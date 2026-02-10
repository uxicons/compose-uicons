package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eagle: ImageVector? = null

val Icons.Ss.Eagle: ImageVector
    get() = _Eagle ?: UXIcon(name = "Eagle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.39f, 7.94f)
                curveToRelative(-0.22f, -0.64f, -0.39f, -1.15f, -0.39f, -1.44f)
                curveToRelative(0f, -0.82f, 0.2f, -1.43f, 0.44f, -2.13f)
                curveToRelative(0.46f, -1.02f, 0.64f, -2.98f, 0.56f, -4.35f)
                curveToRelative(-1.03f, 0.38f, -2.4f, 0.97f, -3.5f, 0.98f)
                curveToRelative(-2.19f, -0.07f, -4.61f, -1.03f, -7f, -1f)
                curveToRelative(-3.76f, 0f, -7.22f, 2.89f, -8.21f, 6.47f)
                lineToRelative(4.71f, 4.71f)
                lineToRelative(-3.07f, 4.47f)
                curveToRelative(0.29f, 4.44f, -1.71f, 6.56f, -2.79f, 8.35f)
                horizontalLineToRelative(1.86f)
                curveToRelative(4.01f, 0f, 6.8f, -2.79f, 8.08f, -4.39f)
                lineToRelative(3.65f, 4.17f)
                curveToRelative(0.94f, -2.0f, 1.72f, -2.9f, 2.18f, -6.21f)
                lineToRelative(5.09f, 2.54f)
                curveToRelative(0.27f, -4.93f, -0.93f, -10.76f, -1.61f, -12.18f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(0f, -3f, 3f, -3f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0f, 3f, -3f, 3f)
                close()
                moveTo(4.5f, 14f)
                curveToRelative(-1.74f, 0f, -2.24f, 0.4f, -2.38f, 0.58f)
                lineToRelative(-0.92f, 1.17f)
                lineToRelative(-0.73f, -1.29f)
                curveToRelative(-0.49f, -0.87f, -0.6f, -1.86f, -0.31f, -2.86f)
                curveToRelative(0.36f, -1.27f, 1.49f, -2.6f, 3.21f, -3.22f)
                lineToRelative(3.04f, 3.04f)
                lineToRelative(-1.78f, 2.58f)
                horizontalLineToRelative(-0.13f)
                close()
            }
        }.also { _Eagle = it}
