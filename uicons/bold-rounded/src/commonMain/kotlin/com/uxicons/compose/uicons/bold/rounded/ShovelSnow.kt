package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShovelSnow: ImageVector? = null

val Icons.Br.ShovelSnow: ImageVector
    get() = _ShovelSnow ?: UXIcon(name = "ShovelSnow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.56f, 4.44f)
            lineTo(19.56f, 0.44f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(0.94f, 0.94f)
            lineToRelative(-6.38f, 6.38f)
            lineToRelative(-1.14f, -1.14f)
            curveToRelative(-0.8f, -0.8f, -1.85f, -1.23f, -2.98f, -1.23f)
            reflectiveCurveToRelative(-2.18f, 0.44f, -2.98f, 1.23f)
            curveToRelative(0f, 0.0f, -0.0f, 0.0f, -0.0f, 0.0f)
            lineTo(0.73f, 12.94f)
            curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
            reflectiveCurveToRelative(0.26f, 1.3f, 0.73f, 1.77f)
            lineToRelative(6.82f, 6.82f)
            curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
            reflectiveCurveToRelative(1.28f, -0.24f, 1.77f, -0.73f)
            lineToRelative(4.16f, -4.2f)
            curveToRelative(1.64f, -1.64f, 1.64f, -4.31f, 0f, -5.96f)
            lineToRelative(-1.14f, -1.14f)
            lineToRelative(6.38f, -6.38f)
            lineToRelative(0.94f, 0.94f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            close()
            moveTo(13.13f, 16.98f)
            lineToRelative(-3.81f, 3.84f)
            lineToRelative(-2.01f, -2.01f)
            lineToRelative(2.25f, -2.25f)
            curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
            lineToRelative(-2.25f, 2.25f)
            lineToRelative(-1.98f, -1.98f)
            lineToRelative(3.82f, -3.85f)
            curveToRelative(0.46f, -0.46f, 1.25f, -0.46f, 1.71f, 0.0f)
            lineToRelative(4.4f, 4.4f)
            curveToRelative(0.47f, 0.47f, 0.47f, 1.24f, -0.0f, 1.72f)
            close()
        }
    }.also { _ShovelSnow = it }
