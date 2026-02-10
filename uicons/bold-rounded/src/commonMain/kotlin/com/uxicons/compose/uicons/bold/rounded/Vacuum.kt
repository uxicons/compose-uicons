package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Vacuum: ImageVector? = null

val Icons.Br.Vacuum: ImageVector
    get() = _Vacuum ?: UXIcon(name = "Vacuum") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 21f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(20f, 7.5f)
            verticalLineToRelative(-0.65f)
            curveToRelative(0f, -3.78f, -3.08f, -6.86f, -6.86f, -6.86f)
            curveToRelative(-3.39f, 0f, -6.31f, 2.53f, -6.79f, 5.89f)
            lineToRelative(-2.16f, 15.11f)
            lineTo(1.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.75f, 0f, 1.38f, -0.55f, 1.49f, -1.29f)
            lineToRelative(2.34f, -16.4f)
            curveToRelative(0.27f, -1.89f, 1.91f, -3.31f, 3.82f, -3.31f)
            curveToRelative(2.13f, 0f, 3.85f, 1.73f, 3.85f, 3.85f)
            verticalLineToRelative(0.14f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-12f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -2.7f, -1.65f, -5.02f, -4f, -6.0f)
            close()
        }
    }.also { _Vacuum = it }
