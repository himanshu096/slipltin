package slipinit.com.slip.in.slipitin.slip_finder.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import slipinit.com.slip.in.slipitin.R;
import slipinit.com.slip.in.slipitin.slip_finder.model.CustomView;

/**
 * Created by Himanshu on 8/19/2016.
 */
public class AdapterRecyclerView extends RecyclerView.Adapter<CustomView> {

    private Activity activity;
    private Context context;

    public AdapterRecyclerView(Activity activity_){
        activity=activity_;
    }


    @Override
    public CustomView onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_view, parent
                , false);
        CustomView holder = new CustomView(row);
        return holder;    }

    @Override
    public void onBindViewHolder(CustomView holder, int position) {
        holder.imageView.setImageDrawable(activity.getResources().getDrawable(R.drawable.scene));


    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
