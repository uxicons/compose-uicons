package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LifeRing: ImageVector? = null

val Icons.Bs.LifeRing: ImageVector
    get() = _LifeRing ?: UXIcon(name = "LifeRing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcToRelative(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.53f, -7.35f)
                lineToRelative(1.59f, -1.59f)
                lineTo(20.94f, 0.94f)
                lineTo(19.35f, 2.53f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, -14.69f, 0f)
                lineTo(3.06f, 0.94f)
                lineTo(0.94f, 3.06f)
                lineTo(2.53f, 4.65f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 14.69f)
                lineTo(0.94f, 20.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.59f, -1.59f)
                arcToRelative(11.92f, 11.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 14.69f, 0f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.59f, -1.59f)
                arcTo(11.93f, 11.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(21f, 12f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.67f, 5.21f)
                lineTo(16.65f, 14.53f)
                arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.06f)
                lineToRelative(2.68f, -2.68f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 12f)
                close()
                moveTo(9.68f, 12f)
                arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 14.32f)
                arcTo(2.32f, 2.32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.68f, 12f)
                close()
                moveTo(12f, 3f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.21f, 1.67f)
                lineTo(14.53f, 7.35f)
                arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.06f, 0f)
                lineTo(6.79f, 4.67f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
                close()
                moveTo(3f, 12f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.67f, 6.79f)
                lineTo(7.35f, 9.47f)
                arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.06f)
                lineTo(4.67f, 17.21f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 12f)
                close()
                moveTo(12f, 21f)
                arcToRelative(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.21f, -1.67f)
                lineTo(9.47f, 16.65f)
                arcToRelative(5.12f, 5.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.06f, 0f)
                lineToRelative(2.68f, 2.68f)
                arcTo(8.94f, 8.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 21f)
                close()
            }
        }.also { _LifeRing = it}
