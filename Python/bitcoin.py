import requests
from bs4 import BeautifulSoup

print("hoi")
URL = 'https://coinmarketcap.com/'
page = requests.get(URL)

#print(page.content)

htmlpage = BeautifulSoup(page.content, 'html.parser')
#print(htmlpage.prettify())

results = htmlpage.find(class_ ="price___3rj7O")
price = results.find("a")
#print(results)
print(price.text)