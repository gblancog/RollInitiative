/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicemechanics;

import utilities.SmartScroller;
import utilities.OutOfRandomBoundsException;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Gorka
 */
public class GraphicDiceThrower extends JFrame {

    // Description labels
    private JLabel label1d2 = new JLabel();
    private JLabel label1d3 = new JLabel();
    private JLabel label1d4 = new JLabel();
    private JLabel label1d6 = new JLabel();
    private JLabel label1d8 = new JLabel();
    private JLabel label1d10 = new JLabel();
    private JLabel label1d12 = new JLabel();
    private JLabel label1d20 = new JLabel();
    private JLabel label1d100 = new JLabel();
    private JLabel labelGeneric = new JLabel();
    private JLabel labelD = new JLabel();

    // Roll buttons
    private JButton button1d2 = new JButton();
    private JButton button1d3 = new JButton();
    private JButton button1d4 = new JButton();
    private JButton button1d6 = new JButton();
    private JButton button1d8 = new JButton();
    private JButton button1d10 = new JButton();
    private JButton button1d12 = new JButton();
    private JButton button1d20 = new JButton();
    private JButton button1d100 = new JButton();
    private JButton buttonGeneric = new JButton();

    // Dice panels
    private JPanel panel1d2 = new JPanel();
    private JPanel panel1d3 = new JPanel();
    private JPanel panel1d4 = new JPanel();
    private JPanel panel1d6 = new JPanel();
    private JPanel panel1d8 = new JPanel();
    private JPanel panel1d10 = new JPanel();
    private JPanel panel1d12 = new JPanel();
    private JPanel panel1d20 = new JPanel();
    private JPanel panel1d100 = new JPanel();
    private JPanel panelGeneric = new JPanel();
    private JPanel panelD = new JPanel();

    // Generic panel textfields
    private JTextField dices = new JTextField(3);
    private JTextField sides = new JTextField(3);

    // Rolling result output text
    private String output;

    // Output showing textarea for user interface
    private JTextArea outputArea = new JTextArea();
    private JScrollPane scrollableOutput = new JScrollPane(outputArea);

    // Element packing panels
    private JPanel panel1d3toGeneric = new JPanel();
    private JPanel panel1d4to1d100 = new JPanel();
    private JPanel panel1d6to1d20 = new JPanel();
    private JPanel panel1d8to1d12 = new JPanel();

    public GraphicDiceThrower() {
        super("Graphic dice thrower");
        this.setSize(350, 500);
        prepareLayout();
    }

    private void prepareLayout() {
        tagLabels();
        prepareRollButtons();
        preparePanelOneByOne();
        packedPanel();
    }

    private void tagLabels() {
        label1d2.setText("1D2");
        label1d3.setText("1D3");
        label1d4.setText("1D4");
        label1d6.setText("1D6");
        label1d8.setText("1D8");
        label1d10.setText("1D10");
        label1d12.setText("1D12");
        label1d20.setText("1D20");
        label1d100.setText("1D100");
        labelGeneric.setText("Generic dice");

        labelD.setText("D"); // For generic dices

        outputArea.setRows(5);
        outputArea.setColumns(5);
        outputArea.setText("Welcome to my automatic dice thrower! ~~~~ \n");
        outputArea.setEditable(false);
        outputArea.setLineWrap(true);

        scrollableOutput.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        scrollableOutput.setBorder(new EmptyBorder(10, 10, 10, 10));
        new SmartScroller(scrollableOutput);
    }

    private void prepareRollButtons() {

        button1d2.setText("Roll!");
        button1d2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice2();
                output = "You have thrown a 2-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        button1d3.setText("Roll!");
        button1d3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice3();
                output = "You have thrown a 3-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        button1d4.setText("Roll!");
        button1d4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice4();
                output = "You have thrown a 4-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        button1d6.setText("Roll!");
        button1d6.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice6();
                output = "You have thrown a 6-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        button1d8.setText("Roll!");
        button1d8.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice8();
                output = "You have thrown a 8-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        button1d10.setText("Roll!");
        button1d10.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice10();
                output = "You have thrown a 10-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        button1d12.setText("Roll!");
        button1d12.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice12();
                output = "You have thrown a 12-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n ");
            }
        });

        button1d20.setText("Roll!");
        button1d20.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice20();
                output = "You have thrown a 20-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        button1d100.setText("Roll!");
        button1d100.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int rolled = DiceTemplate.getTemplate().rollDice100();
                output = "You have thrown a 100-faces dice, and you got a: "
                        + rolled + "!";
                outputArea.append(output + "\n"
                        + " ------------------------------------ \n");
            }
        });

        buttonGeneric.setText("Roll!");
        buttonGeneric.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    int nDices = new Integer(dices.getText());
                    int nSides = new Integer(sides.getText());

                    if (nDices <= 0 || nSides <= 0) {
                        throw new OutOfRandomBoundsException();
                    }

                    for (int i = 0; i < nDices; i++) {
                        int rolled = DiceTemplate.getTemplate().rollGenericDice(nSides);
                        output = "You have thrown a " + nSides + "-faces dice, and "
                                + "you got a: " + rolled + "!";
                        outputArea.append(output + "\n");
                    }
                    outputArea.append(" ------------------------------------ \n");
                } catch (NumberFormatException ex1) {
                    JOptionPane frame = new JOptionPane();
                    JOptionPane.showMessageDialog(frame,
                            "Please, put two numbers on those input boxes!",
                            "Rolling low on intelligence",
                            JOptionPane.ERROR_MESSAGE);
                } catch (OutOfRandomBoundsException ex2) {
                    JOptionPane frame = new JOptionPane();
                    JOptionPane.showMessageDialog(frame,
                            "Please, put two positive valid numbers!",
                            "Rolling high on charisma",
                            JOptionPane.ERROR_MESSAGE);
                } finally {
                    dices.setText("");
                    sides.setText("");
                }
            }

        });
    }

    private void preparePanelOneByOne() {
        panel1d2.add(label1d2, BorderLayout.WEST);
        panel1d2.add(button1d2, BorderLayout.EAST);

        panel1d3.add(label1d3, BorderLayout.WEST);
        panel1d3.add(button1d3, BorderLayout.EAST);

        panel1d4.add(label1d4, BorderLayout.WEST);
        panel1d4.add(button1d4, BorderLayout.EAST);

        panel1d6.add(label1d6, BorderLayout.WEST);
        panel1d6.add(button1d6, BorderLayout.EAST);

        panel1d8.add(label1d8, BorderLayout.WEST);
        panel1d8.add(button1d8, BorderLayout.EAST);

        panel1d10.add(label1d10, BorderLayout.WEST);
        panel1d10.add(button1d10, BorderLayout.EAST);

        panel1d12.add(label1d12, BorderLayout.WEST);
        panel1d12.add(button1d12, BorderLayout.EAST);

        panel1d20.add(label1d20, BorderLayout.WEST);
        panel1d20.add(button1d20, BorderLayout.EAST);

        panel1d100.add(label1d100, BorderLayout.WEST);
        panel1d100.add(button1d100, BorderLayout.EAST);

        // Generic panel requires a little bit more effort
        panelD.add(dices, BorderLayout.WEST);
        panelD.add(labelD, BorderLayout.CENTER);
        panelD.add(sides, BorderLayout.EAST);

        panelGeneric.add(panelD, BorderLayout.WEST);
        panelGeneric.add(buttonGeneric, BorderLayout.EAST);
    }

    private void packedPanel() {

        setPanelLayouts();

        //Pack: [1d8, 1d10, 1d12]
        panel1d8to1d12.add(panel1d8, BorderLayout.NORTH);
        panel1d8to1d12.add(panel1d10, BorderLayout.CENTER);
        panel1d8to1d12.add(panel1d12, BorderLayout.SOUTH);

        //Pack: [1d6, [1d8, 1d10, 1d12], 1d20]
        panel1d6to1d20.add(panel1d6, BorderLayout.NORTH);
        panel1d6to1d20.add(panel1d8to1d12, BorderLayout.CENTER);
        panel1d6to1d20.add(panel1d20, BorderLayout.SOUTH);

        //Pack: [1d4, [1d6, [1d8, 1d10, 1d12], 1d20], 1d100]
        panel1d4to1d100.add(panel1d4, BorderLayout.NORTH);
        panel1d4to1d100.add(panel1d6to1d20, BorderLayout.CENTER);
        panel1d4to1d100.add(panel1d100, BorderLayout.SOUTH);

        //Pack: [1d3, [1d4, [1d6, [1d8, 1d10, 1d12], 1d20], 1d100], genericDice]
        panel1d3toGeneric.add(panel1d3, BorderLayout.NORTH);
        panel1d3toGeneric.add(panel1d4to1d100, BorderLayout.CENTER);
        panel1d3toGeneric.add(panelGeneric, BorderLayout.SOUTH);

        // Final countdown
        this.getContentPane().add(panel1d2, BorderLayout.NORTH);
        this.getContentPane().add(panel1d3toGeneric, BorderLayout.CENTER);
        this.getContentPane().add(scrollableOutput, BorderLayout.SOUTH);
    }

    private void setPanelLayouts() {
        panel1d3toGeneric.setLayout(new BorderLayout());
        panel1d4to1d100.setLayout(new BorderLayout());
        panel1d6to1d20.setLayout(new BorderLayout());
        panel1d8to1d12.setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        GraphicDiceThrower frame = new GraphicDiceThrower();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
