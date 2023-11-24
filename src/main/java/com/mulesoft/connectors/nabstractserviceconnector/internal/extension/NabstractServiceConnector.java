package com.mulesoft.connectors.nabstractserviceconnector.internal.extension;

import com.mulesoft.connectivity.rest.commons.api.error.RestError;
import com.mulesoft.connectors.nabstractserviceconnector.internal.config.NabstractServiceConfiguration;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;
import org.mule.runtime.extension.api.annotation.error.ErrorTypes;
import org.mule.runtime.extension.api.annotation.license.RequiresEnterpriseLicense;

@Extension(name = "Nabstract Service Connector")
@Xml(prefix = "nabstract-service-connector")
@Configurations({NabstractServiceConfiguration.class})
@ErrorTypes(RestError.class)
@RequiresEnterpriseLicense(allowEvaluationLicense = true)
public class NabstractServiceConnector {
  public static final String API_METADATA_CATEGORY = "Nabstract ServiceConnector";
}
