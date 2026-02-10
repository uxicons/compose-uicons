package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Ts.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(17.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 7f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-10.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 6f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(11.5f, 7f)
                verticalLineToRelative(6.5f)
                lineTo(1f, 13.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(10.5f)
                close()
                moveTo(1f, 14.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(6.5f)
                lineTo(1f, 21f)
                verticalLineToRelative(-6.5f)
                close()
                moveTo(12.5f, 21f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(-10.5f)
                close()
            }
        }.also { _Table = it}
