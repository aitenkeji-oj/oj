package entity;

import java.sql.Date;

/**
 * APP������Ϣ��
 * @author Administrator
 *
 */
public class App_Info {
	protected int id;//����id
	protected String softwareName;//�������
	protected String APKName;//APK���ƣ�Ψһ��
	protected String supportROM;//֧��ROM
	protected String interfaceLanguage;//��������
	protected Double softwareSize;//�����С����λ��M��
	protected Date updateDate;//��������
	protected int devId;//������id����Դ�ڣ�dev_user��Ŀ�����id��
	protected String appInfo;//Ӧ�ü��
	protected int status;//״̬����Դ�ڣ�data_dictionary��1 ����� 2 ���ͨ�� 3 ��˲�ͨ�� 4 ���ϼ� 5 ���¼ܣ�
	protected Date onSaleDate;//�ϼ�ʱ��
	protected Date offSaleDate;//�¼�ʱ��
	protected int flatformId;//����ƽ̨����Դ�ڣ�data_dictionary��1 �ֻ� 2 ƽ�� 3 ͨ�ã�
	protected int categoryLevel3;//�����������ࣨ��Դ�ڣ�data_dictionary��
	protected int downloads;//����������λ���Σ�
	protected int createdBy;//�����ߣ���Դ��dev_user��������Ϣ����û�id��
	protected Date creationDate;//����ʱ��
	protected int modifyBy;//�����ߣ���Դ��dev_user��������Ϣ����û�id��
	protected Date modifyDate;//���¸���ʱ��
	protected int categoryLevel1;//����һ�����ࣨ��Դ�ڣ�data_dictionary��
	protected int categoryLevel2;//�����������ࣨ��Դ�ڣ�data_dictionary��
	protected String logoPicPath; //LOGOͼƬurl·��
	protected String logoLocPath; //LOGOͼƬ�ķ������洢·��
	protected int versionId;//���µİ汾id
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSoftwareName() {
		return softwareName;
	}
	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}
	public String getAPKName() {
		return APKName;
	}
	public void setAPKName(String aPKName) {
		APKName = aPKName;
	}
	public String getSupportROM() {
		return supportROM;
	}
	public void setSupportROM(String supportROM) {
		this.supportROM = supportROM;
	}
	public String getInterfaceLanguage() {
		return interfaceLanguage;
	}
	public void setInterfaceLanguage(String interfaceLanguage) {
		this.interfaceLanguage = interfaceLanguage;
	}
	public Double getSoftwareSize() {
		return softwareSize;
	}
	public void setSoftwareSize(Double softwareSize) {
		this.softwareSize = softwareSize;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getDevId() {
		return devId;
	}
	public void setDevId(int devId) {
		this.devId = devId;
	}
	public String getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getOnSaleDate() {
		return onSaleDate;
	}
	public void setOnSaleDate(Date onSaleDate) {
		this.onSaleDate = onSaleDate;
	}
	public Date getOffSaleDate() {
		return offSaleDate;
	}
	public void setOffSaleDate(Date offSaleDate) {
		this.offSaleDate = offSaleDate;
	}
	public int getFlatformId() {
		return flatformId;
	}
	public void setFlatformId(int flatformId) {
		this.flatformId = flatformId;
	}
	public int getCategoryLevel3() {
		return categoryLevel3;
	}
	public void setCategoryLevel3(int categoryLevel3) {
		this.categoryLevel3 = categoryLevel3;
	}
	public int getDownloads() {
		return downloads;
	}
	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public int getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(int modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	public int getCategoryLevel1() {
		return categoryLevel1;
	}
	public void setCategoryLevel1(int categoryLevel1) {
		this.categoryLevel1 = categoryLevel1;
	}
	public int getCategoryLevel2() {
		return categoryLevel2;
	}
	public void setCategoryLevel2(int categoryLevel2) {
		this.categoryLevel2 = categoryLevel2;
	}
	public String getLogoPicPath() {
		return logoPicPath;
	}
	public void setLogoPicPath(String logoPicPath) {
		this.logoPicPath = logoPicPath;
	}
	public String getLogoLocPath() {
		return logoLocPath;
	}
	public void setLogoLocPath(String logoLocPath) {
		this.logoLocPath = logoLocPath;
	}
	public int getVersionId() {
		return versionId;
	}
	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}
	
	
	
	
	
	
	
}
