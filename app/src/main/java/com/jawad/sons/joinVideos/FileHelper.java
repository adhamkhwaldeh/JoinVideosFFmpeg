package com.jawad.sons.joinVideos;

import android.content.Context;

import java.io.File;

public class FileHelper {

    public static String outputPath(Context context) {
        String path = context.getExternalFilesDir(null).getAbsolutePath() + "/ffmpeg/";

        File folder = new File(path);
        if (!folder.exists())
            folder.mkdirs();

//        if (folder.exists())
//            Log.v("", "");

        return path;
    }

}
