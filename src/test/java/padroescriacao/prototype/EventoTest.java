package padroescriacao.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EventoTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Evento evento = new Evento(1, "Semana da Computação 2025", new Local("Anfiteatro", 300), "Juiz de Fora");

        Evento eventoClone = evento.clone();
        eventoClone.setCodigo(2);
        eventoClone.setNome("Semana da Computação 2026");
        eventoClone.getLocal().setCapacidade(500);

        assertEquals("Evento{codigo=1, nome='Semana da Computação 2025', local=Local{nome='Anfiteatro', capacidade=300}, cidade='Juiz de Fora'}", evento.toString());
        assertEquals("Evento{codigo=2, nome='Semana da Computação 2026', local=Local{nome='Anfiteatro', capacidade=500}, cidade='Juiz de Fora'}", eventoClone.toString());
    }
}
