package game;

import com.google.gson.Gson;

public class TextualView extends ViewsObserver {

    public TextualView(ViewsSubject viewsSubject){
        this.viewsSubject = viewsSubject;
        viewsSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(viewsSubject.getState());
    }
}
