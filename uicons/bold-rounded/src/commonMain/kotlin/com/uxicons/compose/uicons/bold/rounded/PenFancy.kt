package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancy: ImageVector? = null

val Icons.Br.PenFancy: ImageVector
    get() = _PenFancy ?: UXIcon(name = "PenFancy") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 4.09f)
            curveToRelative(0f, -1.09f, -0.42f, -2.12f, -1.2f, -2.89f)
            horizontalLineToRelative(0f)
            curveToRelative(-1.59f, -1.59f, -4.19f, -1.59f, -5.78f, -0.0f)
            lineTo(7.9f, 10.29f)
            lineToRelative(-3.46f, 1.16f)
            curveToRelative(-1.14f, 0.46f, -1.99f, 1.4f, -2.34f, 2.58f)
            lineTo(0.1f, 20.83f)
            curveToRelative(-0.26f, 0.87f, -0.02f, 1.8f, 0.62f, 2.44f)
            curveToRelative(0.47f, 0.47f, 1.1f, 0.72f, 1.75f, 0.72f)
            curveToRelative(0.23f, 0f, 0.47f, -0.03f, 0.7f, -0.1f)
            lineToRelative(6.81f, -2.0f)
            curveToRelative(1.18f, -0.35f, 2.12f, -1.2f, 2.6f, -2.39f)
            lineToRelative(1.31f, -3.66f)
            lineToRelative(8.91f, -8.88f)
            curveToRelative(0.77f, -0.77f, 1.2f, -1.8f, 1.2f, -2.89f)
            close()
            moveTo(9.77f, 18.44f)
            curveToRelative(-0.11f, 0.28f, -0.34f, 0.49f, -0.63f, 0.58f)
            lineToRelative(-3.87f, 1.13f)
            lineToRelative(2.44f, -2.45f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
            curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
            lineToRelative(-2.46f, 2.47f)
            lineToRelative(1.15f, -3.9f)
            curveToRelative(0.09f, -0.29f, 0.29f, -0.52f, 0.49f, -0.6f)
            lineToRelative(3.17f, -1.06f)
            lineToRelative(2.22f, 2.22f)
            lineToRelative(-1.09f, 3.03f)
            close()
            moveTo(20.68f, 4.85f)
            lineToRelative(-8.09f, 8.06f)
            lineToRelative(-1.54f, -1.54f)
            lineTo(19.15f, 3.32f)
            curveToRelative(0.42f, -0.42f, 1.11f, -0.42f, 1.54f, 0f)
            horizontalLineToRelative(0f)
            curveToRelative(0.2f, 0.21f, 0.32f, 0.48f, 0.32f, 0.77f)
            reflectiveCurveToRelative(-0.11f, 0.56f, -0.32f, 0.77f)
            close()
        }
    }.also { _PenFancy = it }
