/*******************************************************************************
 * This file is part of OpenNMS(R).
 *
 * Copyright (C) 2018 The OpenNMS Group, Inc.
 * OpenNMS(R) is Copyright (C) 1999-2018 The OpenNMS Group, Inc.
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

package org.opennms.netmgt.model;

import java.util.Objects;

public class CdpLinkInfo {

    private final Integer id;
    private final Integer nodeId;
    private final Integer cdpCacheIfIndex;
    private final String cdpInterfaceName;
    private final String cdpCacheAddress;
    private final String cdpCacheDeviceId;
    private final String cdpCacheDevicePort;

    public CdpLinkInfo(Integer id, Integer nodeId, Integer cdpCacheIfIndex, String cdpInterfaceName, String cdpCacheAddress,
                       String cdpCacheDeviceId, String cdpCacheDevicePort){
        this.id = id;
        this.nodeId = nodeId;
        this.cdpCacheIfIndex = cdpCacheIfIndex;
        this.cdpInterfaceName = cdpInterfaceName;
        this.cdpCacheAddress = cdpCacheAddress;
        this.cdpCacheDeviceId = cdpCacheDeviceId;
        this.cdpCacheDevicePort = cdpCacheDevicePort;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public String getNodeIdAsString() {
        if (getNodeId() != null) {
            return getNodeId().toString();
        }
        return null;
    }

    public Integer getCdpCacheIfIndex() {
        return cdpCacheIfIndex;
    }

    public String getCdpInterfaceName() {
        return cdpInterfaceName;
    }

    public String getCdpCacheAddress() {
        return cdpCacheAddress;
    }

    public String getCdpCacheDevicePort() {
        return cdpCacheDevicePort;
    }

    public String getCdpCacheDeviceId() {
        return cdpCacheDeviceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CdpLinkInfo that = (CdpLinkInfo) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(nodeId, that.nodeId) &&
                Objects.equals(cdpCacheIfIndex, that.cdpCacheIfIndex) &&
                Objects.equals(cdpInterfaceName, that.cdpInterfaceName) &&
                Objects.equals(cdpCacheAddress, that.cdpCacheAddress) &&
                Objects.equals(cdpCacheDeviceId, that.cdpCacheDeviceId) &&
                Objects.equals(cdpCacheDevicePort, that.cdpCacheDevicePort);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, nodeId, cdpCacheIfIndex, cdpInterfaceName, cdpCacheAddress, cdpCacheDeviceId, cdpCacheDevicePort);
    }

    @Override
    public String toString() {
        return "CdpLinkInfo{" +
                "id=" + id +
                ", nodeId=" + nodeId +
                ", cdpCacheIfIndex=" + cdpCacheIfIndex +
                ", cdpInterfaceName='" + cdpInterfaceName + '\'' +
                ", cdpCacheAddress='" + cdpCacheAddress + '\'' +
                ", cdpCacheDeviceId='" + cdpCacheDeviceId + '\'' +
                ", cdpCacheDevicePort='" + cdpCacheDevicePort + '\'' +
                '}';
    }
}