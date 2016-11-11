package com.pwc;

import java.util.List;

public class NotificationPortImpl implements NotificationPort {

	@Override
	public boolean notifications(String organizationId, String actionId, String sessionId, String enterpriseUrl,
			String partnerUrl, List<AccountNotification> notification) {
		// TODO Auto-generated method stub
		System.out.println("Receiving organizationId "+organizationId);
		return true;
	}

}
