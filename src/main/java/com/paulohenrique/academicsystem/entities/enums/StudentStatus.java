package com.paulohenrique.academicsystem.entities.enums;

public enum StudentStatus {
	
	INADIMPLENTE(2),
	ADIMPLENTE(1);
	
	private int code;
	
	private StudentStatus(int code) {
		this.code=code;
	}

	public int getCode(){
		return code;
	}
	
	
	public static StudentStatus valueOf(int code) {
		
		for(StudentStatus value : StudentStatus.values()) {
			if (value.getCode()==code) {
				return value;
			}
			
		}
		throw new IllegalArgumentException("Invalid StudentStatus code");
		
	}
	
	
}
