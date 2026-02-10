package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircleDown: ImageVector? = null

val Icons.Rs.SortCircleDown: ImageVector
    get() = _SortCircleDown ?: UXIcon(name = "SortCircleDown") {
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
                moveTo(5.25f, 13f)
                horizontalLineToRelative(13.5f)
                lineToRelative(-5.69f, 5.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-5.69f, -5.56f)
                close()
                moveTo(12.9f, 5.44f)
                curveToRelative(-0.29f, -0.29f, -0.68f, -0.44f, -1.06f, -0.44f)
                reflectiveCurveToRelative(-0.77f, 0.15f, -1.06f, 0.44f)
                lineToRelative(-5.6f, 5.56f)
                horizontalLineToRelative(13.33f)
                lineToRelative(-5.6f, -5.56f)
                close()
                moveTo(11.84f, 7.2f)
                lineToRelative(2.31f, 2.3f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(2.31f, -2.3f)
                close()
            }
        }.also { _SortCircleDown = it}
