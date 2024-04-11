pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Demonstrations"
include(":app")
include(":mod2demo1")
include(":mod2conditions")
include(":mod2boucles")
include(":mod2fonctions")
include(":mod2poo")
include(":mod2heritage")
include(":mod2inteface")
include(":mod3xml")
include(":mod3compose")
include(":mod4gateauchocolat")
include(":mod4gestioninteraction")
include(":mod4stateviewmodel")
include(":mod4ratingvm")
include(":mod5navigation")
