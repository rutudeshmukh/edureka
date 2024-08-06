package CollectionExamples;

public class Player {
	String playerName;
	int playerId;
	String skill;
	String country;
	
	public Player(String playerName, int playerId, String skill, String country) {
		super();
		this.playerName = playerName;
		this.playerId = playerId;
		this.skill = skill;
		this.country = country;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Player [playerName=" + playerName + ", playerId=" + playerId + ", skill=" + skill + ", country="
				+ country + "]";
	}
	
}
