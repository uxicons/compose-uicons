package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Rr.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.85f, 17.27f)
                lineToRelative(-3.26f, 3.26f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.47f, 13.42f)
                lineToRelative(3.26f, -3.27f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.32f, 8.74f)
                lineTo(2.06f, 12.01f)
                arcTo(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21.94f)
                lineToRelative(3.26f, -3.26f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.94f, 2.06f)
                arcTo(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.98f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.97f, 2.06f)
                lineTo(8.74f, 5.32f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 1.42f)
                lineToRelative(3.27f, -3.26f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.97f, 2f)
                horizontalLineToRelative(0f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.55f, 8.58f)
                lineToRelative(-3.26f, 3.26f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 18.68f, 15.26f)
                lineTo(21.94f, 12f)
                arcTo(7.04f, 7.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.94f, 2.06f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.29f, 8.29f)
                lineToRelative(-6f, 6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.41f, 1.41f)
                lineToRelative(6f, -6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.41f, -1.41f)
                close()
            }
        }.also { _Link = it}
