package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CandySweet: ImageVector? = null

val Icons.Br.CandySweet: ImageVector
    get() = _CandySweet ?: UXIcon(name = "CandySweet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.88f, 9.93f)
            curveToRelative(-0.1f, -0.88f, -1.14f, -1.29f, -1.81f, -0.72f)
            lineToRelative(-1.24f, 1.04f)
            curveToRelative(-0.81f, -4.13f, -4.46f, -7.26f, -8.83f, -7.26f)
            reflectiveCurveTo(3.99f, 6.13f, 3.17f, 10.26f)
            lineToRelative(-1.24f, -1.04f)
            curveToRelative(-0.68f, -0.57f, -1.71f, -0.16f, -1.81f, 0.72f)
            curveTo(0.05f, 10.51f, 0.0f, 11.21f, 0.0f, 12f)
            reflectiveCurveToRelative(0.05f, 1.49f, 0.12f, 2.07f)
            curveToRelative(0.1f, 0.88f, 1.14f, 1.29f, 1.81f, 0.72f)
            lineToRelative(1.24f, -1.04f)
            curveToRelative(0.81f, 4.13f, 4.46f, 7.26f, 8.83f, 7.26f)
            reflectiveCurveToRelative(8.01f, -3.13f, 8.83f, -7.26f)
            lineToRelative(1.24f, 1.04f)
            curveToRelative(0.68f, 0.57f, 1.71f, 0.16f, 1.81f, -0.72f)
            curveToRelative(0.07f, -0.58f, 0.12f, -1.27f, 0.12f, -2.07f)
            reflectiveCurveToRelative(-0.05f, -1.49f, -0.12f, -2.07f)
            close()
            moveTo(11.87f, 6.01f)
            lineToRelative(-5.87f, 5.87f)
            curveToRelative(0.07f, -3.21f, 2.66f, -5.8f, 5.87f, -5.87f)
            close()
            moveTo(6.93f, 15.19f)
            lineTo(15.19f, 6.93f)
            curveToRelative(0.76f, 0.48f, 1.4f, 1.12f, 1.88f, 1.88f)
            lineToRelative(-8.26f, 8.26f)
            curveToRelative(-0.76f, -0.48f, -1.4f, -1.12f, -1.88f, -1.88f)
            close()
            moveTo(12.13f, 17.99f)
            lineToRelative(5.87f, -5.87f)
            curveToRelative(-0.07f, 3.21f, -2.66f, 5.8f, -5.87f, 5.87f)
            close()
        }
    }.also { _CandySweet = it }
