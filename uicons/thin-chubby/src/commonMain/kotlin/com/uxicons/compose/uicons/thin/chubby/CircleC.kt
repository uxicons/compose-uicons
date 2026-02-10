package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleC: ImageVector? = null

val Icons.Tc.CircleC: ImageVector
    get() = _CircleC ?: UXIcon(name = "CircleC") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-7.2f, 0f, -10f, -2.8f, -10f, -10f)
                reflectiveCurveToRelative(2.8f, -10f, 10f, -10f)
                reflectiveCurveToRelative(10f, 2.8f, 10f, 10f)
                reflectiveCurveToRelative(-2.8f, 10f, -10f, 10f)
                close()
                moveTo(8f, 12f)
                curveToRelative(0f, 4.15f, 1.6f, 5f, 4f, 5f)
                curveToRelative(1.5f, 0f, 2.49f, -0.37f, 3.1f, -1.17f)
                curveToRelative(0.17f, -0.22f, 0.48f, -0.26f, 0.7f, -0.09f)
                curveToRelative(0.22f, 0.17f, 0.26f, 0.48f, 0.09f, 0.7f)
                curveToRelative(-0.81f, 1.05f, -2.08f, 1.56f, -3.9f, 1.56f)
                curveToRelative(-3.46f, 0f, -5f, -1.85f, -5f, -6f)
                reflectiveCurveToRelative(1.54f, -6f, 5f, -6f)
                curveToRelative(1.81f, 0f, 3.09f, 0.51f, 3.9f, 1.56f)
                curveToRelative(0.17f, 0.22f, 0.13f, 0.53f, -0.09f, 0.7f)
                curveToRelative(-0.22f, 0.17f, -0.53f, 0.13f, -0.7f, -0.09f)
                curveToRelative(-0.61f, -0.8f, -1.6f, -1.17f, -3.1f, -1.17f)
                curveToRelative(-2.4f, 0f, -4f, 0.85f, -4f, 5f)
                close()
            }
        }.also { _CircleC = it}
