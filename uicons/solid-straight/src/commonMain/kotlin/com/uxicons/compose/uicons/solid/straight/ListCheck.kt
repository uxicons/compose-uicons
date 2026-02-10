package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListCheck: ImageVector? = null

val Icons.Ss.ListCheck: ImageVector
    get() = _ListCheck ?: UXIcon(name = "ListCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 6f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, -0.88f)
                lineToRelative(-1.58f, -1.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.59f, 1.58f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.59f, 3.58f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 0.88f)
                close()
                moveTo(24f, 3f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                close()
                moveTo(6.12f, 13.12f)
                lineTo(9.71f, 9.54f)
                lineTo(8.29f, 8.12f)
                lineTo(4.71f, 11.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.58f, 1.58f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                close()
                moveTo(24f, 11f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                close()
                moveTo(6.12f, 21.12f)
                lineTo(9.71f, 17.54f)
                lineTo(8.29f, 16.12f)
                lineTo(4.71f, 19.71f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.58f, 1.58f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                close()
                moveTo(24f, 19f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _ListCheck = it}
