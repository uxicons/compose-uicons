package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ListCheck: ImageVector? = null

val Icons.Bs.ListCheck: ImageVector
    get() = _ListCheck ?: UXIcon(name = "ListCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 7f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.48f, -1.02f)
                lineToRelative(-1.59f, -1.58f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.58f, 1.58f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0f)
                lineToRelative(3.59f, -3.58f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-3.59f, 3.59f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.48f, 1.02f)
                close()
                moveTo(24f, 2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                close()
                moveTo(6.47f, 13.97f)
                lineTo(10.06f, 10.39f)
                lineTo(7.94f, 8.27f)
                lineTo(4.35f, 11.85f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineToRelative(-1.58f, -1.59f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.59f, 1.58f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                close()
                moveTo(24f, 10f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                close()
                moveTo(6.47f, 21.98f)
                lineTo(10.06f, 18.39f)
                lineTo(7.94f, 16.27f)
                lineTo(4.35f, 19.85f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineToRelative(-1.58f, -1.59f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.59f, 1.58f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                close()
                moveTo(24f, 18f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                close()
            }
        }.also { _ListCheck = it}
