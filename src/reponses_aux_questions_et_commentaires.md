# Réponses aux questions TP2.1

### Est-il nécessaire de définir une variable d'instance et une méthode d'affichage ?
    Il y a besoin d'une méthode d'affichage pour afficher les informations de l'objet sinon il est affiché par défaut l'adresse mémoire de l'objet.
    Il n'est pas nécessaire de définir une variable d'instance car les variables d'instance sont définies par défaut dans la classe Object.


### Est-il possible de placer la conversion implicite de telle manière qu'il ne soit pas nécessaire de l'importer ?
    Il faut placer la conversion implicite dans le même package que la classe qui l'utilise.


### Et que peut-on faire pour traiter un double comme une somme en devise locale ?
    ?

# Commentaires retour TP2.1
### Livrables
1. [x] Traiter les alertes de l'IDE

### Currency
1. [x] Currency ok - l'utilisation d'un paramètre de trait permet de gérer de manière élégante le code alphabétique d'une devise.

### Account
1. [x] Il y a une erreur dans la définition de l'addition : c'est la somme associée au paramètre qu'il faut soumettre au taux de change, ce qui est bien le cas (c'est "that.amount" qui est multiplié), mais le taux de change à prendre en compte devrait partir de la devise de "that" pour retourner la devise de "this".
2. [x] La définition de toString pourrait être simplifiée.

### Conversions implicites
1. [x] Pour utiliser double2Locale comme conversion implicite, il faut encore la déclarer comme telle à l'aide du mot-clef "implicit". 
2. [x] Placement, une fois ceci fait, il est possible de l'utiliser dans le test, à la condition de l'importer via par exemple "import Currency.double2Locale". La question est de savoir s'il n'y aurait pas un autre placement de la conversion ne nécessitant pas cette clause d'importation.

### À suivre
1. [x] Gestion de la multiplication d'un compte par un facteur en utilisant une conversion implicite, puis une extension.