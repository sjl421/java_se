package com.thinktik.otherclass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {

	/**
	 * * A:BigDecimal�ĸ���
			* �����������ʱ��float���ͺ�double�����׶�ʧ���ȣ���ʾ������
			* ���ԣ�Ϊ���ܾ�ȷ�ı�ʾ�����㸡������Java�ṩ��BigDecimal
		
			* ���ɱ�ġ����⾫�ȵ��з���ʮ��������
		* B:���췽��
			* public BigDecimal(String val)
		* C:��Ա����
			* public BigDecimal add(BigDecimal augend)
			* public BigDecimal subtract(BigDecimal subtrahend)
			* public BigDecimal multiply(BigDecimal multiplicand)
			* public BigDecimal divide(BigDecimal divisor)
		* D:������ʾ
			* BigDecimal��Ĺ��췽���ͳ�Ա����ʹ��
		ʮ���Ʊ�ʾ1/3
		0.3333333333333333333333333333333333333333 
			 */
	public static void main(String[] args) {
		//System.out.println(2.0 - 1.1);
		/*BigDecimal bd1 = new BigDecimal(2.0);		//���ַ�ʽ�ڿ����в��Ƽ�,��Ϊ������ȷ
		BigDecimal bd2 = new BigDecimal(1.1);
		
		System.out.println(bd1.subtract(bd2));*/
		
		/*BigDecimal bd1 = new BigDecimal("2.0");		//ͨ�������д����ַ����ķ�ʽ,����ʱ�Ƽ�
		BigDecimal bd2 = new BigDecimal("1.1");
		
		System.out.println(bd1.subtract(bd2));*/
		
		BigDecimal bd1 = BigDecimal.valueOf(2.0);	//���ַ�ʽ�ڿ�����Ҳ���Ƽ���
		BigDecimal bd2 = BigDecimal.valueOf(1.1);
		
		System.out.println(bd1.subtract(bd2));
	}

}
