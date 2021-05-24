package com.jd;

import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @description: 摸鱼插件主窗口
 * @author: jiangzixu
 * @date: 2021/5/24 8:20 下午
 */
public class MoyuWindow implements ToolWindowFactory {

    @Override
    public boolean isApplicable(@NotNull Project project) {
        return false;
    }

    @Override
    public void init(@NotNull ToolWindow toolWindow) {

    }

    @Override
    public boolean shouldBeAvailable(@NotNull Project project) {
        return false;
    }

    @Override
    public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
// myToolWindow=toolWindow;
        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        @Nullable JComponent mainPanel = null;
        Content content = contentFactory.createContent(mainPanel,"", false);
        toolWindow.getContentManager().addContent(content);
    }
}
