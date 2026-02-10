package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendars: ImageVector? = null

val Icons.Ts.Calendars: ImageVector
    get() = _Calendars ?: UXIcon(name = "Calendars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                horizontalLineToRelative(-2.5f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(18f, 2f)
                lineTo(9f, 2f)
                lineTo(9f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(8f, 2f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                lineTo(3f, 21f)
                lineTo(24f, 21f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(5.5f, 3f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                lineTo(4f, 7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(4f, 20f)
                lineTo(4f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(12f)
                lineTo(4f, 20f)
                close()
                moveTo(1f, 23f)
                lineTo(20f, 23f)
                verticalLineToRelative(1f)
                lineTo(0f, 24f)
                lineTo(0f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _Calendars = it}
