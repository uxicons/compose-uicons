package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CirclePhoneFlip: ImageVector? = null

val Icons.Rs.CirclePhoneFlip: ImageVector
    get() = _CirclePhoneFlip ?: UXIcon(name = "CirclePhoneFlip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(6f, 15.83f)
                lineToRelative(1.38f, 1.38f)
                curveToRelative(0.54f, 0.54f, 1.25f, 0.8f, 1.96f, 0.8f)
                curveToRelative(3.63f, 0f, 8.67f, -4.75f, 8.67f, -8.67f)
                curveToRelative(0f, -0.71f, -0.26f, -1.42f, -0.8f, -1.96f)
                lineToRelative(-1.38f, -1.38f)
                lineToRelative(-2.71f, 2.71f)
                lineToRelative(1.77f, 1.77f)
                curveToRelative(-0.88f, 2.19f, -2.38f, 3.63f, -4.4f, 4.4f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-2.71f, 2.71f)
                close()
            }
        }.also { _CirclePhoneFlip = it}
