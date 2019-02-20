import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class ChessRunner{
   private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 600;
   public static void main(String[] args){
		JFrame frame = new JFrame();
      
	   MainPanel mainPanel = new MainPanel();

		ChessViewer cv = new ChessViewer();
      
      frame.add(mainPanel);
		frame.add(cv);
     
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		frame.setVisible(true);
	}
   
   static class MainPanel extends JPanel{
      public MainPanel(){
         JLabel radiusSmallest = new JLabel("Radius of smallest circle: ");
         final JTextField numField = new JTextField(3);
         numField.setText("dsfasfsa");
      }
   }
}