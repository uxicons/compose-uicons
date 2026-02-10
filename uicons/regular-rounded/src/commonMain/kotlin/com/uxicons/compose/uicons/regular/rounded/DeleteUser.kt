package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DeleteUser: ImageVector? = null

val Icons.Rr.DeleteUser: ImageVector
    get() = _DeleteUser ?: UXIcon(name = "DeleteUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, -6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 6f)
                close()
                moveTo(9f, 2f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, -4f, 4f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, -4f)
                close()
                moveTo(18f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 0f)
                close()
                moveTo(23.71f, 14.29f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.79f, -1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.41f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                close()
            }
        }.also { _DeleteUser = it}
