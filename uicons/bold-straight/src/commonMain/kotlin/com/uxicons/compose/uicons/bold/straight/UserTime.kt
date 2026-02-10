package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTime: ImageVector? = null

val Icons.Bs.UserTime: ImageVector
    get() = _UserTime ?: UXIcon(name = "UserTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.5f, 11f)
                arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.5f, -5.5f)
                arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 5.5f)
                close()
                moveTo(8.5f, 3f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.5f, 2.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, -2.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 10f)
                arcToRelative(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.74f, 3f)
                horizontalLineToRelative(-6.26f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(5.08f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.92f, -6f)
                close()
                moveTo(18.44f, 21.06f)
                lineTo(15f, 17.62f)
                verticalLineToRelative(-4.62f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.38f)
                lineToRelative(2.56f, 2.56f)
                close()
            }
        }.also { _UserTime = it}
