package Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Layer;
import androidx.recyclerview.widget.RecyclerView;

import com.srijan.recyclerinfragments.R;

import java.util.ArrayList;

public class SalaryAdapter extends RecyclerView.Adapter<SalaryAdapter.salaryViewHolder>  {

    ArrayList<Model3> salaryList = new ArrayList<>();

    public SalaryAdapter(ArrayList<Model3> salaryList) {
        this.salaryList = salaryList;
    }

    @NonNull
    @Override
    public salaryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.salary_layout, parent,false);
        return new salaryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull salaryViewHolder holder, int position) {

        holder.image.setImageResource(salaryList.get(position).image);
        holder.textView1.setText(salaryList.get(position).content);
        holder.textview2.setText(salaryList.get(position).Salary);
    }

    @Override
    public int getItemCount() {
        return salaryList.size();
    }

    public class salaryViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView textView1,textview2;

        public salaryViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.circularImage);
            textView1 = itemView.findViewById(R.id.textView1);
            textview2 = itemView.findViewById(R.id.textView);
        }

    }
}
