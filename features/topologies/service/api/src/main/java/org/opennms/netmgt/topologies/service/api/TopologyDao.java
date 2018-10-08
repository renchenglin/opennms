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

package org.opennms.netmgt.topologies.service.api;

import java.util.Set;

import org.opennms.netmgt.model.OnmsTopology;
import org.opennms.netmgt.model.OnmsTopologyConsumer;
import org.opennms.netmgt.model.OnmsTopologyException;
import org.opennms.netmgt.model.OnmsTopologyMessage;
import org.opennms.netmgt.model.OnmsTopologyUpdater;

public interface TopologyDao {

    OnmsTopology getTopology(String protocol) throws OnmsTopologyException;
    
    Set<String> getSupportedProtocols();

    void register(OnmsTopologyUpdater updater) throws OnmsTopologyException;
    void unregister(OnmsTopologyUpdater updater) throws OnmsTopologyException;

    void subscribe(OnmsTopologyConsumer consumer);
    void unsubscribe(OnmsTopologyConsumer consumer);
    
    void update(OnmsTopologyUpdater updater, OnmsTopologyMessage message) throws OnmsTopologyException;

}