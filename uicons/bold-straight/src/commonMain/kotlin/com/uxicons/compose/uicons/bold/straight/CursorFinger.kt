package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Bs.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 7.83f)
                verticalLineToRelative(-3.83f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 0f)
                verticalLineToRelative(5.87f)
                lineToRelative(-3.98f, 3.91f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.95f)
                lineToRelative(5.27f, 5.27f)
                horizontalLineToRelative(14.71f)
                verticalLineToRelative(-14.17f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-10.46f)
                lineToRelative(-4.39f, -4.39f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.15f, -0.35f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.14f, -0.34f)
                lineToRelative(1.86f, -1.83f)
                verticalLineToRelative(1.92f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(6.17f)
                lineToRelative(8f, 2f)
                close()
            }
        }.also { _CursorFinger = it}
