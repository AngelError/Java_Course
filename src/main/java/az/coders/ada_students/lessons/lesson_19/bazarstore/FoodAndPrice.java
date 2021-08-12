package az.coders.ada_students.lessons.lesson_19.bazarstore;

public enum FoodAndPrice {
    LaysCheeseChips(2.30),
    LaysKebabChips(2.30),
    LaysPaprikaChips(2.30),
    LaysSpicyChips(0.48),

    DoritosKebab(2.30),
    DoritosTaco(2.30),
    DoritosHotCorn(2.30),
    DoritosNachoCheese(2.30),
    DoritosCheese(2.30),

    AlpengoldChocolateCherry(1.60),
    AlpengoldDarkChocolate(1.60),
    AlpengoldChocolateOreo(1.80),
    AlpengoldAlmondCoconutChocolateOreo(1.25),

    KinderBueno(1.60),
    KinderMaxi(1.65),

    BelochkaSunflowerBlackQuadro(0.85),

    FantaDuses(0.79),
    FantaExotic(0.79),
    PepsiMax(0.69),
    MountainDew(0.70),
    CocaColaZero(0.79),
    MirindaOrange(0.69),
    PepsiTwist(0.69),
    Sprite(0.79),
    Fnata(0.79),
    BadamliCarbonatedWater(0.38),

    MMChocolateDraje(1.10),
    OreoCocaoVanillaCookies(0.60),
    DirolPeppermint(0.39),
    DirolWatermelon(0.49),

    Mars(0.90),
    SholenOzmoFun(0.79),
    RoshenBiscuviDarkCocolate(1.65),
    Twix(0.89),

    AlgidaClassicVanil(1.00),
    MagnumDoubleCaramel(3.50),

    AqusaMilk(2.05),
    ActiviaStrawberryApple(1.20),
    ActiviaDrinkYoghurtBlueberry(1.80),
    PinarWhiteCheese(5.75),
    PinarCheeseLabne(1.79),
    MillaSourcream(1.79),
    SvalyaSourcream(4.45),
    IvanovkaDietBread(0.75),
    OvenBread(0.60),
    SunBakeryBreadFlower(0.65),
    SunBakeryHamburgerBread(1.55),
    TsarFlour(7.45);


    double p;

    FoodAndPrice(double p) {
        this.p = p;
    }
}
