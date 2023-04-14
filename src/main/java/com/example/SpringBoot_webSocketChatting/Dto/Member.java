package com.example.SpringBoot_webSocketChatting.Dto;

public class Member {
	private Long idAuto;
	private String id;
	private String pw;

	public Long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(Long idAuto) {
		this.idAuto = idAuto;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Member [idAuto=" + idAuto + ", id=" + id + ", pw=" + pw + "]";
	}

}
