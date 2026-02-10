package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListTimeline: ImageVector? = null

val Icons.Ss.ListTimeline: ImageVector
    get() = _ListTimeline ?: UXIcon(name = "ListTimeline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9f)
                lineTo(9.02f, 9f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(12.98f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(19f, 6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                lineTo(21f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(9.02f, 0f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(9.98f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(-7.98f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(7.98f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(4f, 21f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(4f, 12f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(4f, 3f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveTo(0f, 4.1f, 0f, 3f)
                reflectiveCurveTo(0.9f, 1f, 2f, 1f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _ListTimeline = it}
