package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ux: ImageVector? = null

val Icons.Br.Ux: ImageVector
    get() = _Ux ?: UXIcon(name = "Ux") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 8.25f)
            verticalLineToRelative(5.25f)
            curveToRelative(0f, 2.17f, -1.99f, 3.88f, -4.24f, 3.42f)
            curveToRelative(-1.64f, -0.34f, -2.77f, -1.85f, -2.77f, -3.52f)
            verticalLineToRelative(-5.15f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            verticalLineToRelative(5.08f)
            curveToRelative(0f, 0.64f, 0.36f, 1.17f, 1f, 1.17f)
            reflectiveCurveToRelative(1f, -0.52f, 1f, -1.17f)
            verticalLineToRelative(-5.08f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(24f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            close()
            moveTo(19.07f, 8.81f)
            curveToRelative(0.42f, -0.83f, -0.18f, -1.81f, -1.12f, -1.81f)
            curveToRelative(-0.65f, 0f, -1.04f, 0.27f, -1.25f, 0.69f)
            lineToRelative(-0.71f, 1.4f)
            lineToRelative(-0.01f, 0.01f)
            lineToRelative(-0.01f, -0.01f)
            lineToRelative(-0.71f, -1.4f)
            curveToRelative(-0.21f, -0.42f, -0.61f, -0.69f, -1.25f, -0.69f)
            curveToRelative(-0.93f, 0f, -1.54f, 0.98f, -1.12f, 1.81f)
            lineToRelative(1.6f, 3.17f)
            lineToRelative(0.01f, 0.01f)
            lineToRelative(-1.61f, 3.19f)
            curveToRelative(-0.42f, 0.83f, 0.18f, 1.81f, 1.12f, 1.81f)
            curveToRelative(0.69f, 0f, 1.04f, -0.27f, 1.25f, -0.69f)
            lineToRelative(0.71f, -1.41f)
            lineToRelative(0.71f, 1.41f)
            curveToRelative(0.21f, 0.42f, 0.6f, 0.69f, 1.25f, 0.69f)
            curveToRelative(0.93f, 0f, 1.54f, -0.98f, 1.12f, -1.81f)
            lineToRelative(-1.61f, -3.19f)
            lineToRelative(0.01f, -0.01f)
            lineToRelative(1.6f, -3.17f)
            close()
        }
    }.also { _Ux = it }
