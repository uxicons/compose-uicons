package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarImage: ImageVector? = null

val Icons.Tr.CalendarImage: ImageVector
    get() = _CalendarImage ?: UXIcon(name = "CalendarImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 2f)
                horizontalLineToRelative(-1.5f)
                lineTo(18f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                lineTo(7f, 2f)
                lineTo(7f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(4.5f, 3f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 8f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(1f, 19.5f)
                verticalLineToRelative(-10.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(0.13f)
                lineToRelative(-7.33f, 7.33f)
                curveToRelative(-0.71f, 0.71f, -1.95f, 0.71f, -2.66f, 0f)
                lineToRelative(-0.64f, -0.64f)
                curveToRelative(-1.09f, -1.09f, -2.98f, -1.09f, -4.07f, 0f)
                lineToRelative(-6.21f, 6.21f)
                curveToRelative(-0.67f, -0.64f, -1.09f, -1.54f, -1.09f, -2.54f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-0.57f, 0f, -1.1f, -0.14f, -1.58f, -0.38f)
                lineToRelative(6.09f, -6.09f)
                curveToRelative(0.71f, -0.71f, 1.95f, -0.71f, 2.66f, 0f)
                lineToRelative(0.64f, 0.64f)
                curveToRelative(1.09f, 1.09f, 2.98f, 1.09f, 4.07f, 0f)
                lineToRelative(6.63f, -6.63f)
                verticalLineToRelative(8.96f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(4f, 13f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
            }
        }.also { _CalendarImage = it}
