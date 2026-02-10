package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Users: ImageVector? = null

val Icons.Ss.Users: ImageVector
    get() = _Users ?: UXIcon(name = "Users") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.5f, 13f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
                close()
                moveTo(15f, 20f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                horizontalLineToRelative(-5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(15f)
                close()
                moveTo(17.5f, 9f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 4.5f, -4.5f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.5f, 4.5f)
                close()
                moveTo(19f, 11f)
                horizontalLineToRelative(-5f)
                arcToRelative(4.79f, 4.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.52f, 0.05f)
                arcToRelative(6.51f, 6.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.58f, 2.22f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.1f, 6.73f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                close()
            }
        }.also { _Users = it}
