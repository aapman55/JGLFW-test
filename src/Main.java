import static com.badlogic.jglfw.Glfw.*;
import com.badlogic.jglfw.gl.GL;
  
/**
 *
 * @author Wilco
 */
public class Main {
    public static void main(String[] args) {
        if (!glfwInit())
            throw new RuntimeException("Could not initialize glfw");
          
        long window = glfwCreateWindow(800, 600, "Test", 0, 0);
          
        if (window == 0)
            throw new RuntimeException("Could not create a window");
          
        glfwMakeContextCurrent(window);
          
        while (!glfwWindowShouldClose(window)) {
            GL.glViewport(0, 0, 640, 480);
            GL.glClear(GL.GL_COLOR_BUFFER_BIT);
            GL.glRotatef(0.01f, 0, 0, 1);
            GL.glBegin(GL.GL_TRIANGLES);
            GL.glVertex2f(-0.5f, -0.5f);
            GL.glVertex2f(0.5f, -0.5f);
            GL.glVertex2f(0, 0.5f);
            GL.glEnd();
            glfwPollEvents();
            glfwSwapBuffers(window);
        }
          
        glfwDestroyWindow(window);
        glfwTerminate();
    }
} 
