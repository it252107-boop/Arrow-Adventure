<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="200dp"
    android:background="@drawable/map"
    android:orientation="vertical"
    android:padding="24dp"
  >

    <TextView
        android:id="@+id/dialog_title"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:gravity="center"
        android:text="QUEST START!"
        android:fontFamily="@font/pixelmplus12regular"
        android:textColor="@color/black"
        android:textSize="30dp"
        android:textStyle="bold"
        android:layout_marginTop="60dp"/>

    <View
        android:layout_width="match_parent"
        android:layout_height="2dp"
        android:layout_marginTop="8dp"
        android:layout_marginBottom="16dp"
        android:background="@color/black" />

    <TextView
        android:id="@+id/dialog_message"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:lineSpacingExtra="4dp"
        android:text="クエストの内容がここに入ります"
        android:textColor="@color/black"
        android:textSize="16sp" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="24dp"
        android:orientation="horizontal">

        <Button
            android:id="@+id/btn_cancel"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginEnd="8dp"
            android:layout_weight="1"
            android:backgroundTint="#1565C0"
            app:backgroundTint="#1565C0"
            android:text="逃げる"
            android:textSize="20dp"
            android:fontFamily="@font/pixelmplus12regular"
            android:textColor="#FFFFFF" />

        <Button
            android:id="@+id/btn_accept"
            android:layout_width="0dp"
            android:layout_height="wrap_content"
            android:layout_marginStart="8dp"
            android:layout_weight="1"
            android:backgroundTint="#ffd700"
            app:backgroundTint="#ffd700"
            android:text="挑戦する！"
            android:textSize="20dp"
            android:fontFamily="@font/pixelmplus12regular"
            android:textColor="#000000"
            android:textStyle="bold" />

    </LinearLayout>

</LinearLayout>