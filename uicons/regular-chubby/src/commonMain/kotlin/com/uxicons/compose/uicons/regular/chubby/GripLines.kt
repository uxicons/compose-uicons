package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GripLines: ImageVector? = null

val Icons.Rc.GripLines: ImageVector
    get() = _GripLines ?: UXIcon(name = "GripLines") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.03f, 10.24f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.17f, -0.04f, 4.19f, -1.03f, 10.24f, -1.03f)
                reflectiveCurveToRelative(10.07f, 0.99f, 10.24f, 1.03f)
                curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.04f, -0.01f, -3.97f, -0.97f, -9.76f, -0.97f)
                reflectiveCurveToRelative(-9.72f, 0.96f, -9.76f, 0.97f)
                curveToRelative(-0.54f, 0.13f, -1.08f, -0.19f, -1.21f, -0.73f)
                close()
                moveTo(22.24f, 15.03f)
                curveToRelative(-0.17f, -0.04f, -4.19f, -1.03f, -10.24f, -1.03f)
                reflectiveCurveToRelative(-10.07f, 0.99f, -10.24f, 1.03f)
                curveToRelative(-0.54f, 0.13f, -0.86f, 0.68f, -0.73f, 1.21f)
                curveToRelative(0.13f, 0.54f, 0.68f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.04f, -0.01f, 3.97f, -0.97f, 9.76f, -0.97f)
                reflectiveCurveToRelative(9.72f, 0.96f, 9.76f, 0.97f)
                curveToRelative(0.52f, 0.13f, 1.08f, -0.19f, 1.21f, -0.73f)
                curveToRelative(0.13f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                close()
            }
        }.also { _GripLines = it}
