package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle7: ImageVector? = null

val Icons.Rs.Circle7: ImageVector
    get() = _Circle7 ?: UXIcon(name = "Circle7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.78f, 17.99f)
                lineToRelative(-1.79f, -0.89f)
                lineToRelative(4.54f, -9.1f)
                horizontalLineToRelative(-5.53f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1.52f)
                lineToRelative(-5.22f, 10.46f)
                close()
                moveTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                reflectiveCurveTo(2f, 17.51f, 2f, 12f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                close()
            }
        }.also { _Circle7 = it}
