package minesweeper.score;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class HallOfFameHibernate extends HallOfFame {
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	@Override
	public void addScore(String name, int time) throws Exception {
		entityManager.persist(new UserScore(name, time));
		/*
		UserScore us =new UserScore(name, time);
		System.out.println("dffffffffff" + us.getId());
		entityManager.persist(us);
		System.out.println("??????????" + us.getId());
		us.setTime(10000);*/
	}

	@Override
	public List<UserScore> loadScore() throws Exception {
		return entityManager.createQuery("select s from UserScore s where name = :P3502439" , UserScore.class)
				.setParameter("name", "jaro").getResultList();
/*		return entityManager.createQuery("select s from UserScore s where name = :name and game = :game" , UserScore.class)
				.setParameter("name", "jaro").setParameter("game", "mines").getResultList();*/
	}
}
