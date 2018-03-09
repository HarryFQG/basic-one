package ObjectTest;

import org.junit.Test;

/**
 * ��װ��Ĳ�����
 *  	�񣺰�װ�����Ҫ������������
 *    		�٣�������������ת��
 *    		�ڣ����ڷ����Ķ������Ͳ������ݺͷ���ֵ
 * 		�򣺷����Ĳ��������磺��������Ϊ�˴����͵ĸ���object
 * 			
 *
 */
public class NumberTest {
	/**
	 * ��װ��Ĳ��Է���
	 */
	//@Test
	public void wrapperTest(){
		//ʵ����һ��integer���͵���������
		Integer i=new Integer(100);
	}
	
	
	/**
	 * NUmber��Ĳ��Է���
	 */
	//@Test
	public void NumberTest(){
		//ʹ��Number�����ͱ��������������Ͷ���
		Number d=123.45;
		Number i=123;
		//��Ч���������仰
		d=new Double(123.45);
		i=new Integer(123);
		/*��λ����ֵ�����ԭʼ����
		 * ����������.getClass().getName()*/
		System.out.println(d.getClass().getName());
		System.out.println(i.getClass().getName());
		/*����װ�ڻ��������е����ݣ�ת��Ϊ��������ʹ��*/
		double doubleValue=d.doubleValue();
		int intValue=i.intValue();
		System.out.println("\nӦ�գ�"+doubleValue+";ʵ���գ�"+intValue);
		
		doubleValue=i.doubleValue();
		intValue=i.intValue();
		System.out.println(doubleValue+","+intValue);
		
	}
	
	
	
	/**
	 * Integer����Է���
	 *    Integer�ķ�����������(Integer.***���Զ�����
	 *    �����������ͬ
	 */
	@Test
	public void IntegerTest(){
		/*��ȡint���������ķ���*/
		System.out.println("\nint �������Χ��"+Integer.MAX_VALUE);
		System.out.println("int ������С��Χ��"+Integer.MIN_VALUE);
		
		/*Integer����ת������*/
		int i=8;
		System.out.println("\nת��Ϊ������:"+Integer.toBinaryString(i));
		System.out.println("ת��Ϊ�˽���:"+Integer.toOctalString(i));
		
		/*���ַ�������ת��Ϊ��������(parseInt(ĳĳ);)
		 *   Ҫ���ַ������������������������Ҫ�󣬲ſ���ת��*/
		String input="123.0";//�������ӣ������׳��쳣
		//String input="123.00";//��������
		//String input ="180cm";//�������ӣ�
		/*����������������������Ҫ�󣬲�������ת�����һ��׳��쳣
		 *  �쳣Ϊ��NumberFormat
		 */
		double n=Double.parseDouble(input );
		n+=1;
		System.out.println("\n�ַ���ת��Ϊint���ͣ�"+n);
		
		String input1="123.00";
		double d=Double.parseDouble(input1);
		System.out.println("���ַ�������ת��Ϊdouble���ͣ�"+d);
		
	}
	
	/**
	 * ģ����Ա������ͻ���
	 * @param objҪ�����Ļ����������������
	 * @return���ط��͵Ļ����������������
	 * ���֣����ڷ����Ķ������Ͳ������ݺͷ���ֵ
	 */
	public Object deliver(Object obj){
		System.out.println("�����ѷ��ͣ���");
		return obj;
	}
	
	/**
	 * ģ������������ͺͶ�����Ϊ����
	 */
	@Test
	public void boxingTest(){
		int money=300;
		Object o=deliver(money);//��װ��
		//��Ч��
		o=deliver((Integer.valueOf(money)));
		//�ȵ�һ��object���Ͷ��󣬶�Ҫ�ֶ�ת��Ϊ��������
		//
		System.out.println((int)o+300);
	}
}
