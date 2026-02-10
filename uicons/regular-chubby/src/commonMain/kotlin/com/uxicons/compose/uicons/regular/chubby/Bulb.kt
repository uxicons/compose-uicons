package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bulb: ImageVector? = null

val Icons.Rc.Bulb: ImageVector
    get() = _Bulb ?: UXIcon(name = "Bulb") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 1f)
                curveTo(6.55f, 1f, 3.29f, 4.28f, 3.29f, 9.76f)
                curveToRelative(0f, 4.77f, 2.85f, 6.69f, 4.55f, 7.41f)
                curveToRelative(0.15f, 0.07f, 0.24f, 0.2f, 0.24f, 0.37f)
                curveToRelative(0f, 2.43f, 0f, 5.46f, 3.92f, 5.46f)
                reflectiveCurveToRelative(3.92f, -3.03f, 3.92f, -5.47f)
                curveToRelative(0f, -0.17f, 0.09f, -0.31f, 0.24f, -0.37f)
                curveToRelative(1.69f, -0.72f, 4.54f, -2.64f, 4.54f, -7.4f)
                curveToRelative(0f, -5.57f, -3.17f, -8.76f, -8.7f, -8.76f)
                close()
                moveTo(12.01f, 21f)
                curveToRelative(-1.23f, 0f, -1.75f, -0.11f, -1.89f, -2.1f)
                curveToRelative(0.57f, 0.07f, 1.2f, 0.11f, 1.89f, 0.11f)
                reflectiveCurveToRelative(1.31f, -0.04f, 1.89f, -0.11f)
                curveToRelative(-0.13f, 2f, -0.63f, 2.1f, -1.89f, 2.1f)
                close()
                moveTo(15.39f, 15.32f)
                curveToRelative(-0.67f, 0.29f, -1.16f, 0.85f, -1.36f, 1.53f)
                curveToRelative(-0.31f, 0.05f, -0.65f, 0.09f, -1.0f, 0.12f)
                verticalLineToRelative(-5.01f)
                curveToRelative(0.74f, -0.27f, 1.32f, -0.78f, 1.74f, -1.2f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, -0.0f, -1.41f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, 0.0f)
                curveToRelative(-1.08f, 1.08f, -1.65f, 1.03f, -2.69f, 0f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.42f, -0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, -0.0f, 1.41f)
                curveToRelative(0.6f, 0.6f, 1.18f, 1.0f, 1.78f, 1.21f)
                verticalLineToRelative(5.0f)
                curveToRelative(-0.37f, -0.03f, -0.72f, -0.07f, -1.04f, -0.12f)
                curveToRelative(-0.2f, -0.68f, -0.69f, -1.24f, -1.37f, -1.53f)
                curveToRelative(-1.52f, -0.65f, -3.33f, -2.13f, -3.33f, -5.57f)
                curveToRelative(0f, -5.59f, 3.66f, -6.76f, 6.72f, -6.76f)
                reflectiveCurveToRelative(6.7f, 1.17f, 6.7f, 6.76f)
                curveToRelative(0f, 3.43f, -1.8f, 4.92f, -3.32f, 5.56f)
                close()
            }
        }.also { _Bulb = it}
