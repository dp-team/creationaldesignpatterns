public class EnglishMenuPool extends ObjectPool<EnglishMenu> {
    @Override
    protected EnglishMenu create() {
        return new EnglishMenu();
    }
}
