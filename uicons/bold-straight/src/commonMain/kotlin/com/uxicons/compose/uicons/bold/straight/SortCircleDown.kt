package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircleDown: ImageVector? = null

val Icons.Bs.SortCircleDown: ImageVector
    get() = _SortCircleDown ?: UXIcon(name = "SortCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                close()
                moveTo(18.75f, 13f)
                lineToRelative(-5.69f, 5.56f)
                curveToRelative(-0.59f, 0.59f, -1.53f, 0.59f, -2.12f, 0f)
                lineToRelative(-5.69f, -5.56f)
                horizontalLineToRelative(13.5f)
                close()
                moveTo(9.59f, 11f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(5.6f, -5.56f)
                curveToRelative(0.29f, -0.29f, 0.68f, -0.44f, 1.06f, -0.44f)
                reflectiveCurveToRelative(0.77f, 0.15f, 1.06f, 0.44f)
                lineToRelative(5.6f, 5.56f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(-2.4f, -2.39f)
                lineToRelative(-2.4f, 2.39f)
                close()
            }
        }.also { _SortCircleDown = it}
