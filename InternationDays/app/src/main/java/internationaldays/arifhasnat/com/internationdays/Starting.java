package internationaldays.arifhasnat.com.internationdays;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;


public class Starting extends Activity {
    MediaPlayer mp;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        iv=(ImageView) findViewById(R.id.imageView1);
        mp=MediaPlayer.create(getBaseContext(), R.raw.amarvayer1);
        mp.start();
		/*iv.setOnTouchListener(new OnTouchListener(){

			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				Intent i=new Intent("com.example.internationaldays.MainActivity");
				startActivity(i);
				mp.stop();
				return true;
			}});

		*/
        Thread th=new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(Exception exp){

                }finally{
                    mp.stop();
                    Intent i=new Intent("com.example.internationaldays.MainActivity");
                    startActivity(i);

                }


            }
        };
        th.start();
    }


}
