package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListTimeline: ImageVector? = null

val Icons.Bs.ListTimeline: ImageVector
    get() = _ListTimeline ?: UXIcon(name = "ListTimeline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(2f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(2f, 1f)
                curveTo(0.9f, 1f, 0f, 1.9f, 0f, 3f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(3.1f, 1f, 2f, 1f)
                close()
                moveTo(19f, 0f)
                lineTo(9f, 0f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(21f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(17f, 18f)
                lineTo(9f, 18f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 9f)
                lineTo(9f, 9f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ListTimeline = it}
