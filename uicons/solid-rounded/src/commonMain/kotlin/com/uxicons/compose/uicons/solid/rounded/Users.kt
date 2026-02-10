package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Users: ImageVector? = null

val Icons.Sr.Users: ImageVector
    get() = _Users ?: UXIcon(name = "Users") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 13f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
                close()
                moveTo(14f, 24f)
                horizontalLineToRelative(-13f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineToRelative(-0.5f)
                arcToRelative(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 0f)
                verticalLineToRelative(0.5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                close()
                moveTo(17.5f, 9f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
                close()
                moveTo(16.08f, 11.02f)
                arcToRelative(6.83f, 6.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.67f, 2.83f)
                arcToRelative(9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.91f, 5.15f)
                horizontalLineToRelative(6.68f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                verticalLineToRelative(-0.04f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.92f, -6.94f)
                close()
            }
        }.also { _Users = it}
