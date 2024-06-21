import flet as ft

def main(pagina):
    def iniciar_chat(evento):
        pagina.dialog = janela
        janela.open = True
        pagina.update()

    def entrar_chat(evento):
        pagina.remove(titulo)
        pagina.remove(botao_inciar)
        janela.open = False
        pagina.add(chat)
        pagina.add(linha_msg)
        nome_usuario = campo_nome_usuario.value
        mensagem = f"{nome_usuario} : entrou no chat"
        pagina.pubsub.send_all(mensagem)
        pagina.update()

    def enviar_msg(evento):
        texto_msg = campo_msg.value
        nome_usuario = campo_nome_usuario.value
        mensagem = f"{nome_usuario} : {texto_msg}"
        pagina.pubsub.send_all(mensagem)
        campo_msg.value = " "
        pagina.update()

    def enviar_msg_tunel(mensagem):
        texto_chat = ft.Text(mensagem)
        chat.controls.append(texto_chat)
        pagina.update()

    #criacao de elementos
    titulo = ft.Text("Chat de mensagens da galera")
    botao_inciar = ft.ElevatedButton("Inciar Conversa",on_click=iniciar_chat)

    titulo_janela = ft.Text("Bem-vindo")
    campo_nome_usuario = ft.TextField(label="Digite o seu nome",on_submit=entrar_chat)
    botao_entar = ft.ElevatedButton("Entrar no chat",on_click=entrar_chat)
    janela = ft.AlertDialog(title=titulo_janela,content=campo_nome_usuario,actions=[botao_entar])

    chat = ft.Column()
    campo_msg = ft.TextField(label="Escreva sua mensagem",on_submit=enviar_msg)
    botao_msg = ft.ElevatedButton("Enviar",on_click=enviar_msg)
    linha_msg = ft.Row([campo_msg,botao_msg])

    #adcionando elementos a pagina
    pagina.add(titulo)
    pagina.add(botao_inciar)
    pagina.pubsub.subscribe(enviar_msg_tunel)

ft.app(main,view=ft.WEB_BROWSER)