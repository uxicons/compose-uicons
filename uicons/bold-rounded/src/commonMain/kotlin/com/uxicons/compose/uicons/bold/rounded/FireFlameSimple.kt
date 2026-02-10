package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameSimple: ImageVector? = null

val Icons.Br.FireFlameSimple: ImageVector
    get() = _FireFlameSimple ?: UXIcon(name = "FireFlameSimple") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.74f, 5.11f)
            lineToRelative(-3.73f, -3.46f)
            curveToRelative(-1.08f, -1.06f, -2.5f, -1.64f, -4.0f, -1.64f)
            reflectiveCurveToRelative(-2.93f, 0.58f, -3.97f, 1.61f)
            lineToRelative(-3.81f, 3.54f)
            curveTo(-0.07f, 9.45f, -0.07f, 16.46f, 4.22f, 20.76f)
            curveToRelative(2.08f, 2.09f, 4.84f, 3.24f, 7.78f, 3.24f)
            reflectiveCurveToRelative(5.7f, -1.15f, 7.78f, -3.24f)
            curveToRelative(4.28f, -4.31f, 4.28f, -11.31f, -0.04f, -15.66f)
            close()
            moveTo(17.65f, 18.64f)
            curveToRelative(-1.51f, 1.52f, -3.52f, 2.35f, -5.65f, 2.35f)
            reflectiveCurveToRelative(-4.14f, -0.84f, -5.65f, -2.35f)
            curveToRelative(-3.12f, -3.14f, -3.12f, -8.24f, -0.04f, -11.34f)
            lineToRelative(3.8f, -3.52f)
            curveToRelative(0.51f, -0.5f, 1.19f, -0.78f, 1.9f, -0.78f)
            reflectiveCurveToRelative(1.39f, 0.28f, 1.93f, 0.81f)
            lineToRelative(3.72f, 3.45f)
            curveToRelative(3.12f, 3.14f, 3.12f, 8.24f, 0f, 11.38f)
            close()
            moveTo(14.83f, 12.14f)
            curveToRelative(1.56f, 1.57f, 1.56f, 4.11f, 0f, 5.68f)
            curveToRelative(-0.78f, 0.79f, -1.8f, 1.18f, -2.83f, 1.18f)
            curveToRelative(-1.02f, 0f, -2.05f, -0.39f, -2.83f, -1.18f)
            curveToRelative(-1.56f, -1.57f, -1.56f, -4.11f, 0f, -5.68f)
            lineToRelative(1.59f, -1.63f)
            curveToRelative(0.34f, -0.34f, 0.79f, -0.51f, 1.24f, -0.51f)
            reflectiveCurveToRelative(0.9f, 0.17f, 1.24f, 0.51f)
            lineToRelative(1.58f, 1.63f)
            close()
        }
    }.also { _FireFlameSimple = it }
