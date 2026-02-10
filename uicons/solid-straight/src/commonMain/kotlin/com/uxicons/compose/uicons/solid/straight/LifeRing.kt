package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LifeRing: ImageVector? = null

val Icons.Ss.LifeRing: ImageVector
    get() = _LifeRing ?: UXIcon(name = "LifeRing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.24f, 7.83f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.51f, 0f)
                lineToRelative(4.99f, -4.99f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.49f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.16f, 4.26f)
                lineTo(16.17f, 9.24f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.51f)
                lineToRelative(4.99f, 4.99f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.49f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.76f, 16.17f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.51f, 0f)
                lineTo(4.26f, 21.16f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.49f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.83f, 14.76f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -5.51f)
                lineTo(2.84f, 4.26f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.49f)
                close()
            }
        }.also { _LifeRing = it}
