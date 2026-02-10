package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pills: ImageVector? = null

val Icons.Br.Pills: ImageVector
    get() = _Pills ?: UXIcon(name = "Pills") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 11f)
            curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
            reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
            reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
            reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(17.5f, 14f)
            curveToRelative(0.41f, 0f, 0.81f, 0.07f, 1.18f, 0.2f)
            lineToRelative(-4.47f, 4.47f)
            curveToRelative(-0.13f, -0.37f, -0.2f, -0.76f, -0.2f, -1.18f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            close()
            moveTo(17.5f, 21f)
            curveToRelative(-0.41f, 0f, -0.81f, -0.07f, -1.18f, -0.2f)
            lineToRelative(4.47f, -4.47f)
            curveToRelative(0.13f, 0.37f, 0.2f, 0.76f, 0.2f, 1.18f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            close()
            moveTo(10f, 9.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(3f, 13.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            curveToRelative(0.49f, 0f, 0.96f, -0.1f, 1.4f, -0.29f)
            curveToRelative(0.76f, -0.33f, 1.64f, 0.01f, 1.98f, 0.77f)
            reflectiveCurveToRelative(-0.01f, 1.64f, -0.77f, 1.98f)
            curveToRelative(-0.82f, 0.36f, -1.7f, 0.54f, -2.6f, 0.54f)
            curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
            lineTo(-0.0f, 6.5f)
            curveTo(0f, 2.92f, 2.92f, 0f, 6.5f, 0f)
            reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _Pills = it }
