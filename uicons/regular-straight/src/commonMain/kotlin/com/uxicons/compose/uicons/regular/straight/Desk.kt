package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Desk: ImageVector? = null

val Icons.Rs.Desk: ImageVector
    get() = _Desk ?: UXIcon(name = "Desk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                lineTo(19f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                lineTo(7f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                lineTo(5f, 10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                lineTo(0f, 12f)
                verticalLineToRelative(2f)
                lineTo(2f, 14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                lineTo(4f, 14f)
                lineTo(15f, 14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(9f)
                lineTo(24f, 12f)
                lineTo(13f, 12f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(6f)
                lineTo(7f, 8f)
                lineTo(7f, 2f)
                close()
                moveTo(22f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                close()
                moveTo(17f, 22f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Desk = it}
