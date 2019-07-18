package com.example.visitor.demo02;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * 窗体类
 * @author hzq
 * @date 2019/7/18 12:52
 */
public class MaterialWin extends JFrame implements ItemListener {

    JPanel CenterJP;
    /**
     * 材料集对象
     */
    SetMaterial os;
    /**
     * 访问者对象
     */
    Company visitor1,visitor2;
    String[] select;

    public MaterialWin(){
        super("利用访问者模式设计艺术公司和造币公司");
        JRadioButton Art;
        JRadioButton mint;
        os = new SetMaterial();
        os.add(new Cuprum());
        os.add(new Paper());
        //艺术公司
        visitor1 = new ArtCompany();
        //造币公司
        visitor2 = new Mint();
        this.setBounds(10,10,750,350);
        this.setResizable(false);
        CenterJP = new JPanel();
        this.add("Center",CenterJP);
        JPanel SouthJP = new JPanel();
        JLabel yl = new JLabel("原材料有：铜和纸，请选择生产公司：");
        Art = new JRadioButton("艺术公司",true);
        mint = new JRadioButton("造币公司");
        Art.addItemListener(this);
        mint.addItemListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(Art);
        group.add(mint);
        SouthJP.add(yl);
        SouthJP.add(Art);
        SouthJP.add(mint);
        this.add("South",SouthJP);
        //获取产品名
        select = (os.accpet(visitor1)).split(" ");
        //显示产品
        showPicture(select[0],select[1]);
    }

    private void showPicture(String cuprum, String paper) {
        CenterJP.removeAll();    //清除面板内容
        CenterJP.repaint();    //刷新屏幕
        String FileName1 = "design-mode\\src\\main\\resources\\visitor\\" + cuprum + ".jpg";
        String FileName2 = "design-mode\\src\\main\\resources\\visitor\\" + paper + ".jpg";
        JLabel lb = new JLabel(new ImageIcon(FileName1),JLabel.CENTER);
        JLabel rb = new JLabel(new ImageIcon(FileName2),JLabel.CENTER);
        CenterJP.add(lb);
        CenterJP.add(rb);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void itemStateChanged(ItemEvent arg0) {
        JRadioButton jc = (JRadioButton) arg0.getSource();
        if (jc.isSelected()) {
            if (jc.getText() == "造币公司") {

                select = (os.accpet(visitor2)).split(" ");
            } else {
                select = (os.accpet(visitor1)).split(" ");
            }
            //显示选择的产品
            showPicture(select[0],select[1]);
        }
    }
}
