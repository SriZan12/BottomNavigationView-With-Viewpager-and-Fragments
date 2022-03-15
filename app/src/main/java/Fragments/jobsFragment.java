package Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.srijan.recyclerinfragments.R;

import java.util.ArrayList;

import Adapters.JobAdapter;
import Adapters.Model;
import Adapters.Model2;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link jobsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class jobsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public jobsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment jobsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static jobsFragment newInstance(String param1, String param2) {
        jobsFragment fragment = new jobsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        RecyclerView recyclerView;
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_jobs, container, false);

        recyclerView = view.findViewById(R.id.rlv);
        ArrayList<Model2> joblist = new ArrayList<>();
        joblist.add(new Model2(R.drawable.c,"C Developer"));
        joblist.add(new Model2(R.drawable.golang,"GOlang Developer"));
        joblist.add(new Model2(R.drawable.py,"Pythoneer"));
        joblist.add(new Model2(R.drawable.ruby,"Ruby Developer"));
        joblist.add(new Model2(R.drawable.java,"Java Developer"));
        joblist.add(new Model2(R.drawable.android,"Android Developer"));
        joblist.add(new Model2(R.drawable.html,"Frontend Developer"));
        joblist.add(new Model2(R.drawable.js,"JavaScript Developer"));
        joblist.add(new Model2(R.drawable.react,"React Developer"));
        joblist.add(new Model2(R.drawable.kotlin,"Kotlin apps Developer"));
        joblist.add(new Model2(R.drawable.web,"Web Developer"));
        joblist.add(new Model2(R.drawable.php,"Backend Developer"));

        JobAdapter jobAdapter = new JobAdapter(joblist);
        recyclerView.setAdapter(jobAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}