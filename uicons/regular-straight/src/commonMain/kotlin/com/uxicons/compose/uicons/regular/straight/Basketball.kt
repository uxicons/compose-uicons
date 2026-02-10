package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Basketball: ImageVector? = null

val Icons.Rs.Basketball: ImageVector
    get() = _Basketball ?: UXIcon(name = "Basketball") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 12f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -12f, -12f)
                close()
                moveTo(15.25f, 7.33f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, -5.28f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.27f, 2.2f)
                close()
                moveTo(13.84f, 8.75f)
                lineTo(12f, 10.59f)
                lineTo(5.68f, 4.26f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.38f, -2.21f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.78f, 6.7f)
                close()
                moveTo(10.59f, 12f)
                lineTo(8.75f, 13.84f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.7f, -2.78f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.21f, -5.38f)
                close()
                moveTo(7.33f, 15.25f)
                lineTo(4.26f, 18.32f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.2f, -5.27f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.27f, 2.2f)
                close()
                moveTo(8.75f, 16.67f)
                arcToRelative(9.93f, 9.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 5.28f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.27f, -2.21f)
                close()
                moveTo(10.16f, 15.25f)
                lineTo(12f, 13.41f)
                lineTo(18.32f, 19.74f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.38f, 2.21f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.78f, -6.7f)
                close()
                moveTo(13.41f, 12f)
                lineTo(15.25f, 10.16f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.7f, 2.78f)
                arcToRelative(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.21f, 5.38f)
                close()
                moveTo(16.67f, 8.75f)
                lineTo(19.74f, 5.68f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.21f, 5.27f)
                arcToRelative(9.94f, 9.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.28f, -2.2f)
                close()
            }
        }.also { _Basketball = it}
