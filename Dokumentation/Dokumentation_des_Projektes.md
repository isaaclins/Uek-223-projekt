# Projektidee: MultiUser Messaging Page

## Beschreibung der Projektidee

Die Projektidee ist die Entwicklung einer MultiUser Messaging Seite, auf der Benutzer mit einer eindeutigen Benutzer-ID miteinander kommunizieren können. Benutzer können entweder private Nachrichten senden oder Gruppenchats erstellen. Die Plattform ähnelt Discord, bietet jedoch nur einen Kanal für die Kommunikation.

## Entitäten

- **Benutzer**: Enthält Informationen über die Benutzer wie Benutzer-ID, Name, E-Mail, etc.
- **Nachrichten**: Speichert die gesendeten Nachrichten mit Details wie Absender, Empfänger, Zeitstempel, etc.
- **Gruppen**: Informationen über die verschiedenen Gruppen, die erstellt werden können, einschließlich Gruppenname und Mitglieder.
- **Gruppenmitglieder**: Verknüpft Benutzer mit Gruppen und speichert ihre Rollen innerhalb der Gruppe.

## Motivation

Die Motivation hinter dieser Idee ist es, eine einfache und effiziente Kommunikationsplattform zu schaffen, die sowohl private als auch Gruppennachrichten unterstützt. Persönlich könnte diese Plattform nützlich sein, um mit Freunden und Kollegen in Kontakt zu bleiben, ohne die Komplexität und die Vielzahl an Funktionen anderer Messaging-Dienste.

## API-Endpunkte
| Methode | Endpunkt | Beschreibung                 |
|---------|----------|------------------------------|
| GET     | /benutzer                               | Gibt eine Liste aller Benutzer zurück                                                 |
| POST    | /benutzer                               | Erstellt einen neuen Benutzer                                                         |
| GET     | /benutzer/{id}                          | Gibt Details zu einem bestimmten Benutzer zurück                                      |
| PUT     | /benutzer/{id}                          | Aktualisiert die Informationen eines bestimmten Benutzers                             |
| DELETE  | /benutzer/{id}                          | Löscht einen bestimmten Benutzer                                                      |
| GET     | /chat/{benutzerid}                      | Gibt eine Liste aller Nachrichten zwischen bestimmten Benutzers zurück                |
| POST    | /chat/{benutzerid}                      | Sendet eine neue Nachricht an einen bestimmten Benutzer                               |
| GET     | /gruppen                                | Gibt eine Liste aller Gruppen zurück                                                  |
| POST    | /gruppen                                | Erstellt eine neue Gruppe                                                             |
| GET     | /gruppen/{id}                           | Gibt Details zu einer bestimmten Gruppe zurück                                        |
| PUT     | /gruppen/{id}                           | Aktualisiert die Informationen einer bestimmten Gruppe                                |
| DELETE  | /gruppen/{id}                           | Löscht eine bestimmte Gruppe                                                          |
| GET     | /gruppen/{id}/mitglieder                | Gibt eine Liste aller Mitglieder einer bestimmten Gruppe zurück                       |
| POST    | /gruppen/{id}/mitglieder                | Fügt ein neues Mitglied zu einer bestimmten Gruppe hinzu                              |
| DELETE  | /gruppen/{id}/mitglieder/{mitgliedId}   | Entfernt ein Mitglied aus einer bestimmten Gruppe                                     |

Diese Tabelle deckt die grundlegenden Funktionen Ihrer Anwendung ab, wie Benutzerverwaltung, Produktverwaltung und Nachrichtensystem. Sie können diese Tabelle erweitern oder anpassen, um weitere spezifische Funktionen Ihrer Anwendung zu berücksichtigen.