// dependent on interfaces rather than contined classes
class MacBook
{
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook()
    {
        keyboard=new WiredKeyboard();
        mouse=new WiredMouse();
    }
}

//
class MacBook{
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard,Mouse mouse)
    {
        this.keyboard=keyboard;
        this.mouse=mouse;
    }
}