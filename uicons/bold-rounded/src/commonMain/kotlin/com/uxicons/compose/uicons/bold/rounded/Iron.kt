package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Iron: ImageVector? = null

val Icons.Br.Iron: ImageVector
    get() = _Iron ?: UXIcon(name = "Iron") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 1f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(0.5f)
            lineTo(10.37f, 10f)
            curveTo(4.88f, 10f, 1.14f, 12.99f, 0.11f, 18.21f)
            curveToRelative(-0.27f, 1.35f, -0.03f, 2.53f, 0.68f, 3.4f)
            curveToRelative(0.76f, 0.93f, 1.97f, 1.39f, 3.58f, 1.39f)
            horizontalLineToRelative(14.13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 9.5f)
            curveToRelative(0f, -4.69f, -3.81f, -8.5f, -8.5f, -8.5f)
            close()
            moveTo(21f, 17.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(4.37f, 20f)
            curveToRelative(-0.75f, 0f, -1.15f, -0.15f, -1.27f, -0.3f)
            curveToRelative(-0.12f, -0.14f, -0.14f, -0.49f, -0.05f, -0.91f)
            curveToRelative(0.76f, -3.84f, 3.22f, -5.79f, 7.32f, -5.79f)
            horizontalLineToRelative(10.63f)
            verticalLineToRelative(4.5f)
            close()
            moveTo(11f, 16.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _Iron = it }
