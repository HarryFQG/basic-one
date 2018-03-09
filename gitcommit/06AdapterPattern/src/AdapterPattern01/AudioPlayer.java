package AdapterPattern01;
/**
 * ������
 * @author Feng
 *
 */
public class AudioPlayer implements Media{
	MediaAdapter med;
	public AudioPlayer(){}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("Mp3")){
			//mp3�ļ����õķ���
			System.out.println("playing mp3 file.file name:"+fileName);
		}else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
			//ͨ�������������ӵ�
			/**
			 * ���ӵͼ��ģ��򵥵���Ϊ������Ķ��󣬸߼��ġ����ӵ���Ϊ����Ķ���
			 */
			med=new MediaAdapter(audioType);
			med.play(audioType, fileName);			
		}else{
			System.out.println("invalid media"+audioType+"format not support.");
		}
		
	}

}
