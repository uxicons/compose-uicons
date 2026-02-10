package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLinesVertical: ImageVector? = null

val Icons.Rc.GripLinesVertical: ImageVector
    get() = _GripLinesVertical ?: UXIcon(name = "GripLinesVertical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.97f, 2.24f)
                curveToRelative(-0.01f, 0.04f, -0.97f, 3.97f, -0.97f, 9.76f)
                reflectiveCurveToRelative(0.96f, 9.72f, 0.97f, 9.76f)
                curveToRelative(0.13f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.52f, 0.14f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.04f, -0.17f, -1.03f, -4.19f, -1.03f, -10.24f)
                reflectiveCurveToRelative(0.99f, -10.07f, 1.03f, -10.24f)
                curveToRelative(0.13f, -0.54f, 0.67f, -0.87f, 1.21f, -0.73f)
                curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
                close()
                moveTo(16f, 12f)
                curveToRelative(0f, -5.79f, 0.96f, -9.72f, 0.97f, -9.76f)
                curveToRelative(0.13f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                curveToRelative(-0.54f, -0.14f, -1.08f, 0.19f, -1.21f, 0.73f)
                curveToRelative(-0.04f, 0.17f, -1.03f, 4.19f, -1.03f, 10.24f)
                reflectiveCurveToRelative(0.99f, 10.07f, 1.03f, 10.24f)
                curveToRelative(0.13f, 0.54f, 0.69f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.54f, -0.13f, 0.86f, -0.68f, 0.73f, -1.21f)
                curveToRelative(-0.01f, -0.04f, -0.97f, -3.97f, -0.97f, -9.76f)
                close()
            }
        }.also { _GripLinesVertical = it}
