package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleY: ImageVector? = null

val Icons.Rs.CircleY: ImageVector
    get() = _CircleY ?: UXIcon(name = "CircleY") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(18f, 6.25f)
                lineToRelative(-5f, 6.79f)
                verticalLineToRelative(4.96f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.96f)
                lineToRelative(-5f, -6.79f)
                horizontalLineToRelative(2.48f)
                lineToRelative(3.52f, 4.77f)
                lineToRelative(3.52f, -4.77f)
                horizontalLineToRelative(2.48f)
                close()
            }
        }.also { _CircleY = it}
