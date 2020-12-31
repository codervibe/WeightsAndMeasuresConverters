package com.codervibe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Administrator on 2020/12/15  0015
 * @author Administrator
 * DateTime:2020/12/15 16:47
 * Description:度量衡转换器
 * Others:Weights and measures converters
 */

public class Conversion extends JFrame implements ActionListener {
    //设置组件
    /**
     * 工具栏
     */
    JToolBar toolBar = new JToolBar();
    /**
     * 定义所有的按钮
     */
    JButton picLength = new JButton("长度(L)");

    JButton picSquare = new JButton("面积(S)");

    JButton picVolume = new JButton("体积(V)");

    JButton picTemper = new JButton("温度(K)");
    /**
     * 定义面板
     */
    JPanel boxLength = new JPanel();

    JPanel boxSquare = new JPanel();

    JPanel boxVolume = new JPanel();

    JPanel boxTemper = new JPanel();

    /**
     * 定义菜单栏
     */
    JMenuBar jMenuBar = new JMenuBar();

    JMenu aboutMenu = new JMenu("帮助");

    JMenuItem aboutItem = new JMenuItem("程序说明");

    String[] length = {"厘米（cm）", "分米（dm）", "米（m）", "千米（km）"};

    String[] square = {"平方厘米（cm^2）", "平方分米（dm^2）", "平方米（m^2）"};

    String[] volume = {"立方厘米（cm^3）=毫升（mL）", "立方分米（dm^3）=升（L）", "立方米（m^3）"};

    String[] temper = {"摄氏度（℃）", "华氏度（℉）", "开尔文度（°K）"};

    //输入

    JComboBox jbxLength = new JComboBox(length);

    JComboBox jbxSquare = new JComboBox(square);

    JComboBox jbxVolume = new JComboBox(volume);

    JComboBox jbxTemper = new JComboBox(temper);

    //转换成

    JComboBox jbxLength1 = new JComboBox(length);

    JComboBox jbxSquare1 = new JComboBox(square);

    JComboBox jbxVolume1 = new JComboBox(volume);

    JComboBox jbxTemper1 = new JComboBox(temper);

    //输入框

    JTextField jtfLength = new JTextField(20);

    JTextField jtfLength1 = new JTextField(20);

    JTextField jtfSquare = new JTextField(20);

    JTextField jtfSquare1 = new JTextField(20);

    JTextField jtfVolume = new JTextField(20);

    JTextField jtfVolume1 = new JTextField(20);

    JTextField jtfTemper = new JTextField(20);

    JTextField jtfTemper1 = new JTextField(20);

    CardLayout centerLayout = new CardLayout(5, 5);

    JPanel centerPane = new JPanel();

    private static final long serialVersionUID = 1L;

    public Conversion() {
        //设置输入框是否可编辑

        jtfLength1.setEditable(false);

        jtfSquare1.setEditable(false);

        jtfVolume1.setEditable(false);

        jtfTemper1.setEditable(false);
        //设置标题
        setTitle("度量衡换算器");
        //设置可调整大小
        setResizable(false);
        //设置默认关闭操作
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置面板的布局
        boxLength.setLayout(new BoxLayout(boxLength, BoxLayout.Y_AXIS));

        boxSquare.setLayout(new BoxLayout(boxSquare, BoxLayout.Y_AXIS));

        boxVolume.setLayout(new BoxLayout(boxVolume, BoxLayout.Y_AXIS));

        boxTemper.setLayout(new BoxLayout(boxTemper, BoxLayout.Y_AXIS));

        //在工具栏中添加按钮组件

        toolBar.add(picLength);

        toolBar.add(picSquare);

        toolBar.add(picVolume);

        toolBar.add(picTemper);

        //设置快捷键 Alt+对应字母
        picLength.setMnemonic('L');

        picSquare.setMnemonic('S');

        picVolume.setMnemonic('V');

        picTemper.setMnemonic('K');

        //长度布局
        boxLength.add(new JLabel("输入:"));

        boxLength.add(jbxLength);

        boxLength.add(jtfLength);

        boxLength.add(new JLabel("转换成:"));

        boxLength.add(jbxLength1);

        boxLength.add(jtfLength1);

        //面积布局
        boxSquare.add(new JLabel("输入:"));

        boxSquare.add(jbxSquare);

        boxSquare.add(jtfSquare);

        boxSquare.add(new JLabel("转换成:"));

        boxSquare.add(jbxSquare1);

        boxSquare.add(jtfSquare1);

        //体积布局
        boxVolume.add(new JLabel("输入:"));

        boxVolume.add(jbxVolume);

        boxVolume.add(jtfVolume);

        boxVolume.add(new JLabel("转换成:"));

        boxVolume.add(jbxVolume1);

        boxVolume.add(jtfVolume1);

        //温度布局
        boxTemper.add(new JLabel("输入:"));

        boxTemper.add(jbxTemper);

        boxTemper.add(jtfTemper);

        boxTemper.add(new JLabel("转换成:"));

        boxTemper.add(jbxTemper1);

        boxTemper.add(jtfTemper1);

        //设置中心区布局
        centerPane.setLayout(centerLayout);

        centerPane.add("Length page", boxLength);

        centerPane.add("Square page", boxSquare);

        centerPane.add("Volume page", boxVolume);

        centerPane.add("Temperature page", boxTemper);

        aboutMenu.add(aboutItem);

        jMenuBar.add(aboutMenu);

        setJMenuBar(jMenuBar);

        Container contentPane = getContentPane();

        contentPane.add(toolBar, BorderLayout.NORTH);

        contentPane.add(centerPane, BorderLayout.CENTER);
        //菜单栏的监听事件
        aboutItem.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ap) {
                AboutFrame aboutFrame = new AboutFrame();

            }

        });


        //为工具栏中组件添加监听

        picLength.addActionListener(this);

        picSquare.addActionListener(this);

        picVolume.addActionListener(this);

        picTemper.addActionListener(this);


        //各个面板中下拉框添加监听

        jtfLength.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                indexListener(1);

            }

        });

        jtfLength.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent arg0) {
            }

            @Override
            public void focusLost(FocusEvent arg0) {
            }

        });

        jbxLength1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (jtfLength.getText().equals("")) {
                    jtfLength.setText("0");

                }

                indexListener(1);

            }

        });

        jtfSquare.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                indexListener(2);

            }

        });

        jbxSquare1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (jtfSquare.getText().equals("")) {
                    jtfSquare.setText("0");

                }

                indexListener(2);

            }

        });

        jtfVolume.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                indexListener(3);

            }

        });

        jbxVolume1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (jtfVolume.getText().equals("")) {
                    jtfVolume.setText("0");

                }

                indexListener(3);

            }

        });

        jtfTemper.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                indexListener(4);

            }

        });

        jbxTemper1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                if (jtfTemper.getText().equals("")) {
                    jtfTemper.setText("0");

                }

                indexListener(4);

            }

        });

    }

    public void indexListener(int index) {
        //换算关系的方法
        switch (index) {

            //长度
            case 1:

                int cb10 = jbxLength.getSelectedIndex();

                int cb11 = jbxLength1.getSelectedIndex();

                Double temDouble1;

                temDouble1 = Double.valueOf(jtfLength.getText().trim());

                if (cb10 == cb11) {
                } else if (cb10 == 0 && cb11 == 1) {
                    temDouble1 /= 10;
                } else if (cb10 == 0 && cb11 == 2) {
                    temDouble1 /= 100;
                } else if (cb10 == 0 && cb11 == 3) {
                    temDouble1 /= 100 * 1000;
                } else if (cb10 == 1 && cb11 == 0) {
                    temDouble1 *= 10;
                } else if (cb10 == 1 && cb11 == 2) {
                    temDouble1 /= 10;
                } else if (cb10 == 1 && cb11 == 3) {
                    temDouble1 /= 10 * 1000;
                } else if (cb10 == 2 && cb11 == 0) {
                    temDouble1 *= 100;
                } else if (cb10 == 2 && cb11 == 1) {
                    temDouble1 *= 10;
                } else if (cb10 == 2 && cb11 == 3) {
                    temDouble1 /= 1000;
                } else if (cb10 == 3 && cb11 == 0) {
                    temDouble1 *= 100 * 1000;
                } else if (cb10 == 3 && cb11 == 1) {
                    temDouble1 *= 10 * 1000;
                } else if (cb10 == 3 && cb11 == 2) {
                    temDouble1 *= 1000;
                }

                jtfLength1.setText(temDouble1.toString());

                break;
            //面积
            case 2:

                int cb20 = jbxSquare.getSelectedIndex();

                int cb21 = jbxSquare1.getSelectedIndex();

                Double temDouble2;

                temDouble2 = Double.valueOf(jtfSquare.getText().trim());

                if ((cb20 == cb21)) {
                } else if (cb20 == 0 && cb21 == 1) {
                    temDouble2 /= 100;
                } else if (cb20 == 0 && cb21 == 2) {
                    temDouble2 /= 10000;
                } else if (cb20 == 1 && cb21 == 0) {
                    temDouble2 *= 100;
                } else if (cb20 == 1 && cb21 == 2) {
                    temDouble2 /= 100;
                } else if (cb20 == 2 && cb21 == 0) {
                    temDouble2 *= 10000;
                } else if (cb20 == 2 && cb21 == 1) {
                    temDouble2 *= 100;
                }

                jtfSquare1.setText(temDouble2.toString());

                break;
            //体积
            case 3:

                int cb30 = jbxVolume.getSelectedIndex();

                int cb31 = jbxVolume1.getSelectedIndex();

                Double temDouble3;

                temDouble3 = Double.valueOf(jtfVolume.getText().trim());

                if ((cb30 == cb31)) {
                } else if (cb30 == 0 && cb31 == 1) {
                    temDouble3 /= 1000;
                } else if (cb30 == 0 && cb31 == 2) {
                    temDouble3 /= 1000000;
                } else if (cb30 == 1 && cb31 == 0) {
                    temDouble3 *= 1000;
                } else if (cb30 == 1 && cb31 == 2) {
                    temDouble3 /= 1000;
                } else if (cb30 == 2 && cb31 == 0) {
                    temDouble3 *= 1000000;
                } else if (cb30 == 2 && cb31 == 1) {
                    temDouble3 *= 1000;
                }

                jtfVolume1.setText(temDouble3.toString());

                break;
            //温度
            case 4:

                int cb40 = jbxTemper.getSelectedIndex();

                int cb41 = jbxTemper1.getSelectedIndex();

                Double temDouble4;

                temDouble4 = Double.valueOf(jtfTemper.getText().trim());

                if ((cb40 == cb41)) {
                } else if (cb40 == 0 && cb41 == 1) {
                    temDouble4 = (temDouble4 * 9 / 5) + 32;
                } else if (cb40 == 0 && cb41 == 2) {
                    temDouble4 += 273.16;
                } else if (cb40 == 1 && cb41 == 0) {
                    temDouble4 = (temDouble4 - 32) * 5 / 9;
                }//C＝(F－32)×5／9

                else if (cb40 == 1 && cb41 == 2) {
                    temDouble4 = (temDouble4 - 32) * 5 / 9 + 273.16;
                } else if (cb40 == 2 && cb41 == 0) {
                    temDouble4 -= 273.16;
                } else if (cb40 == 2 && cb41 == 1) {
                    temDouble4 = (temDouble4 - 273.16) * 9 / 5 + 32;
                }//K ->℉

                jtfTemper1.setText(temDouble4.toString());

                break;

            default:
                break;

        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if (e.getSource() == picLength) {
            centerLayout.first(centerPane);

        } else if (e.getSource() == picSquare) {
            centerLayout.first(centerPane);

            centerLayout.next(centerPane);

        } else if (e.getSource() == picVolume) {
            centerLayout.first(centerPane);

            centerLayout.next(centerPane);

            centerLayout.next(centerPane);

        } else if (e.getSource() == picTemper) {
            //1
            centerLayout.first(centerPane);

            //2
            centerLayout.next(centerPane);

            //3
            centerLayout.next(centerPane);

            //4
            centerLayout.next(centerPane);

        }

    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        } catch (Exception e) {

        }

        Conversion conversion = new Conversion();

        conversion.pack();

        conversion.setVisible(true);

    }

}




