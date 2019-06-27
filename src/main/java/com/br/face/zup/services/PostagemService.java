package com.br.face.zup.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.br.face.zup.models.PostagemModel;

@Service
public class PostagemService {

	private Map<Integer, PostagemModel> postagens = new HashMap<Integer, PostagemModel>() {
		{
			put(1, new PostagemModel(
					"https://media.licdn.com/dms/image/C4D03AQGkYtNEcMg8AQ/profile-displayphoto-shrink_100_100/0?e=2159024400&v=beta&t=lJTwyzOKKYo-Ics4U77j1Jimwarohvm-qFd5lKDNwzc",
					"Vinicius", "Ola mundo é muito legal"));
		}
	};

	public Collection<PostagemModel> retornarPostagens() {
		return this.postagens.values();
	}
	
	public void salvarPostagem(PostagemModel postagemModel) {
		postagens.put(postagens.size()+1, postagemModel);
	}

}
