package tw.raymondsryang.life.utils;

import android.content.Context;
import android.support.annotation.NonNull;

import tw.raymondsryang.life.config.Config;

public class Utils {

    public static String getStoryImagePath(@NonNull final Context context, @NonNull final String storyId){
        return context.getFilesDir()+"/"+ Config.STORY_PHOTO_DIR+"/"+storyId;
    }

}
