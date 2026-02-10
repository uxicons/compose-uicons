package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandMineOn: ImageVector? = null

val Icons.Rs.LandMineOn: ImageVector
    get() = _LandMineOn ?: UXIcon(name = "LandMineOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.37f, 22f)
                lineToRelative(-0.63f, -4.42f)
                curveToRelative(-0.21f, -1.47f, -1.49f, -2.58f, -2.97f, -2.58f)
                horizontalLineToRelative(-1.77f)
                verticalLineToRelative(-4f)
                lineTo(7f, 11f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1.77f)
                curveToRelative(-1.48f, 0f, -2.76f, 1.11f, -2.97f, 2.58f)
                lineToRelative(-0.63f, 4.42f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                lineTo(24f, 24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.63f)
                close()
                moveTo(9f, 13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(4.25f, 17.86f)
                curveToRelative(0.07f, -0.49f, 0.49f, -0.86f, 0.99f, -0.86f)
                horizontalLineToRelative(13.53f)
                curveToRelative(0.49f, 0f, 0.92f, 0.37f, 0.99f, 0.86f)
                lineToRelative(0.59f, 4.14f)
                lineTo(3.65f, 22f)
                lineToRelative(0.59f, -4.14f)
                close()
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 7f)
                close()
                moveTo(18.21f, 9.21f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(5f, -5f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-5f, 5f)
                close()
                moveTo(5.79f, 9.21f)
                lineTo(0.79f, 4.21f)
                lineToRelative(1.41f, -1.41f)
                lineTo(7.21f, 7.79f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _LandMineOn = it}
