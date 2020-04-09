package com.example.music_player;

import android.app.Application;

import com.example.music_player.dagger2.DaggerNetworkComponent;
import com.example.music_player.dagger2.NetworksModule;
import com.example.music_player.dagger2.NetworkComponent;


public class CustomApplication extends Application {
    private NetworkComponent networkComponent;

    @Override
    public void onCreate(){
        super.onCreate();

        networkComponent = DaggerNetworkComponent.builder()
                .networksModule(new NetworksModule(Helper.URL))
                .build();
    }
    public NetworkComponent getNetworkComponent(){
        return networkComponent;
    }

}
