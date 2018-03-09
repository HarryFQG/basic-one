package AdapterPattern01;
/**
 * 步骤2.1
 * @author Feng
 */
public class Adv_Mp4Player implements AdvancedMedia {

	@Override
	public void playVlc(String fileName) {
		// TODO 自动生成的方法存根

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("playing Mp4 file:file name:"+fileName);


	}

}
