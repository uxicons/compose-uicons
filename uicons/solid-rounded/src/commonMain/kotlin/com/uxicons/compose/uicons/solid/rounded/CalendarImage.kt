package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarImage: ImageVector? = null

val Icons.Sr.CalendarImage: ImageVector
    get() = _CalendarImage ?: UXIcon(name = "CalendarImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7f)
                verticalLineToRelative(1f)
                lineTo(0f, 8f)
                verticalLineToRelative(-1f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(0f, 19f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(23.59f)
                lineToRelative(-7.61f, 7.61f)
                curveToRelative(-0.52f, 0.52f, -1.43f, 0.52f, -1.95f, 0f)
                lineToRelative(-0.63f, -0.64f)
                curveToRelative(-1.28f, -1.28f, -3.5f, -1.28f, -4.78f, 0f)
                lineToRelative(-6.26f, 6.26f)
                curveToRelative(-1.41f, -0.89f, -2.35f, -2.45f, -2.35f, -4.24f)
                close()
                moveTo(3f, 13.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(17.39f, 19.02f)
                curveToRelative(-1.28f, 1.28f, -3.5f, 1.28f, -4.78f, 0f)
                lineToRelative(-0.63f, -0.64f)
                curveToRelative(-0.52f, -0.52f, -1.43f, -0.52f, -1.95f, 0f)
                lineToRelative(-5.58f, 5.58f)
                curveToRelative(0.18f, 0.02f, 0.37f, 0.03f, 0.56f, 0.03f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-6.59f)
                lineToRelative(-6.61f, 6.61f)
                close()
            }
        }.also { _CalendarImage = it}
