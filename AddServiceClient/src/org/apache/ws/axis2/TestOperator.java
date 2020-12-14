package org.apache.ws.axis2;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.ws.axis2.OperatorStub.Add;

public class TestOperator {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub

		
		OperatorStub clStub = new OperatorStub();
		Add add0=new Add();
		add0.setA(8);
		add0.setB(10);
		int val=clStub.add(add0).get_return();
		
		System.out.println("Value:-"+val);
		
		
	}

}
