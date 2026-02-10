package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Rs.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.58f, 20.53f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.47f, 13.42f)
                lineTo(7.73f, 9.15f)
                lineTo(6.32f, 7.74f)
                lineTo(2.06f, 12.01f)
                arcTo(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21.94f)
                lineToRelative(4.26f, -4.26f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.94f, 2.06f)
                arcTo(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.98f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.97f, 2.06f)
                lineTo(7.74f, 6.32f)
                lineTo(9.15f, 7.74f)
                lineToRelative(4.26f, -4.26f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.97f, 2f)
                horizontalLineToRelative(0f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.55f, 8.58f)
                lineToRelative(-4.26f, 4.26f)
                lineTo(17.68f, 16.26f)
                lineTo(21.94f, 12f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.94f, 2.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.74f, 14.85f)
                lineToRelative(7.1f, -7.1f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-7.1f, 7.1f)
                close()
            }
        }.also { _Link = it}
