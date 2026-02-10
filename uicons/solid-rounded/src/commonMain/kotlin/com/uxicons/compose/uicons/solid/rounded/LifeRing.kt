package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LifeRing: ImageVector? = null

val Icons.Sr.LifeRing: ImageVector
    get() = _LifeRing ?: UXIcon(name = "LifeRing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 12f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.83f, -2.75f)
                lineTo(2.85f, 4.26f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.48f)
                lineToRelative(4.99f, -4.99f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.16f, 4.26f)
                lineTo(16.17f, 9.25f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5.51f)
                lineToRelative(4.99f, 4.99f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 17f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.75f, -0.83f)
                lineTo(4.26f, 21.16f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.48f, 0f)
                lineToRelative(-4.99f, -4.99f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 17f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 7f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.75f, 0.83f)
                lineToRelative(4.99f, -4.99f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.48f, 0f)
                lineTo(9.25f, 7.83f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                close()
            }
        }.also { _LifeRing = it}
