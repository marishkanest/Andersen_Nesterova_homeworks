package Homework3.MarinaPattern.TemplateMethod;

public class RussianFlag extends AbstractThreeRowsFlag {
    @Override
    void drawUpperLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintBlueColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintRedColor();
    }
}
