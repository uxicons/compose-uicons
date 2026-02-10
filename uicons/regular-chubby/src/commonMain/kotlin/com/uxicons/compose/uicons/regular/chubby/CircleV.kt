package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Rc.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.5f, 7.06f)
                curveToRelative(-0.36f, 5.98f, -3.56f, 10.35f, -3.69f, 10.54f)
                curveToRelative(-0.19f, 0.25f, -0.49f, 0.4f, -0.8f, 0.4f)
                reflectiveCurveToRelative(-0.61f, -0.15f, -0.8f, -0.4f)
                curveToRelative(-0.14f, -0.18f, -3.33f, -4.56f, -3.69f, -10.54f)
                curveToRelative(-0.03f, -0.55f, 0.39f, -1.02f, 0.94f, -1.06f)
                curveToRelative(0.55f, -0.03f, 1.02f, 0.39f, 1.06f, 0.94f)
                curveToRelative(0.22f, 3.58f, 1.59f, 6.57f, 2.5f, 8.18f)
                curveToRelative(0.91f, -1.61f, 2.29f, -4.61f, 2.5f, -8.18f)
                curveToRelative(0.03f, -0.55f, 0.52f, -0.97f, 1.06f, -0.94f)
                curveToRelative(0.55f, 0.03f, 0.97f, 0.51f, 0.94f, 1.06f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -6.56f, -2.44f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.44f, -9f, 9f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.44f, 9f, -9f)
                close()
            }
        }.also { _CircleV = it}
