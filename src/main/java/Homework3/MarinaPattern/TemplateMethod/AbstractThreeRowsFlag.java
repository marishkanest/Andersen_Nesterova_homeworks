package Homework3.MarinaPattern.TemplateMethod;

abstract class AbstractThreeRowsFlag {
    abstract void drawUpperLevel();

    abstract void drawMiddleLevel();

    abstract void drawBottomLevel();

    final void drawFlag() {
        drawFlagpole();
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
    }

    private void drawFlagpole() {
        System.out.println("Флагшток нарисован");
    }
}
