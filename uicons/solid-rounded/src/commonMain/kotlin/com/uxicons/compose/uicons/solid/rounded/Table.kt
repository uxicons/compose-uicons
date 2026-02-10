package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Sr.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 7f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                lineTo(0f, 7f)
                close()
                moveTo(11f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-5f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-5f)
                close()
                moveTo(11f, 16f)
                lineTo(0f, 16f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(13f, 16f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-11f)
                close()
            }
        }.also { _Table = it}
