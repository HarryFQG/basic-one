package JavaCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * List���͵Ĳ���
 * @author Feng
 *���߸�����
 */
public class ListTest03 {
	/**
	 * List ���͵Ĳ��Է���
	 */
	@Test
	public void testList(){
		List<String> array=new ArrayList<String>();
		List<String> linked=new LinkedList<String>();
		array.add("Ů����");
		array.add("��");
		array.add("ѧ��");
		System.out.println(array);
		String str=array.get(1);
		System.out.println("��ָ��λ�ã�"+str);
		array.set(2,"����");
		System.out.println("����ָ��λ�ú����飺"+array);
		//����λ��1��2λ�û�
		str =array.get(1);
		array.set(1,array.get(2) );
		array.set(2, str);
		System.out.println("����λ��"+array);
		/*array.add(1, "��");
		System.out.println(array);
		linked.add("��ΰ��");
		linked.add("Ф����");
		linked.add("����");
		System.out.println(linked);
		linked.add(1, "��");
		System.out.println(linked);*/
	}
}
/**
 * ���ۣ�ArrayList��LinkedList��������ȫһ��
 * 				��Ϊ����ʵ��List�ӿ�
 *           ArrayList�ڲ���ָ��λ����Ԫ�ظ���Ч
 */
/**
 * List�ӿڵ��߸�������
 *  	1��	public void add(int index,E element);
 *      2��  public boolean addAll(int index,Collection<? Extends E>c);
 *      3:    public E get(int index);
 *      4:    public int indexOf(Object o);
 *      5:    public int lastIndexOf(Object o);
 *      6:    public E  remove(int index);
 *      7:    public E  set(int index,E element);
 */
