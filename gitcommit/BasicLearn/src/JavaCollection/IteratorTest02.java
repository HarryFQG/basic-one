package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

/**
 * ���������ڱ�������Ԫ�ء���ȡ����������ʹ��Collection����ķ�����Iterator iterator()
 * ������Itreator��һ���ӿڣ���������дCollection��iterator()����ʱ�����ڲ����ṩ�ĵ�������ʵ�֣�
 * �������ṩ��ͳһ�ı�������Ԫ�صķ��������ṩ�����ڱ������ϵ�����������
 * 		boolean hasNext():�жϼ����Ƿ���Ԫ�ؿ��Ա�����
 * 		E next():���ص�������һ��Ԫ�� 
 * @author Feng
 *
 */
public class IteratorTest02 {

	/**
	 * ���Լ��϶���ĵ�������hasNext��next��remove����
	 */
	//@Test
	public void IteratorTest(){
		//4��100Ԫ��Ʊ����һ�żٱ�
		Collection<String> money=new ArrayList<String>();
		money.add("100");
		money.add("100");
		money.add("��100");
		money.add("100");
		System.out.println(money);
		int sum=0;//����Ǯ��
		//1.ֻҪ�������ϵ�ÿ��Ԫ�ؾ�Ҫʹ�õ�����
		//2.ֻҪʹ�õ�����������Ӽ��϶����Iterator�������
		
		Iterator<String> it=money.iterator();
		/*������ʹ�õĹ̶�������
		 *  whileѭ�����������Ƿ�����һ��Ԫ��
		 *  		ѭ���壺ʹ��next��������ƶ�һ��Ԫ��λ�ã�
		 *  							��ȡ����Ԫ�ؽ��в���
		 */
	while(it.hasNext()){
		//����������ʼλ���ڵ�һ��Ԫ��֮ǰ��
		//���ԣ���ʹ��֮ǰ ��������next�������ڴ���
		String s=it.next();
		if(s.equals("100")){
			sum+=Integer.parseInt(s);
		}else{
			System.out.println("���ּ�100");
			//money.remove("��100");
			it.remove();//���϶���remove����Ҫ������,��������remove�������ô�����
			System.out.println(money);
			/**���⣺����100Ԫ
			 * ���϶����remove������������һ��Ԫ��
			 * ����������remove�������������������Ⱥ���һ��Ԫ��λ�������±���
			 *���ۣ�һ�㲻Ҫ���׸��ļ����е�Ԫ�ظ�����Ҫ���ľ�ͨ���������е�remove�������Ͳ������©��Ԫ��
			 */
		}
	}
	System.out.println("����"+sum+"Ԫ");	
		
	}
	
	/**
	 *���� ��ǿforѭ��
	 */
	/*Ӧ�ó�����ֻ�����ڱ������ϻ�����
	 * for(Ԫ������ e  ������򼯺�){
	 *      ѭ���壻
	 *      }
	 */
	@Test
	public void forTest(){
		Collection<String> money=new ArrayList<String>();
		money.add("100");
		money.add("100");
		money.add("��100");
		money.add("100");
		System.out.println(money);
		int sum=0;
		for(String str:money){
			if(str.equals("100")){
				sum+=Integer.parseInt(str);
			}
			//��ǿforѭ���в���ɾ�����ϵ�Ԫ��
			//Ҫɾ��Ԫ�أ�ֻ���Լ���д��������Ȼ����õ�������remove����
		}
		System.out.println("��"+sum+"Ԫ");
	}
	
}
