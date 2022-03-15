package Adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.srijan.recyclerinfragments.R;

import java.util.ArrayList;

public class JobAdapter extends RecyclerView.Adapter<JobAdapter.JobViewHolder> {

    ArrayList<Model2> joblist = new ArrayList<>();

    public JobAdapter(ArrayList<Model2> joblist) {
        this.joblist = joblist;
    }

    @NonNull
    @Override
    public JobViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.job_layout,parent,false);
        return new JobViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JobViewHolder holder, int position) {
        holder.image.setImageResource(joblist.get(position).image);
        holder.textView1.setText(joblist.get(position).content);
    }

    @Override
    public int getItemCount() {
        return joblist.size();
    }

    public class JobViewHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView textView1,textView2;

        public JobViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.circularImage);
            textView1 = itemView.findViewById(R.id.textView1);
        }
    }
}
