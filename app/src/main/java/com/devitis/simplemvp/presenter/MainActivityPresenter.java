package com.devitis.simplemvp.presenter;

import android.view.View;

import com.devitis.simplemvp.model.Location;

/**
 * Created by Diana on 21.03.2019.
 */

public class MainActivityPresenter {

    private Location location;
    private View view;

    public MainActivityPresenter(View view) {
        this.location = new Location();
        this.view = view;
    }

    public void updateLat(String lat) {
        location.setLat(lat);
        view.updateLocationInfoTextView(location.toString());
    }

    public void updateLon(String lon) {
        location.setLon(lon);
        view.updateLocationInfoTextView(location.toString());
    }

    public interface View {

        void updateLocationInfoTextView(String info);

    }
}
