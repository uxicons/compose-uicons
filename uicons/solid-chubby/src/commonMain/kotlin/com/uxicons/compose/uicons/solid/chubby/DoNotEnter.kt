package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DoNotEnter: ImageVector? = null

val Icons.Sc.DoNotEnter: ImageVector
    get() = _DoNotEnter ?: UXIcon(name = "DoNotEnter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(18.64f, 14.01f)
                curveToRelative(-0.13f, 0.29f, -0.39f, 0.5f, -0.7f, 0.56f)
                curveToRelative(-0.08f, 0.02f, -2.06f, 0.42f, -5.93f, 0.42f)
                reflectiveCurveToRelative(-5.85f, -0.4f, -5.93f, -0.42f)
                curveToRelative(-0.31f, -0.07f, -0.57f, -0.28f, -0.7f, -0.56f)
                curveToRelative(-0.04f, -0.08f, -0.36f, -0.83f, -0.36f, -2.01f)
                reflectiveCurveToRelative(0.33f, -1.93f, 0.36f, -2.01f)
                curveToRelative(0.13f, -0.29f, 0.39f, -0.5f, 0.7f, -0.56f)
                curveToRelative(0.08f, -0.02f, 2.06f, -0.42f, 5.93f, -0.42f)
                reflectiveCurveToRelative(5.85f, 0.4f, 5.93f, 0.42f)
                curveToRelative(0.31f, 0.07f, 0.57f, 0.28f, 0.7f, 0.56f)
                curveToRelative(0.04f, 0.08f, 0.36f, 0.83f, 0.36f, 2.01f)
                reflectiveCurveToRelative(-0.33f, 1.93f, -0.36f, 2.01f)
                close()
                moveTo(16.94f, 11.29f)
                curveToRelative(0.03f, 0.19f, 0.06f, 0.43f, 0.06f, 0.71f)
                reflectiveCurveToRelative(-0.03f, 0.52f, -0.06f, 0.71f)
                curveToRelative(-0.81f, 0.11f, -2.47f, 0.28f, -4.94f, 0.28f)
                reflectiveCurveToRelative(-4.13f, -0.17f, -4.94f, -0.29f)
                curveToRelative(-0.03f, -0.19f, -0.06f, -0.43f, -0.06f, -0.71f)
                reflectiveCurveToRelative(0.03f, -0.53f, 0.06f, -0.71f)
                curveToRelative(0.81f, -0.11f, 2.46f, -0.29f, 4.94f, -0.29f)
                reflectiveCurveToRelative(4.13f, 0.17f, 4.94f, 0.28f)
                close()
            }
        }.also { _DoNotEnter = it}
