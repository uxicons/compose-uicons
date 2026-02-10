package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppsSort: ImageVector? = null

val Icons.Rs.AppsSort: ImageVector
    get() = _AppsSort ?: UXIcon(name = "AppsSort") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 3f)
                verticalLineToRelative(8f)
                horizontalLineTo(11f)
                verticalLineTo(0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                close()
                moveTo(9f, 9f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 21f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                horizontalLineToRelative(8f)
                lineTo(11f, 13f)
                lineTo(0f, 13f)
                close()
                moveTo(2f, 15f)
                lineTo(9f, 15f)
                verticalLineToRelative(7f)
                lineTo(3f, 22f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 21.42f)
                verticalLineTo(2.59f)
                lineToRelative(2.58f, 2.58f)
                lineTo(24f, 3.75f)
                lineTo(21.12f, 0.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, 0f)
                lineToRelative(-2.88f, 2.87f)
                lineTo(15.42f, 5.16f)
                lineTo(18f, 2.58f)
                verticalLineTo(21.42f)
                lineToRelative(-2.58f, -2.58f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(2.88f, 2.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(24f, 20.25f)
                lineToRelative(-1.41f, -1.42f)
                close()
            }
        }.also { _AppsSort = it}
