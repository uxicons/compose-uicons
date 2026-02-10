package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Angle90: ImageVector? = null

val Icons.Br.Angle90: ImageVector
    get() = _Angle90 ?: UXIcon(name = "Angle90") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(17f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(17f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(18.4f, 14.94f)
            curveToRelative(0.27f, 0.88f, 0.45f, 1.79f, 0.53f, 2.71f)
            curveToRelative(0.07f, 0.78f, 0.6f, 1.35f, 1.64f, 1.35f)
            curveToRelative(0.82f, -0.08f, 1.43f, -0.81f, 1.35f, -1.64f)
            curveToRelative(-0.11f, -1.11f, -0.33f, -2.22f, -0.65f, -3.29f)
            curveToRelative(-0.24f, -0.79f, -1.08f, -1.24f, -1.87f, -1.0f)
            curveToRelative(-0.79f, 0.24f, -1.24f, 1.08f, -1f, 1.87f)
            close()
            moveTo(15.84f, 10.14f)
            curveToRelative(0.3f, 0.36f, 0.73f, 0.55f, 1.16f, 0.55f)
            curveToRelative(0.33f, 0f, 0.67f, -0.11f, 0.95f, -0.34f)
            curveToRelative(0.64f, -0.52f, 0.73f, -1.47f, 0.21f, -2.11f)
            curveToRelative(-0.72f, -0.88f, -1.52f, -1.68f, -2.4f, -2.4f)
            curveToRelative(-0.64f, -0.52f, -1.59f, -0.43f, -2.11f, 0.21f)
            curveToRelative(-0.53f, 0.64f, -0.43f, 1.59f, 0.21f, 2.11f)
            curveToRelative(0.72f, 0.59f, 1.39f, 1.26f, 1.98f, 1.98f)
            close()
            moveTo(6.36f, 5.06f)
            curveToRelative(0.92f, 0.09f, 1.83f, 0.27f, 2.71f, 0.53f)
            curveToRelative(0.14f, 0.04f, 0.29f, 0.06f, 0.44f, 0.06f)
            curveToRelative(0.64f, 0f, 1.24f, -0.42f, 1.44f, -1.06f)
            curveToRelative(0.24f, -0.79f, -0.21f, -1.63f, -1f, -1.87f)
            curveToRelative(-1.07f, -0.32f, -2.17f, -0.54f, -3.29f, -0.65f)
            curveToRelative(-0.82f, -0.08f, -1.56f, 0.52f, -1.64f, 1.35f)
            curveToRelative(-0.08f, 0.82f, 0.52f, 1.56f, 1.35f, 1.64f)
            close()
        }
    }.also { _Angle90 = it }
