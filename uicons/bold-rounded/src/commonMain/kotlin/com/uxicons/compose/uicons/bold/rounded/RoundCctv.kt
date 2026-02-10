package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RoundCctv: ImageVector? = null

val Icons.Br.RoundCctv: ImageVector
    get() = _RoundCctv ?: UXIcon(name = "RoundCctv") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 4f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-16f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 1.0f, 0.39f, 1.91f, 1f, 2.62f)
            verticalLineToRelative(6.38f)
            curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
            reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
            verticalLineToRelative(-6.38f)
            curveToRelative(0.61f, -0.7f, 1f, -1.61f, 1f, -2.62f)
            close()
            moveTo(4f, 3f)
            horizontalLineToRelative(16f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-16f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            close()
            moveTo(20f, 13f)
            curveToRelative(0f, 4.41f, -3.59f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.59f, -8f, -8f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(16f)
            close()
            moveTo(12f, 19f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            close()
            moveTo(12f, 12f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            close()
        }
    }.also { _RoundCctv = it }
