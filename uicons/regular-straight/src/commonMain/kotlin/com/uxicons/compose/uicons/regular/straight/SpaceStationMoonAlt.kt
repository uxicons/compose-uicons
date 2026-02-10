package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceStationMoonAlt: ImageVector? = null

val Icons.Rs.SpaceStationMoonAlt: ImageVector
    get() = _SpaceStationMoonAlt ?: UXIcon(name = "SpaceStationMoonAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.8f, 13f)
                curveToRelative(-0.37f, -1.59f, -1.15f, -3.02f, -2.23f, -4.16f)
                lineToRelative(1.53f, -1.53f)
                curveToRelative(1.35f, 1.05f, 3.06f, 1.68f, 4.9f, 1.68f)
                verticalLineToRelative(-2f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 1.85f, 0.63f, 3.55f, 1.68f, 4.9f)
                lineToRelative(-1.64f, 1.64f)
                curveToRelative(-1.19f, -0.8f, -2.56f, -1.32f, -4.04f, -1.49f)
                verticalLineToRelative(-2.06f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2.06f)
                curveTo(3.51f, 6.56f, 0f, 10.39f, 0f, 15.03f)
                verticalLineToRelative(7.97f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-6.2f)
                close()
                moveTo(11f, 18f)
                verticalLineToRelative(3f)
                lineTo(2f, 21f)
                verticalLineToRelative(-5.97f)
                curveToRelative(0f, -3.88f, 3.14f, -7.03f, 7f, -7.03f)
                curveToRelative(3.14f, 0f, 5.86f, 2.09f, 6.73f, 5.01f)
                curveToRelative(-2.63f, 0.14f, -4.73f, 2.33f, -4.73f, 4.99f)
                close()
                moveTo(22f, 21f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveTo(5f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _SpaceStationMoonAlt = it}
