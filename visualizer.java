public class visualizer {
    public static void main (String[] args){
        //new GUI();
        System.out.println("HI");
    }

    public GUI(){
        JFrame frame = new Jframe();
        JButton button = new JButton("Click me");
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayOut(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
    }
}
