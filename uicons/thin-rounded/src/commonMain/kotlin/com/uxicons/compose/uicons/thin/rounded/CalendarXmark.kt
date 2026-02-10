package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarXmark: ImageVector? = null

val Icons.Tr.CalendarXmark: ImageVector
    get() = _CalendarXmark ?: UXIcon(name = "CalendarXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.85f, 12.85f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-3.15f, -3.15f)
                lineToRelative(-3.15f, 3.15f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(-3.15f, -3.15f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(3.15f, 3.15f)
                lineToRelative(3.15f, -3.15f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(24f, 6.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 24f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 6.5f)
                curveTo(0f, 4.02f, 2.02f, 2f, 4.5f, 2f)
                horizontalLineToRelative(1.5f)
                lineTo(6f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(10f)
                lineTo(17f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(1f, 6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(4.5f, 3f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(23f, 19.5f)
                verticalLineToRelative(-10.5f)
                lineTo(1f, 9f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _CalendarXmark = it}
