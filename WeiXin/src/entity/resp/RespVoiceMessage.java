package entity.resp;

public class RespVoiceMessage extends RespBaseMessage{
	private RespVoice Voice;

	public RespVoice getVoice() {
		return Voice;
	}

	public void setVoice(RespVoice voice) {
		Voice = voice;
	}
	
}
