package hibernate_HQL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="PremierLeague")
@Table(name="PremierLeague")
public class PremierLeague {
	@Id
	@Column(name="Srno")
	private int srno;
	@Column(name="TeamName")
	private String team;
	@Column(name="Points")
	private int pts;
	@Column(name="Position")
	private int pos;
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getPts() {
		return pts;
	}
	public void setPts(int pts) {
		this.pts = pts;
	}
	public int getPos() {
		return pos;
	}
	public void setPos(int pos) {
		this.pos = pos;
	}
	public PremierLeague(int srno, String team, int pts, int pos) {
		this.srno = srno;
		this.team = team;
		this.pts = pts;
		this.pos = pos;
	}
	public PremierLeague() 
	{
		
	}
	@Override
	public String toString() {
		return "PremierLeague [srno=" + srno + ", team=" + team + ", pts=" + pts + ", pos=" + pos + "]";
	}	
	
}
