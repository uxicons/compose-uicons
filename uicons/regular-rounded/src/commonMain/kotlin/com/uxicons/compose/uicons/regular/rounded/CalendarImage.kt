package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarImage: ImageVector? = null

val Icons.Rr.CalendarImage: ImageVector
    get() = _CalendarImage ?: UXIcon(name = "CalendarImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-1f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(2f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(2f, 10f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(0.59f)
                curveToRelative(-0.01f, 0.01f, -6.03f, 6.02f, -6.03f, 6.02f)
                curveToRelative(-0.52f, 0.52f, -1.43f, 0.52f, -1.95f, 0f)
                lineToRelative(-0.63f, -0.64f)
                curveToRelative(-1.28f, -1.28f, -3.5f, -1.28f, -4.78f, 0f)
                lineToRelative(-5.42f, 5.42f)
                curveToRelative(-0.72f, -0.55f, -1.19f, -1.42f, -1.19f, -2.39f)
                verticalLineToRelative(-9f)
                close()
                moveTo(19f, 22f)
                lineTo(5.41f, 22f)
                lineToRelative(4.61f, -4.61f)
                curveToRelative(0.52f, -0.52f, 1.43f, -0.52f, 1.95f, 0f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(1.28f, 1.28f, 3.5f, 1.28f, 4.78f, 0f)
                lineToRelative(4.61f, -4.61f)
                verticalLineToRelative(5.59f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(4f, 13.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _CalendarImage = it}
