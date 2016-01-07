package info.androidhive.slidingmenu;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.technewsoft.slidingmenu.R;

public class HomeFragment extends Fragment {
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        
        ImageView mainSlide = (ImageView) rootView.findViewById(R.id.imageView1);
        
        LinearLayout textViewtitle1 = (LinearLayout) rootView.findViewById(R.id.LinearLayout01);
        LinearLayout textViewtitle2 = (LinearLayout) rootView.findViewById(R.id.LinearLayout012);
        LinearLayout textViewtitle3 = (LinearLayout) rootView.findViewById(R.id.LinearLayout013);
        
        mainSlide.setOnClickListener(new OnClickListener() 
        {
            public void onClick(View v)
            {
            	/*Toast.makeText(getActivity(), " This is my Toast message Welcome ",
            			   Toast.LENGTH_LONG).show();*/
            	Intent intent = new Intent(getActivity(), VideoViewActivity.class);
        		startActivity(intent);
            }

        });
        
        
        textViewtitle1.setOnClickListener(new OnClickListener() 
        {
            public void onClick(View v)
            {
            	/*Toast.makeText(getActivity(), " This is my Toast message Welcome Button1",
            			   Toast.LENGTH_LONG).show();*/
            	Intent intent = new Intent(getActivity(), VideoViewActivity1.class);
        		startActivity(intent);
            }

        });
        
        textViewtitle2.setOnClickListener(new OnClickListener() 
        {
            public void onClick(View v)
            {
            	/*Toast.makeText(getActivity(), " This is my Toast message Welcome Button1",
            			   Toast.LENGTH_LONG).show();*/
            	Intent intent = new Intent(getActivity(), VideoViewActivity2.class);
        		startActivity(intent);
            }

        });
        
        textViewtitle3.setOnClickListener(new OnClickListener() 
        {
            public void onClick(View v)
            {
            	/*Toast.makeText(getActivity(), " This is my Toast message Welcome Button1",
            			   Toast.LENGTH_LONG).show();*/
            	Intent intent = new Intent(getActivity(), VideoViewActivity3.class);
        		startActivity(intent);
            }

        });
        
        
        return rootView;
    }
}
