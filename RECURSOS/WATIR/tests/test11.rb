require 'watir'

b = Watir::Browser.new :chrome
b.goto('C:\Users\Jorge\RubymineProjects\watir\uitesting\sessionstorage.html')

sleep 2

b.execute_script("sessionStorage.setItem('usuario', 'Jorge');")

sleep 2

valor = b.execute_script("return sessionStorage.getItem('usuario');")

puts valor

sleep 2

b.execute_script("sessionStorage.removeItem('usuario');")

valor = b.execute_script("return sessionStorage.getItem('usuario');")

puts valor

sleep 2