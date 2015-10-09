import javax.swing.JOptionPane;
/**
 * 
 * @author Duoc
 *
 */
public class WindowInOut implements InOut
{
   public String nextLine(String prompt)
   {
      return JOptionPane.showInputDialog(prompt);
   }

   public void message(String text)
   {
      JOptionPane.showMessageDialog(null, text);
   }
}
