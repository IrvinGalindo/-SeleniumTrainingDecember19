package utilities;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import enums.BotKey;
import exceptions.ActionException;

public class Press {
	public static Robot robot;

	public static void Key(BotKey botkey) throws InterruptedException, AWTException, ActionException, IOException {
		robot = new Robot();
		switch (botkey) {
		case TAB:
			takeScreenShot();
			robot.keyPress(KeyEvent.VK_TAB);
			break;
			
		case SPACE:
			takeScreenShot();
			robot.keyPress(KeyEvent.VK_SPACE);
			break;
			
		case DELETE:
			takeScreenShot();
			robot.keyPress(KeyEvent.VK_DELETE);
			break;
			
		case ENTER:
			takeScreenShot();
			robot.keyPress(KeyEvent.VK_ENTER);
			break;

		case ESCAPE:
			takeScreenShot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			break;

		case PAGE_DOWN:
			takeScreenShot();
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			break;

		case PAGE_UP:
			takeScreenShot();
			robot.keyPress(KeyEvent.VK_PAGE_UP);
			break;

		default:
			throw new InterruptedException();
		}
	}
	
	public static void takeScreenShot() throws IOException, AWTException {
		robot = new Robot();
		 BufferedImage image = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		 ImageIO.write(image, "png", new File(TestCase.getImageUri()));
	}
}
