/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Core;
import UI.Frames.MainPageFrame;
import UI.Frames.ContatctUsFrame;
import UI.Frames.LogInFrame;
import UI.Frames.SingUpFrame;
import UI.Frames.ViewUserProfielFrame;
import javax.swing.JFrame;

/**
 *
 * @author Moni
 */
public enum FrameType {
    LOGIN_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return LogInFrame.class;
        }
    },
    SIGN_UP_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return SingUpFrame.class;
        }
    },
    MAIN_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return MainPageFrame.class;
        }
    },
    VIEW_USER_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return ViewUserProfielFrame.class;
        }
    },
    CONTACT_US_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return ContatctUsFrame.class;
        }
    };
    
    public abstract Class<? extends JFrame> getFrameClass();
}
