package entity;

import java.sql.Date;

/**
 * App�汾��Ϣ��
 * @author Administrator
 *
 */
public class App_Version {

	protected int id;//����id
	protected int appId;//appId����Դ�ڣ�app_info�������id��
	protected String versionNo;//�汾��
	protected String versionInfo;//�汾����
	protected int publishStatus;//����״̬����Դ�ڣ�data_dictionary��1 ������ 2 �ѷ��� 3 Ԥ������
	protected String downloadLink;//��������
	protected Double versionSize; //�汾��С����λ��M��
	protected int createdBy;//�����ߣ���Դ��dev_user��������Ϣ����û�id��
	protected Date creationDate; //����ʱ��
	protected int modifyBy;//�����ߣ���Դ��dev_user��������Ϣ����û�id��
	protected Date modifyDate; //���¸���ʱ��
	protected String apkLocPath;//apk�ļ��ķ������洢·��
	protected String apkFileName; //�ϴ���apk�ļ�����
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAppId() {
		return appId;
	}
	public void setAppId(int appId) {
		this.appId = appId;
	}
	public String getVersionNo() {
		return versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}
	public String getVersionInfo() {
		return versionInfo;
	}
	public void setVersionInfo(String versionInfo) {
		this.versionInfo = versionInfo;
	}
	public int getPublishStatus() {
		return publishStatus;
	}
	public void setPublishStatus(int publishStatus) {
		this.publishStatus = publishStatus;
	}
	public String getDownloadLink() {
		return downloadLink;
	}
	public void setDownloadLink(String downloadLink) {
		this.downloadLink = downloadLink;
	}
	public Double getVersionSize() {
		return versionSize;
	}
	public void setVersionSize(Double versionSize) {
		this.versionSize = versionSize;
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
	public String getApkLocPath() {
		return apkLocPath;
	}
	public void setApkLocPath(String apkLocPath) {
		this.apkLocPath = apkLocPath;
	}
	public String getApkFileName() {
		return apkFileName;
	}
	public void setApkFileName(String apkFileName) {
		this.apkFileName = apkFileName;
	}
	
	
	
	
	
	
}
