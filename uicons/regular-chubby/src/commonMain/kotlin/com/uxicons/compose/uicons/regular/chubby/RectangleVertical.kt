package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleVertical: ImageVector? = null

val Icons.Rc.RectangleVertical: ImageVector
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
                moveTo(16.9f, 20.13f)
                curveToRelative(-0.83f, 0.3f, -2.66f, 0.87f, -4.9f, 0.87f)
                curveToRelative(-2.22f, 0f, -4.07f, -0.57f, -4.9f, -0.87f)
                curveToRelative(-0.2f, -1.25f, -0.65f, -4.5f, -0.65f, -8.13f)
                reflectiveCurveToRelative(0.45f, -6.89f, 0.65f, -8.13f)
                curveToRelative(0.83f, -0.3f, 2.66f, -0.87f, 4.9f, -0.87f)
                curveToRelative(2.22f, 0f, 4.07f, 0.57f, 4.9f, 0.87f)
                curveToRelative(0.2f, 1.25f, 0.65f, 4.51f, 0.65f, 8.13f)
                reflectiveCurveToRelative(-0.45f, 6.89f, -0.65f, 8.13f)
                close()
            }
        }.also { _RectangleVertical = it}
