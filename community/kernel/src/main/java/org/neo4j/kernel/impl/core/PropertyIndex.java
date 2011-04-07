/**
 * Copyright (c) 2002-2011 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.impl.core;

// TODO: make LRU x elements
public class PropertyIndex
{
    private final String key;
    private final int keyId;

    protected PropertyIndex( String key, int keyId )
    {
        this.key = key;
        this.keyId = keyId;
    }

    public String getKey()
    {
        return key;
    }

    @Override
    public int hashCode()
    {
        return keyId;
    }

    public int getKeyId()
    {
        return this.keyId;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( o instanceof PropertyIndex )
        {
            return keyId == ((PropertyIndex) o).getKeyId();
        }
        return false;
    }
}