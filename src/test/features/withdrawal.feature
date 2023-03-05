# language: ru
@smoke
Функция: Снятие со счета

  @success
  Сценарий: Успешное снятие со счета
    Дано пользователь зашел на сайт
    И залогинился
    И выбрал имя "Ron Weasly" и нажал кнопку логин
    И пользователь выбрал Deposit
    И ввел сумму 100000
    И нажал кнопку Deposit
    Когда пользователь выбрал Withdrawl
    И хочет снять 50000
    И нажал кнопку Withdrawl
    Тогда на балансе 50000 денег
    И отобразилось сообщение "Transaction successful"