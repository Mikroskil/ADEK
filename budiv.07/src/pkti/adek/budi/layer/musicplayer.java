package pkti.adek.budi.layer;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;

public class musicplayer {

    public static MediaPlayer mediaPlayer;
    private static SoundPool soundPool;
    public static boolean isplayingAudio=false;
    public static void setAudioLoop(boolean x){
    	 mediaPlayer.setLooping(x);
    }
    public static void playAudio(Context c,int id){
         mediaPlayer = MediaPlayer.create(c,id);
         soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
         if(!mediaPlayer.isPlaying())           
         {
        isplayingAudio=true;
         mediaPlayer.start();             
         }          
     }
    public static void stopAudio(){     
         isplayingAudio=false;       
         mediaPlayer.stop();
    }   
    public static void PauseAudi(){
    //	 isplayingAudio=false; 
    	
    	if(!mediaPlayer.isPlaying())
    	{
    		mediaPlayer.start();
    	}else{
    		
    	mediaPlayer.pause();
    	}
    
    }
}