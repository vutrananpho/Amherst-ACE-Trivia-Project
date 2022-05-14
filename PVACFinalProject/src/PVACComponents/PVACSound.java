/** File: Week15/Game/PVACFinalProject @PVAC Pho Vu + Ada Chen
 * Creating a mini trivia testing Amherst students' knowledge about AC history
 * Using JAVA GUI (Java Swing & Swing UI Designer)
 * IDE: IntelliJ IDEA
 * Using a combination of images + soung
 */
package PVACComponents; //encapsulates a group of classes + sub-classes

import javax.sound.sampled.AudioInputStream; //for audio use
import javax.sound.sampled.AudioSystem; //for audio use
import javax.sound.sampled.Clip; //for audio use
import java.io.File; //for file variable

public class PVACSound { //start class + driver program
    void playMusic(String musicLocation) //function returns results
    {
        try //read the music file
        {
            File musicPath = new File(musicLocation);

            if(musicPath.exists()) { //condition when looking for music file's existence
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else //in case errors occur
            {
                System.out.println("Can't find file"); //announce error
                }
        } catch (Exception ex)
        {
            ex.printStackTrace(); //handle exceptions & errors
        }
    } //end playMusic()
} //end class