package com.newegg.ec.redis.entity;

/**
 * @author Everly.J.Ju
 * @date 2020/01/22
 */
public class SentinelMaster {
    private Integer sentinelMasterId;

    private Integer clusterId;

    private Integer groupId;

    private Integer userId;

    private String masterNode;

    private String lastMasterNode;

    private String flags;

    private Long sDownTime;

    private Long oDownTime;

    private Long downAfterMilliseconds;

    private Integer numSlaves;

    private Long updateTime;

    private String masterHost;

    private Integer masterPort;

    private String masterName;

    private Integer quorum;

    private Long failoverTimeout;

    private Integer parallelSync;

    private String authPass;

    private String state;

    public Integer getSentinelMasterId() {
        return sentinelMasterId;
    }

    public void setSentinelMasterId(Integer sentinelMasterId) {
        this.sentinelMasterId = sentinelMasterId;
    }

    public Integer getClusterId() {
        return clusterId;
    }

    public void setClusterId(Integer clusterId) {
        this.clusterId = clusterId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMasterNode() {
        return masterNode;
    }

    public void setMasterNode(String masterNode) {
        this.masterNode = masterNode;
    }

    public String getLastMasterNode() {
        return lastMasterNode;
    }

    public void setLastMasterNode(String lastMasterNode) {
        this.lastMasterNode = lastMasterNode;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public Long getsDownTime() {
        return sDownTime;
    }

    public void setsDownTime(Long sDownTime) {
        this.sDownTime = sDownTime;
    }

    public Long getoDownTime() {
        return oDownTime;
    }

    public void setoDownTime(Long oDownTime) {
        this.oDownTime = oDownTime;
    }

    public Long getDownAfterMilliseconds() {
        return downAfterMilliseconds;
    }

    public void setDownAfterMilliseconds(Long downAfterMilliseconds) {
        this.downAfterMilliseconds = downAfterMilliseconds;
    }

    public Integer getNumSlaves() {
        return numSlaves;
    }

    public void setNumSlaves(Integer numSlaves) {
        this.numSlaves = numSlaves;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getMasterHost() {
        return masterHost;
    }

    public void setMasterHost(String masterHost) {
        this.masterHost = masterHost;
    }

    public Integer getMasterPort() {
        return masterPort;
    }

    public void setMasterPort(Integer masterPort) {
        this.masterPort = masterPort;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public Integer getQuorum() {
        return quorum;
    }

    public void setQuorum(Integer quorum) {
        this.quorum = quorum;
    }

    public Long getFailoverTimeout() {
        return failoverTimeout;
    }

    public void setFailoverTimeout(Long failoverTimeout) {
        this.failoverTimeout = failoverTimeout;
    }

    public Integer getParallelSync() {
        return parallelSync;
    }

    public void setParallelSync(Integer parallelSync) {
        this.parallelSync = parallelSync;
    }

    public String getAuthPass() {
        return authPass;
    }

    public void setAuthPass(String authPass) {
        this.authPass = authPass;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
