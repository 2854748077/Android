package com.example.notepad;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.notepad.databinding.FragmentSecondBinding;

/**
 * SecondFragment 是一个 Fragment，用于显示应用的第二个界面。
 * 它通过 Navigation 组件实现界面之间的导航。
 */
public class SecondFragment extends Fragment {

    // 使用 ViewBinding 来绑定布局文件，提供对布局元素的直接引用
    private FragmentSecondBinding binding;

    /**
     * 创建并返回与 Fragment 关联的视图层次结构。
     * @param inflater 用于将布局 XML 文件转换为 View 的对象。
     * @param container 当前 Fragment 所在的父容器。
     * @param savedInstanceState 如果 Fragment 是从之前的状态重新创建的，则此参数包含该状态的数据。
     * @return 绑定的根视图。
     */
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // 通过 ViewBinding 获取布局视图
        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot(); // 返回绑定的根视图
    }

    /**
     * 在视图创建完成后调用，可以在这里设置监听器或初始化数据。
     * @param view 与 Fragment 关联的根视图。
     * @param savedInstanceState 如果 Fragment 是从之前的状态重新创建的，则此参数包含该状态的数据。
     */
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // 为按钮设置点击监听器，点击后导航到 FirstFragment
        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 使用 Navigation 组件实现界面跳转
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }

    /**
     * 在视图销毁时调用，用于清理资源。
     */
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        // 解除 ViewBinding 的引用，防止内存泄漏
        binding = null;
    }
}
