package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Ss.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.29f, 22.13f)
                lineToRelative(-0.97f, 1.75f)
                curveTo(2.67f, 21.29f, 0f, 16.96f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                curveToRelative(1.65f, 0f, 3.21f, 0.33f, 4.64f, 0.94f)
                lineToRelative(-1.55f, 1.55f)
                curveToRelative(-0.97f, -0.32f, -2.01f, -0.49f, -3.09f, -0.49f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                curveToRelative(0f, 4.21f, 2.29f, 7.9f, 6.29f, 10.13f)
                close()
                moveTo(12.0f, 12f)
                horizontalLineToRelative(3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.48f, -0.48f, 0.74f, -1.12f, 0.74f, -1.79f)
                reflectiveCurveToRelative(-0.26f, -1.32f, -0.74f, -1.79f)
                curveToRelative(-0.99f, -0.99f, -2.6f, -0.99f, -3.59f, 0f)
                lineToRelative(-7.67f, 7.67f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(21.51f, 8.91f)
                curveToRelative(0.32f, 0.97f, 0.49f, 2.01f, 0.49f, 3.09f)
                curveToRelative(0f, 3.2f, -2.61f, 5.81f, -5.81f, 5.81f)
                reflectiveCurveToRelative(-5.81f, -2.61f, -5.81f, -5.81f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 4.31f, 3.5f, 7.81f, 7.81f, 7.81f)
                reflectiveCurveToRelative(7.81f, -3.5f, 7.81f, -7.81f)
                curveToRelative(0f, -1.65f, -0.33f, -3.22f, -0.94f, -4.65f)
                lineToRelative(-1.55f, 1.55f)
                close()
            }
        }.also { _PenSwirl = it}
