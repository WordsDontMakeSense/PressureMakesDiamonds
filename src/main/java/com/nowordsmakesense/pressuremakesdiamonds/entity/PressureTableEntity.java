package com.nowordsmakesense.pressuremakesdiamonds.entity;

import com.nowordsmakesense.pressuremakesdiamonds.PressureMakesDiamonds;
import com.nowordsmakesense.pressuremakesdiamonds.block.ModBlocks;
import com.nowordsmakesense.pressuremakesdiamonds.block.PressureTableBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.Packet;
import net.minecraft.network.listener.ClientPlayPacketListener;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class PressureTableEntity extends BlockEntity {
    public PressureTableEntity(BlockPos pos, BlockState state)
    {
        super(ModBlocks.PRESSURE_TABLE_ENTITY, pos, state);
    }
    public static void tick(World world, BlockPos pos, BlockState state, PressureTableEntity be) {
    }

    @Override
    public void writeNbt(NbtCompound nbt) {
        // nbt.putInt("number", number);

        super.writeNbt(nbt);
    }
    @Override
    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);

        // number = nbt.getInt("number");
    }

    @Nullable
    @Override
    public Packet<ClientPlayPacketListener> toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    @Override
    public NbtCompound toInitialChunkDataNbt() {
        return createNbt();
    }
}
