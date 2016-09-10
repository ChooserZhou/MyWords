package com.example.mywords;

import android.provider.BaseColumns;

/**
 * Created by 果红艳。 on 2016/9/9 0009.
 */
public class Words {
    public Words() {
    }

    public static abstract class Word implements BaseColumns {
        public static final String TABLE_NAME="words";
        public static final String COLUMN_NAME_WORD="word";
        public static final String COLUMN_NAME_MEANING="meaning";
        public static final String COLUMN_NAME_SAMPLE="sample";
    }
}