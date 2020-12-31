package com.codervibe;

import javax.swing.*;
import java.awt.*;

/**
 * 创建about类继承JFrame
 *
 * @author Administrator
 */
public class AboutFrame extends JFrame {
    /**
     * 定义内容窗格
     */
    JPanel contentPane;
    /**
     * 定义滚动窗格
     */
    JScrollPane jsPane = new JScrollPane();
    /**
     * 设置文字区
     */
    JTextArea aboutText = new JTextArea(5, 5);


    public AboutFrame() {
        //启用事件
        enableEvents(AWTEvent.WINDOW_EVENT_MASK);
        //设置大小
        setSize(new Dimension(600, 500));
        //设置默认关闭操作
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        contentPane = (JPanel) getContentPane();

        contentPane.setLayout(new BorderLayout());

        setSize(new Dimension(400, 300));

        setTitle("程序说明");

        contentPane = (JPanel) getContentPane();

        contentPane.setLayout(new BorderLayout());


        jsPane.getViewport().add(aboutText, null);

        contentPane.add(jsPane, "Center");

        this.aboutText.setEditable(false);

    }

}

