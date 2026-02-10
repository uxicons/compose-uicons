package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarPen: ImageVector? = null

val Icons.Ts.CalendarPen: ImageVector
    get() = _CalendarPen ?: UXIcon(name = "CalendarPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.73f, 13.73f)
                lineToRelative(-6.73f, 6.73f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(3.54f)
                lineToRelative(6.73f, -6.73f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                curveToRelative(-0.97f, -0.97f, -2.56f, -0.98f, -3.54f, 0f)
                close()
                moveTo(22.56f, 16.56f)
                lineToRelative(-6.44f, 6.44f)
                horizontalLineToRelative(-2.12f)
                verticalLineToRelative(-2.12f)
                lineToRelative(6.44f, -6.44f)
                curveToRelative(0.57f, -0.57f, 1.55f, -0.57f, 2.12f, 0f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
                moveTo(21.5f, 2.0f)
                horizontalLineToRelative(-3.5f)
                lineTo(18.0f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(17.0f, 2f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(6f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 24f)
                lineTo(11f, 24f)
                verticalLineToRelative(-1f)
                lineTo(1f, 23f)
                lineTo(1f, 9f)
                lineTo(23f, 9f)
                verticalLineToRelative(2.29f)
                curveToRelative(0.35f, 0.12f, 0.69f, 0.27f, 1f, 0.47f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 8f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(1f, 8f)
                close()
            }
        }.also { _CalendarPen = it}
