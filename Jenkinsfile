pipeline {
    agent any // Выполняется на любом доступном узле
    tools {
        gradle "gradle"
    }
    stages { // Этап разделения на шаги
        stage('Checkout') { // Клонирование репозитория
            steps {
                git 'https://github.com/catcell4787-cmd/tests.git' // Адрес вашего Git-репозитория
            }
        }

//         stage('Build') { // Сборка проекта
//             steps {
//                 sh 'gradle clean build -D skipTests' // Запуск Maven-команды сборки Java-проекта
//             }
//         }

        stage('Test') { // Тестирование приложения
            steps {
                sh 'gradle cucumber' // Команда запуска тестов
            }
        }
    }

    post { // Пост-действия после завершения пайплайна
        success {
            echo 'Сборка успешно выполнена!'
        }
        failure {
            echo 'Ошибка при сборке'
        }
    }
}