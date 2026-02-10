package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Desk: ImageVector? = null

val Icons.Ts.Desk: ImageVector
    get() = _Desk ?: UXIcon(name = "Desk") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6.5f)
                lineTo(19f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(7.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(2f)
                lineTo(0f, 12f)
                verticalLineToRelative(1f)
                lineTo(2f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(1f)
                lineTo(3f, 13f)
                lineTo(15f, 13f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(9f)
                lineTo(24f, 12f)
                lineTo(12.5f, 12f)
                close()
                moveTo(6f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                lineTo(6f, 9f)
                lineTo(6f, 2.5f)
                close()
                moveTo(23f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(7f)
                close()
                moveTo(16f, 23f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _Desk = it}
