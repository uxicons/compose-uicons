package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PageBreak: ImageVector? = null

val Icons.Ss.PageBreak: ImageVector
    get() = _PageBreak ?: UXIcon(name = "PageBreak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(9f)
                lineTo(2f, 24f)
                lineTo(2f, 15f)
                lineTo(7f, 15f)
                verticalLineToRelative(-2f)
                lineTo(2f, 13f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _PageBreak = it}
