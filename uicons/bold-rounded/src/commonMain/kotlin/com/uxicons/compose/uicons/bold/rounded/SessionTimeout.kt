package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SessionTimeout: ImageVector? = null

val Icons.Br.SessionTimeout: ImageVector
    get() = _SessionTimeout ?: UXIcon(name = "SessionTimeout") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(10.5f, 12f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(22.31f, 24f)
            horizontalLineToRelative(-9.62f)
            curveToRelative(-1.26f, 0f, -2.04f, -1.36f, -1.41f, -2.45f)
            lineToRelative(4.81f, -8.24f)
            curveToRelative(0.63f, -1.08f, 2.19f, -1.08f, 2.81f, 0f)
            lineToRelative(4.81f, 8.24f)
            curveToRelative(0.63f, 1.09f, -0.15f, 2.45f, -1.41f, 2.45f)
            close()
            moveTo(18.5f, 22f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            close()
            moveTo(18.5f, 17.0f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            verticalLineToRelative(2.0f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
            close()
            moveTo(8.83f, 17.81f)
            curveToRelative(-3.43f, -0.78f, -5.83f, -3.79f, -5.83f, -7.31f)
            curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
            curveToRelative(3.83f, 0f, 7.03f, 2.87f, 7.45f, 6.67f)
            curveToRelative(0.09f, 0.82f, 0.85f, 1.41f, 1.66f, 1.33f)
            curveToRelative(0.82f, -0.09f, 1.42f, -0.83f, 1.33f, -1.66f)
            curveToRelative(-0.59f, -5.32f, -5.08f, -9.34f, -10.44f, -9.34f)
            curveToRelative(-5.79f, 0f, -10.5f, 4.71f, -10.5f, 10.5f)
            curveToRelative(0f, 4.94f, 3.36f, 9.15f, 8.17f, 10.24f)
            curveToRelative(0.79f, 0.18f, 1.61f, -0.32f, 1.79f, -1.13f)
            curveToRelative(0.18f, -0.81f, -0.32f, -1.61f, -1.13f, -1.79f)
            close()
        }
    }.also { _SessionTimeout = it }
