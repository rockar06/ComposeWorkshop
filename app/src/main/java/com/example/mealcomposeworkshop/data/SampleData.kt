package com.example.mealcomposeworkshop.data

object SampleData {

    val data: List<Meal> = listOf(
        Meal(
            name = "Beef",
            description = "Beef is the culinary name for meat from cattle (Bos taurus). " +
                    "In prehistoric times, humans hunted aurochs and later domesticated them. " +
                    "Since that time, numerous breeds of cattle have been bred specifically for the " +
                    "quality or quantity of their meat. Today, beef is the third most widely " +
                    "consumed meat in the world, after pork and poultry. ",
            image = "https://img.freepik.com/free-photo/grilled-beef-steak-dark-wooden-surface_1150-44344.jpg"
        ),
        Meal(
            name = "Chicken",
            description = "The chicken (Gallus domesticus) is a domesticated subspecies of the red " +
                    "junglefowl, with attributes of wild species such as grey and ceylon " +
                    "junglefowl that are originally from Southeastern Asia. Rooster or cock is a " +
                    "term for an adult male bird, and a younger male may be called a cockerel. A " +
                    "male that has been castrated is a capon. An adult female bird is called a hen " +
                    "and a sexually immature female is called a pullet.",
            image = "https://img.freepik.com/free-photo/raw-chicken-breast-fillets-wooden-cutting-board-with-herbs-spices_2829-16891.jpg"
        ),
        Meal(
            name = "Dessert",
            description = "Dessert is a course that concludes a meal. The course consists of sweet " +
                    "foods, such as confections, and possibly a beverage such as dessert wine and " +
                    "liqueur. In some parts of the world, such as much of Central Africa and West " +
                    "Africa, and most parts of China, there is no tradition of a dessert course to " +
                    "conclude a meal.\n" +
                    "\n" +
                    "The term dessert can apply to many confections, such as biscuits, cakes, " +
                    "cookies, custards, gelatins, ice creams, pastries, pies, puddings, macaroons, " +
                    "sweet soups, tarts, and fruit salad. Fruit is also commonly found in dessert " +
                    "courses because of its naturally occurring sweetness. Some cultures sweeten " +
                    "foods that are more commonly savory to create desserts.",
            image = "https://img.freepik.com/free-photo/closeup-shot-cheesecake-with-jelly-decorated-with-strawberries-berries_181624-45104.jpg"
        ),
        Meal(
            name = "Beef",
            description = "Beef is the culinary name for meat from cattle (Bos taurus). " +
                    "In prehistoric times, humans hunted aurochs and later domesticated them. " +
                    "Since that time, numerous breeds of cattle have been bred specifically for the " +
                    "quality or quantity of their meat. Today, beef is the third most widely " +
                    "consumed meat in the world, after pork and poultry. ",
            image = "https://img.freepik.com/free-photo/grilled-beef-steak-dark-wooden-surface_1150-44344.jpg"
        ),
        Meal(
            name = "Chicken",
            description = "The chicken (Gallus domesticus) is a domesticated subspecies of the red " +
                    "junglefowl, with attributes of wild species such as grey and ceylon " +
                    "junglefowl that are originally from Southeastern Asia. Rooster or cock is a " +
                    "term for an adult male bird, and a younger male may be called a cockerel. A " +
                    "male that has been castrated is a capon. An adult female bird is called a hen " +
                    "and a sexually immature female is called a pullet.",
            image = "https://img.freepik.com/free-photo/raw-chicken-breast-fillets-wooden-cutting-board-with-herbs-spices_2829-16891.jpg"
        ),
        Meal(
            name = "Dessert",
            description = "Dessert is a course that concludes a meal. The course consists of sweet " +
                    "foods, such as confections, and possibly a beverage such as dessert wine and " +
                    "liqueur. In some parts of the world, such as much of Central Africa and West " +
                    "Africa, and most parts of China, there is no tradition of a dessert course to " +
                    "conclude a meal.\n" +
                    "\n" +
                    "The term dessert can apply to many confections, such as biscuits, cakes, " +
                    "cookies, custards, gelatins, ice creams, pastries, pies, puddings, macaroons, " +
                    "sweet soups, tarts, and fruit salad. Fruit is also commonly found in dessert " +
                    "courses because of its naturally occurring sweetness. Some cultures sweeten " +
                    "foods that are more commonly savory to create desserts.",
            image = "https://img.freepik.com/free-photo/closeup-shot-cheesecake-with-jelly-decorated-with-strawberries-berries_181624-45104.jpg"
        )
    )
}

data class Meal(
    val name: String,
    val description: String,
    val image: String
)