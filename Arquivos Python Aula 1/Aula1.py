import pyautogui
import pandas as pd
import time
pyautogui.PAUSE = 0.5
#Criar comando para abrir o navegador e entrar no link
pyautogui.press("win")
pyautogui.write("opera")
pyautogui.press("enter")

pyautogui.write("https://dlp.hashtagtreinamentos.com/python/intensivao/login")
pyautogui.press("enter")
time.sleep(3)

#Login 
pyautogui.click(x=841, y=477)
pyautogui.write("valverdevalverde03@gmail.com")
pyautogui.press("tab")
pyautogui.write("senha123")
pyautogui.press("tab")
pyautogui.press("enter")
time.sleep(3)
tabela = pd.read_csv(r"C:\Users\Felipi\Desktop\ProjetoPython\Arquivos Python\produtos.csv")
#Cadastrar produtos
for linha in tabela.index:
    #codigo
    pyautogui.click(x=822, y=339)

    codigo = str(tabela.loc[linha,"codigo"])
    pyautogui.write(codigo)
    pyautogui.press("tab")
    
    #marca
    marca = str(tabela.loc[linha,"marca"])
    pyautogui.write(marca)
    pyautogui.press("tab")

    #tipo
    tipo = str(tabela.loc[linha,"tipo"])
    pyautogui.write(tipo)
    pyautogui.press("tab")

    #categoria
    categoria = str(tabela.loc[linha,"categoria"])
    pyautogui.write(categoria)
    pyautogui.press("tab")

    #preco
    preco = str(tabela.loc[linha,"preco_unitario"])
    pyautogui.write(preco)
    pyautogui.press("tab")

    #custo
    custo = str(tabela.loc[linha,"custo"])
    pyautogui.write(custo)
    pyautogui.press("tab")

    #obs
    obs = str(tabela.loc[linha,"obs"])
    if obs !="nan": 
        pyautogui.write(obs)
    pyautogui.press("tab")
    #enviar e scroll
    pyautogui.press("enter")
    pyautogui.scroll(2000)