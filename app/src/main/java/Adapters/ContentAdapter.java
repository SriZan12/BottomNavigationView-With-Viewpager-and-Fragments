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

public class ContentAdapter extends RecyclerView.Adapter<ContentAdapter.ContentHolder> {

    ArrayList<Model> contentList = new ArrayList<>();

    public ContentAdapter(ArrayList<Model> contentList) {
        this.contentList = contentList;
    }

    @NonNull
    @Override
    public ContentHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_file,parent,false);
        return new ContentHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContentHolder holder, int position) {

        holder.image.setImageResource(contentList.get(position).image);
        holder.textView1.setText(contentList.get(position).content);
        holder.textView2.setText(contentList.get(position).desc);
    }

    @Override
    public int getItemCount() {
        return contentList.size();
    }

    public class ContentHolder extends RecyclerView.ViewHolder{

        ImageView image;
        TextView textView1,textView2;

        public ContentHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.circularImage);
            textView1 = itemView.findViewById(R.id.textView1);
            textView2 = itemView.findViewById(R.id.textView2);
        }
    }
}
