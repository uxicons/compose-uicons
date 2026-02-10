package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenClip: ImageVector? = null

val Icons.Br.PenClip: ImageVector
    get() = _PenClip ?: UXIcon(name = "PenClip") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.99f, 3.9f)
            curveToRelative(-0.06f, -1.17f, -0.61f, -2.26f, -1.52f, -3f)
            curveToRelative(-1.62f, -1.33f, -4.1f, -1.16f, -5.65f, 0.39f)
            lineToRelative(-1.25f, 1.25f)
            curveToRelative(-2.15f, -2.08f, -5.59f, -2.06f, -7.71f, 0.06f)
            lineToRelative(-2.84f, 2.84f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0f)
            lineToRelative(2.84f, -2.84f)
            curveToRelative(0.96f, -0.96f, 2.49f, -0.97f, 3.47f, -0.06f)
            lineTo(2.21f, 15.94f)
            curveToRelative(-0.78f, 0.78f, -1.21f, 1.82f, -1.21f, 2.93f)
            curveToRelative(0f, 0.58f, 0.12f, 1.15f, 0.35f, 1.67f)
            lineToRelative(-0.91f, 0.91f)
            curveToRelative(-0.59f, 0.59f, -0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            lineToRelative(0.91f, -0.91f)
            curveToRelative(0.52f, 0.23f, 1.09f, 0.35f, 1.67f, 0.35f)
            curveToRelative(1.11f, 0f, 2.15f, -0.43f, 2.93f, -1.21f)
            lineTo(22.79f, 7.04f)
            curveToRelative(0.83f, -0.83f, 1.27f, -1.97f, 1.21f, -3.13f)
            close()
            moveTo(5.94f, 19.67f)
            curveToRelative(-0.43f, 0.43f, -1.18f, 0.43f, -1.61f, 0f)
            curveToRelative(-0.22f, -0.21f, -0.33f, -0.5f, -0.33f, -0.81f)
            reflectiveCurveToRelative(0.12f, -0.59f, 0.33f, -0.81f)
            lineTo(15.58f, 6.78f)
            lineToRelative(1.61f, 1.61f)
            lineTo(5.94f, 19.67f)
            close()
        }
    }.also { _PenClip = it }
