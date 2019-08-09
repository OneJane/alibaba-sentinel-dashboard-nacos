package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NacosConfigProperties {

    @Value("${houyi.nacos.server.ip}")
    private String ip;

    @Value("${houyi.nacos.server.port}")
    private String port;

    @Value("${houyi.nacos.server.namespace}")
    private String namespace;

    @Value("${houyi.nacos.server.group-id}")
    private String groupId;

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getPort() {
        return port;
    }
    public void setPort(String port) {
        this.port = port;
    }
    public String getNamespace() {
        return namespace;
    }
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }
    public String getGroupId() {
        return groupId;
    }
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public String getServerAddr() {
        return this.getIp()+":"+this.getPort();
    }
    @Override
    public String toString() {
        return "NacosConfigProperties [ip=" + ip + ", port=" + port + ", namespace="
                + namespace + ", groupId=" + groupId + "]";
    }
}