package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Typewriter: ImageVector? = null

val Icons.Br.Typewriter: ImageVector
    get() = _Typewriter ?: UXIcon(name = "Typewriter") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 9f)
            horizontalLineToRelative(-0.55f)
            curveToRelative(-0.17f, -1.17f, -0.92f, -2.15f, -1.95f, -2.65f)
            verticalLineToRelative(-1.35f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(1.35f)
            curveToRelative(-1.03f, 0.49f, -1.78f, 1.48f, -1.95f, 2.65f)
            horizontalLineToRelative(-0.55f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-6.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(9f, 3f)
            horizontalLineToRelative(6f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(1f)
            lineTo(7f, 6f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            close()
            moveTo(19f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 9.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1.81f)
            curveToRelative(-0.19f, 0.38f, -0.31f, 0.8f, -0.31f, 1.25f)
            curveToRelative(0f, 1.52f, 1.23f, 2.75f, 2.75f, 2.75f)
            horizontalLineToRelative(4.5f)
            curveToRelative(1.52f, 0f, 2.75f, -1.23f, 2.75f, -2.75f)
            curveToRelative(0f, -0.45f, -0.12f, -0.87f, -0.31f, -1.25f)
            horizontalLineToRelative(1.81f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(11f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(16f, 17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Typewriter = it }
