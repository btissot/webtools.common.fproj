/******************************************************************************
 * Copyright (c) 2008 BEA Systems, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Konstantin Komissarchik - initial implementation and ongoing maintenance
 ******************************************************************************/

package org.eclipse.wst.common.project.facet.core.events;

import java.util.Set;

import org.eclipse.wst.common.project.facet.core.IProjectFacet;

/**
 * This interface is implemented by the event object that is used for the FIXED_FACETS_CHANGED 
 * event. 
 * 
 * @author <a href="mailto:kosta@bea.com">Konstantin Komissarchik</a>
 */

public interface IFixedFacetsChangedEvent

    extends IFacetedProjectEvent
    
{
    /**
     * The set of facets that were fixed for the project prior to the change.
     * 
     * @return the set of old fixed facets
     */
    
    Set<IProjectFacet> getOldFixedFacets();
    
    /**
     * The set of facets that are fixed for the project after the change.
     * 
     * @return the set of new fixed facets
     */
    
    Set<IProjectFacet> getNewFixedFacets();
    
}