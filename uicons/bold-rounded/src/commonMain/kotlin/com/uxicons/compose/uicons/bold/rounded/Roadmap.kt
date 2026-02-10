package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Roadmap: ImageVector? = null

val Icons.Br.Roadmap: ImageVector
    get() = _Roadmap ?: UXIcon(name = "Roadmap") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 15.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(2.5f, 19f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(7.99f, 15.68f)
            curveToRelative(0.12f, -0.82f, -0.45f, -1.58f, -1.27f, -1.7f)
            curveToRelative(-0.98f, -0.14f, -1.71f, -0.99f, -1.71f, -1.98f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(6.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(7f, 7.0f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            curveToRelative(0f, 2.47f, 1.84f, 4.6f, 4.29f, 4.95f)
            curveToRelative(0.07f, 0.01f, 0.14f, 0.02f, 0.21f, 0.02f)
            curveToRelative(0.73f, 0f, 1.38f, -0.54f, 1.48f, -1.29f)
            close()
            moveTo(19.5f, 14f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(8.5f, 20f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(11f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(18.5f, 10f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.44f)
            lineToRelative(3.52f, -1.69f)
            curveToRelative(0.64f, -0.4f, 0.64f, -1.33f, 0f, -1.73f)
            lineToRelative(-3.1f, -1.26f)
            curveToRelative(-0.61f, -0.25f, -1.27f, -0.38f, -1.93f, -0.38f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.also { _Roadmap = it }
