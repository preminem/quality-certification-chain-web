package com.example.demo.domain;

public class FileData {

    String unitID;
    String unitName;
    String platformName;
    String edition;
    String certificationUnitID;
    String certificationUnitName;
    String conclusion;
    String auditTime;
    String auditorID;
    String auditorName;
    String postPersonID;
    String postPersonName;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"unitID\":\"")
                .append(unitID).append('\"');
        sb.append(",\"unitName\":\"")
                .append(unitName).append('\"');
        sb.append(",\"platformName\":\"")
                .append(platformName).append('\"');
        sb.append(",\"edition\":\"")
                .append(edition).append('\"');
        sb.append(",\"certificationUnitID\":\"")
                .append(certificationUnitID).append('\"');
        sb.append(",\"certificationUnitName\":\"")
                .append(certificationUnitName).append('\"');
        sb.append(",\"conclusion\":\"")
                .append(conclusion).append('\"');
        sb.append(",\"auditTime\":\"")
                .append(auditTime).append('\"');
        sb.append(",\"auditorID\":\"")
                .append(auditorID).append('\"');
        sb.append(",\"auditorName\":\"")
                .append(auditorName).append('\"');
        sb.append(",\"postPersonID\":\"")
                .append(postPersonID).append('\"');
        sb.append(",\"postPersonName\":\"")
                .append(postPersonName).append('\"');
        sb.append('}');
        return sb.toString();
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

    public String getCertificationUnitID() {
        return certificationUnitID;
    }

    public void setCertificationUnitID(String certificationUnitID) {
        this.certificationUnitID = certificationUnitID;
    }

    public String getCertificationUnitName() {
        return certificationUnitName;
    }

    public void setCertificationUnitName(String certificationUnitName) {
        this.certificationUnitName = certificationUnitName;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditorID() {
        return auditorID;
    }

    public void setAuditorID(String auditorID) {
        this.auditorID = auditorID;
    }

    public String getAuditorName() {
        return auditorName;
    }

    public void setAuditorName(String auditorName) {
        this.auditorName = auditorName;
    }

    public String getPostPersonID() {
        return postPersonID;
    }

    public void setPostPersonID(String postPersonID) {
        this.postPersonID = postPersonID;
    }

    public String getPostPersonName() {
        return postPersonName;
    }

    public void setPostPersonName(String postPersonName) {
        this.postPersonName = postPersonName;
    }
}
