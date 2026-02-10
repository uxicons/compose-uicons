package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteUser: ImageVector? = null

val Icons.Bs.DeleteUser: ImageVector
    get() = _DeleteUser ?: UXIcon(name = "DeleteUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.12f, 11f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(-1.94f, 1.94f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(-1.94f, -1.94f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.94f, 1.94f)
                lineToRelative(1.94f, -1.94f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(2f, 6f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                close()
                moveTo(5f, 6f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3f, -3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                close()
                moveTo(11f, 14f)
                horizontalLineToRelative(-6f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                horizontalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, -5f)
                close()
            }
        }.also { _DeleteUser = it}
