/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Core;
import UI.Frames.MainPageFrame;
import UI.Frames.ContactUsFrame;
import UI.Frames.LoansFrame;
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
        // Returns the class for the LogInFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return LogInFrame.class;
        }
    },
    SIGN_UP_FRAME {
        // Returns the class for the SignUpFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return SignUpFrame.class;
        }
    },
    MAIN_FRAME {
        // Returns the class for the MainFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return MainPageFrame.class;
        }
    },
    VIEW_USER_FRAME {
        // Returns the class for the ViewUserProfileFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return ViewUserProfileFrame.class;
        }
    },
    VIEW_ACCOUNT_FRAME {
        // Returns the class for the ViewAccountFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return ViewAccountInformationFrame.class;
        }
    },
    TRANSACTION_FRAME {
        // Returns the class for the TransactionPageFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return TransactionPageFrame.class;
        }
    },
    CONTACT_US_FRAME {
        // Returns the class for the ContactUsFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return ContactUsFrame.class;
        }
    },
    LOANS_FRAME {
        // Returns the class for the LoanFrame
        @Override
        public Class<? extends JFrame> getFrameClass() {
            return LoansFrame.class;
        }
    };
    
    // Returns the class for a given Frame
    public abstract Class<? extends JFrame> getFrameClass();
}
