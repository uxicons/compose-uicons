package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldSlash: ImageVector? = null

val Icons.Br.ShieldSlash: ImageVector
    get() = _ShieldSlash ?: UXIcon(name = "ShieldSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.48f, 20.78f)
            curveToRelative(0.4f, 0.73f, 0.13f, 1.64f, -0.59f, 2.04f)
            curveToRelative(-0.8f, 0.44f, -1.49f, 0.74f, -1.93f, 0.92f)
            curveToRelative(0f, 0f, -0.52f, 0.27f, -0.95f, 0.27f)
            reflectiveCurveToRelative(-1.05f, -0.35f, -1.05f, -0.35f)
            curveToRelative(-2.1f, -1.05f, -8.95f, -4.98f, -8.95f, -11.5f)
            verticalLineToRelative(-1.65f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.65f)
            curveToRelative(0f, 4.61f, 5.14f, 7.71f, 7.07f, 8.7f)
            curveToRelative(0.35f, -0.15f, 0.83f, -0.37f, 1.37f, -0.67f)
            curveToRelative(0.73f, -0.4f, 1.64f, -0.13f, 2.04f, 0.59f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            reflectiveCurveTo(1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(2.05f, 2.05f)
            curveToRelative(0.32f, -0.18f, 0.65f, -0.34f, 1.0f, -0.46f)
            lineTo(11.53f, 0.08f)
            curveToRelative(0.31f, -0.1f, 0.64f, -0.1f, 0.94f, 0f)
            lineToRelative(5.91f, 1.96f)
            curveToRelative(2.16f, 0.72f, 3.62f, 2.73f, 3.62f, 5.01f)
            verticalLineToRelative(5.11f)
            curveToRelative(0f, 2.15f, -0.6f, 4.15f, -1.78f, 5.94f)
            lineToRelative(3.34f, 3.34f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(6.89f, 4.77f)
            lineToRelative(11.14f, 11.14f)
            curveToRelative(0.64f, -1.16f, 0.97f, -2.42f, 0.97f, -3.76f)
            verticalLineToRelative(-5.11f)
            curveToRelative(0f, -0.98f, -0.63f, -1.85f, -1.56f, -2.16f)
            lineToRelative(-5.44f, -1.8f)
            lineToRelative(-5.11f, 1.69f)
            close()
        }
    }.also { _ShieldSlash = it }
