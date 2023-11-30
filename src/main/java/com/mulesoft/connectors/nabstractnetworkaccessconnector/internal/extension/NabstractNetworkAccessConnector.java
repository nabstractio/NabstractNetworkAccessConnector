package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.config.NabstractNetworkAccessConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Nabstract Network Access Connector")
@Xml(prefix = "nabstract-network-access-connector")
@Configurations({NabstractNetworkAccessConfiguration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class NabstractNetworkAccessConnector {
  public static final String API_METADATA_CATEGORY = "Nabstract Network Access Connector";
}
