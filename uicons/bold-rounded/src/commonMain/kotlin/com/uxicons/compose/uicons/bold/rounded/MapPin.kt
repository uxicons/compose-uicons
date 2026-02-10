package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPin: ImageVector? = null

val Icons.Br.MapPin: ImageVector
    get() = _MapPin ?: UXIcon(name = "MapPin") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 6f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            reflectiveCurveTo(6f, 2.69f, 6f, 6f)
            curveToRelative(0f, 2.79f, 1.92f, 5.14f, 4.5f, 5.81f)
            verticalLineToRelative(10.69f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(13.5f, 11.81f)
            curveToRelative(2.58f, -0.67f, 4.5f, -3.02f, 4.5f, -5.81f)
            close()
            moveTo(12f, 9f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            close()
        }
    }.also { _MapPin = it }
