package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peace: ImageVector? = null

val Icons.Br.Peace: ImageVector
    get() = _Peace ?: UXIcon(name = "Peace") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, 1.43f, -0.33f, 2.77f, -0.93f, 3.97f)
            lineToRelative(-6.57f, -6.57f)
            lineTo(13.5f, 3.13f)
            curveToRelative(4.25f, 0.72f, 7.5f, 4.42f, 7.5f, 8.87f)
            close()
            moveTo(10.5f, 20.87f)
            curveToRelative(-1.86f, -0.31f, -3.52f, -1.2f, -4.81f, -2.46f)
            lineToRelative(4.81f, -4.81f)
            verticalLineToRelative(7.27f)
            close()
            moveTo(13.5f, 13.64f)
            lineToRelative(4.79f, 4.79f)
            curveToRelative(-1.28f, 1.26f, -2.94f, 2.13f, -4.79f, 2.44f)
            verticalLineToRelative(-7.24f)
            close()
            moveTo(10.5f, 3.12f)
            verticalLineToRelative(6.24f)
            lineToRelative(-6.59f, 6.59f)
            curveToRelative(-0.58f, -1.19f, -0.91f, -2.53f, -0.91f, -3.95f)
            curveToRelative(0f, -4.45f, 3.25f, -8.16f, 7.5f, -8.87f)
            close()
        }
    }.also { _Peace = it }
