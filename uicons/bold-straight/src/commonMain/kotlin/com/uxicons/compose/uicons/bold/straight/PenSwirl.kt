package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Bs.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.91f, 7.0f)
                curveToRelative(0.7f, 1.52f, 1.09f, 3.21f, 1.09f, 5.0f)
                curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
                reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
                horizontalLineToRelative(3f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -0.93f, -0.14f, -1.83f, -0.41f, -2.68f)
                lineToRelative(2.32f, -2.32f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                reflectiveCurveToRelative(-2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                curveToRelative(0.93f, 0f, 1.83f, 0.14f, 2.68f, 0.41f)
                lineToRelative(2.32f, -2.32f)
                curveToRelative(-1.52f, -0.7f, -3.21f, -1.09f, -5.0f, -1.09f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 4.94f, 2.65f, 9.24f, 7.27f, 11.81f)
                lineToRelative(1.46f, -2.62f)
                curveToRelative(-3.64f, -2.02f, -5.73f, -5.37f, -5.73f, -9.19f)
                close()
            }
        }.also { _PenSwirl = it}
