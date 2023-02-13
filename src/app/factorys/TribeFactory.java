package app.factorys;

import app.tribes.Protos;
import app.tribes.Terran;
import app.tribes.Tribe;
import app.tribes.Zerg;

public class TribeFactory {

	public Tribe getTribe(String tribe) {
		if (tribe.isEmpty() || tribe == null) {
			return null;
		}

		switch (tribe) {
			case "테란":
				return new Terran();
			case "프로토스":
				return new Protos();
			case "저그":
				return new Zerg();
		}

		return null;
	}
}
