package state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        // canvas.setCurrentTool(new SelectionTool());
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();
       /*
        mouseUp(new SelectionTool());
        mouseDown(new SelectionTool());
        mouseUp(new BrushTool());
        mouseDown(new BrushTool());
        mouseUp(new EraserTool());
        mouseDown(new EraserTool());
    }
    public static void mouseUp(Tool tool){
        tool.mouseUp();
    }
    public static void mouseDown(Tool tool){
        tool.mouseDown();
    }*/
    }
}