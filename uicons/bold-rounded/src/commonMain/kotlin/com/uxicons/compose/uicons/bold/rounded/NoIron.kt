package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoIron: ImageVector? = null

val Icons.Br.NoIron: ImageVector
    get() = _NoIron ?: UXIcon(name = "NoIron") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 21.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(4.37f, 23f)
            curveToRelative(-1.62f, 0f, -2.82f, -0.47f, -3.58f, -1.39f)
            curveToRelative(-0.71f, -0.86f, -0.95f, -2.04f, -0.68f, -3.4f)
            curveToRelative(0.45f, -2.28f, 1.67f, -5.35f, 4.96f, -7.04f)
            curveToRelative(0.73f, -0.38f, 1.64f, -0.09f, 2.02f, 0.65f)
            curveToRelative(0.38f, 0.73f, 0.09f, 1.64f, -0.65f, 2.02f)
            curveToRelative(-2.22f, 1.15f, -3.07f, 3.33f, -3.39f, 4.96f)
            curveToRelative(-0.08f, 0.42f, -0.06f, 0.77f, 0.05f, 0.91f)
            curveToRelative(0.12f, 0.14f, 0.51f, 0.3f, 1.27f, 0.3f)
            lineTo(14.5f, 20f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 9.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.19f, -0.39f, 2.35f, -1.09f, 3.29f)
            lineToRelative(0.65f, 0.65f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            reflectiveCurveTo(1.98f, -0.15f, 2.56f, 0.44f)
            lineTo(12.12f, 10f)
            horizontalLineToRelative(8.88f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
            close()
            moveTo(20.73f, 18.61f)
            curveToRelative(0.17f, -0.34f, 0.27f, -0.72f, 0.27f, -1.11f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(-5.88f)
            lineToRelative(5.61f, 5.61f)
            close()
        }
    }.also { _NoIron = it }
