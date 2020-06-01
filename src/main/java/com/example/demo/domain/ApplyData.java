package com.example.demo.domain;

public class ApplyData {
    String summary;
    String hashSummary;
    String unitID;
    String unitName;
    String platformName;
    String edition;
    String deployPlace;
    String runPlace;
    String runState;
    String applyTime;
    String operatorID;
    String operatorName;
    String applicationHash;
    String legalFileHash;
    String image1;
    String imgge2;

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImgge2() {
        return imgge2;
    }

    public void setImgge2(String imgge2) {
        this.imgge2 = imgge2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"summary\":\"")
                .append(summary).append('\"');
        sb.append(",\"hashSummary\":\"")
                .append(hashSummary).append('\"');
        sb.append(",\"unitID\":\"")
                .append(unitID).append('\"');
        sb.append(",\"unitName\":\"")
                .append(unitName).append('\"');
        sb.append(",\"platformName\":\"")
                .append(platformName).append('\"');
        sb.append(",\"edition\":\"")
                .append(edition).append('\"');
        sb.append(",\"deployPlace\":\"")
                .append(deployPlace).append('\"');
        sb.append(",\"runPlace\":\"")
                .append(runPlace).append('\"');
        sb.append(",\"runState\":\"")
                .append(runState).append('\"');
        sb.append(",\"applyTime\":\"")
                .append(applyTime).append('\"');
        sb.append(",\"operatorID\":\"")
                .append(operatorID).append('\"');
        sb.append(",\"operatorName\":\"")
                .append(operatorName).append('\"');
        sb.append(",\"applicationHash\":\"")
                .append(applicationHash).append('\"');
        sb.append(",\"legalFileHash\":\"")
                .append(legalFileHash).append('\"');
        sb.append(",\"image1\":\"")
                .append(image1).append('\"');
        sb.append(",\"imgge2\":\"")
                .append(imgge2).append('\"');
        sb.append('}');
        return sb.toString();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getHashSummary() {
        return hashSummary;
    }

    public void setHashSummary(String hashSummary) {
        this.hashSummary = hashSummary;
    }

    public String getUnitID() {
        return unitID;
    }

    public void setUnitID(String unitID) {
        this.unitID = unitID;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getDeployPlace() {
        return deployPlace;
    }

    public void setDeployPlace(String deployPlace) {
        this.deployPlace = deployPlace;
    }

    public String getRunPlace() {
        return runPlace;
    }

    public void setRunPlace(String runPlace) {
        this.runPlace = runPlace;
    }

    public String getRunState() {
        return runState;
    }

    public void setRunState(String runState) {
        this.runState = runState;
    }

    public String getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getApplicationHash() {
        return applicationHash;
    }

    public void setApplicationHash(String applicationHash) {
        this.applicationHash = applicationHash;
    }

    public String getLegalFileHash() {
        return legalFileHash;
    }

    public void setLegalFileHash(String legalFileHash) {
        this.legalFileHash = legalFileHash;
    }
}
