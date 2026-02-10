package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Calendars: ImageVector? = null

val Icons.Rs.Calendars: ImageVector
    get() = _Calendars ?: UXIcon(name = "Calendars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 2f)
                horizontalLineToRelative(-2f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 2f)
                horizontalLineToRelative(-6f)
                lineTo(11f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(9f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                lineTo(24f, 20f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(7f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                lineTo(6f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(6f, 18f)
                lineTo(6f, 9f)
                lineTo(22f, 9f)
                verticalLineToRelative(9f)
                lineTo(6f, 18f)
                close()
                moveTo(2f, 22f)
                lineTo(20f, 22f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                lineTo(0f, 8f)
                lineTo(2f, 8f)
                verticalLineToRelative(14f)
                close()
            }
        }.also { _Calendars = it}
