package guru.springframework.sfwdi.services;

public class GreetingtServiceImpl implements GreetingtService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
