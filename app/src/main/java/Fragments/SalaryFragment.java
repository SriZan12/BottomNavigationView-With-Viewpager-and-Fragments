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

import Adapters.Model2;
import Adapters.Model3;
import Adapters.SalaryAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SalaryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SalaryFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;

    public SalaryFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SalaryFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SalaryFragment newInstance(String param1, String param2) {
        SalaryFragment fragment = new SalaryFragment();
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
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_salary, container, false);
        recyclerView = view.findViewById(R.id.rv);

        ArrayList<Model3> joblist = new ArrayList<>();
        joblist.add(new Model3(R.drawable.c,"C Developer","$200"));
        joblist.add(new Model3(R.drawable.golang,"GOlang Developer","$400"));
        joblist.add(new Model3(R.drawable.py,"Pythoneer","$1,200"));
        joblist.add(new Model3(R.drawable.ruby,"Ruby Developer","$700"));
        joblist.add(new Model3(R.drawable.java,"Java Developer","$1,500"));
        joblist.add(new Model3(R.drawable.android,"Android Developer","$1,700"));
        joblist.add(new Model3(R.drawable.html,"Frontend Developer","$900"));
        joblist.add(new Model3(R.drawable.js,"JavaScript Developer","$2,000"));
        joblist.add(new Model3(R.drawable.react,"React Developer","$1,000"));
        joblist.add(new Model3(R.drawable.kotlin,"Kotlin apps Developer","$1,200"));
        joblist.add(new Model3(R.drawable.web,"Web Developer","$1,400"));
        joblist.add(new Model3(R.drawable.php,"Backend Developer","$1,100"));

        SalaryAdapter salaryAdapter = new SalaryAdapter(joblist);
        recyclerView.setAdapter(salaryAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }
}