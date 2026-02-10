package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LifeRing: ImageVector? = null

val Icons.Rr.LifeRing: ImageVector
    get() = _LifeRing ?: UXIcon(name = "LifeRing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.16f, 19.74f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -15.48f)
                lineToRelative(0.86f, -0.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.6f, 1.99f)
                lineToRelative(-0.86f, 0.86f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, -15.48f, 0f)
                lineToRelative(-0.86f, -0.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, 3.4f)
                lineToRelative(0.86f, 0.86f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15.48f)
                lineToRelative(-0.86f, 0.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 3.4f, 22.02f)
                lineToRelative(0.86f, -0.86f)
                arcToRelative(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.48f, 0f)
                lineToRelative(0.86f, 0.86f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.02f, 20.6f)
                close()
                moveTo(22f, 12f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.26f, 6.32f)
                lineToRelative(-3.57f, -3.57f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -5.51f)
                lineToRelative(3.57f, -3.57f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                close()
                moveTo(9f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 3f, 3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                close()
                moveTo(12f, 2f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.32f, 2.26f)
                lineTo(14.75f, 7.83f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.51f, 0f)
                lineTo(5.68f, 4.26f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
                moveTo(2f, 12f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.26f, 5.68f)
                lineTo(7.83f, 9.25f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 5.51f)
                lineTo(4.26f, 18.32f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                close()
                moveTo(12f, 22f)
                arcToRelative(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.32f, -2.26f)
                lineToRelative(3.57f, -3.57f)
                arcToRelative(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.51f, 0f)
                lineToRelative(3.57f, 3.57f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _LifeRing = it}
