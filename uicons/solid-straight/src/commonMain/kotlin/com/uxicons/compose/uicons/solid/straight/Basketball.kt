package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Basketball: ImageVector? = null

val Icons.Ss.Basketball: ImageVector
    get() = _Basketball ?: UXIcon(name = "Basketball") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.25f, 6.33f)
                arcTo(9.22f, 9.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 0.18f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.74f, 2.66f)
                close()
                moveTo(7.75f, 14.83f)
                lineTo(10.59f, 12f)
                lineTo(2.85f, 4.26f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 12f)
                lineTo(0.32f, 12f)
                arcTo(11.58f, 11.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.75f, 14.84f)
                close()
                moveTo(21.16f, 4.26f)
                lineTo(17.67f, 7.75f)
                arcTo(9.53f, 9.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.82f, 10f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.16f, 4.26f)
                close()
                moveTo(14.84f, 7.75f)
                arcTo(11.59f, 11.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 0.32f)
                lineTo(12f, 0f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.26f, 2.85f)
                lineTo(12f, 10.59f)
                close()
                moveTo(23.68f, 12f)
                arcToRelative(11.58f, 11.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.43f, -2.84f)
                lineTo(13.41f, 12f)
                lineToRelative(7.74f, 7.74f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(9.16f, 16.25f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 23.65f)
                lineTo(12f, 24f)
                horizontalLineToRelative(0f)
                arcToRelative(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.74f, -2.85f)
                lineTo(12f, 13.41f)
                close()
                moveTo(7.75f, 17.67f)
                lineTo(4.26f, 21.16f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 23.82f)
                arcTo(9.49f, 9.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.75f, 17.67f)
                close()
                moveTo(0.18f, 14f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.66f, 5.74f)
                lineToRelative(3.49f, -3.49f)
                arcTo(9.45f, 9.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, 14f)
                close()
            }
        }.also { _Basketball = it}
