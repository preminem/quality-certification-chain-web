package com.example.demo.domain;

public class Certificate {

    String unitName;
    String certificateID;
    String unitId;
    String registerAddr;
    String platformName;
    String edition;
    String website;
    String auditAddr;
    String authenticationStandard;
    String certificationMode;
    String certificationConclusion;
    String certificationClass;
    String awardDate;
    String replaceDate;
    String validityTerm;
    String certificationID;
    String certificationName;
    String certificateScanHASH;
    String postPersonID;
    String postPersonName;
    String img;

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCertificateID() {
        return certificateID;
    }

    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    public String getUnitId() {
        return unitId;
    }

    public void setUnitId(String unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getRegisterAddr() {
        return registerAddr;
    }

    public void setRegisterAddr(String registerAddr) {
        this.registerAddr = registerAddr;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAuditAddr() {
        return auditAddr;
    }

    public void setAuditAddr(String auditAddr) {
        this.auditAddr = auditAddr;
    }

    public String getAuthenticationStandard() {
        return authenticationStandard;
    }

    public void setAuthenticationStandard(String authenticationStandard) {
        this.authenticationStandard = authenticationStandard;
    }

    public String getCertificationMode() {
        return certificationMode;
    }

    public void setCertificationMode(String certificationMode) {
        this.certificationMode = certificationMode;
    }

    public String getCertificationConclusion() {
        return certificationConclusion;
    }

    public void setCertificationConclusion(String certificationConclusion) {
        this.certificationConclusion = certificationConclusion;
    }

    public String getCertificationClass() {
        return certificationClass;
    }

    public void setCertificationClass(String certificationClass) {
        this.certificationClass = certificationClass;
    }

    public String getAwardDate() {
        return awardDate;
    }

    public void setAwardDate(String awardDate) {
        this.awardDate = awardDate;
    }

    public String getReplaceDate() {
        return replaceDate;
    }

    public void setReplaceDate(String replaceDate) {
        this.replaceDate = replaceDate;
    }

    public String getValidityTerm() {
        return validityTerm;
    }

    public void setValidityTerm(String validityTerm) {
        this.validityTerm = validityTerm;
    }

    public String getCertificationID() {
        return certificationID;
    }

    public void setCertificationID(String certificationID) {
        this.certificationID = certificationID;
    }

    public String getCertificationName() {
        return certificationName;
    }

    public void setCertificationName(String certificationName) {
        this.certificationName = certificationName;
    }

    public String getCertificateScanHASH() {
        return certificateScanHASH;
    }

    public void setCertificateScanHASH(String certificateScanHASH) {
        this.certificateScanHASH = certificateScanHASH;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"unitName\":\"")
                .append(unitName).append('\"');
        sb.append(",\"certificateID\":\"")
                .append(certificateID).append('\"');
        sb.append(",\"unitId\":\"")
                .append(unitId).append('\"');
        sb.append(",\"registerAddr\":\"")
                .append(registerAddr).append('\"');
        sb.append(",\"platformName\":\"")
                .append(platformName).append('\"');
        sb.append(",\"edition\":\"")
                .append(edition).append('\"');
        sb.append(",\"website\":\"")
                .append(website).append('\"');
        sb.append(",\"auditAddr\":\"")
                .append(auditAddr).append('\"');
        sb.append(",\"authenticationStandard\":\"")
                .append(authenticationStandard).append('\"');
        sb.append(",\"certificationMode\":\"")
                .append(certificationMode).append('\"');
        sb.append(",\"certificationConclusion\":\"")
                .append(certificationConclusion).append('\"');
        sb.append(",\"certificationClass\":\"")
                .append(certificationClass).append('\"');
        sb.append(",\"awardDate\":\"")
                .append(awardDate).append('\"');
        sb.append(",\"replaceDate\":\"")
                .append(replaceDate).append('\"');
        sb.append(",\"validityTerm\":\"")
                .append(validityTerm).append('\"');
        sb.append(",\"certificationID\":\"")
                .append(certificationID).append('\"');
        sb.append(",\"certificationName\":\"")
                .append(certificationName).append('\"');
        sb.append(",\"certificateScanHASH\":\"")
                .append(certificateScanHASH).append('\"');
        sb.append(",\"postPersonID\":\"")
                .append(postPersonID).append('\"');
        sb.append(",\"postPersonName\":\"")
                .append(postPersonName).append('\"');
        sb.append(",\"img\":\"")
                .append(img).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
