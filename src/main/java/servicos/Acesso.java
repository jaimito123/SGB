/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import conexao.JPA;
import controladores.entidades.UsersJpaController;
import entidades.SgEmprestimo;
import entidades.Users;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Manhique
 */
public class Acesso {

    public Acesso() {
    }

    public boolean isbloqueado(String nm) {
        Users user = new UsersJpaController(new JPA().getEmf()).findUsers(nm);
        String estado = "";
        try {
            estado = user.getEstado();
        } catch (java.lang.NullPointerException e) {
            estado = "nao existe";
        }
        return (estado.equalsIgnoreCase("bloqueado"));
    }

    public String bloquear(Users user) throws ParseException {
        try {
            List<SgEmprestimo> emprestimoList = user.getSgEmprestimoList();
            if (user.getEstado().equalsIgnoreCase("bloqueado")) {
                return "o usuario ja foi bloqueado";
            }
            for (SgEmprestimo empst : emprestimoList) {
                if (empst.getDataDevolucao().before(ConvertMilliSecondsToFormattedDate(System.currentTimeMillis() + ""))) {
                    if (empst.getMultaEstado().equalsIgnoreCase("NULL")) {
                        user.setEstado("bloqueado");
                        return "utilizador bloqueado com sucesso";
                    }
                }
            }
        } catch (Exception e) {
            return "o usuario nao fez nenhum emprestimo ate o momento";
        }
        return "situacao regularizada";
    }

    public int bloquear1(String nm) {
        Users user = new UsersJpaController(new JPA().getEmf()).findUsers(nm);
        try {
            if (bloquear(user).equalsIgnoreCase("utilizador bloqueado com sucesso")) {
                return 1;
            }
        } catch (ParseException ex) {
        }
        return 0;
    }

    public String desbloquear(Users user) {
        String estado = "";
        try {
            estado = user.getEstado();
        } catch (java.lang.NullPointerException e) {
            estado = "nao existe";
        }
        if (estado.equalsIgnoreCase("bloqueado")) {
            user.setEstado("Null");
            return "utilizador desbloqueado com sucesso";
        }
        return "o utilizador nao esta bloqueado";
    }

    public void desbloquear1(String nm) {
        Users user = new UsersJpaController(new JPA().getEmf()).findUsers(nm);
        desbloquear(user);      
    }

    public Date ConvertMilliSecondsToFormattedDate(String milliSeconds) throws ParseException {
        String dateFormat = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(Long.parseLong(milliSeconds));
        String dat = simpleDateFormat.format(calendar.getTime());
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date date = new java.sql.Date(format.parse(dat).getTime());
        return date;
    }

}
