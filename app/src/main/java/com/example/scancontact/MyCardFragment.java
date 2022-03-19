package com.example.scancontact;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;


public class MyCardFragment extends Fragment {
    ListView mListView;
    ListAdapter mListAdapter;
    public MyCardFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,
                             Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_home,container,false);
        final String[] name =
                getResources().getStringArray(R.array.name);
        final String[] tel =
                getResources().getStringArray(R.array.tel);
        final String[] email =
                getResources().getStringArray(R.array.email);
        final String[] add =
                getResources().getStringArray(R.array.add);
        final int[] head ={R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head,R.drawable.head};
        final int[] company ={R.drawable.tsu,R.drawable.pku,R.drawable.cityu,R.drawable.tsu,R.drawable.pku,R.drawable.cityu,R.drawable.tsu,R.drawable.pku,R.drawable.cityu,R.drawable.tsu,R.drawable.pku,R.drawable.cityu,};


        mListView = (ListView) view.findViewById(R.id.card_list);
        mListAdapter = new
                com.example.scancontact.ListAdapter(getActivity(),name,tel,email,add,head,company);

        mListView.setAdapter(mListAdapter);


        return view;
    }
}