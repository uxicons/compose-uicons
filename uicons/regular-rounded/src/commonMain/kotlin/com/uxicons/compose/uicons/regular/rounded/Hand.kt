package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hand: ImageVector? = null

val Icons.Rr.Hand: ImageVector
    get() = _Hand ?: UXIcon(name = "Hand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.95f, 12.3f)
                lineToRelative(-0.7f, -5f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.3f, 3f)
                lineTo(5f, 3f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8f)
                verticalLineToRelative(5f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5f)
                lineTo(7.71f, 18f)
                lineToRelative(1.91f, 3.88f)
                arcToRelative(3.04f, 3.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.72f, -1.84f)
                lineTo(15.01f, 18f)
                lineTo(19f, 18f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, -5.7f)
                close()
                moveTo(5f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 16f)
                lineTo(5f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                lineTo(2f, 8f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                close()
                moveTo(21.26f, 14.97f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 16f)
                lineTo(13.83f, 16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.99f, 1.16f)
                lineToRelative(0.53f, 3.2f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.23f, 0.84f)
                arcToRelative(1.07f, 1.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.72f, -0.21f)
                lineTo(9.23f, 16.56f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 16.27f)
                lineTo(9f, 5f)
                horizontalLineToRelative(9.3f)
                arcToRelative(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.97f, 2.58f)
                lineToRelative(0.71f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.26f, 14.97f)
                close()
            }
        }.also { _Hand = it}
