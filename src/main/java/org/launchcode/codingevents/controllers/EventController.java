package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("events")
public class EventController {
    private Event event = new Event();

    private static ArrayList<Event> events = new ArrayList<Event>();

    @GetMapping
    public String displayAllEvents(Model model) {
        Event apple = new Event();
        apple.setName("Baked Appel");
        apple.setDescription("Come hear how Apple renders its devices useless at a date they determine.");
        Event meta = new Event();
        meta.setName("Meta Meta");
        meta.setDescription("Pre Meta Epi Anti In En Ana...How many prepositions strung together can you make sense of?");
        Event loop = new Event();
        loop.setName("Loops in the Loop");
        loop.setDescription("Have we lost control of control structures?");
        events.add(apple);
        events.add(meta);
        events.add(loop);
        model.addAttribute("events", events);
        return "events/index";
    }

    // lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

    // lives at /events/create
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        //events.put(eventName);
        return "redirect:";
    }
}
