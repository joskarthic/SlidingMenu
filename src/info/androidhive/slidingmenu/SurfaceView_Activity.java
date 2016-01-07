package info.androidhive.slidingmenu;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.VideoView;
 
public class SurfaceView_Activity extends Activity {
 
	// Declare variables
	ProgressDialog pDialog;
	VideoView videoview;
 
	// Insert your Video URL
	String VideoURL = "http://188.166.221.33:1935/madhatv/myStream_360p/playlist.m3u8";
	private SurfaceView surfaceViewFrame;
	private MediaPlayer player;
	private SurfaceHolder holder;
	private SurfaceView progressBarWait;
	private Dialog updateTimer;
	private SurfaceView pause;
 
	 private VideoView mVV;
	 
	 
     
	
	 
	  

	
 
}
