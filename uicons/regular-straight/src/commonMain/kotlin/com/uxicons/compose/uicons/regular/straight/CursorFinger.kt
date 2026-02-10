package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Rs.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8.18f)
                verticalLineToRelative(-5.07f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.5f, -3.07f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.5f, 2.96f)
                verticalLineToRelative(7.58f)
                lineToRelative(-4.12f, 4.05f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.24f)
                lineToRelative(5.12f, 5.12f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-13.82f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-12.17f)
                lineToRelative(-4.54f, -4.54f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.01f, -1.41f)
                lineToRelative(2.71f, -2.67f)
                verticalLineToRelative(3.61f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.18f, -0.99f)
                arcToRelative(1.08f, 1.08f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.82f, 1.09f)
                verticalLineToRelative(6.71f)
                lineToRelative(10f, 2f)
                close()
            }
        }.also { _CursorFinger = it}
