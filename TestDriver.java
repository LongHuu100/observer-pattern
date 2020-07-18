public static void main(String[] args) {
        Event e = new Event();
        e.setOnEventListener(new OnEventListener() {
             public void onEvent(EventResult er) {
                 // do your work. 
             }
        });
        e.doEvent();
    }
