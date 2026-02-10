package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainTrack: ImageVector? = null

val Icons.Ss.TrainTrack: ImageVector
    get() = _TrainTrack ?: UXIcon(name = "TrainTrack") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.88f, 22f)
                lineTo(6.05f, 22f)
                lineToRelative(-0.22f, 2f)
                horizontalLineToRelative(-2.01f)
                lineTo(6.21f, 2f)
                horizontalLineToRelative(0f)
                lineToRelative(0.22f, -2f)
                horizontalLineToRelative(2.01f)
                lineToRelative(-0.22f, 2f)
                horizontalLineToRelative(6.48f)
                lineToRelative(0.54f, 5f)
                horizontalLineToRelative(-7.57f)
                lineToRelative(-0.27f, 2.5f)
                horizontalLineToRelative(8.11f)
                lineToRelative(0.54f, 5f)
                lineTo(6.87f, 14.5f)
                lineToRelative(-0.27f, 2.5f)
                horizontalLineToRelative(9.74f)
                lineToRelative(0.54f, 5f)
                close()
                moveTo(24f, 22f)
                lineToRelative(-0.54f, -5f)
                horizontalLineToRelative(-3.04f)
                lineToRelative(-0.27f, -2.5f)
                horizontalLineToRelative(2.88f)
                lineToRelative(-0.54f, -5f)
                horizontalLineToRelative(-2.88f)
                lineToRelative(-0.27f, -2.5f)
                horizontalLineToRelative(2.93f)
                lineToRelative(-0.54f, -5f)
                horizontalLineToRelative(-2.93f)
                lineToRelative(-0.22f, -2f)
                horizontalLineToRelative(-2.01f)
                lineToRelative(2.61f, 24f)
                horizontalLineToRelative(2.01f)
                lineToRelative(-0.22f, -2f)
                horizontalLineToRelative(3.04f)
                close()
                moveTo(2.05f, 2f)
                lineToRelative(-0.54f, 5f)
                horizontalLineToRelative(2.15f)
                lineToRelative(0.54f, -5f)
                horizontalLineToRelative(-2.15f)
                close()
                moveTo(0.75f, 14.5f)
                horizontalLineToRelative(2.09f)
                lineToRelative(0.54f, -5f)
                lineTo(1.29f, 9.5f)
                lineToRelative(-0.54f, 5f)
                close()
                moveTo(-0.23f, 22f)
                horizontalLineToRelative(2.25f)
                lineToRelative(0.54f, -5f)
                lineTo(0.31f, 17f)
                lineToRelative(-0.54f, 5f)
                close()
            }
        }.also { _TrainTrack = it}
