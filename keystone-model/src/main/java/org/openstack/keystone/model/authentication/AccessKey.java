package org.openstack.keystone.model.authentication;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.openstack.keystone.model.Authentication;

@JsonRootName("auth")
public class AccessKey extends Authentication {
	
	public static final class ApiAccessKeyCredentials {
		
		private String accessKey;
		
		private String secretKey;

		/**
		 * @return the accessKey
		 */
		public String getAccessKey() {
			return accessKey;
		}

		/**
		 * @param accessKey the accessKey to set
		 */
		public void setAccessKey(String accessKey) {
			this.accessKey = accessKey;
		}

		/**
		 * @return the secretKey
		 */
		public String getSecretKey() {
			return secretKey;
		}

		/**
		 * @param secretKey the secretKey to set
		 */
		public void setSecretKey(String secretKey) {
			this.secretKey = secretKey;
		}
		
	}
	
	private ApiAccessKeyCredentials apiAccessKeyCredentials;

	/**
	 * @return the apiAccessKeyCredentials
	 */
	public ApiAccessKeyCredentials getApiAccessKeyCredentials() {
		return apiAccessKeyCredentials;
	}

	/**
	 * @param apiAccessKeyCredentials the apiAccessKeyCredentials to set
	 */
	public void setApiAccessKeyCredentials(
			ApiAccessKeyCredentials apiAccessKeyCredentials) {
		this.apiAccessKeyCredentials = apiAccessKeyCredentials;
	}
	
}