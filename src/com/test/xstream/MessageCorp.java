package com.test.xstream;

public class MessageCorp {
	private String DbAccName;
	private String NVoucherType;
	private String NFAccNo;

	public MessageCorp(String NVoucherType, String NFAccNo) {
		this.NVoucherType = NVoucherType;
		this.NFAccNo = NFAccNo;
	}

	public String getDbAccName() {
		return DbAccName;
	}

	public void setDbAccName(String dbAccName) {
		DbAccName = dbAccName;
	}

	public String getNVoucherType() {
		return NVoucherType;
	}

	public void setNVoucherType(String nVoucherType) {
		NVoucherType = nVoucherType;
	}

	public String getNFAccNo() {
		return NFAccNo;
	}

	public void setNFAccNo(String nFAccNo) {
		NFAccNo = nFAccNo;
	}
	
}
