# Sistema de Gestión de Parqueadero Central - UniQuindío 🚗🏢

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-3.8.1-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

## 📝 Descripción
Este proyecto surge como una solución a la necesidad de modernizar el control de vehículos en el **Parqueadero Central de la Universidad del Quindío**. El sistema reemplaza el registro manual por una plataforma digital que automatiza la asignación de espacios, el control de tiempos de permanencia y el cálculo preciso de tarifas.

## ✨ Características Principales
- **Registro de Vehículos:** Entrada y salida automatizada con marca de tiempo.
- **Gestión de Espacios:** Control de disponibilidad en tiempo real y asignación inteligente.
- **Cálculo de Tarifas:** Algoritmo para determinar el valor a pagar basado en el tiempo de estancia.
- **Administración de Usuarios:** Control de acceso para personal autorizado y tipos de vehículos (motos, carros, etc.).
- **Interfaz Interactiva:** Menú por consola (o GUI) diseñado para operaciones rápidas y seguras.

## 🛠️ Tecnologías Utilizadas
- **Lenguaje:** "Java 25.0.2" 2026-01-20
- **Gestor de Dependencias:** Maven
- **Arquitectura:** Programación Orientada a Objetos (POO)

## 📂 Estructura del Proyecto
```text
src/
├── main/
│   └── java/
│       └── com.uniquindio.migueldiaz/
│           ├── modelo/      # Clases Entidad (Vehiculo, Usuario, Espacio)
│           ├── servicio/    # Lógica de negocio (Calculo de tarifas)
│           └── vista/       # Interfaz de usuario / Menú
└── test/                    # Pruebas unitarias