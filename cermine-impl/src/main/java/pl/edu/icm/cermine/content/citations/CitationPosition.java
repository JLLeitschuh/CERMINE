/**
 * This file is part of CERMINE project.
 * Copyright (c) 2011-2018 ICM-UW
 *
 * CERMINE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CERMINE is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with CERMINE. If not, see <http://www.gnu.org/licenses/>.
 */

package pl.edu.icm.cermine.content.citations;

/**
 * A class for storing the position of a single reference to another document in a document's text.
 *
 * @author Dominika Tkaczyk (d.tkaczyk@icm.edu.pl)
 */
public class CitationPosition {
    
    private int startRefPosition;
    
    private int endRefPosition;
    

    /**
     * Returns the index of the character following the last reference character
     * in the document's text.
     * 
     * @return the index of the character
     */
    public int getEndRefPosition() {
        return endRefPosition;
    }

    public void setEndRefPosition(int endRefPosition) {
        this.endRefPosition = endRefPosition;
    }


    /**
     * Returns the index of the first reference character in the document's text.
     * 
     * @return the index of the first reference character
     */
    public int getStartRefPosition() {
        return startRefPosition;
    }

    public void setStartRefPosition(int startRefPosition) {
        this.startRefPosition = startRefPosition;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.startRefPosition;
        hash = 47 * hash + this.endRefPosition;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CitationPosition other = (CitationPosition) obj;
        return this.startRefPosition == other.startRefPosition &&
               this.endRefPosition == other.endRefPosition;
    }
 
}
