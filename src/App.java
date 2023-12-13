import java.util.Base64;
import java.security.SecureRandom;

public class App {
    public static void main(String[] args) throws Exception {
      
        SecureRandom secureRandom = new SecureRandom();

        byte[] secretKeyBytes = new byte[32];
        secureRandom.nextBytes(secretKeyBytes);

        String SECRET_KEY = Base64.getEncoder().encodeToString(secretKeyBytes);

        System.out.println(SECRET_KEY);

    }
}
