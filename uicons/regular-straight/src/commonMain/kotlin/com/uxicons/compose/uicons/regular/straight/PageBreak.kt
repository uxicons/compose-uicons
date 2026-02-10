package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PageBreak: ImageVector? = null

val Icons.Rs.PageBreak: ImageVector
    get() = _PageBreak ?: UXIcon(name = "PageBreak") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 17f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                lineTo(2f, 24f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                lineTo(20f, 22f)
                verticalLineToRelative(-5f)
                close()
                moveTo(4f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                lineTo(14.41f, 0f)
                lineToRelative(7.59f, 7.59f)
                verticalLineToRelative(3.41f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(4f, 11f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(7f, 13f)
                lineTo(1f, 13f)
                verticalLineToRelative(2f)
                lineTo(7f, 15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _PageBreak = it}
