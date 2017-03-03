package com.example.activitytest.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by webbread on 2017/3/1.
 * 活动管理类
 */

public class ActivityCollector {
    public static List<Activity> activities=new ArrayList<>();

    public static void addActivtiy(Activity activity){
        activities.add(activity);
    }

    public static void removeMoveActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for(Activity activity:activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }

}
