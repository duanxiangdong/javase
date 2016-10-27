package com.test.xstream3;

import com.thoughtworks.xstream.annotations.XStreamAlias;
@XStreamAlias("ReturnInfo")
public class ReturnInfo {
	private GeneralInfoReturn GeneralInfoReturn;
	
	public class GeneralInfoReturn {
		@XStreamAlias("UUID")
		private String uUID;
		@XStreamAlias("PlateformCode")
		private String plateformCode;
		@XStreamAlias("ErrorCode")
		private String errorCode;
		@XStreamAlias("ErrorMessage")
		private String errorMessage;

		public String getuUID() {
			return uUID;
		}

		public void setuUID(String uUID) {
			this.uUID = uUID;
		}

		public String getPlateformCode() {
			return plateformCode;
		}

		public void setPlateformCode(String plateformCode) {
			this.plateformCode = plateformCode;
		}

		public String getErrorCode() {
			return errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getErrorMessage() {
			return errorMessage;
		}

		public void setErrorMessage(String errorMessage) {
			this.errorMessage = errorMessage;
		}

	}

	public GeneralInfoReturn getGeneralInfoReturn() {
		return GeneralInfoReturn;
	}

	public void setGeneralInfoReturn(GeneralInfoReturn generalInfoReturn) {
		GeneralInfoReturn = generalInfoReturn;
	}

}