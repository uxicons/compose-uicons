package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendars: ImageVector? = null

val Icons.Bs.Calendars: ImageVector
    get() = _Calendars ?: UXIcon(name = "Calendars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 2f)
                horizontalLineToRelative(-0.5f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(17f, 2f)
                horizontalLineToRelative(-5f)
                lineTo(12f, 0f)
                horizontalLineToRelative(-3f)
                lineTo(9f, 2f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 19f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(8f, 16f)
                lineTo(8f, 8f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(8f)
                lineTo(8f, 16f)
                close()
                moveTo(3f, 21f)
                lineTo(20f, 21f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 8f)
                lineTo(3f, 8f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Calendars = it}
