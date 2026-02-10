package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Apple: ImageVector? = null

val Icons.Ts.Apple: ImageVector
    get() = _Apple ?: UXIcon(name = "Apple") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.49f, 6.03f)
                curveToRelative(0.32f, -0.19f, 0.63f, -0.43f, 0.91f, -0.71f)
                curveTo(19.57f, 3.15f, 18.97f, 0.03f, 18.97f, 0.03f)
                curveToRelative(0f, 0f, -3.39f, -0.34f, -5.3f, 1.57f)
                curveToRelative(-0.75f, 0.75f, -1.16f, 1.7f, -1.39f, 2.56f)
                curveToRelative(-0.39f, -2.02f, -1.17f, -3.47f, -1.53f, -4.12f)
                lineToRelative(-0.88f, 0.48f)
                curveToRelative(0.42f, 0.77f, 1.49f, 2.74f, 1.61f, 5.47f)
                horizontalLineToRelative(-3.15f)
                curveTo(3.74f, 5.99f, 0f, 10.03f, 0f, 14.99f)
                reflectiveCurveToRelative(3.74f, 9f, 8.34f, 9f)
                curveToRelative(1.26f, 0f, 2.52f, -0.31f, 3.66f, -0.9f)
                curveToRelative(1.14f, 0.59f, 2.4f, 0.9f, 3.66f, 0.9f)
                curveToRelative(4.6f, 0f, 8.34f, -4.04f, 8.34f, -9f)
                curveToRelative(0f, -4.67f, -3.3f, -8.51f, -7.51f, -8.96f)
                close()
                moveTo(14.38f, 2.31f)
                curveToRelative(1.1f, -1.1f, 2.81f, -1.29f, 3.63f, -1.32f)
                curveToRelative(-0.02f, 0.81f, -0.21f, 2.53f, -1.32f, 3.63f)
                reflectiveCurveToRelative(-2.84f, 1.32f, -3.67f, 1.36f)
                curveToRelative(0.04f, -0.83f, 0.25f, -2.56f, 1.36f, -3.67f)
                close()
                moveTo(15.66f, 23.0f)
                curveToRelative(-1.2f, 0f, -2.35f, -0.3f, -3.41f, -0.91f)
                lineToRelative(-0.25f, -0.14f)
                lineToRelative(-0.25f, 0.14f)
                curveToRelative(-1.06f, 0.6f, -2.21f, 0.91f, -3.41f, 0.91f)
                curveToRelative(-4.05f, 0f, -7.34f, -3.59f, -7.34f, -8f)
                reflectiveCurveToRelative(3.29f, -8.01f, 7.34f, -8.01f)
                horizontalLineToRelative(7.32f)
                curveToRelative(4.05f, 0f, 7.34f, 3.59f, 7.34f, 8.01f)
                reflectiveCurveToRelative(-3.29f, 8f, -7.34f, 8f)
                close()
            }
        }.also { _Apple = it}
