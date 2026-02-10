package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _6: ImageVector? = null

val Icons.Br.Six: ImageVector
    get() = _6 ?: UXIcon(name = "Six") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.77f, 10.51f)
            curveToRelative(-1.48f, -1.56f, -3.54f, -2.48f, -5.64f, -2.51f)
            curveToRelative(-1.86f, -0.01f, -3.65f, 0.58f, -5.09f, 1.72f)
            curveToRelative(0.39f, -3.77f, 3.59f, -6.72f, 7.46f, -6.72f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveTo(8.71f, 0f, 4f, 4.71f, 4f, 10.5f)
            curveToRelative(0f, 0f, 0.0f, 5.63f, 0.01f, 5.7f)
            curveToRelative(0.23f, 4.17f, 3.57f, 7.62f, 7.64f, 7.8f)
            curveToRelative(0.12f, 0.01f, 0.24f, 0.01f, 0.35f, 0.01f)
            curveToRelative(2.02f, 0f, 3.94f, -0.75f, 5.43f, -2.13f)
            curveToRelative(1.58f, -1.46f, 2.49f, -3.44f, 2.56f, -5.59f)
            curveToRelative(0.07f, -2.1f, -0.74f, -4.21f, -2.22f, -5.77f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
            reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
            close()
        }
    }.also { _6 = it }
