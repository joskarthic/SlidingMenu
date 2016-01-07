package info.androidhive.slidingmenu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.technewsoft.slidingmenu.R;

public class FindPeopleFragment extends Fragment {
	
	
	private String[] mNames = { "ANGELUS",
	        "SPECIAL ILLATHIL IRAIYATCHI (BISHOP SOUNDARARAJU-SCC) (REPEAT)",
	        "HOLY MASS FROM PONDICHERRY (NEW)",
	        "TELEFILM (THAVARUGAL PESINAAL) (SCC) (REPEAT)",
	        "DIVINE MERCY ROSARY",
	        "VATICAN TOP 10 ROME REPORTS (REPEAT)",
	        "MADURAI CHRISTMASS CAROLS (NEW)",
	        "EDUTHTHU VAASI (REPEAT)",
	        "BETHLEHEMHEY MAGILNTHURU (COIMBATORE) (REPEAT)",
	        "ILLATHIL IRAIYATCHI (TRICHY) (NEW)",
	        "ANGELUS","SPECIAL KUTTIES NERAM COIMBATORE) (NEW)",
	        "THOOTHUKUDI CHRISTMASS CAROLS-PART 1 (REPEAT)",
	        "HOLY MASS FROM BESANT NAGAR CHURCH (NEW)",
	        "KUTTIES NERAM (TRICHY) (VIVILIYA THATHA-MASCILLA CHILDRENS) (REPEAT)",
	        "ROSARY (JOYFUL)",
	        "SCC CHRISTMASS CAROLS (ANNA NAGAR) (NEW)",
	        "URAVUHGAL MAEMBADA (NEW)",
	        "KONUM KANMANIGAL (SCC) (NEW)",
	        "GOODNIGHT TALK (NEW)",
	        "ARULIN NERAM (ADORATION) (REPEAT)",
	        "SCC CHRISTMASS CAROLS (ANNA NAGAR) (REPEAT)",
	        "LOGO","THUTHIGAL 1000","THIRUPUGAL MAALAI (NEW)","ANGELUS",
	        "HOLY MASS FROM MADURAI (NEW)","KADAVUL VANAKKAM (NEW)",
	        "THOOTHUKUDI CHRISTMASS CAROLS-PART 1 (NEW)","ANDRADA UNAVU (NEW)",
	        "KALAMILA ORU VELINILA (TRICHY TABLEU) (REPEAT)",
	        "EDUTHTHU VAASI (NEW)" };

		private String[] mAnimals = { "28.12.2015"};
	
	public FindPeopleFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
		List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();
		
		for(int i=0;i<31;i++){
		    HashMap<String, String> hm = new HashMap<String,String>();
		    hm.put("txt",mNames[i]);
		    hm.put("cur","Date : " + "06.01.2016");
		    aList.add(hm);        
		}
		String[] from = { "txt","cur" };

		int[] to = { R.id.txt,R.id.cur}; 
		
		
		
        View rootView = inflater.inflate(R.layout.fragment_find_people, container, false);
        ImageView mainSlide = (ImageView) rootView.findViewById(R.id.imageView1);
        ListView list = (ListView)rootView.findViewById(R.id.listview);
        
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
        
        SimpleAdapter adapter = new SimpleAdapter(getActivity().getBaseContext(), aList, R.layout.schedule_listview, from, to);       
        list.setAdapter(adapter);
     		
        
        return rootView;
    }
}
