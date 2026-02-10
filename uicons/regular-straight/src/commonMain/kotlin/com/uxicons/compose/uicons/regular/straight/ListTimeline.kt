package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListTimeline: ImageVector? = null

val Icons.Rs.ListTimeline: ImageVector
    get() = _ListTimeline ?: UXIcon(name = "ListTimeline") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 15f)
                lineTo(9.02f, 15f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(12.98f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(9.85f, 13f)
                horizontalLineToRelative(12.15f)
                verticalLineToRelative(-2f)
                lineTo(9.85f, 11f)
                lineToRelative(-1f, 1f)
                lineToRelative(1f, 1f)
                close()
                moveTo(19f, 6f)
                lineTo(9.02f, 6f)
                lineToRelative(-3f, -3f)
                lineTo(9.02f, 0f)
                horizontalLineToRelative(9.98f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(9.85f, 4f)
                horizontalLineToRelative(9.15f)
                lineTo(19f, 2f)
                lineTo(9.85f, 2f)
                lineToRelative(-1f, 1f)
                lineToRelative(1f, 1f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(-7.98f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(7.98f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(9.85f, 22f)
                horizontalLineToRelative(7.15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7.15f)
                lineToRelative(-1f, 1f)
                lineToRelative(1f, 1f)
                close()
                moveTo(2f, 19f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
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
            }
        }.also { _ListTimeline = it}
