package AdapterPattern01;
/**
 * 步骤四
 * @author Feng
 *
 */
public class AudioPlayer implements Media{
	MediaAdapter med;
	public AudioPlayer(){}
	
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("Mp3")){
			//mp3文件内置的方法
			System.out.println("playing mp3 file.file name:"+fileName);
		}else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
			//通过适配器新增加的
			/**
			 * 更加低级的，简单的作为被适配的对象，高级的、复杂的作为适配的对象
			 */
			med=new MediaAdapter(audioType);
			med.play(audioType, fileName);			
		}else{
			System.out.println("invalid media"+audioType+"format not support.");
		}
		
	}

}
