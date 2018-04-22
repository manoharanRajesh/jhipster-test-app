package nl.manoharanrajesh.app.cucumber.stepdefs;

import nl.manoharanrajesh.app.GaneshtestApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = GaneshtestApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
