package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PageBreak: ImageVector? = null

val Icons.Bs.PageBreak: ImageVector
    get() = _PageBreak ?: UXIcon(name = "PageBreak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(11.12f)
                lineToRelative(5.88f, 5.88f)
                verticalLineToRelative(5.12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 11f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                verticalLineToRelative(-3f)
                lineTo(2f, 18f)
                verticalLineToRelative(6f)
                lineTo(22f, 24f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(7f, 13f)
                lineTo(1f, 13f)
                verticalLineToRelative(3f)
                lineTo(7f, 16f)
                verticalLineToRelative(-3f)
                close()
                moveTo(9f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _PageBreak = it}
