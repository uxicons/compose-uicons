package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandMineOn: ImageVector? = null

val Icons.Ss.LandMineOn: ImageVector
    get() = _LandMineOn ?: UXIcon(name = "LandMineOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 14f)
                lineTo(7f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(3f)
                close()
                moveTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 7f)
                horizontalLineToRelative(2f)
                lineTo(13f, 0f)
                close()
                moveTo(23.21f, 4.21f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-5f, 5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5f, -5f)
                close()
                moveTo(7.21f, 7.79f)
                lineTo(2.21f, 2.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(5f, 5f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(22.23f, 22f)
                lineToRelative(-0.49f, -3.42f)
                curveToRelative(-0.21f, -1.47f, -1.49f, -2.58f, -2.97f, -2.58f)
                lineTo(5.23f, 16f)
                curveToRelative(-1.48f, 0f, -2.76f, 1.11f, -2.97f, 2.58f)
                lineToRelative(-0.49f, 3.42f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.77f)
                close()
            }
        }.also { _LandMineOn = it}
