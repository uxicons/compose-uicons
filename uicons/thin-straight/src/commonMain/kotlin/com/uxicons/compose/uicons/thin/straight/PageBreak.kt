package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PageBreak: ImageVector? = null

val Icons.Ts.PageBreak: ImageVector
    get() = _PageBreak ?: UXIcon(name = "PageBreak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 14f)
                lineTo(1f, 14f)
                verticalLineToRelative(-1f)
                lineTo(7f, 13f)
                verticalLineToRelative(1f)
                close()
                moveTo(9f, 14f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(21f, 23f)
                lineTo(3f, 23f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(8f)
                lineTo(22f, 24f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(7f)
                close()
                moveTo(3f, 11f)
                horizontalLineToRelative(-1f)
                lineTo(2f, 2.5f)
                curveTo(2f, 1.12f, 3.12f, 0f, 4.5f, 0f)
                lineTo(14.71f, 0f)
                lineToRelative(7.29f, 7.29f)
                verticalLineToRelative(3.71f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                lineTo(14f, 1f)
                lineTo(4.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(3f, 11f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(5.29f)
                lineTo(15f, 1.71f)
                lineTo(15f, 7f)
                close()
            }
        }.also { _PageBreak = it}
