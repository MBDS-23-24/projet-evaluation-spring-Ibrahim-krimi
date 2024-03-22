# Examen Spring Boot Microservices

## Organisation du Code

Le code est organisé en branches selon les fonctionnalités globales suivantes :

main: Intègre toutes les fonctionnalités en une seule branche.

CircuitBreaker/Config: Contient l'implémentation du Circuit Breaker et du service de configuration.

OpenFeign: Branche dédiée à l'interconnexion des services à l'aide d'Open Feign.

gatewayDiscovery: Implémente la découverte des services et la passerelle.

## Réalisations Techniques

Chaque priorité du projet a été pleinement réalisée :

Deux Services Nécessaires: Les services pour les postes et les compétences ont été développés et sont pleinement fonctionnels.

Lien entre les Services avec Open Feign: Un lien robuste a été établi entre les services, permettant aux postes d'interroger les compétences associées.

Bonnes Pratiques de Développement: L'application adhère aux bonnes pratiques de développement, avec une utilisation cohérente de services, DTOs et mappers.

Services de Gateway et Discovery: Les services de découverte et la passerelle API ont été mis en place pour faciliter l'interaction entre les microservices.

Circuit Breaker: Un Circuit Breaker a été intégré pour renforcer la résilience des services.

Service de Configuration: Une gestion centralisée de la configuration des services a été implémentée.

Chaque fonctionnalité globale a été développée dans sa propre branche pour une clarté et une organisation optimales.


## Conclusion

Toutes les tâches requises pour ce projet ont été accomplies avec succès. Le projet répond non seulement aux besoins fonctionnels mais respecte également les meilleures pratiques et principes de conception de l'architecture microservices.
