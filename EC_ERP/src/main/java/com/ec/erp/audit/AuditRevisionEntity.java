//package com.ec.erp.audit;
//
//import javax.persistence.AttributeOverride;
//import javax.persistence.AttributeOverrides;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//import org.hibernate.envers.DefaultRevisionEntity;
//import org.hibernate.envers.RevisionEntity;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@RevisionEntity(AuditRevisionListener.class)
//@Table(name = "REVINFO", schema = "audit")
//@AttributeOverrides({
//		@AttributeOverride(name = "timestamp", column = @Column(name = "REVTSTMP")),
//		@AttributeOverride(name = "id", column = @Column(name = "REV"))})
//@Getter
//@Setter
//public class AuditRevisionEntity extends DefaultRevisionEntity {
//
//	private static final long serialVersionUID = 1L;
//	
//	@Column(name = "USERNAME", nullable = false)
//    private String username;
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}    
//    
//}
