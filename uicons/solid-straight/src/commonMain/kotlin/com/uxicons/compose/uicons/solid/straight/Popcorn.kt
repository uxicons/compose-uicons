package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Popcorn: ImageVector? = null

val Icons.Ss.Popcorn: ImageVector
    get() = _Popcorn ?: UXIcon(name = "Popcorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.82f, 14f)
                lineToRelative(-2f, 10f)
                horizontalLineToRelative(-3.7f)
                lineTo(17f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
                moveTo(7f, 16f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(2.18f, 14f)
                lineToRelative(2f, 10f)
                horizontalLineToRelative(3.7f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(0.02f)
                arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.91f, 12f)
                lineTo(19f, 12f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.29f, 1.73f)
                arcToRelative(4.83f, 4.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.41f, 0f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 12f)
                lineTo(2.09f, 12f)
                arcTo(2.06f, 2.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 10.02f)
                lineTo(0f, 10f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.03f, 6.53f)
                arcTo(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.31f, 3.06f)
                arcToRelative(3.46f, 3.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.7f, -2.02f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.66f, 2f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.39f, 1.11f)
                arcTo(3.85f, 3.85f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 3f)
                arcToRelative(4.01f, 4.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.97f, 3.53f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 10f)
                close()
                moveTo(10f, 5f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                lineTo(8f, 9f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, -2f)
                close()
                moveTo(18f, 10f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, -4f)
                lineTo(14f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 2f)
                close()
                moveTo(12f, 14f)
                arcToRelative(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.9f, 2.87f)
                lineTo(9.9f, 24f)
                horizontalLineToRelative(4.21f)
                lineToRelative(0.79f, -7.13f)
                arcTo(2.9f, 2.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 14f)
                close()
            }
        }.also { _Popcorn = it}
