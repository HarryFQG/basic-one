package JavaCollection;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Test;

/**
 * ����Collection�ӿ�����All�йصķ���
 * boolean addAll(Collection<?extends E>c)
 * 						�÷�����Ҫ���Ǵ���һ�����ϣ����ҽ��ü��������е�Ԫ����ӵ���ǰ�����С������
 * 						Collection���ڱ����ö��������ģ��򷵻�true
 * boolean containsAll(Collection<?>c)
 * 						�÷��������жϵ�ǰ�����Ƿ�����������ϵ�����Ԫ�أ��������򷵻�true
 * @author Feng
 *
 */
public class addAllAndContainsAll01 {

		/**
		 * c���Լ�������All��صķ���
		 * collection�����ĸ�������c1.addAll(c2);c1.containsAll(c2)
		 *										c1.removeAll(c2);c1.retainAll(c2);
		 */
	//@Test
	public void testAll(){
		Collection<String> c1=new ArrayList<String>();
		c1.add("÷��3");c1.add("����6");
		c1.add("����2");c1.add("����");
		Collection<String> c2=new ArrayList<String>();
		c2.add("����3");c2.add("����3");
		c2.add("����3");c2.add("С��");
		c2.addAll(c1);//���ñ�����ס����������µļ��ϣ�ֱ����ԭ�����������
		/*�����������ϵ�ƴ��ֱ���޸�a2���϶��������
		 * ���ᴴ���µļ���*/
		System.out.println(c2);
		/*�����жϼ������Ƿ������ը��ͬʱ������С��
		 * 	ֻҪͬʱ�ж϶��Ԫ��ʱ��
		 * 1���Ƚ�Ҫ�жϵ�Ԫ�ط�������һ��������
		 * 2�������������ڽ��бȽ�
		 * */
		Collection<String> wz=new ArrayList<String>();
		wz.add("����");wz.add("С��");
		System.out.println(c2.containsAll(wz)?"����ը":"û����ը");
		
	}
	
	
	/**retainAll:����������ϵĹ������֣�Ҳ�н���
	 * removeAll:����������ϵĲ
	 *
	 * ǿ����������������ֱ���޸�ԭ�����϶���С��ʹ��
	 * ��ʵ����������ִ�еĶ��ǴӼ���������ɾ�����Ԫ�صĲ�����ֻ������
	 * 			retainAll����ɾ���������������в�ͬ��Ԫ��
	 * 			removeAll����ɾ����������������ͬ��Ԫ��
	 */
	/**
	 * ���������ϵĽ����Ͳ
	 */
	@Test
	public void batchRemoveTest(){
		Collection<String> mine=new ArrayList<String>();
		mine.add("��Ʒ�");
		mine.add("�Ȼ���");
		mine.add("������");
		System.out.println("�Ҽҵģ�"+mine);
		Collection<String> others=new ArrayList<String>();
		others.add("������");
		others.add("��Ʒ�");
		others.add("��Ƥ");
		others.add("������");
		System.out.println("���˵ģ�"+others);
		mine.retainAll(others);
		System.out.println("�Ҽ��б���Ҳ�еģ�"+mine);
		//���ۣ�ԭ����mine�����еľȻ����ᱻɾ�����Ҳ�����
		//		�󽻼������ö���Ͳ��������˳�򲻻�Ӱ����
		others.removeAll(mine);
		System.out.println("�����У�"+others+",����û�У�");
		//���ۣ����������ϲ��˭����removeAll�������ͻᱣ��˭�еĲԪ��
		//		��Ϊ�����ļ��ϣ�����Ϊ�Ƚϣ����ᱣ�����κε��޸�
	}
}
