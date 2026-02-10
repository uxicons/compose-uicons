package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToolMarquee: ImageVector? = null

val Icons.Bs.ToolMarquee: ImageVector
    get() = _ToolMarquee ?: UXIcon(name = "ToolMarquee") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 3.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, -3.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2.5f)
                arcToRelative(0.51f, 0.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(6f, 21f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                close()
                moveTo(3f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(3f)
                close()
                moveTo(3f, 9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                close()
                moveTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                close()
                moveTo(15.07f, 21f)
                horizontalLineToRelative(-6.07f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6.07f)
                close()
            }
        }.also { _ToolMarquee = it}
