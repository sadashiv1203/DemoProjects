package com.bean.scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("singletoneDemo")
//default scope for this bean is singletom
// standart defining the singleton method @Scope(value= ConfigurableBeanFactory.SCOPE_SINGLETON)
public class SingletoneDemo 
{

}
