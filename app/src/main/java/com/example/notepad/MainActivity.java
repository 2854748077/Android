package com.example.notepad;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;

/**
 * MainActivity 是应用的主入口，负责加载导航组件和处理全局操作。
 */
public class MainActivity extends AppCompatActivity {

   /* // 定义导航栏的配置对象
    private AppBarConfiguration appBarConfiguration;
    // 使用 ViewBinding 绑定 Activity 布局
    private ActivityMainBinding binding;

    *//**
     * 在 Activity 创建时调用，用于初始化视图和设置事件。
     //* @param savedInstanceState 如果 Activity 是从之前的状态重新创建的，则此参数包含该状态的数据。
     *//*
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 使用 ViewBinding 绑定布局
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 设置工具栏 (Toolbar) 作为 ActionBar
        setSupportActionBar(binding.toolbar);

        // 设置导航控制器，用于处理导航逻辑
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        // 配置导航栏，与导航图 (nav_graph) 关联
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        // 设置导航栏与 ActionBar 集成
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        // 设置悬浮按钮 (FloatingActionButton) 的点击事件
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 显示 Snackbar 提示信息
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Button 1: Launch Program 1
        Button buttonProgram1 = findViewById(R.id.button_program1);
        buttonProgram1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NotepadActivity.class);
                startActivity(intent);
            }
        });

        // Button 2: Launch Program 2
        Button buttonProgram2 = findViewById(R.id.button_program2);
        buttonProgram2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, calculate2Activity.class);
                startActivity(intent);
            }
        });

        // Button 3: Launch Program 3
        Button buttonProgram3 = findViewById(R.id.button_program3);
        buttonProgram3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Program3Activity.class);
                startActivity(intent);
            }
        });
    }



    /**
     * 创建选项菜单。
     * @param menu 用于填充的菜单对象。
     * @return true 表示菜单应该显示。
     */
  /*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 加载菜单布局文件
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/


}
