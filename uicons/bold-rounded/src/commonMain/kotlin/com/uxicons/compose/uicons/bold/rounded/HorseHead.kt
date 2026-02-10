package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Br.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(13.5f, 13f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(22.39f, 14.28f)
            curveToRelative(-2.75f, -2.16f, -3.85f, -4.38f, -4.92f, -6.53f)
            curveToRelative(-0.7f, -1.42f, -1.4f, -2.75f, -2.46f, -3.94f)
            lineTo(15f, 0.81f)
            curveToRelative(0f, -0.54f, -0.52f, -0.93f, -1.04f, -0.79f)
            curveToRelative(-1.46f, 0.4f, -2.59f, 1.6f, -2.88f, 3.1f)
            curveTo(4.2f, 3.95f, 0f, 8.9f, 0f, 16.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -3.14f, 0.98f, -10.41f, 9.96f, -10.5f)
            curveToRelative(0.71f, 0.85f, 1.23f, 1.9f, 1.82f, 3.08f)
            curveToRelative(1.1f, 2.22f, 2.48f, 4.97f, 5.78f, 7.57f)
            curveToRelative(0.25f, 0.2f, 0.41f, 0.48f, 0.43f, 0.8f)
            curveToRelative(0.03f, 0.31f, -0.07f, 0.61f, -0.28f, 0.84f)
            curveToRelative(-0.28f, 0.31f, -0.54f, 0.61f, -0.76f, 0.86f)
            lineToRelative(-7.31f, -3.51f)
            curveToRelative(-1.07f, -0.51f, -2.29f, 0.36f, -2.14f, 1.54f)
            curveToRelative(0.28f, 2.26f, 1.04f, 4.29f, 2.06f, 6.08f)
            curveToRelative(0.26f, 0.46f, 0.76f, 0.73f, 1.29f, 0.73f)
            curveToRelative(1.17f, 0f, 1.87f, -1.25f, 1.29f, -2.27f)
            curveToRelative(-0.36f, -0.64f, -0.68f, -1.3f, -0.94f, -2.0f)
            lineToRelative(4.44f, 2.13f)
            curveToRelative(1.21f, 0.58f, 2.66f, 0.29f, 3.55f, -0.72f)
            curveToRelative(0.27f, -0.3f, 0.53f, -0.6f, 0.76f, -0.85f)
            curveToRelative(0.75f, -0.84f, 1.12f, -1.98f, 1.02f, -3.1f)
            curveToRelative(-0.1f, -1.13f, -0.67f, -2.18f, -1.59f, -2.91f)
            close()
        }
    }.also { _HorseHead = it }
