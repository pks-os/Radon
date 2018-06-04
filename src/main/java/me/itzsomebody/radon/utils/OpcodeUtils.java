/*
 * Copyright (C) 2018 ItzSomebody
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package me.itzsomebody.radon.utils;

import org.objectweb.asm.Opcodes;

/**
 * Contains one utility which maps opcodes to strings for legibility.
 *
 * @author ItzSomebody
 */
public class OpcodeUtils implements Opcodes {
    /**
     * Returns a {@link String} representation of inputted opcode.
     *
     * @param opcode the opcode to get a name from.
     * @return a {@link String} representation of inputted opcode.
     */
    public static String getOpcodeName(int opcode) {
        switch (opcode) {
            case NOP:
                return "nop";
            case ACONST_NULL:
                return "aconst_null";
            case ICONST_M1:
                return "iconst_m1";
            case ICONST_0:
                return "iconst_0";
            case ICONST_1:
                return "iconst_1";
            case ICONST_2:
                return "iconst_2";
            case ICONST_3:
                return "iconst_3";
            case ICONST_4:
                return "iconst_4";
            case ICONST_5:
                return "iconst_5";
            case LCONST_0:
                return "lconst_0";
            case LCONST_1:
                return "lconst_1";
            case FCONST_0:
                return "fconst_0";
            case FCONST_1:
                return "fconst_1";
            case FCONST_2:
                return "fconst_2";
            case DCONST_0:
                return "dconst_0";
            case DCONST_1:
                return "dconst_1";
            case BIPUSH:
                return "bipush";
            case SIPUSH:
                return "sipush";
            case LDC:
                return "ldc";
            case ILOAD:
                return "iload";
            case LLOAD:
                return "lload";
            case FLOAD:
                return "fload";
            case DLOAD:
                return "dload";
            case ALOAD:
                return "aload";
            case IALOAD:
                return "iaload";
            case LALOAD:
                return "laload";
            case FALOAD:
                return "faload";
            case DALOAD:
                return "daload";
            case AALOAD:
                return "aaload";
            case BALOAD:
                return "baload";
            case CALOAD:
                return "caload";
            case SALOAD:
                return "saload";
            case ISTORE:
                return "istore";
            case LSTORE:
                return "lstore";
            case FSTORE:
                return "fstore";
            case DSTORE:
                return "dstore";
            case ASTORE:
                return "astore";
            case IASTORE:
                return "iastore";
            case LASTORE:
                return "lastore";
            case FASTORE:
                return "fastore";
            case DASTORE:
                return "dastore";
            case AASTORE:
                return "aastore";
            case BASTORE:
                return "bastore";
            case CASTORE:
                return "castore";
            case SASTORE:
                return "sastore";
            case POP:
                return "pop";
            case POP2:
                return "pop2";
            case DUP:
                return "dup";
            case DUP_X1:
                return "dup_x1";
            case DUP_X2:
                return "dup_x2";
            case DUP2:
                return "dup2";
            case DUP2_X1:
                return "dup2_x1";
            case DUP2_X2:
                return "dup2_x2";
            case SWAP:
                return "swap";
            case IADD:
                return "iadd";
            case LADD:
                return "ladd";
            case FADD:
                return "fadd";
            case DADD:
                return "dadd";
            case ISUB:
                return "isub";
            case LSUB:
                return "lsub";
            case FSUB:
                return "fsub";
            case DSUB:
                return "dsub";
            case IMUL:
                return "imul";
            case LMUL:
                return "lmul";
            case FMUL:
                return "fmul";
            case DMUL:
                return "dmul";
            case IDIV:
                return "idiv";
            case LDIV:
                return "ldiv";
            case FDIV:
                return "fdiv";
            case DDIV:
                return "ddiv";
            case IREM:
                return "irem";
            case LREM:
                return "lrem";
            case FREM:
                return "frem";
            case DREM:
                return "drem";
            case INEG:
                return "ineg";
            case LNEG:
                return "lneg";
            case FNEG:
                return "fneg";
            case DNEG:
                return "dneg";
            case ISHL:
                return "ishl";
            case LSHL:
                return "lshl";
            case ISHR:
                return "ishr";
            case LSHR:
                return "lshr";
            case IUSHR:
                return "iushr";
            case LUSHR:
                return "lushr";
            case IAND:
                return "iand";
            case LAND:
                return "land";
            case IOR:
                return "ior";
            case LOR:
                return "lor";
            case IXOR:
                return "ixor";
            case LXOR:
                return "lxor";
            case IINC:
                return "iinc";
            case I2L:
                return "i2l";
            case I2F:
                return "i2f";
            case I2D:
                return "i2d";
            case L2I:
                return "l2i";
            case L2F:
                return "l2f";
            case L2D:
                return "l2d";
            case F2I:
                return "f2i";
            case F2L:
                return "f2l";
            case F2D:
                return "f2d";
            case D2I:
                return "d2i";
            case D2L:
                return "d2l";
            case D2F:
                return "d2f";
            case I2B:
                return "i2b";
            case I2C:
                return "i2c";
            case I2S:
                return "i2s";
            case LCMP:
                return "lcmp";
            case FCMPL:
                return "fcmpl";
            case FCMPG:
                return "fcmpg";
            case DCMPL:
                return "dcmpl";
            case DCMPG:
                return "dcmpg";
            case IFEQ:
                return "ifeq";
            case IFNE:
                return "ifne";
            case IFLT:
                return "iflt";
            case IFGE:
                return "ifge";
            case IFGT:
                return "ifgt";
            case IFLE:
                return "ifle";
            case IF_ICMPEQ:
                return "if_icmpeq";
            case IF_ICMPNE:
                return "if_icmpne";
            case IF_ICMPLT:
                return "if_icmplt";
            case IF_ICMPGE:
                return "if_icmpge";
            case IF_ICMPGT:
                return "if_icmpgt";
            case IF_ICMPLE:
                return "if_icmple";
            case IF_ACMPEQ:
                return "if_acmpeq";
            case IF_ACMPNE:
                return "if_acmpne";
            case GOTO:
                return "goto";
            case JSR:
                return "jsr";
            case RET:
                return "ret";
            case TABLESWITCH:
                return "tableswitch";
            case LOOKUPSWITCH:
                return "lookupswitch";
            case IRETURN:
                return "ireturn";
            case LRETURN:
                return "lreturn";
            case FRETURN:
                return "freturn";
            case DRETURN:
                return "dreturn";
            case ARETURN:
                return "areturn";
            case RETURN:
                return "return";
            case GETSTATIC:
                return "getstatic";
            case PUTSTATIC:
                return "putstatic";
            case GETFIELD:
                return "getfield";
            case PUTFIELD:
                return "putfield";
            case INVOKEVIRTUAL:
                return "invokevirtual";
            case INVOKESPECIAL:
                return "invokespecial";
            case INVOKESTATIC:
                return "invokestatic";
            case INVOKEINTERFACE:
                return "invokeinterface";
            case INVOKEDYNAMIC:
                return "invokedynamic";
            case NEW:
                return "new";
            case NEWARRAY:
                return "newarray";
            case ANEWARRAY:
                return "anewarray";
            case ARRAYLENGTH:
                return "arraylength";
            case ATHROW:
                return "athrow";
            case CHECKCAST:
                return "checkcast";
            case INSTANCEOF:
                return "instanceof";
            case MONITORENTER:
                return "monitorenter";
            case MONITOREXIT:
                return "monitorexit";
            case MULTIANEWARRAY:
                return "multianewarray";
            case IFNULL:
                return "ifnull";
            case IFNONNULL:
                return "ifnonnull";
            case -1:
                return "debugging";
        }

        throw new IllegalArgumentException("Unknown opcode");
    }
}
