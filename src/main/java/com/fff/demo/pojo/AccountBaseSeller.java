package com.fff.demo.pojo;

public class AccountBaseSeller {
    private String id;//主键
    private String myData_accountBaseSeller;//外键

    private String openid;
    private String unid;
    private Integer unidCode;
    private String brandName;
    private String brandUrl;
    private String brandAuth;
    private String phone;
    private String bgUrl;
    private String description;
    private Integer canView;
    private String certUrl;
    private String address;
    private String addressDetail;
    private String longitude;
    private String latitude;
    private Integer noticeNumb;
    private Boolean isOpenPay;
    private String city;
    private String shopUrl;
    private Integer actived;
    private String contract;
    private Boolean insure;
    private Boolean isTaibao;
    private String createDate;
    private String shareId;
    private Boolean isShare;
    private String subMerId;
    private Boolean notice;
    private String idurl;

    @Override
    public String toString() {
        return "AccountBaseSeller{" +
                "primaryKey='" + id + '\'' +
                ", openid='" + openid + '\'' +
                ", unid='" + unid + '\'' +
                ", unidCode=" + unidCode +
                ", brandName='" + brandName + '\'' +
                ", brandUrl='" + brandUrl + '\'' +
                ", brandAuth='" + brandAuth + '\'' +
                ", phone='" + phone + '\'' +
                ", bgUrl='" + bgUrl + '\'' +
                ", description='" + description + '\'' +
                ", canView=" + canView +
                ", certUrl='" + certUrl + '\'' +
                ", address='" + address + '\'' +
                ", addressDetail='" + addressDetail + '\'' +
                ", longitude='" + longitude + '\'' +
                ", latitude='" + latitude + '\'' +
                ", noticeNumb=" + noticeNumb +
                ", isOpenPay=" + isOpenPay +
                ", city='" + city + '\'' +
                ", shopUrl='" + shopUrl + '\'' +
                ", actived=" + actived +
                ", contract='" + contract + '\'' +
                ", insure=" + insure +
                ", isTaibao=" + isTaibao +
                ", createDate='" + createDate + '\'' +
                ", shareId='" + shareId + '\'' +
                ", isShare=" + isShare +
                ", subMerId='" + subMerId + '\'' +
                ", notice=" + notice +
                ", idurl='" + idurl + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String primaryKey) {
        this.id = primaryKey;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getUnid() {
        return unid;
    }

    public void setUnid(String unid) {
        this.unid = unid;
    }

    public Integer getUnidCode() {
        return unidCode;
    }

    public void setUnidCode(Integer unidCode) {
        this.unidCode = unidCode;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandUrl() {
        return brandUrl;
    }

    public void setBrandUrl(String brandUrl) {
        this.brandUrl = brandUrl;
    }

    public String getBrandAuth() {
        return brandAuth;
    }

    public void setBrandAuth(String brandAuth) {
        this.brandAuth = brandAuth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBgUrl() {
        return bgUrl;
    }

    public void setBgUrl(String bgUrl) {
        this.bgUrl = bgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCanView() {
        return canView;
    }

    public void setCanView(Integer canView) {
        this.canView = canView;
    }

    public String getCertUrl() {
        return certUrl;
    }

    public void setCertUrl(String certUrl) {
        this.certUrl = certUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public Integer getNoticeNumb() {
        return noticeNumb;
    }

    public void setNoticeNumb(Integer noticeNumb) {
        this.noticeNumb = noticeNumb;
    }

    public Boolean getOpenPay() {
        return isOpenPay;
    }

    public void setOpenPay(Boolean openPay) {
        isOpenPay = openPay;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getShopUrl() {
        return shopUrl;
    }

    public void setShopUrl(String shopUrl) {
        this.shopUrl = shopUrl;
    }

    public Integer getActived() {
        return actived;
    }

    public void setActived(Integer actived) {
        this.actived = actived;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public Boolean getInsure() {
        return insure;
    }

    public void setInsure(Boolean insure) {
        this.insure = insure;
    }

    public Boolean getTaibao() {
        return isTaibao;
    }

    public void setTaibao(Boolean taibao) {
        isTaibao = taibao;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getShareId() {
        return shareId;
    }

    public void setShareId(String shareId) {
        this.shareId = shareId;
    }

    public Boolean getShare() {
        return isShare;
    }

    public void setShare(Boolean share) {
        isShare = share;
    }

    public String getSubMerId() {
        return subMerId;
    }

    public void setSubMerId(String subMerId) {
        this.subMerId = subMerId;
    }

    public Boolean getNotice() {
        return notice;
    }

    public void setNotice(Boolean notice) {
        this.notice = notice;
    }

    public String getIdurl() {
        return idurl;
    }

    public void setIdurl(String idurl) {
        this.idurl = idurl;
    }
}
