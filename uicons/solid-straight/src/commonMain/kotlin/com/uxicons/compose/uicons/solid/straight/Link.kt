package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Link: ImageVector? = null

val Icons.Ss.Link: ImageVector
    get() = _Link ?: UXIcon(name = "Link") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.03f, 24f)
                arcToRelative(7.02f, 7.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.97f, -11.99f)
                lineTo(6.32f, 7.74f)
                lineTo(7.73f, 9.15f)
                lineTo(3.47f, 13.42f)
                arcToRelative(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.11f, 7.11f)
                lineToRelative(4.26f, -4.26f)
                lineToRelative(1.41f, 1.41f)
                lineTo(12f, 21.94f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.03f, 24f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.68f, 16.26f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.26f, -4.26f)
                arcTo(5.03f, 5.03f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.97f, 2f)
                horizontalLineToRelative(0f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.55f, 1.47f)
                lineTo(9.15f, 7.74f)
                lineTo(7.74f, 6.32f)
                lineToRelative(4.26f, -4.26f)
                arcTo(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.97f, 0f)
                horizontalLineToRelative(0f)
                arcToRelative(7.03f, 7.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.97f, 12f)
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
