package entity;

import java.sql.Date;

/**
 * App���������
 * @author Administrator
 *
 */
public class App_Category {

	protected int id;//����ID
	protected String categoryCode;//�������
	protected String categoryName; //��������
	protected int parentId; //�����ڵ�id
	protected int createdBy; //�����ߣ���Դ��backend_user�û�����û�id��
	protected Date creationTime; //����ʱ��
	protected int modifyBy; //�����ߣ���Դ��backend_user�û�����û�id��
	protected Date modifyDate; //���¸���ʱ��
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getParentId() {
		return parentId;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
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
}
