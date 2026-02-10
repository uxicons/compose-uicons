package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lips: ImageVector? = null

val Icons.Bs.Lips: ImageVector
    get() = _Lips ?: UXIcon(name = "Lips") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.81f, 11.76f)
                curveToRelative(-2.24f, -4.07f, -5.01f, -7.05f, -6.76f, -8.19f)
                curveToRelative(-1.38f, -0.9f, -3.22f, -0.7f, -4.38f, 0.46f)
                lineToRelative(-0.67f, 0.67f)
                lineToRelative(-0.67f, -0.67f)
                curveToRelative(-1.17f, -1.17f, -3.01f, -1.36f, -4.38f, -0.46f)
                curveTo(4.94f, 4.87f, 2.17f, 8.22f, 0.19f, 11.71f)
                lineToRelative(-0.19f, 0.38f)
                verticalLineToRelative(0.78f)
                lineToRelative(0.18f, 0.34f)
                curveToRelative(0.17f, 0.32f, 4.33f, 7.79f, 11.82f, 7.79f)
                reflectiveCurveToRelative(11.64f, -7.46f, 11.82f, -7.78f)
                lineToRelative(0.18f, -0.36f)
                verticalLineToRelative(-0.77f)
                lineToRelative(-0.19f, -0.34f)
                close()
                moveTo(8.59f, 6.08f)
                curveToRelative(0.2f, -0.13f, 0.45f, -0.1f, 0.62f, 0.07f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.17f, -0.17f, 0.43f, -0.2f, 0.62f, -0.07f)
                curveToRelative(1.27f, 0.83f, 3.32f, 3.07f, 5.09f, 5.95f)
                curveToRelative(-2.06f, -0.44f, -5.39f, -1.03f, -8.5f, -1.03f)
                reflectiveCurveToRelative(-6.44f, 0.58f, -8.49f, 1.01f)
                curveToRelative(1.81f, -2.89f, 3.89f, -5.16f, 5.08f, -5.94f)
                close()
                moveTo(12.0f, 18f)
                curveToRelative(-4.08f, 0f, -7.01f, -3.17f, -8.36f, -4.99f)
                curveToRelative(2.06f, 0.43f, 5.32f, 0.99f, 8.36f, 0.99f)
                reflectiveCurveToRelative(6.3f, -0.56f, 8.37f, -0.99f)
                curveToRelative(-1.33f, 1.81f, -4.26f, 4.99f, -8.37f, 4.99f)
                close()
            }
        }.also { _Lips = it}
