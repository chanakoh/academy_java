package com.kh.variable;

public class Variableconversation {
	    //1.�ڵ�����ȯ(�Ͻ�������ȯ,����������ȯ)
        
    public static void main(String[] args) {
    	int intNum = 100;
       long longNum = intNum; // int�� long�� �ڵ� ����ȯ
       System.out.println(intNum); //���� 100�� �ǹ�
       System.out.println(longNum);
       
       float floatNum = 3.14f;
       double doubleNum = floatNum; //float�� double�� �ڵ� ����ȯ

       
       //int -> long �����ϴ� ����ȯ 2���� ����� ����ϱ�
       int intNum2 = 1000;
       long longNum2 = intNum2;
       
       int intNum3 = 2000;
       long longNum3 = intNum3;
       
       System.out.println(intNum2 + intNum3);
       
       //short > int�� �����ϴ� ����ȯ 1���� ����� ����ϱ�
       
       short shortNum = 500;
       int intNum4 = shortNum;
       System.out.println( intNum4);
       
       //float > double �����ϴ� ����ȯ 1���� ����� ����ϱ�
       float floatNum2 = 3.15f;
       double doubleNum2 = floatNum2;
       System.out.println( floatNum2);	   
    	
       //2. ����� ����ȯ(���� ����ȯ)
       //long -> int
       long largeLong = 123456789012345L;
       System.out.println(largeLong);
       
       int largeInt = (int) largeLong;
       System.out.println(largeInt); // long�� int�� ���� ����ȯ �� ��� ���� �����ȿ� ���� ������ �Ϻ� �����ʹ� �սǵȴ�.
       
       double largeDouble1 = 12345.6789;
       int intPart = (int) largeDouble1;
       System.out.println(intPart); // �Ǽ��� int�� ���� ����ȯ �� �� (���� �κи� �����ȴ�.)
       
       System.out.println("------------------");
       
       //���ڿ� ���ڰ��� ����ȯ 2�� ���
       // ���ڴ� char charBalue = 'z'; -> int�� ����
       char charBalue = 'A';
       int intChar = charBalue;
       char charBalue2 = 'B';
       int intChar2 = charBalue2;
       System.out.print("intChar:");
       System.out.println(intChar);
       System.out.print("intChar2:");
       System.out.println(intChar2);

       
       //double > int�� ����ȯ ��� 1��
       double doubleA = 10.52;
       int intA = (int) doubleA;
       System.out.print("intA:");
       System.out.println(intA);
       
       // int�� short�� ����ȯ 1�� ���
       int intS = 300;
       short shortA = (short) intS;
       System.out.print("shortA :");
       System.out.println(shortA);
       
       
    		   
    }
}
