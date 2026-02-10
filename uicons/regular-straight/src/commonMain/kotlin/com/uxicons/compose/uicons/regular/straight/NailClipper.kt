package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NailClipper: ImageVector? = null

val Icons.Rs.NailClipper: ImageVector
    get() = _NailClipper ?: UXIcon(name = "NailClipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14.41f)
                lineToRelative(-9.14f, -10.06f)
                curveToRelative(0.04f, -0.77f, 0.19f, -3.64f, 0.2f, -4.35f)
                horizontalLineToRelative(-1.52f)
                lineToRelative(-0.3f, 0.36f)
                curveToRelative(-0.06f, 0.07f, -1.44f, 1.64f, -4.22f, 1.64f)
                reflectiveCurveToRelative(-4.16f, -1.57f, -4.21f, -1.64f)
                lineToRelative(-0.32f, -0.36f)
                horizontalLineToRelative(-1.52f)
                lineToRelative(0.98f, 19.16f)
                curveToRelative(0.13f, 2.71f, 2.36f, 4.84f, 5.07f, 4.84f)
                reflectiveCurveToRelative(4.94f, -2.12f, 5.07f, -4.83f)
                lineToRelative(0.15f, -2.99f)
                lineToRelative(4.18f, 3.8f)
                curveToRelative(1.56f, 1.42f, 3.94f, 1.36f, 5.44f, -0.13f)
                curveToRelative(1.49f, -1.49f, 1.55f, -3.88f, 0.13f, -5.44f)
                close()
                moveTo(10.1f, 19.07f)
                curveToRelative(-0.08f, 1.65f, -1.43f, 2.93f, -3.08f, 2.93f)
                reflectiveCurveToRelative(-3.0f, -1.29f, -3.08f, -2.94f)
                lineToRelative(-0.82f, -16.0f)
                curveToRelative(0.94f, 0.5f, 2.24f, 0.94f, 3.89f, 0.94f)
                reflectiveCurveToRelative(2.95f, -0.44f, 3.89f, -0.94f)
                lineToRelative(-0.82f, 16.01f)
                close()
                moveTo(20.46f, 18.43f)
                curveToRelative(-0.73f, 0.73f, -1.91f, 0.76f, -2.68f, 0.06f)
                lineToRelative(-5.4f, -4.91f)
                lineToRelative(0.33f, -6.42f)
                lineToRelative(7.81f, 8.59f)
                curveToRelative(0.7f, 0.77f, 0.67f, 1.94f, -0.06f, 2.68f)
                close()
                moveTo(8.53f, 8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _NailClipper = it}
