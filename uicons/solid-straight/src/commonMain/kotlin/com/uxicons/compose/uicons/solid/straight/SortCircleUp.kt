package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortCircleUp: ImageVector? = null

val Icons.Ss.SortCircleUp: ImageVector
    get() = _SortCircleUp ?: UXIcon(name = "SortCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.52f, 14.5f)
                horizontalLineToRelative(4.63f)
                lineToRelative(-2.31f, 2.3f)
                lineToRelative(-2.31f, -2.3f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(18.5f, 13f)
                lineTo(5.17f, 13f)
                lineToRelative(5.6f, 5.56f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(5.6f, -5.56f)
                close()
                moveTo(18.75f, 11f)
                lineToRelative(-5.69f, -5.56f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                lineToRelative(-5.69f, 5.56f)
                horizontalLineToRelative(13.5f)
                close()
            }
        }.also { _SortCircleUp = it}
