package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendars: ImageVector? = null

val Icons.Ss.Calendars: ImageVector
    get() = _Calendars ?: UXIcon(name = "Calendars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 24f)
                horizontalLineTo(0f)
                verticalLineTo(8f)
                horizontalLineTo(2f)
                verticalLineToRelative(14f)
                horizontalLineTo(20f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                horizontalLineToRelative(-6f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineTo(24f)
                close()
                moveTo(4f, 9f)
                verticalLineToRelative(11f)
                horizontalLineTo(24f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                close()
            }
        }.also { _Calendars = it}
