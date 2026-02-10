package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Sr.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.98f, 9.38f)
                lineToRelative(-4.98f, -1.2f)
                verticalLineToRelative(-5.6f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.09f, -2.55f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.91f, 2.47f)
                verticalLineToRelative(14.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-7.34f)
                lineToRelative(-2.79f, 3.64f)
                arcToRelative(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.25f, 6.79f)
                lineToRelative(2.4f, 2.42f)
                arcToRelative(5.04f, 5.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.55f, 1.48f)
                horizontalLineToRelative(7.59f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, -5f)
                verticalLineToRelative(-4.72f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.02f, -4.9f)
                close()
            }
        }.also { _CursorFinger = it}
