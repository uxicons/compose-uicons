package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Squircle: ImageVector? = null

val Icons.Br.Squircle: ImageVector
    get() = _Squircle ?: UXIcon(name = "Squircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveToRelative(-0.75f, 0f, -1.78f, -0.06f, -3.08f, -0.18f)
            curveTo(4.27f, 23.4f, 0.6f, 19.73f, 0.18f, 15.08f)
            curveToRelative(-0.12f, -1.3f, -0.18f, -2.33f, -0.18f, -3.08f)
            reflectiveCurveToRelative(0.06f, -1.78f, 0.18f, -3.08f)
            curveTo(0.6f, 4.27f, 4.27f, 0.6f, 8.92f, 0.18f)
            curveToRelative(1.3f, -0.12f, 2.33f, -0.18f, 3.08f, -0.18f)
            reflectiveCurveToRelative(1.78f, 0.06f, 3.08f, 0.18f)
            curveToRelative(4.65f, 0.42f, 8.32f, 4.1f, 8.74f, 8.74f)
            curveToRelative(0.12f, 1.3f, 0.18f, 2.33f, 0.18f, 3.08f)
            reflectiveCurveToRelative(-0.06f, 1.78f, -0.18f, 3.08f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.42f, 4.64f, -4.1f, 8.32f, -8.74f, 8.74f)
            curveToRelative(-1.3f, 0.12f, -2.33f, 0.18f, -3.08f, 0.18f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-0.66f, 0f, -1.6f, 0.06f, -2.81f, 0.17f)
            curveToRelative(-3.2f, 0.29f, -5.73f, 2.82f, -6.02f, 6.02f)
            curveToRelative(-0.11f, 1.21f, -0.17f, 2.15f, -0.17f, 2.81f)
            reflectiveCurveToRelative(0.06f, 1.6f, 0.16f, 2.81f)
            curveToRelative(0.29f, 3.2f, 2.82f, 5.73f, 6.02f, 6.02f)
            curveToRelative(1.21f, 0.11f, 2.15f, 0.17f, 2.81f, 0.17f)
            reflectiveCurveToRelative(1.6f, -0.06f, 2.81f, -0.17f)
            curveToRelative(3.2f, -0.29f, 5.73f, -2.82f, 6.02f, -6.02f)
            horizontalLineToRelative(0f)
            curveToRelative(0.11f, -1.21f, 0.16f, -2.15f, 0.16f, -2.81f)
            reflectiveCurveToRelative(-0.06f, -1.6f, -0.16f, -2.81f)
            curveToRelative(-0.29f, -3.2f, -2.82f, -5.73f, -6.02f, -6.02f)
            curveToRelative(-1.21f, -0.11f, -2.15f, -0.17f, -2.81f, -0.17f)
            close()
        }
    }.also { _Squircle = it }
