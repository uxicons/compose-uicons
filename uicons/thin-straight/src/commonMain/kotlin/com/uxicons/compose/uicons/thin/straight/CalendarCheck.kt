package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCheck: ImageVector? = null

val Icons.Ts.CalendarCheck: ImageVector
    get() = _CalendarCheck ?: UXIcon(name = "CalendarCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                horizontalLineToRelative(-3.5f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                verticalLineTo(24f)
                horizontalLineTo(24f)
                verticalLineTo(4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(2.5f, 3f)
                horizontalLineTo(21.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                horizontalLineTo(1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(1f, 23f)
                verticalLineTo(9f)
                horizontalLineTo(23f)
                verticalLineToRelative(14f)
                horizontalLineTo(1f)
                close()
                moveTo(17.15f, 11.64f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-6.29f, 6.21f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-3.29f, -3.2f)
                lineToRelative(0.7f, -0.72f)
                lineToRelative(3.29f, 3.21f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.01f)
                lineToRelative(6.29f, -6.21f)
                close()
            }
        }.also { _CalendarCheck = it}
