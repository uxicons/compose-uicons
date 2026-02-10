package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPlayFootball: ImageVector? = null

val Icons.Br.NoPlayFootball: ImageVector
    get() = _NoPlayFootball ?: UXIcon(name = "NoPlayFootball") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(7.5f, 14.99f)
            curveToRelative(-0.83f, 0f, -1.51f, 0.68f, -1.51f, 1.51f)
            reflectiveCurveToRelative(0.68f, 1.51f, 1.51f, 1.51f)
            reflectiveCurveToRelative(1.51f, -0.68f, 1.51f, -1.51f)
            reflectiveCurveToRelative(-0.68f, -1.51f, -1.51f, -1.51f)
            close()
            moveTo(7.47f, 12.34f)
            lineTo(6.03f, 10.91f)
            lineTo(5.37f, 11.41f)
            curveToRelative(-0.43f, 0.33f, -0.53f, 0.93f, -0.22f, 1.37f)
            curveToRelative(0.33f, 0.46f, 0.97f, 0.57f, 1.42f, 0.23f)
            close()
            moveTo(10f, 14.88f)
            verticalLineToRelative(3.12f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-1.12f)
            close()
            moveTo(24f, 12.0f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveToRelative(-12f, -5.38f, -12f, -12.0f)
            reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-1.94f, 0f, -3.73f, 0.62f, -5.21f, 1.67f)
            lineToRelative(3.54f, 3.54f)
            curveToRelative(0.45f, -0.13f, 0.92f, -0.21f, 1.39f, -0.21f)
            horizontalLineToRelative(5.28f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-2.88f)
            lineToRelative(1.5f, 3f)
            horizontalLineToRelative(2.38f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-0.88f)
            lineToRelative(2.21f, 2.21f)
            curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            close()
            moveTo(12f, 21f)
            curveToRelative(1.94f, 0f, 3.73f, -0.62f, 5.21f, -1.67f)
            lineToRelative(-12.53f, -12.53f)
            curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            close()
        }
    }.also { _NoPlayFootball = it }
