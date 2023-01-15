/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Core;
import UI.Frames.MainPageFrame;
import UI.Frames.ContactUsFrame;
import UI.Frames.LogInFrame;
import UI.Frames.SignUpFrame;
import UI.Frames.TransactionPageFrame;
import UI.Frames.ViewAccountInformationFrame;
import UI.Frames.ViewUserProfileFrame;
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
            return SignUpFrame.class;
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
            return ViewUserProfileFrame.class;
        }
    },
    VIEW_ACCOUNT_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return ViewAccountInformationFrame.class;
        }
    },
    TRANSACTION_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return TransactionPageFrame.class;
        }
    },
    CONTACT_US_FRAME {
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return ContactUsFrame.class;
        }
    };
    
    public abstract Class<? extends JFrame> getFrameClass();
}
