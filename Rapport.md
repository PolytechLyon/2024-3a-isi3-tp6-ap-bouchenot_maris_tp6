# Compte Rendu du TP 1 : Patrons de Conceptions

Noms des étudiants du binôme : Bouchenot Gaelle, Maris Xan

## Exercices 1
Le parton de conception utilisé est le Composite. Vehicle correspond au composite et MobileObject au composant

Grâce à la réutilisation des composants, nous n'avons besoin de rajouter aucune méthode puisque chaque méthode de vehicle parcours déja l'entiereté des composants.
## Exercices 2

La méthode velocity() utilise le patron de conception itérateur. Celui-ci a pour avantage de pouvoir traiter tous les objects implémentant une interface.
Il n'est pas nécessaire de changer la méthode vélocity puisqu'il est également possible de créer un itérateur à partir d'une liste 

## Exercices 3

Pour transformer Clock en singleton, nous avons commencé par rajouter un attribut static instance qui contient un Object de type Clock, qui sera notre singleton.
On rajoute ensuite la méthode getInstance, qui, si instance est null, crée un Clock et la met dans instance, puis retourne instance, sinon, elle le retourne directement.
On passe également le constructeur en privé pour s'assurer qu'une nouvelle Clock ne soit pas créer
Ainsi, on assure l'unicité de Clock

On fini par remplacer new Clock par Clock.getInstance() dans les roues pour récupérer l'instance


## Exercices 4

Non, wheel appartient au package transport tandis que Bike appartient à cycling. On a une interdépendance entre les 2 packages, ce qui est contraire aux bonnes pratiques.
La fonctionnalité de la classe Bike qui utilise Wheel est GetPush()

Oui, la classe Vehicle, qui se trouve dans transport.

Ainsi, il suffit de changer le type de l'attribut drive dans wheel, en le passant de Bike à Vehicle, ainsi on appelle la méthode push de vehicle, qui est dans le package transport.

## Exercices 5


## Exercices 6

La différence entre cette méthode et un singleton c'est qu'on crée une unique instance dans le singleton tandis que pour les logs on souhaite creer des instances différentes à chaque utilisation, dans notre cas pour que le log est le bon nom.


## Exercices 7

Nous avons crée une classe 'TimeStampedLoggerDecorator' qui herite de 'Logger' et qui possède un attribut privé de type Logger. 
L'idée est de surcharger la méthode 'log()' afin d'afficher l'heure du log peu importe le type du log.


## Exercices 8

Le patron de conception que suit la classe Context vis-à-vis l'outil ServiceLoader est Façade car elle y unifie l'accès
Le fr.polytech.sim.cycling.Bike peut avoir plusieurs lignes. Chacune fait référence à une classe. A noter que seul la première ligne sera executée tant qu'on utilise pas 'injectAll()'

## Exercices 9

