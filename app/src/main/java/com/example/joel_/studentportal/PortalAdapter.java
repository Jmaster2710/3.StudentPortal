package com.example.joel_.studentportal;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PortalAdapter extends RecyclerView.Adapter<PortalViewHolder> {

    private Context context;
    public List<Portal> listPortals;


    public PortalAdapter(Context context, List<Portal> listPortalObject) {

        this.context = context;

        this.listPortals = listPortalObject;

    }

    @Override
    public PortalViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridcell, parent, false);

        return new PortalViewHolder(view);
    }


    @Override
    public void onBindViewHolder(final PortalViewHolder holder, final int position) {

        // Gets a single item in the list from its position

        final Portal portalObject = listPortals.get(position);

        // The holder argument is used to reference the views inside the viewHolder

        // Populate the views with the data from the list
        holder.mButton.setText(portalObject.getmLinkName());

    }

    @Override
    public int getItemCount() {

        return listPortals.size();
    }
}