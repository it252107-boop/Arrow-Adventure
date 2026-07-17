<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/naviInfo"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <TextView
        android:id="@+id/headerTitle"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:padding="16dp"
        android:text="冒険の記録"
        android:fontFamily="@font/pixelmplus12regular"
        android:letterSpacing="1.0"
        android:textSize="30sp"
        android:gravity="center"
        android:textColor="@color/textcolor"/>

    <View
        android:id="@+id/myLine"
        android:layout_width="match_parent"
        android:layout_height="5dp"
        android:background="@color/sen" />

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/historyRecyclerView"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:scrollbars="vertical"
        android:contentDescription="履歴一覧"
        tools:listitem="@android:layout/simple_list_item_1" />
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:weightSum="2">

    <Button
        android:id="@+id/backButton"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:layout_marginLeft="30dp"
        android:layout_marginRight="30dp"
        android:fontFamily="@font/pixelmplus12regular"
        android:text="戻る"
        android:backgroundTint="#546E7A"
        android:textSize="40sp" />

    <Button
        android:id="@+id/rirekiclear"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"
        android:layout_marginRight="30dp"
        android:fontFamily="@font/pixelmplus12regular"
        android:text="記録削除"
        android:backgroundTint="#f62e36"
        android:textSize="30sp" />
    </LinearLayout>

</LinearLayout>