package AdapterPattern01;
/**
 * ����2.2
 * @author Feng
 */
public class Adv_VlcPlayer implements AdvancedMedia {

	@Override
	public void playVlc(String fileName) {
		System.out.println("playing vlc file:file name:"+fileName);

	}

	@Override
	public void playMp4(String fileName) {
		// TODO �Զ����ɵķ������

	}

}
