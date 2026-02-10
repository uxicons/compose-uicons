package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ufo: ImageVector? = null

val Icons.Br.Ufo: ImageVector
    get() = _Ufo ?: UXIcon(name = "Ufo") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.51f, 8.96f)
            curveToRelative(-0.79f, -2.85f, -3.41f, -4.96f, -6.51f, -4.96f)
            reflectiveCurveToRelative(-5.72f, 2.1f, -6.51f, 4.96f)
            curveTo(1.99f, 10.01f, 0f, 11.84f, 0f, 14.04f)
            curveToRelative(0f, 3.92f, 6.04f, 5.96f, 12f, 5.96f)
            reflectiveCurveToRelative(12f, -2.05f, 12f, -5.96f)
            curveToRelative(0f, -2.19f, -1.99f, -4.02f, -5.49f, -5.08f)
            close()
            moveTo(12f, 7f)
            curveToRelative(1.92f, 0f, 3.51f, 1.45f, 3.73f, 3.32f)
            curveToRelative(-0.54f, 0.28f, -1.67f, 0.68f, -3.73f, 0.68f)
            curveToRelative(-2.07f, 0f, -3.21f, -0.41f, -3.73f, -0.68f)
            curveToRelative(0.21f, -1.87f, 1.8f, -3.33f, 3.73f, -3.33f)
            close()
            moveTo(12f, 17f)
            curveToRelative(-5.58f, 0f, -9f, -1.92f, -9f, -2.96f)
            curveToRelative(0f, -0.46f, 0.83f, -1.29f, 2.65f, -1.97f)
            curveToRelative(0.41f, 0.46f, 2.06f, 1.93f, 6.35f, 1.93f)
            reflectiveCurveToRelative(5.95f, -1.48f, 6.35f, -1.93f)
            curveToRelative(1.81f, 0.67f, 2.65f, 1.51f, 2.65f, 1.97f)
            curveToRelative(0f, 1.04f, -3.42f, 2.96f, -9f, 2.96f)
            close()
        }
    }.also { _Ufo = it }
