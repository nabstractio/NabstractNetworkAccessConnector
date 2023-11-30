package com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.refinement;

import com.mulesoft.connectors.nabstractnetworkaccessconnector.internal.operation.base.CreateQosSessionOperationBase;
import org.mule.runtime.api.el.ExpressionLanguage;

/** Middle part of the Operation. Can be used by the user to add custom code into the operation. */
public class CreateQosSessionOperationRefinement extends CreateQosSessionOperationBase {
  public CreateQosSessionOperationRefinement() {
    super();
  }

  public CreateQosSessionOperationRefinement(ExpressionLanguage arg0) {
    super(arg0);
  }
}
