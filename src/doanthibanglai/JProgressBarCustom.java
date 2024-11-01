
package doanthibanglai;

import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JProgressBar;
import javax.swing.plaf.basic.BasicProgressBarUI;

public class JProgressBarCustom  extends JProgressBar {           
    public JProgressBarCustom() {
        //setStringPainted(true);
        setUI(new BasicProgressBarUI() {
            @Override
            protected void paintString(Graphics grphcs, int i, int i1, int i2, int i3, int i4, Insets insets) {
                super.paintString(grphcs, i, i1, i2, i3, i4, insets);
            }
        });
    }
}
