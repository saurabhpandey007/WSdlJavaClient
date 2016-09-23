package org.tempuri;

import java.rmi.RemoteException;

public class Myclient {

	public static void main(String[] args) {
		
		int input1=100;
		int input2=220;
		Integer result=0;
		
		ICalculatorServiceProxy calService=new ICalculatorServiceProxy();
		 try {
			 result=calService.add(input1,input2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 System.out.println("reult--"+result);
	}


}

