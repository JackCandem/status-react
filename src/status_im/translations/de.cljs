(ns status-im.translations.de)

(def translations
  {
   ;common
   :members-title                         "Mitglieder"
   :not-implemented                       "nicht implementiert"
   :chat-name                             "Chatname"
   :notifications-title                   "Benachrichtigungen und Sounds"
   :offline                               "Offline"

   ;drawer
   :invite-friends                        "Freunde einladen"
   :faq                                   "FAQ"
   :switch-users                          "Benutzer wechseln"

   ;chat
   :is-typing                             "tippt"
   :and-you                               "und du"
   :search-chat                           "Gespräch durchsuchen"
   :members                               {:one   "1 Mitglied"
                                           :other "{{count}} Mitglieder"
                                           :zero  "keine Mitglieder"}
   :members-active                        {:one   "1 Mitglied, 1 aktiv"
                                           :other "{{count}} Mitglieder, {{count}} aktiv"
                                           :zero  "keine Mitglieder aktiv"}
   :active-online                         "Online"
   :active-unknown                        "Unbekannt"
   :available                             "Verfügbar"
   :no-messages                           "Keine Nachrichten"
   :suggestions-requests                  "Anfragen"
   :suggestions-commands                  "Befehle"

   ;sync
   :sync-in-progress                      "synchronisiere..."
   :sync-synced                           "Synchronisiert"

   ;messages
   :status-sending                        "sendet"
   :status-pending                        "in Zustellung"
   :status-sent                           "Versandt"
   :status-seen-by-everyone               "Von allen gesehen"
   :status-seen                           "Gesehen"
   :status-delivered                      "Zugestellt"
   :status-failed                         "Fehlgeschlagen"

   ;datetime
   :datetime-ago-format                   "{{ago}} {{number}} {{time-intervals}}"
   :datetime-second                       {:one   "Sekunde"
                                           :other "Sekunden"}
   :datetime-minute                       {:one   "Minute"
                                           :other "Minuten"}
   :datetime-hour                         {:one   "Stunde"
                                           :other "Stunden"}
   :datetime-day                          {:one   "Tag"
                                           :other "Tage"}
   :datetime-multiple                     "mehrere"
   :datetime-ago                          "vor"
   :datetime-yesterday                    "Gestern"
   :datetime-today                        "Heute"

   ;profile
   :profile                               "Profil"
   :report-user                           "BENUTZER MELDEN"
   :message                               "Nachricht"
   :username                              "Benutzername"
   :not-specified                         "Nicht angegeben"
   :public-key                            "Öffentlicher Schlüssel"
   :phone-number                          "Telefonnummer"
   :email                                 "E-Mail"
   :profile-no-status                     "Kein Status"
   :add-to-contacts                       "Zu Kontakten hinzufügen"
   :error-incorrect-name                  "Falscher Benutzername"
   :error-incorrect-email                 "Falsche E-Mail"

   ;;make_photo
   :image-source-title                    "Profilfoto"
   :image-source-make-photo               "Foto machen"
   :image-source-gallery                  "Aus Galerie auswählen"
   :image-source-cancel                   "Abbrechen"

   ;sign-up
   :contacts-syncronized                  "Deine Kontakte wurden synchronisiert."
   :confirmation-code                     (str "Danke! Wir haben dir eine Textnachricht mit einem Bestätigungscode "
                                               "geschickt. Bitte gib den Code ein, damit wir deine Telefonnummer verifizieren können.")
   :incorrect-code                        (str "Tut uns leid, der Code war nicht korrekt, bitte erneut eingeben")
   :generate-passphrase                   (str "Ich werde eine Passphrase für dich generieren, damit du deinen"
                                               "Zugriff wiederherstellen oder dich von einem anderen Gerät aus einloggen kannst")
   :phew-here-is-your-passphrase          "*Puh*, hier ist dein Passphrase. *Bitte aufschreiben und sicher aufbewahren! *Du benötigst diesen, um deinen Account wiederherzustellen."
   :here-is-your-passphrase               "Hier ist deine Passphrase, *bitte aufschreiben und sicher verwahren!* Du benötigst diesen, um deinen Account wiederherzustellen."
   :written-down                          "Stell bitte sicher, dass du die Passphrase es an einem sicheren Ort notiert hast"
   :phone-number-required                 "Tipp hier, um deine Telefonnummer einzugeben"
   :intro-status                          "Chatte mit mir, um deinen Account einzurichten und deine Einstellungen zu ändern!"
   :intro-message1                        "Willkommen beim Status.\nTippe auf diese Nachricht, um dein Passwort einzurichten und loszulegen!"
   :account-generation-message            "Eine Sekunde bitte, ich bin dabei dein Konto zu generieren!"

   ;chats
   :chats                                 "Chats"
   :new-chat                              "Neuer Chat"
   :new-group-chat                        "Neuer Gruppenchat"

   ;discover
   :discover                             "Entdecken"
   :none                                  "Nichts"
   :search-tags                           "Geben Sie Ihre Suchbegriffe hier ein"
   :popular-tags                          "Beliebte Begriffe"
   :recent                                "Kürzlich"
   :no-statuses-discovered                "Kein Status gefunden"

   ;settings
   :settings                              "Einstellungen"

   ;contacts
   :contacts                              "Kontakte"
   :new-contact                           "Neuer Kontakt"
   :show-all                              "Alle anzeigen"
   :contacts-group-dapps                  "ÐApps"
   :contacts-group-people                 "Leute"
   :contacts-group-new-chat               "Neue Chats"
   :no-contacts                           "Keine Kontakte vorhanden"
   :show-qr                               "QR-Code anzeigen"

   ;group-settings
   :remove                                "Entfernen"
   :save                                  "Speichern"
   :change-color                          "Farbe ändern"
   :clear-history                         "Verlauf löschen"
   :delete-and-leave                      "Löschen und verlassen"
   :chat-settings                         "Chateinstellungen"
   :edit                                  "Bearbeiten"
   :add-members                           "Mitglieder hinzufügen"
   :blue                                  "Blau"
   :purple                                "Lila"
   :green                                 "Grün"
   :red                                   "Rot"

   ;commands
   :money-command-description             "Geld senden"
   :location-command-description          "Position senden"
   :phone-command-description             "Telefonnummer senden"
   :phone-request-text                    "Telefonnummer anfragen"
   :confirmation-code-command-description "Bestätitungscode senden"
   :confirmation-code-request-text        "Bestätigungscode anfragen"
   :send-command-description              "Befehl senden"
   :request-command-description           "Anfrage senden"
   :keypair-password-command-description  ""
   :help-command-description              "Hilfe"
   :request                               "Anfrage"
   :chat-send-eth                         "{{amount}} ETH senden"
   :chat-send-eth-to                      "{{amount}} ETH an {{chat-name}} senden"
   :chat-send-eth-from                    "{{amount}} ETH von {{chat-name}} erhalten"

   ;new-group
   :group-chat-name                       "Gruppenname"
   :empty-group-chat-name                 "Bitte geben Sie einen Namen ein"
   :illegal-group-chat-name               "Bitte wählen Sie einen anderen Namen"

   ;participants
   :add-participants                      "Teilnehmer hinzufügen"
   :remove-participants                   "Teilnehmer entfernen"

   ;protocol
   :received-invitation                   "Gruppeneinladung erhalten"
   :removed-from-chat                     "Aus dem Gruppenchat entfernt"
   :left                                  "Links"
   :invited                               "Eingeladen"
   :removed                               "Entfernt"
   :You                                   "Du"

   ;new-contact
   :add-new-contact                       "Neuen Kontakt hinzufügen"
   :import-qr                             "Per QR-Code importieren"
   :scan-qr                               "QR-Code scannen"
   :name                                  "Name"
   :whisper-identity                      "Identität flüstern"
   :address-explication                   "Vielleicht sollte hier ein Text stehen, der erklärt, was eine Adresse ist und wo man danach sucht"
   :enter-valid-address                   "Bitte geben Sie eine gültige Adresse ein"
   :contact-already-added                 "Dieser Kontakt wurde bereits hinzugefügt"
   :can-not-add-yourself                  "Du kannst dich nicht selbst hinzufügen"
   :unknown-address                       "Unbekannte Adresse"


   ;login
   :connect                               "Verbinden"
   :address                               "Adresse"
   :password                              "Passwort"
   :login                                 "Login"
   :wrong-password                        "Falsches Passwort"

   ;recover
   :recover-from-passphrase               "Mittels Passphrase wiederherstellen"
   :recover-explain                       "Bitte gib die Passphrase für deinen Account ein, um den Zugriff wiederherzustellen"
   :passphrase                            "Passphrase"
   :recover                               "Wiederherstellen"
   :enter-valid-passphrase                "Bitte gib eine gültige Passphrase ein"
   :enter-valid-password                  "Bitte gib ein Passwort ein"

   ;accounts
   :recover-access                        "Zugriff wiederherstellen"
   :add-account                           "Konto hinzufügen"

   ;wallet-qr-code
   :done                                  "Fertig"
   :main-wallet                           "Haupt-Konto"

   ;validation
   :invalid-phone                         "Ungültige Telefonnummer"
   :amount                                "Betrag"
   :not-enough-eth                        (str "Nicht genug EHT auf dem Konto"
                                               "({{balance}} ETH)")
   ;transactions
   :confirm-transactions                  {:one   "Transaktion bestätigen"
                                           :other "{{count}} Transaktionen bestätigen"
                                           :zero  "Keine Transaktionen"}
   :status                                "Status"
   :pending-confirmation                  "Bestätigung ausstehend"
   :recipient                             "Empfänger"
   :one-more-item                         "Noch ein Objekt"
   :fee                                   "Gebühr"
   :value                                 "Wert"

   ;:webview
   :web-view-error                        "Ups, Fehler"})
