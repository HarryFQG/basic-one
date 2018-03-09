package AdapterPattern01;

public class MediaAdapter implements Media{
	/**
	 * ≤Ω÷Ë3
	 * @author Feng
	 */
	AdvancedMedia adv;
	public MediaAdapter(String audiaType){
		if(audiaType.equalsIgnoreCase("Vlc")){
			adv=new Adv_VlcPlayer();
		}else if(audiaType.equalsIgnoreCase("Mp4")){
			adv=new Adv_Mp4Player();
		}
			
	}
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("Vlc")){
			adv.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("Mp4")){
			adv.playMp4(fileName);
		}
		
	}

}
