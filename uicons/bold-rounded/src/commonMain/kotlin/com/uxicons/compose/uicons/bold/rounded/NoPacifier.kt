package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoPacifier: ImageVector? = null

val Icons.Br.NoPacifier: ImageVector
    get() = _NoPacifier ?: UXIcon(name = "NoPacifier") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.32f, 17.32f)
            curveToRelative(-0.65f, 0.43f, -1.42f, 0.69f, -2.25f, 0.69f)
            curveToRelative(-2.24f, 0f, -4.07f, -1.82f, -4.07f, -4.07f)
            curveToRelative(0f, -0.83f, 0.25f, -1.61f, 0.69f, -2.25f)
            lineToRelative(1.47f, 1.47f)
            curveToRelative(-0.1f, 0.24f, -0.16f, 0.51f, -0.16f, 0.78f)
            curveToRelative(0f, 1.14f, 0.93f, 2.07f, 2.07f, 2.07f)
            curveToRelative(0.28f, 0f, 0.54f, -0.06f, 0.78f, -0.16f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveToRelative(-12f, -5.38f, -12f, -12f)
            reflectiveCurveToRelative(5.38f, -12f, 12f, -12f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(12f, 3f)
            curveToRelative(-1.94f, 0f, -3.73f, 0.62f, -5.21f, 1.67f)
            lineToRelative(2.23f, 2.23f)
            curveToRelative(0.05f, -0.5f, 0.46f, -0.9f, 0.98f, -0.9f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            curveToRelative(0f, 1.07f, 0.38f, 2.13f, 0.99f, 3.06f)
            curveToRelative(0.59f, -1.22f, 0.78f, -2.55f, 1.53f, -3.3f)
            curveToRelative(1.02f, -1.02f, 2.69f, -1.02f, 3.71f, 0f)
            reflectiveCurveToRelative(1.02f, 2.69f, 0f, 3.71f)
            curveToRelative(-0.74f, 0.74f, -2.07f, 0.93f, -3.3f, 1.53f)
            curveToRelative(0.93f, 0.62f, 1.99f, 0.99f, 3.06f, 0.99f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            curveToRelative(0f, 0.52f, -0.4f, 0.93f, -0.9f, 0.98f)
            lineToRelative(2.23f, 2.23f)
            curveToRelative(1.05f, -1.47f, 1.67f, -3.27f, 1.67f, -5.21f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            close()
            moveTo(12f, 21f)
            curveToRelative(1.94f, 0f, 3.73f, -0.62f, 5.21f, -1.67f)
            lineToRelative(-12.54f, -12.53f)
            curveToRelative(-1.05f, 1.47f, -1.67f, 3.27f, -1.67f, 5.21f)
            curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
            close()
        }
    }.also { _NoPacifier = it }
