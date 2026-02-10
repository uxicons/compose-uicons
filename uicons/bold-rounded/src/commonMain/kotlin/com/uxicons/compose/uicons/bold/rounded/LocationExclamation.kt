package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationExclamation: ImageVector? = null

val Icons.Br.LocationExclamation: ImageVector
    get() = _LocationExclamation ?: UXIcon(name = "LocationExclamation") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.78f, 3.24f)
            curveToRelative(-2.08f, -2.09f, -4.84f, -3.24f, -7.78f, -3.24f)
            reflectiveCurveToRelative(-5.7f, 1.15f, -7.78f, 3.24f)
            curveTo(-0.07f, 7.54f, -0.07f, 14.55f, 4.26f, 18.89f)
            lineToRelative(3.73f, 3.46f)
            curveToRelative(1.08f, 1.06f, 2.5f, 1.64f, 4.0f, 1.64f)
            reflectiveCurveToRelative(2.93f, -0.58f, 3.97f, -1.61f)
            lineToRelative(3.81f, -3.54f)
            curveToRelative(4.28f, -4.31f, 4.28f, -11.31f, 0f, -15.62f)
            close()
            moveTo(17.7f, 16.7f)
            lineToRelative(-3.8f, 3.52f)
            curveToRelative(-1.02f, 1.01f, -2.75f, 1.04f, -3.83f, -0.03f)
            lineToRelative(-3.72f, -3.45f)
            curveToRelative(-3.12f, -3.14f, -3.12f, -8.24f, 0f, -11.38f)
            curveToRelative(1.51f, -1.52f, 3.52f, -2.35f, 5.65f, -2.35f)
            reflectiveCurveToRelative(4.14f, 0.84f, 5.65f, 2.35f)
            horizontalLineToRelative(0f)
            curveToRelative(3.12f, 3.14f, 3.12f, 8.24f, 0.04f, 11.34f)
            close()
            moveTo(13.5f, 6.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(13.5f, 15.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _LocationExclamation = it }
