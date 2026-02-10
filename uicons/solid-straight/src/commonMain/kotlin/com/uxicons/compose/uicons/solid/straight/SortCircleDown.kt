package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircleDown: ImageVector? = null

val Icons.Ss.SortCircleDown: ImageVector
    get() = _SortCircleDown ?: UXIcon(name = "SortCircleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.15f, 9.5f)
                horizontalLineToRelative(-4.63f)
                lineToRelative(2.31f, -2.3f)
                lineToRelative(2.31f, 2.3f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(5.17f, 11f)
                horizontalLineToRelative(13.33f)
                lineToRelative(-5.6f, -5.56f)
                curveToRelative(-0.29f, -0.29f, -0.68f, -0.44f, -1.06f, -0.44f)
                reflectiveCurveToRelative(-0.77f, 0.15f, -1.06f, 0.44f)
                lineToRelative(-5.6f, 5.56f)
                close()
                moveTo(18.75f, 13f)
                lineTo(5.25f, 13f)
                lineToRelative(5.69f, 5.56f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                lineToRelative(5.69f, -5.56f)
                close()
            }
        }.also { _SortCircleDown = it}
