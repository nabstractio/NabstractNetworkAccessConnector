package com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.config.NabstractNetworkAccessConnectorMule4Configuration;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Nabstract Network Access", category = Category.CERTIFIED)
@Xml(prefix = "nabstract-network-access-connector-mule-4")
@Configurations({NabstractNetworkAccessConnectorMule4Configuration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class NabstractNetworkAccessConnectorMule4 {
  public static final String API_METADATA_CATEGORY = "Nabstract Network Access Connector - Mule 4";
}
