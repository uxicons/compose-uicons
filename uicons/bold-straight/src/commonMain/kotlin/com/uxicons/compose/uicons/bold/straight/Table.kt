package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Bs.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10.5f, 7f)
                verticalLineToRelative(4.5f)
                lineTo(3f, 11.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.5f)
                close()
                moveTo(13.5f, 7f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(3f, 14.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                lineTo(3f, 19f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(13.5f, 19f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }.also { _Table = it}
