package com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.operation.refinement;

import com.mulesoft.connectors.nabstractnetworkaccessconnectormule4.internal.operation.base.GetQosSessionDetailsOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class GetQosSessionDetailsOperationRefinement extends GetQosSessionDetailsOperationBase {
  public GetQosSessionDetailsOperationRefinement() {
    super();
  }

  public GetQosSessionDetailsOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
