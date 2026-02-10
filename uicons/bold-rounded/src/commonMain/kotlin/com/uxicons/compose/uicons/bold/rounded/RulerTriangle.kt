package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RulerTriangle: ImageVector? = null

val Icons.Br.RulerTriangle: ImageVector
    get() = _RulerTriangle ?: UXIcon(name = "RulerTriangle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.72f, 16.56f)
            lineTo(7.44f, 1.28f)
            curveTo(6.17f, 0.01f, 4.35f, -0.35f, 2.69f, 0.34f)
            curveTo(1.03f, 1.02f, 0f, 2.57f, 0f, 4.37f)
            verticalLineToRelative(14.13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(14.13f)
            curveToRelative(1.8f, 0f, 3.34f, -1.03f, 4.03f, -2.69f)
            reflectiveCurveToRelative(0.33f, -3.48f, -0.94f, -4.75f)
            close()
            moveTo(20.89f, 20.16f)
            curveToRelative(-0.08f, 0.2f, -0.41f, 0.84f, -1.26f, 0.84f)
            lineTo(5.5f, 21.0f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 4.37f)
            curveToRelative(0f, -0.84f, 0.64f, -1.18f, 0.84f, -1.26f)
            curveToRelative(0.09f, -0.04f, 0.29f, -0.11f, 0.55f, -0.11f)
            curveToRelative(0.28f, 0f, 0.62f, 0.09f, 0.94f, 0.4f)
            lineToRelative(2.69f, 2.69f)
            lineToRelative(-1.08f, 1.08f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(1.08f, -1.08f)
            lineToRelative(1.77f, 1.77f)
            lineToRelative(-1.08f, 1.08f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(1.08f, -1.08f)
            lineToRelative(1.76f, 1.76f)
            lineToRelative(-1.08f, 1.1f)
            curveToRelative(-0.58f, 0.59f, -0.57f, 1.54f, 0.02f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f)
            curveToRelative(0.39f, 0f, 0.78f, -0.15f, 1.07f, -0.45f)
            lineToRelative(1.06f, -1.08f)
            lineToRelative(2.7f, 2.7f)
            curveToRelative(0.6f, 0.6f, 0.38f, 1.28f, 0.29f, 1.48f)
            close()
            moveTo(10.56f, 15.44f)
            curveToRelative(0.43f, 0.43f, 0.56f, 1.07f, 0.33f, 1.64f)
            curveToRelative(-0.23f, 0.56f, -0.78f, 0.93f, -1.39f, 0.93f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.61f, 0.36f, -1.15f, 0.93f, -1.39f)
            curveToRelative(0.56f, -0.23f, 1.21f, -0.1f, 1.64f, 0.33f)
            lineToRelative(2f, 2f)
            close()
        }
    }.also { _RulerTriangle = it }
