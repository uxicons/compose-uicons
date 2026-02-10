package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneFlip: ImageVector? = null

val Icons.Ss.CirclePhoneFlip: ImageVector
    get() = _CirclePhoneFlip ?: UXIcon(name = "CirclePhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(8.89f, 19f)
                curveToRelative(-0.83f, 0f, -1.65f, -0.3f, -2.28f, -0.93f)
                lineToRelative(-1.61f, -1.61f)
                lineToRelative(3.16f, -3.16f)
                lineToRelative(2.07f, 2.07f)
                curveToRelative(2.36f, -0.9f, 4.11f, -2.58f, 5.14f, -5.14f)
                lineToRelative(-2.07f, -2.07f)
                lineToRelative(3.16f, -3.16f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(0.63f, 0.63f, 0.93f, 1.46f, 0.93f, 2.28f)
                curveToRelative(0f, 4.57f, -5.87f, 10.11f, -10.11f, 10.11f)
                close()
            }
        }.also { _CirclePhoneFlip = it}
