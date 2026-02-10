package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotDisturb: ImageVector? = null

val Icons.Br.DoNotDisturb: ImageVector
    get() = _DoNotDisturb ?: UXIcon(name = "DoNotDisturb") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 18f)
            curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            close()
            moveTo(18.77f, 20.89f)
            lineToRelative(-3.66f, -3.65f)
            curveToRelative(-0.07f, 0.25f, -0.11f, 0.5f, -0.11f, 0.77f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            curveToRelative(0.27f, 0f, 0.52f, -0.05f, 0.77f, -0.11f)
            close()
            moveTo(21f, 18f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            curveToRelative(-0.27f, 0f, -0.52f, 0.05f, -0.77f, 0.11f)
            lineToRelative(3.66f, 3.65f)
            curveToRelative(0.07f, -0.25f, 0.11f, -0.5f, 0.11f, -0.77f)
            close()
            moveTo(5.5f, 11f)
            horizontalLineToRelative(4f)
            curveToRelative(0.59f, 0f, 1.09f, -0.06f, 1.54f, -0.16f)
            curveToRelative(0.15f, 0.66f, 0.75f, 1.16f, 1.46f, 1.16f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.5f)
            curveTo(14f, 3.14f, 10.86f, 0f, 7f, 0f)
            curveTo(4.36f, 0f, 1.97f, 1.46f, 0.76f, 3.82f)
            curveToRelative(-0.38f, 0.74f, -0.09f, 1.64f, 0.65f, 2.02f)
            curveToRelative(0.74f, 0.38f, 1.64f, 0.08f, 2.02f, -0.65f)
            curveToRelative(0.69f, -1.35f, 2.06f, -2.18f, 3.56f, -2.18f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            curveToRelative(0f, 0.75f, 0f, 1f, -1.5f, 1f)
            lineTo(5.5f, 8.0f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.5f, 21.0f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.also { _DoNotDisturb = it }
