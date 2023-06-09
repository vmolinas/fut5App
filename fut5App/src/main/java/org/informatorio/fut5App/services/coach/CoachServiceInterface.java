package org.informatorio.fut5App.services.coach;

import org.informatorio.fut5App.domain.Coach;
import org.informatorio.fut5App.domain.Team;

public interface CoachServiceInterface {
    Coach createCoach(Team team);
}