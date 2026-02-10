package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHorizontal: ImageVector? = null

val Icons.Rc.RectangleHorizontal: ImageVector
    get() = _RectangleHorizontal ?: UXIcon(name = "RectangleHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.76f, 5.78f)
                curveToRelative(-0.14f, -0.29f, -0.41f, -0.5f, -0.72f, -0.56f)
                curveToRelative(-0.17f, -0.03f, -4.23f, -0.77f, -9.03f, -0.77f)
                reflectiveCurveToRelative(-8.86f, 0.74f, -9.03f, 0.77f)
                curveToRelative(-0.32f, 0.06f, -0.59f, 0.27f, -0.73f, 0.56f)
                curveToRelative(-0.05f, 0.11f, -1.24f, 2.73f, -1.24f, 6.21f)
                curveToRelative(0f, 3.51f, 1.19f, 6.11f, 1.24f, 6.22f)
                curveToRelative(0.14f, 0.29f, 0.41f, 0.5f, 0.72f, 0.56f)
                curveToRelative(0.17f, 0.03f, 4.23f, 0.77f, 9.03f, 0.77f)
                reflectiveCurveToRelative(8.86f, -0.74f, 9.03f, -0.77f)
                curveToRelative(0.32f, -0.06f, 0.59f, -0.27f, 0.73f, -0.56f)
                curveToRelative(0.05f, -0.11f, 1.24f, -2.73f, 1.24f, -6.21f)
                curveToRelative(0f, -3.51f, -1.19f, -6.11f, -1.24f, -6.22f)
                close()
                moveTo(20.13f, 16.9f)
                curveToRelative(-1.25f, 0.2f, -4.5f, 0.65f, -8.13f, 0.65f)
                reflectiveCurveToRelative(-6.89f, -0.45f, -8.13f, -0.65f)
                curveToRelative(-0.3f, -0.83f, -0.87f, -2.66f, -0.87f, -4.9f)
                curveToRelative(0f, -2.22f, 0.57f, -4.07f, 0.87f, -4.9f)
                curveToRelative(1.25f, -0.2f, 4.5f, -0.65f, 8.13f, -0.65f)
                reflectiveCurveToRelative(6.89f, 0.45f, 8.13f, 0.65f)
                curveToRelative(0.3f, 0.83f, 0.87f, 2.66f, 0.87f, 4.9f)
                curveToRelative(0f, 2.22f, -0.57f, 4.07f, -0.87f, 4.9f)
                close()
            }
        }.also { _RectangleHorizontal = it}
