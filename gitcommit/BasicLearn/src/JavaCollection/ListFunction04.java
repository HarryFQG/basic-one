package JavaCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

/**
 * List�ӿڵ��߸�������
 *  	1��	public void add(int index,E element);				���뵽ָ��λ�ã�ԭλ��֮���Ԫ�ض�˳�������ƶ�һ��
 *      2��  public boolean addAll(int index,Collection<? Extends E>c);
 *      3:    public E get(int index);
 *      4:    public int indexOf(Object o);
 *      5:    public int lastIndexOf(Object o);
 *      6:    public E  remove(int index);				ɾ��ָ��λ�õ�Ԫ�أ����ҽ�ָ����Ԫ�ط���
 *      7:    public E  set(int index,E element);
 *      8:   List<E> sublist(int fromIndex,int toIndex);��ȡ���ַ�������ͷ����β�����伯������ԭ�����Ͻ��в�������û�н��д�������
 *		9:   Object toArray() <T> T[]toArray(T[] a);����ת��Ϊ���飬ʵ�����ǵ���collection�ж���ģ����м��϶����������
 *		10��static <T>List<T>asList(T...a);������ת��Ϊ����
 */
public class ListFunction04 {
	/**
	 * ����add(int index,E element)��remove��int ����
	 */
	//@Test
	public void addAndRemoveTest(){
		List<String> linked=new LinkedList<String>();
		linked.add("��ΰ��");
		linked.add("Ф����");
		linked.add("����"); 
		System.out.println(linked);
		linked.add(1, "��");
		String str=linked.remove(1);
		System.out.println(linked);
		System.out.println(str);
		System.out.println(linked);
		/**
		 * ���ۣ�ArrayList������ǰλ��֮�������Ԫ��Ǩ��һ��Ԫ�أ�Ч�ʵ���
		 * 			LinkedList������Ҫ�ƶ�Ԫ�أ�ֻ��Ҫ�޸�ָ��
		 * 
		 */
	}
	
	
	/**
	 * ����subList
	 */
	//@Test
	public void subListTest(){
		List<String> cards=new ArrayList<String>();
		cards.add("����");
		cards.add("����2");
		cards.add("��Ƭ2");
		cards.add("����2");
		cards.add("÷��2");
		cards.add("С��");
		System.out.println("�������"+cards);
		List<String> bong=cards.subList(1, 4+1);
		System.out.println("ը��"+bong);
		bong.clear();
		System.out.println("�������"+cards);
		/*
		 * ���ۣ��޸��Ӽ��ϣ�Դ����Ҳ�ᱻ�ı䣻�Ӽ���ֻ����Դ�����ϼ���һ���±���������û�д����¼���
		 */
	}
	
	/**
	 * ���Լ���ת��Ϊ����ķ���
	 */
	@Test
	public void toArrayTest(){
		Collection<String> to=new LinkedList<String>();
		for(int i=0;i<4;i++){
			to.add("ƻ��");
		}
		//Step1:���ӿ��Է�������ƻ��
		String[] basket6=new String[6];
		to.toArray(basket6);
		System.out.println(Arrays.toString( basket6));
		//���ۣ����������Էŵ�������Ԫ�أ�ֱ���޸�Ԫ���飬���ᴴ��������
		//step2:
		String[] basket2=new String[2];
		String[] newbasket=to.toArray(basket2);
		System.out.println(Arrays.toString( newbasket));
		//�������Ų������м���Ԫ�أ��ͻ����������飬���������飬�������������
		//    �����ñ�����ס���ص�������
		//step3;
		String[] newbasket1=to.toArray(new String[]{});
		System.out.println("newbasket:"+Arrays.toString(newbasket1));
		//ͨ�����������ع��ļ����е�Ԫ�ظ����Լ����鳤��
		//step4:
		String[] mybasket=to.toArray(new String[to.size()]);
		System.out.println("mybasket:"+Arrays.toString(mybasket));
		//�Ż��������������������飬��������������
	}
	/**
	 * ���Խ�����ת��Ϊ���ϵķ���
	 */
	@Test
	public void asListTest(){
		String[] money={"100","100","��100","100"};
		//���鼯�ϣ�Arrays.asList(money);
		//���һ������һ������ɾ�������Ԫ�صļ��ϣ����������鹲��ͬһ���������洢�ռ�
	  //List<String > n=Arrays.asList(money);
		//����������һ�����������޸ĵļ��϶���
		//step1:�½�һ����׼��ArrayList����
		List<String> n=new ArrayList<String>();
		//step2:ʹ�ü��϶����addAll������������asList�����ļ����е�����Ԫ�ص��¼��϶�����
		n.addAll(Arrays.asList(money));
		System.out.println("���϶���"+n);
		for(int i=0;i<n.size();i++){//size()Ԫ�ظ���
			//������ּٱҾ��滻Ϊ��100
			if(!n.get(i).equals("100")){
				System.out.println("���ּ�100");
				//����1�����ּٱҾ��滻���
				//n.set(i, "100");
				//����2�����ּٱң���ɾ���üٱ�
				n.remove(i);//������֧�ֵĲ�����
			}
		}
		System.out.println("�������"+Arrays.toString(money));
		System.out.println("���϶���"+n);
		//����:������ת��Ϊ���ϣ��ڶԼ��Ͻ��в���Ҳ��ı�ԭ������Ԫ��
		//		ת��ļ��϶����ԭ���������ʵ����ͬһ������洢�ռ�
		//        ת��������飬��֧����ӣ�add����ɾ����remove��Ԫ�صĲ���
	}
}
