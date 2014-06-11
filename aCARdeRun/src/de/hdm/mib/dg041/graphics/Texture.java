/* Copyright 2012 Dennis Grewe
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
package de.hdm.mib.dg041.graphics;

/**
 * @author dennis.grewe [dg041@hdm-stuttgart.de]
 * Created on 23.02.2012.
 */
public class Texture
{
    // --------------------------------------------------------
    // PROPERTIES
    // --------------------------------------------------------

    private int handle;
    private int width, height;

    // --------------------------------------------------------
    // CONSTRUCTOR
    // --------------------------------------------------------

    public Texture(int handle, int width, int height)
    {
		this.handle = handle;
		this.width = width;
		this.height = height;
    }

    // --------------------------------------------------------
    // METHODS
    // --------------------------------------------------------

    /**
     * @return returns the handle object of the texture
     */
    public int getHandle()
    {
	    return handle;
    }

    /**
     * @return returns the width of the texture
     */
    public int getWidth()
    {
	    return width;
    }

    /**
     * @return returns the height of the texture
     */
    public int getHeight()
    {
	    return height;
	}  
}