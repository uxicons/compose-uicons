package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Entertainment: ImageVector? = null

val Icons.Ss.Entertainment: ImageVector
    get() = _Entertainment ?: UXIcon(name = "Entertainment") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = true, isPositiveArc = false, -6f, 6f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, -6f)
                close()
                moveTo(12f, 16f)
                lineTo(9f, 12f)
                lineTo(12f, 8f)
                lineTo(15f, 12f)
                close()
                moveTo(16.39f, 0.84f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.77f, 6.77f)
                lineToRelative(-3.85f, 1.15f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.07f, -4.07f)
                close()
                moveTo(9.52f, 0.26f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.96f, 0f)
                lineToRelative(-1.16f, 3.86f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.64f, 0f)
                close()
                moveTo(19.88f, 13.32f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.64f)
                lineToRelative(3.86f, -1.16f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 4.96f)
                close()
                moveTo(4.12f, 13.32f)
                lineTo(0.26f, 14.48f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -4.96f)
                lineToRelative(3.86f, 1.16f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.64f)
                close()
                moveTo(14.48f, 23.74f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.96f, 0f)
                lineToRelative(1.16f, -3.86f)
                arcToRelative(7.44f, 7.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.64f, 0f)
                close()
                moveTo(23.16f, 16.39f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.77f, 6.77f)
                lineToRelative(-1.15f, -3.85f)
                arcToRelative(8.05f, 8.05f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.07f, -4.07f)
                close()
                moveTo(0.84f, 7.61f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.76f, -6.77f)
                lineToRelative(1.15f, 3.85f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.07f, 4.07f)
                close()
                moveTo(7.61f, 23.16f)
                arcToRelative(12.05f, 12.05f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.76f, -6.77f)
                lineToRelative(3.85f, -1.15f)
                arcToRelative(8.04f, 8.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.07f, 4.07f)
                close()
            }
        }.also { _Entertainment = it}
