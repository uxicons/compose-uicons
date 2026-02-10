package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBolt: ImageVector? = null

val Icons.Sc.CircleBolt: ImageVector
    get() = _CircleBolt ?: UXIcon(name = "CircleBolt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12.64f, 18.77f)
                curveToRelative(-0.42f, 0.35f, -1.05f, 0.3f, -1.41f, -0.13f)
                curveToRelative(-0.35f, -0.42f, -0.3f, -1.05f, 0.13f, -1.41f)
                curveToRelative(0.02f, -0.02f, 2.07f, -1.77f, 2.54f, -4.23f)
                horizontalLineToRelative(-4.9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -3.92f, 3.22f, -6.65f, 3.36f, -6.77f)
                curveToRelative(0.42f, -0.35f, 1.05f, -0.3f, 1.41f, 0.13f)
                curveToRelative(0.35f, 0.42f, 0.3f, 1.05f, -0.13f, 1.41f)
                curveToRelative(-0.02f, 0.02f, -2.07f, 1.77f, -2.54f, 4.23f)
                horizontalLineToRelative(4.9f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 3.92f, -3.22f, 6.65f, -3.36f, 6.77f)
                close()
            }
        }.also { _CircleBolt = it}
