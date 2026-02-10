package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListCheck: ImageVector? = null

val Icons.Rs.ListCheck: ImageVector
    get() = _ListCheck ?: UXIcon(name = "ListCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.88f, 5.12f)
                lineToRelative(-1.58f, -1.58f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.59f, 1.58f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.59f, 3.58f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.24f, 0f)
                close()
                moveTo(12f, 5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(4f, 14f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.59f, 3.58f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.58f, 1.58f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 0.88f)
                close()
                moveTo(12f, 13f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                close()
                moveTo(4f, 22f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.88f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.59f, 3.58f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.58f, 1.58f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 0.88f)
                close()
                moveTo(12f, 21f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                close()
            }
        }.also { _ListCheck = it}
