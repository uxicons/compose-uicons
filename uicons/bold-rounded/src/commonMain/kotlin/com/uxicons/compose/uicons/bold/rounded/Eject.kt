package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eject: ImageVector? = null

val Icons.Br.Eject: ImageVector
    get() = _Eject ?: UXIcon(name = "Eject") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 20.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 22f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(0.42f, 14.88f)
            curveToRelative(-0.28f, -0.56f, -0.42f, -1.15f, -0.42f, -1.75f)
            curveToRelative(0f, -0.81f, 0.26f, -1.6f, 0.75f, -2.27f)
            lineTo(8.93f, 1.52f)
            curveToRelative(0.74f, -0.97f, 1.85f, -1.52f, 3.07f, -1.52f)
            reflectiveCurveToRelative(2.33f, 0.55f, 3.07f, 1.52f)
            lineToRelative(8.18f, 9.34f)
            curveToRelative(0.86f, 1.18f, 0.99f, 2.72f, 0.33f, 4.03f)
            curveToRelative(-0.66f, 1.3f, -1.98f, 2.12f, -3.44f, 2.12f)
            lineTo(3.87f, 17.0f)
            curveToRelative(-1.46f, 0f, -2.78f, -0.81f, -3.44f, -2.12f)
            close()
            moveTo(3f, 13.13f)
            curveToRelative(0f, 0.13f, 0.03f, 0.27f, 0.1f, 0.4f)
            curveToRelative(0.15f, 0.3f, 0.43f, 0.47f, 0.77f, 0.47f)
            horizontalLineToRelative(16.27f)
            curveToRelative(0.34f, 0f, 0.61f, -0.17f, 0.77f, -0.47f)
            curveToRelative(0.15f, -0.29f, 0.13f, -0.59f, -0.04f, -0.86f)
            lineTo(12.7f, 3.35f)
            curveToRelative(-0.34f, -0.45f, -1.06f, -0.45f, -1.39f, 0f)
            lineTo(3.15f, 12.67f)
            curveToRelative(-0.1f, 0.15f, -0.14f, 0.3f, -0.14f, 0.46f)
            close()
        }
    }.also { _Eject = it }
