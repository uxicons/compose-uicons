package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pear: ImageVector? = null

val Icons.Sr.Pear: ImageVector
    get() = _Pear ?: UXIcon(name = "Pear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 1.32f)
                curveToRelative(0.17f, -0.52f, -0.11f, -1.09f, -0.63f, -1.26f)
                curveToRelative(-0.53f, -0.18f, -1.09f, 0.11f, -1.26f, 0.63f)
                curveToRelative(-0.23f, 0.69f, -0.95f, 1.46f, -1.54f, 2.0f)
                curveToRelative(-0.91f, -0.77f, -2.0f, -1.33f, -3.2f, -1.55f)
                curveToRelative(-2.65f, -0.49f, -5.31f, 0.51f, -6.93f, 2.63f)
                curveToRelative(-0.67f, 0.87f, -1.53f, 1.42f, -2.42f, 1.54f)
                curveToRelative(-1.91f, 0.26f, -3.67f, 1.08f, -5.1f, 2.38f)
                curveToRelative(-3.4f, 3.08f, -3.67f, 8.46f, -0.62f, 12.23f)
                curveToRelative(1.99f, 2.45f, 4.7f, 3.94f, 7.44f, 4.09f)
                curveToRelative(0.15f, 0.01f, 0.3f, 0.01f, 0.45f, 0.01f)
                curveToRelative(2.21f, 0f, 4.23f, -0.86f, 5.88f, -2.51f)
                curveToRelative(1.44f, -1.44f, 2.37f, -3.27f, 2.68f, -5.29f)
                curveToRelative(0.16f, -1.05f, 0.66f, -1.92f, 1.39f, -2.45f)
                curveToRelative(2.24f, -1.61f, 3.31f, -4.32f, 2.8f, -7.06f)
                curveToRelative(-0.17f, -0.91f, -0.54f, -1.76f, -1.03f, -2.51f)
                curveToRelative(0.71f, -0.65f, 1.72f, -1.71f, 2.11f, -2.86f)
                close()
                moveTo(11.46f, 20.11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(14.46f, 16.11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Pear = it}
