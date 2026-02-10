package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Desk: ImageVector? = null

val Icons.Bs.Desk: ImageVector
    get() = _Desk ?: UXIcon(name = "Desk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(2f)
                lineTo(0f, 12f)
                verticalLineToRelative(3f)
                lineTo(2f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                lineTo(5f, 15f)
                lineTo(14f, 15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(10f)
                lineTo(24f, 12f)
                lineTo(13.5f, 12f)
                close()
                moveTo(8f, 3f)
                horizontalLineToRelative(8f)
                lineTo(16f, 7f)
                lineTo(8f, 7f)
                lineTo(8f, 3f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                close()
            }
        }.also { _Desk = it}
