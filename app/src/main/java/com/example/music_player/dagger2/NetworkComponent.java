package com.example.music_player.dagger2;


import com.example.music_player.MainActivity;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetworksModule.class})
public interface NetworkComponent {
    public void inject(MainActivity activity);
}
