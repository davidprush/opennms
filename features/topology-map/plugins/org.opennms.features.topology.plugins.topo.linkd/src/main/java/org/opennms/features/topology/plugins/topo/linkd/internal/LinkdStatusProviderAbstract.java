/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2013-2014 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2014 The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is a registered trademark of The OpenNMS Group, Inc.
 *
 * OpenNMS(R) is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * OpenNMS(R) is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with OpenNMS(R).  If not, see:
 *      http://www.gnu.org/licenses/
 *
 * For more information contact:
 *     OpenNMS(R) Licensing <license@opennms.org>
 *     http://www.opennms.org/
 *     http://www.opennms.com/
 *******************************************************************************/

package org.opennms.features.topology.plugins.topo.linkd.internal;

import org.opennms.netmgt.topologies.service.api.OnmsTopology;
import org.opennms.netmgt.topologies.service.api.OnmsTopologyDao;
import org.opennms.netmgt.topologies.service.api.OnmsTopologyProtocol;

public abstract class LinkdStatusProviderAbstract {

    public String getNamespace() {
        return OnmsTopology.TOPOLOGY_NAMESPACE_LINKD;
    }

    public boolean contributesTo(String namespace) {
        if ( OnmsTopology.TOPOLOGY_NAMESPACE_LINKD.equals(namespace)) {
            return true;  
        }
        for (OnmsTopologyProtocol onmsTP :m_onmsTopologyDao.getSupportedProtocols()) {
            if (onmsTP.getId().equals(namespace)) {
                return true;
            }
        }
        return false;
    }

    private OnmsTopologyDao m_onmsTopologyDao;

    public OnmsTopologyDao getOnmsTopologyDao() {
        return m_onmsTopologyDao;
    }

    public void setOnmsTopologyDao(OnmsTopologyDao onmsTopologyDao) {
        m_onmsTopologyDao = onmsTopologyDao;
    }
    
    
}
