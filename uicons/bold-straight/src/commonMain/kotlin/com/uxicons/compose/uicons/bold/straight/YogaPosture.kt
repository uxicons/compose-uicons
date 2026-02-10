package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaPosture: ImageVector? = null

val Icons.Bs.YogaPosture: ImageVector
    get() = _YogaPosture ?: UXIcon(name = "YogaPosture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 15f)
                curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                close()
                moveTo(21.98f, 9.7f)
                curveToRelative(0.0f, -0.33f, -0.03f, -0.69f, -0.09f, -1.09f)
                curveToRelative(-0.72f, -4.44f, -4.93f, -7.6f, -9.41f, -7.61f)
                curveTo(6.69f, 1f, 1.98f, 5.71f, 1.98f, 11.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(3f)
                lineTo(4.98f, 11.5f)
                curveToRelative(0f, -0.88f, 0.16f, -1.72f, 0.44f, -2.5f)
                horizontalLineToRelative(0.88f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2.0f)
                lineToRelative(-0.02f, 12f)
                lineToRelative(3f, 0.0f)
                lineToRelative(0.02f, -12.0f)
                curveToRelative(0f, -0.73f, 0.21f, -1.42f, 0.56f, -2.01f)
                curveToRelative(1.25f, -0.04f, 2.36f, -0.73f, 3.1f, -1.76f)
                curveToRelative(0.1f, -0.14f, 0.22f, -0.24f, 0.34f, -0.24f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4.0f)
                lineToRelative(-0.02f, 12f)
                lineToRelative(3f, 0.0f)
                lineToRelative(0.02f, -10.02f)
                curveToRelative(0.94f, -0.5f, 1.97f, -1.46f, 1.99f, -3.29f)
                close()
            }
        }.also { _YogaPosture = it}
