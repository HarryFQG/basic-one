package AdapterPattern01;
/**
 * ����2.1
 * @author Feng
 */
public class Adv_Mp4Player implements AdvancedMedia {

	@Override
	public void playVlc(String fileName) {
		// TODO �Զ����ɵķ������

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("playing Mp4 file:file name:"+fileName);


	}

}
