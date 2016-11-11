package com.pwc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.1
 * 2016-11-11T15:32:25.010+01:00
 * Generated source version: 2.5.1
 * 
 */
@WebService(targetNamespace = "http://soap.sforce.com/2005/09/outbound", name = "NotificationPort")
@XmlSeeAlso({ObjectFactory.class})
public interface NotificationPort {

    /**
     * Process a number of notifications.
     */
    @WebMethod
    @RequestWrapper(localName = "notifications", targetNamespace = "http://soap.sforce.com/2005/09/outbound", className = "com.pwc.Notifications")
    @ResponseWrapper(localName = "notificationsResponse", targetNamespace = "http://soap.sforce.com/2005/09/outbound", className = "com.pwc.NotificationsResponse")
    @WebResult(name = "Ack", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
    public boolean notifications(
        @WebParam(name = "OrganizationId", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String organizationId,
        @WebParam(name = "ActionId", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String actionId,
        @WebParam(name = "SessionId", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String sessionId,
        @WebParam(name = "EnterpriseUrl", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String enterpriseUrl,
        @WebParam(name = "PartnerUrl", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.lang.String partnerUrl,
        @WebParam(name = "Notification", targetNamespace = "http://soap.sforce.com/2005/09/outbound")
        java.util.List<com.pwc.AccountNotification> notification
    );
}
