package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Overline: ImageVector? = null

val Icons.Rc.Overline: ImageVector
    get() = _Overline ?: UXIcon(name = "Overline") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5f)
                curveToRelative(-5.46f, 0f, -8f, 2.86f, -8f, 9f)
                reflectiveCurveToRelative(2.54f, 9f, 8f, 9f)
                reflectiveCurveToRelative(8f, -2.86f, 8f, -9f)
                reflectiveCurveToRelative(-2.54f, -9f, -8f, -9f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.7f, 0f, -6f, -1.17f, -6f, -7f)
                reflectiveCurveToRelative(2.4f, -7f, 6f, -7f)
                curveToRelative(3.7f, 0f, 6f, 1.17f, 6f, 7f)
                reflectiveCurveToRelative(-2.4f, 7f, -6f, 7f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.37f, 3.93f)
                curveToRelative(0.02f, -0.01f, 2.42f, -0.93f, 6.63f, -0.93f)
                reflectiveCurveToRelative(6.61f, 0.92f, 6.63f, 0.93f)
                curveToRelative(0.12f, 0.05f, 0.25f, 0.07f, 0.37f, 0.07f)
                curveToRelative(0.4f, 0f, 0.77f, -0.24f, 0.93f, -0.63f)
                curveToRelative(0.2f, -0.51f, -0.04f, -1.09f, -0.56f, -1.3f)
                curveToRelative(-0.11f, -0.04f, -2.73f, -1.07f, -7.37f, -1.07f)
                reflectiveCurveToRelative(-7.26f, 1.03f, -7.37f, 1.07f)
                curveToRelative(-0.51f, 0.2f, -0.76f, 0.78f, -0.56f, 1.3f)
                curveToRelative(0.2f, 0.51f, 0.78f, 0.77f, 1.3f, 0.56f)
                close()
            }
        }.also { _Overline = it}
