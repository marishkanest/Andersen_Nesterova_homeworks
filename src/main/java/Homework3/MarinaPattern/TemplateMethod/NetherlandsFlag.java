package Homework3.MarinaPattern.TemplateMethod;

public class NetherlandsFlag extends AbstractThreeRowsFlag{
    @Override
    void drawUpperLevel() {
        Colors.paintRedColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintBlueColor();
    }
}

