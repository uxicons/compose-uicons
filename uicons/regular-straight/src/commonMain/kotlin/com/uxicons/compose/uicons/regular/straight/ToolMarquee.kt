package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToolMarquee: ImageVector? = null

val Icons.Rs.ToolMarquee: ImageVector
    get() = _ToolMarquee ?: UXIcon(name = "ToolMarquee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(6f, 22f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                close()
                moveTo(2f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                close()
                moveTo(2f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                close()
                moveTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _ToolMarquee = it}
