package com.example.dominic.naijanews.db;

/**
 * Created by dominic on 18/06/2015.
 */
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class TaskContract {
    public static final String DB_NAME = "com.example.dominic.naijanews.db.tasks";
    public static final int DB_VERSION = 1;
    public static final String TABLE = "tasks";
    public static final String AUTHORITY = "com.example.dominic.naijanews.db.mytasks";
    public static final Uri CONTENT_URI = Uri.parse("content://"+AUTHORITY+"/"+ TABLE);
    public static final int TASKS_LIST = 1;
    public static final int TASKS_ITEM = 2;
    public static final String CONTENT_TYPE = ContentResolver.CURSOR_DIR_BASE_TYPE + "/example.tasksDB/"+TABLE;
    public static final String CONTENT_ITEM_TYPE = ContentResolver.CURSOR_ITEM_BASE_TYPE + "/example/tasksDB" + TABLE;


    public class Columns {
        public static final String TASK = "task";
        public static final String _ID = BaseColumns._ID;
    }
}
