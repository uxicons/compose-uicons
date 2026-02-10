package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVertical: ImageVector? = null

val Icons.Sc.RectangleVertical: ImageVector
    get() = _RectangleVertical ?: UXIcon(name = "RectangleVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.78f, 2.97f)
                curveToRelative(-0.06f, -0.32f, -0.27f, -0.59f, -0.56f, -0.73f)
                curveToRelative(-0.11f, -0.05f, -2.73f, -1.24f, -6.21f, -1.24f)
                curveToRelative(-3.51f, 0f, -6.11f, 1.19f, -6.22f, 1.24f)
                curveToRelative(-0.29f, 0.14f, -0.5f, 0.41f, -0.56f, 0.72f)
                curveToRelative(-0.03f, 0.17f, -0.77f, 4.23f, -0.77f, 9.03f)
                reflectiveCurveToRelative(0.74f, 8.86f, 0.77f, 9.03f)
                curveToRelative(0.06f, 0.32f, 0.27f, 0.59f, 0.56f, 0.73f)
                curveToRelative(0.11f, 0.05f, 2.73f, 1.24f, 6.21f, 1.24f)
                curveToRelative(3.51f, 0f, 6.11f, -1.19f, 6.22f, -1.24f)
                curveToRelative(0.29f, -0.14f, 0.5f, -0.41f, 0.56f, -0.72f)
                curveToRelative(0.03f, -0.17f, 0.77f, -4.23f, 0.77f, -9.03f)
                reflectiveCurveToRelative(-0.74f, -8.86f, -0.77f, -9.03f)
                close()
            }
        }.also { _RectangleVertical = it}
