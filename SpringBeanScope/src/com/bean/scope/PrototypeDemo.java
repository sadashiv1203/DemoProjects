package com.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("prototypeDemo")
@Scope("prototype")
public class PrototypeDemo 
{

}
