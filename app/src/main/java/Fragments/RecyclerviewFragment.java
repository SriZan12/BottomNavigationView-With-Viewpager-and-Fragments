package Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import Adapters.ContentAdapter;
import Adapters.Model;
import com.srijan.recyclerinfragments.R;

import java.util.ArrayList;


public class RecyclerviewFragment extends Fragment {

    RecyclerView recyclerView;
    public RecyclerviewFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_recyclerview, container, false);
        recyclerView = view.findViewById(R.id.rv);

        ArrayList<Model> contentlist = new ArrayList<>();
        contentlist.add(new Model(R.drawable.c,"C Language","Low Level Language"));
        contentlist.add(new Model(R.drawable.golang,"GOlang","Developed by Google"));
        contentlist.add(new Model(R.drawable.py,"Python","Web Application"));
        contentlist.add(new Model(R.drawable.ruby,"Ruby","Desktop Applications"));
        contentlist.add(new Model(R.drawable.java,"Java","Embedded Network Application"));
        contentlist.add(new Model(R.drawable.android,"Android Development with Java","Android Apps"));
        contentlist.add(new Model(R.drawable.html,"Html & Css","Designing Webpages"));
        contentlist.add(new Model(R.drawable.js,"JavaScript","Making Websites and Application"));
        contentlist.add(new Model(R.drawable.react,"React","Making Websites and Application"));
        contentlist.add(new Model(R.drawable.kotlin,"Kotlin","Making Android Application"));
        contentlist.add(new Model(R.drawable.web,"Web Development","Html,Css and JavaScript"));
        contentlist.add(new Model(R.drawable.php,"PhP","Database"));



        ContentAdapter contentAdapter = new ContentAdapter(contentlist);
        recyclerView.setAdapter(contentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}