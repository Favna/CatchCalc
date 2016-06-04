package Controllers;

import Models.Components;
import Models.Pokemon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Controller extends JFrame {

    Components varData = new Components();
    Pokemon pokemons = new Pokemon();

//<editor-fold defaultstate="collapsed" desc="Calculation Variables">
    public static int selectedSpecies;
    public static int selectedGeneration;
    public static int selectedGame;
    private int selectedBall;
    private int levelOpponent;
    private double statusMultiplier;
    private double oPowerMultiplier;
    private double ballMultiplier;
    private double multiplier;
    private double roundedCatchProbability;

    //</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Component variables">
    //Buttons
    private JButton btnCalc;

    //Comboboxes
    private JComboBox cbxBall;
    private JComboBox cbxGame;
    private JComboBox cbxGeneration;
    private JComboBox cbxInput1;
    private JComboBox cbxInput2;
    private JComboBox cbxOPower;
    private JComboBox cbxSpecies;
    private JComboBox cbxStatus;

    //Labels
    private JLabel lblBall;
    private JLabel lblBonusses;
    private JLabel lblCave;
    private JLabel lblChance;
    private JLabel lblCurrent;
    private JLabel lblGame;
    private JLabel lblGameQuestion;
    private JLabel lblGeneration;
    private JLabel lblHP;
    private JLabel lblMax;
    private JLabel lblOPower;
    private JLabel lblSpecies;
    private JLabel lblSpeciesQuestion;
    private JLabel lblStatus;
    private JLabel lblVariable;

    //Panels
    private JPanel pnlBonusses;
    private JPanel pnlCalculator;
    private JPanel pnlGame;
    private JPanel pnlHP;
    private JPanel pnlSpecies;
    private JPanel pnlVariables;

    //Textfields
    private JTextField txtCurrent;
    private JTextField txtInput1;
    private JTextField txtMax;
//</editor-fold>

    public Controller() {
        createComponents();
        componentProperties();
        setComponentVisibility(false, false, false, false, false);
        setDefaultModels();
        addingListeners();
    }

    private void createComponents() {
        pnlGame = new JPanel();
        pnlSpecies = new JPanel();
        pnlHP = new JPanel();
        pnlBonusses = new JPanel();
        pnlVariables = new JPanel();
        pnlCalculator = new JPanel();

        cbxGame = new JComboBox();
        cbxGeneration = new JComboBox();
        cbxSpecies = new JComboBox();
        txtMax = new JTextField();
        txtCurrent = new JTextField();
        cbxBall = new JComboBox();
        txtInput1 = new JTextField();
        cbxInput1 = new JComboBox();
        cbxInput2 = new JComboBox();
        cbxStatus = new JComboBox();
        cbxOPower = new JComboBox();
        btnCalc = new JButton();

        lblSpecies = new JLabel();
        lblGeneration = new JLabel();
        lblSpeciesQuestion = new JLabel();
        lblCurrent = new JLabel();
        lblMax = new JLabel();
        lblHP = new JLabel();
        lblBonusses = new JLabel();
        lblBall = new JLabel();
        lblStatus = new JLabel();
        lblOPower = new JLabel();
        lblVariable = new JLabel();
        lblCave = new JLabel();
        lblChance = new JLabel();
        lblGame = new JLabel();
        lblGameQuestion = new JLabel();
    }

    private void componentProperties() {
//<editor-fold defaultstate="collapsed" desc="Panels">
        //    pnlGame.setEnabled(true);
        pnlGame.setLayout(null);
        pnlGame.setOpaque(true);

        pnlSpecies.setLayout(null);
        pnlSpecies.setOpaque(true);

        pnlHP.setLayout(null);
        pnlHP.setOpaque(true);

        pnlBonusses.setLayout(null);
        pnlBonusses.setOpaque(true);

        pnlVariables.setLayout(null);
        pnlVariables.setOpaque(true);

        pnlCalculator.setLayout(null);
        pnlCalculator.setOpaque(true);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Labels">
        lblGame.setText("Game");
        lblGameQuestion.setText("What game are you playing?");
        lblSpecies.setText("Species");
        lblSpeciesQuestion.setText("Species");
        lblGeneration.setText("Generation");
        lblHP.setText("HP");
        lblCurrent.setText("Current:");
        lblMax.setText("Maximum:");
        lblBonusses.setText("Bonusses");
        lblBall.setText("Ball:");
        lblStatus.setText("Status:");
        lblOPower.setText("O-Power level:");
        lblVariable.setText("");
        lblCave.setText("");
        lblChance.setText("");
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Button">
        btnCalc.setText("Calculate chance to catch");
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Adding components to panels">
        pnlGame.add(lblGame);
        pnlGame.add(lblGameQuestion);
        pnlGame.add(cbxGame);

        pnlSpecies.add(lblSpecies);
        pnlSpecies.add(lblSpeciesQuestion);
        pnlSpecies.add(lblGeneration);
        pnlSpecies.add(cbxGeneration);
        pnlSpecies.add(cbxSpecies);

        pnlHP.add(lblHP);
        pnlHP.add(lblCurrent);
        pnlHP.add(lblMax);
        pnlHP.add(txtCurrent);
        pnlHP.add(txtMax);

        pnlBonusses.add(lblBonusses);
        pnlBonusses.add(lblBall);
        pnlBonusses.add(lblStatus);
        pnlBonusses.add(lblOPower);
        pnlBonusses.add(cbxBall);
        pnlBonusses.add(cbxStatus);
        pnlBonusses.add(cbxOPower);
        pnlBonusses.add(pnlVariables);

        pnlVariables.add(lblVariable);
        pnlVariables.add(lblCave);
        pnlVariables.add(txtInput1);
        pnlVariables.add(cbxInput1);
        pnlVariables.add(cbxInput2);

        pnlCalculator.add(btnCalc);
        pnlCalculator.add(lblChance);
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Setting bounds">
        pnlGame.setBounds(10, 15, 700, 50);
        pnlSpecies.setBounds(10, 76, 700, 50);
        pnlHP.setBounds(10, 137, 700, 110);
        pnlBonusses.setBounds(10, 258, 700, 137);
        pnlVariables.setBounds(270, 30, 420, 100);
        pnlCalculator.setBounds(10, 406, 700, 40);

        lblSpecies.setBounds(0, 0, 60, 20);
        lblGeneration.setBounds(0, 20, 80, 20);
        lblSpeciesQuestion.setBounds(290, 20, 60, 20);
        lblMax.setBounds(10, 80, 80, 20);
        lblCurrent.setBounds(10, 40, 80, 20);
        lblBonusses.setBounds(0, 0, 60, 30);
        lblBall.setBounds(10, 40, 40, 20);
        lblStatus.setBounds(10, 70, 80, 20);
        lblOPower.setBounds(10, 100, 120, 20);
        lblVariable.setBounds(50, 10, 180, 20);
        lblCave.setBounds(50, 40, 180, 20);
        lblGame.setBounds(0, 0, 50, 20);
        lblGameQuestion.setBounds(0, 20, 200, 20);
        lblChance.setBounds(250, 10, 500, 20);
        lblHP.setBounds(0, 0, 20, 30);

        cbxGame.setBounds(220, 20, 100, 20);
        cbxSpecies.setBounds(360, 20, 260, 20);
        cbxBall.setBounds(130, 40, 180, 20);
        cbxStatus.setBounds(130, 70, 180, 20);
        cbxOPower.setBounds(130, 100, 180, 20);
        cbxInput1.setBounds(180, 10, 190, 20);
        cbxInput2.setBounds(180, 40, 190, 20);
        cbxGeneration.setBounds(80, 20, 200, 20);

        txtInput1.setBounds(180, 10, 190, 25);
        txtMax.setBounds(130, 80, 200, 25);
        txtCurrent.setBounds(130, 40, 200, 25);

        btnCalc.setBounds(10, 10, 210, 30);
//</editor-fold>
        this.add(pnlGame);
        this.add(pnlSpecies);
        this.add(pnlHP);
        this.add(pnlBonusses);
        this.add(pnlCalculator);
    }

    private void setComponentVisibility(boolean variable, boolean cave, boolean text1, boolean cbx1, boolean cbx2) {
        lblVariable.setVisible(variable);
        lblCave.setVisible(cave);
        txtInput1.setVisible(text1);
        cbxInput1.setVisible(cbx1);
        cbxInput2.setVisible(cbx2);
    }

    private void setDefaultModels() {
        cbxBall.setModel(varData.getBallOptions());
        cbxGame.setModel(varData.getGameOptions());
        cbxGeneration.setModel(varData.getGenSelect());
        cbxOPower.setModel(varData.getoPowerOptions());
        cbxStatus.setModel(varData.getStatusOptions());
        cbxSpecies.setModel(varData.getGen1species());
        cbxInput1.setModel(varData.getEmptySelect());
        cbxInput2.setModel(varData.getEmptySelect());
    }

    private void addingListeners() {
        cbxGeneration.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                anotherGenerationSelected();
                selectedGeneration = cbxGeneration.getSelectedIndex();
            }
        });

        cbxSpecies.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                selectedSpecies = cbxSpecies.getSelectedIndex();
            }
        });

        cbxGame.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                selectedGame = cbxGame.getSelectedIndex();
            }
        });

        cbxBall.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                anotherBallSelected();
                selectedBall = cbxBall.getSelectedIndex();
            }
        });

        btnCalc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                calculateCatchRate();
            }
        });

        txtMax.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                txtMax.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //Nothing
            }
        });

        txtCurrent.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                txtCurrent.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //Nothing
            }
        });

        txtInput1.addFocusListener(new FocusListener() {

            @Override
            public void focusGained(FocusEvent e) {
                txtInput1.selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {
                //Nothing
            }
        });
    }

    private void anotherGenerationSelected() {
        if (cbxGeneration.getSelectedIndex() == 0) {
            cbxSpecies.setModel(varData.getGen1species());
        } else if (cbxGeneration.getSelectedIndex() == 1) {
            cbxSpecies.setModel(varData.getGen2species());
        } else if (cbxGeneration.getSelectedIndex() == 2) {
            cbxSpecies.setModel(varData.getGen3species());
        } else if (cbxGeneration.getSelectedIndex() == 3) {
            cbxSpecies.setModel(varData.getGen4species());
        } else if (cbxGeneration.getSelectedIndex() == 4) {
            cbxSpecies.setModel(varData.getGen5species());
        } else if (cbxGeneration.getSelectedIndex() == 5) {
            cbxSpecies.setModel(varData.getGen6species());
        }
        selectedSpecies = cbxSpecies.getSelectedIndex();
    }

    private void anotherBallSelected() {
        switch (cbxBall.getSelectedIndex()) {
            case 6: //Nest Ball
                lblVariable.setText("Opponent level?");
                setComponentVisibility(true, false, true, false, false);
                break;
            case 7: //Repeat Ball
                lblVariable.setText("Caught before?");
                setComponentVisibility(true, false, false, true, false);
                cbxInput1.setModel(varData.getSimpleSelect());
                break;
            case 8: //Timer Ball
                lblVariable.setText("Turn number?");
                setComponentVisibility(true, false, true, false, false);
                break;
            case 11: //Dive Ball
                lblVariable.setText("Water or land?");
                setComponentVisibility(true, false, false, true, false);
                cbxInput1.setModel(varData.getDivingSelect());
                break;
            case 12: //Dusk Ball
                lblCave.setText("Are you in a cave?");
                lblVariable.setText("Day or night?");
                setComponentVisibility(true, true, false, true, true);
                cbxInput1.setModel(varData.getTimerSelect());
                cbxInput2.setModel(varData.getSimpleSelect());
                break;
            case 13: //Quick Ball
                lblVariable.setText("First turn?");
                setComponentVisibility(true, false, false, true, false);
                cbxInput1.setModel(varData.getQuickSelect());
                break;
            default:
                lblVariable.setText("");
                setComponentVisibility(false, false, false, false, false);
                cbxInput1.setModel(varData.getEmptySelect());
                cbxInput2.setModel(varData.getEmptySelect());
                break;
        }
    }

    private void ballCheck() {
        ballMultiplier = 0;
        multiplier = 0;

        selectedBall = cbxBall.getSelectedIndex();
        switch (selectedBall) {
            case 1: //Great Ball
                ballMultiplier = 1.5;
                break;
            case 2: //Ultra Ball
                ballMultiplier = 2.0;
                break;
            case 4: //Safari Ball
                ballMultiplier = 1.5;
                break;
            case 5: //Net Ball
                if (pokemons.isWaterOrBug()) {
                    ballMultiplier = 3.0;
                } else {
                    ballMultiplier = 1.0;
                }
                break;
            case 6: //Nest Ball
                levelOpponent = Integer.parseInt(txtInput1.getText());
                multiplier = (41 - levelOpponent) / 10;
                if (multiplier <= 1.0) {
                    ballMultiplier = 1.0;
                } else {
                    ballMultiplier = multiplier;
                }
                break;
            case 7: //Repeat Ball
                if (cbxInput1.getSelectedIndex() == 1) {
                    ballMultiplier = 3.0;
                } else {
                    ballMultiplier = 1.0;
                }
                break;
            case 8: //Timer Ball
                double numberOfTurns = Double.parseDouble(txtInput1.getText()) - 1;
                if (numberOfTurns == -1) {
                    numberOfTurns = 0;
                }
                multiplier = (1 + numberOfTurns * 1229 / 4096);
                if (multiplier >= 4.0) {
                    ballMultiplier = 4.0;
                } else if (multiplier < 1.0) {
                    ballMultiplier = 1.0;
                } else {
                    ballMultiplier = multiplier;
                }
                break;
            case 11: //Dive Ball
                if (cbxInput1.getSelectedIndex() != 0) {
                    ballMultiplier = 3.5;
                } else {
                    ballMultiplier = 1.0;
                }
                break;
            case 12: //Dusk Ball
                if (cbxInput1.getSelectedIndex() == 1 || cbxInput2.getSelectedIndex() == 1) {
                    ballMultiplier = 3.5;
                } else {
                    ballMultiplier = 1.0;
                }
                break;
            case 13: //Quick Ball
                if (cbxInput1.getSelectedIndex() == 0) {
                    ballMultiplier = 5.0;
                } else {
                    ballMultiplier = 1.0;
                }
                break;
            default:
                ballMultiplier = 1.0;
                break;
        }
    }

    private void oPowerCheck() {
        int selectPowerLevel = cbxOPower.getSelectedIndex();
        switch (selectPowerLevel) {
            case 0:
                oPowerMultiplier = 1;
                break;
            case 1:
                oPowerMultiplier = 1.5;
                break;
            case 2:
                oPowerMultiplier = 2;
                break;
            case 3:
                oPowerMultiplier = 2.5;
                break;
            case 4:
                oPowerMultiplier = 2.5;
                break;
            case 5:
                oPowerMultiplier = 3.5;
                break;
        }
    }

    private void statusCheck() {
        int selectedStatus = cbxStatus.getSelectedIndex();
        switch (selectedStatus) {
            case 0:
                statusMultiplier = 1;
                break;
            case 1:
                statusMultiplier = 2.5;
                break;
            default:
                statusMultiplier = 1.5;
                break;
        }
    }

    private void calculateCatchRate() {
        statusCheck();
        oPowerCheck();
        pokemons.pokeProperties();
        double catchProbability;

        try {
            int maxHP = Integer.parseInt(txtMax.getText());
            int currentHP = Integer.parseInt(txtCurrent.getText());
            ballCheck();

            if (selectedBall == 3) {
                catchProbability = 100;
                lblChance.setText("The chance to capture the Pokémon is " + catchProbability + "%");
            } else {
                catchProbability = (ballMultiplier * statusMultiplier * oPowerMultiplier * pokemons.getCatchRate() * (3 * maxHP - 2 * currentHP)) / (3 * maxHP * 255) * 100;
                roundedCatchProbability = Math.round(catchProbability * 10.00) / 10.00;
                lblChance.setText("The chance to capture the Pokémon is " + roundedCatchProbability + "%");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "The text boxes have to be filled with numbers!!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Make sure you fill out all text boxes!");
        }
    }

}
