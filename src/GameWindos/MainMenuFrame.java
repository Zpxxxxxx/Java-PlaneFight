package GameWindos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuFrame extends WorkFrame {
    private JPanel mainPanel;
    private JButton planeFightButton;
    private JButton billiardsButton;
    private JLabel titleLabel;

    private static MainMenuFrame instance;

    private MainMenuFrame() {
        this.setBounds(700, 300, 500, 500);
        this.setTitle("Game Main Menu");
        this.setResizable(false);
        
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        
        // 创建标题
        titleLabel = new JLabel("Game Selection");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setBounds(150, 50, 200, 50);
        mainPanel.add(titleLabel);
        
        // 创建飞机大战按钮
        planeFightButton = new JButton("Plane Fight");
        planeFightButton.setBounds(150, 150, 200, 50);
        planeFightButton.setFont(new Font("Arial", Font.PLAIN, 18));
        mainPanel.add(planeFightButton);
        
        // 创建台球按钮
        billiardsButton = new JButton("Billiards");
        billiardsButton.setBounds(150, 250, 200, 50);
        billiardsButton.setFont(new Font("Arial", Font.PLAIN, 18));
        mainPanel.add(billiardsButton);
        
        this.add(mainPanel);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        addActionListener();
    }
    
    public static MainMenuFrame getInstance() {
        if (instance == null) {
            instance = new MainMenuFrame();
        }
        return instance;
    }
    
    private void addActionListener() {
        planeFightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 关闭当前窗口
                dispose();
                // 打开飞机大战登录界面
                LoginFrame.getInstance();
            }
        });
        
        billiardsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 关闭当前窗口
                dispose();
                // 打开台球游戏界面
                BilliardsFrame.getInstance();
            }
        });
    }
}