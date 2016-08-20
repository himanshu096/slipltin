package slipinit.com.slip.in.slipitin.slip_finder.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import slipinit.com.slip.in.slipitin.R;

/**
 * Created by Himanshu on 8/19/2016.
 */
public class CustomView extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView textView;

    public CustomView(View itemView) {
        super(itemView);
        imageView=(ImageView)itemView.findViewById(R.id.id_imageView);
    }
}
