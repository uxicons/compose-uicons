package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoonAlt: ImageVector? = null

val Icons.Ss.SpaceStationMoonAlt: ImageVector
    get() = _SpaceStationMoonAlt ?: UXIcon(name = "SpaceStationMoonAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8f)
                close()
                moveTo(17.1f, 7.31f)
                lineToRelative(-1.53f, 1.53f)
                curveToRelative(0.84f, 0.9f, 1.51f, 1.97f, 1.93f, 3.16f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                verticalLineToRelative(5f)
                lineTo(0f, 23f)
                verticalLineToRelative(-7.97f)
                curveTo(0f, 10.39f, 3.51f, 6.56f, 8f, 6.06f)
                verticalLineToRelative(-2.06f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.06f)
                curveToRelative(1.48f, 0.17f, 2.85f, 0.69f, 4.04f, 1.49f)
                lineToRelative(1.65f, -1.65f)
                curveToRelative(-1.05f, -1.35f, -1.69f, -3.05f, -1.69f, -4.9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                verticalLineToRelative(2f)
                curveToRelative(-1.85f, 0f, -3.54f, -0.63f, -4.9f, -1.69f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _SpaceStationMoonAlt = it}
