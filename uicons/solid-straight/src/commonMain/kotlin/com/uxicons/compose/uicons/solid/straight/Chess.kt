package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Chess: ImageVector? = null

val Icons.Ss.Chess: ImageVector
    get() = _Chess ?: UXIcon(name = "Chess") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 11f)
                verticalLineToRelative(7f)
                lineTo(14f, 18f)
                lineTo(14f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 7f)
                horizontalLineToRelative(2f)
                lineTo(15f, 9f)
                horizontalLineToRelative(2f)
                lineTo(17f, 7f)
                horizontalLineToRelative(2f)
                lineTo(19f, 9f)
                horizontalLineToRelative(2f)
                lineTo(21f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(11.9f, 4.41f)
                lineTo(11.85f, 4.52f)
                lineTo(10.63f, 7f)
                lineTo(11f, 7f)
                lineTo(11f, 9f)
                lineTo(3f, 9f)
                lineTo(3f, 7f)
                horizontalLineToRelative(0.39f)
                lineTo(2.11f, 4.41f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, -2.4f)
                horizontalLineToRelative(2.2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2.2f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.7f, 2.4f)
                close()
                moveTo(14f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 23f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, -3f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                close()
                moveTo(3.79f, 11f)
                arcToRelative(46.29f, 46.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.53f, 7f)
                horizontalLineToRelative(9.47f)
                arcToRelative(46.69f, 46.69f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.53f, -7f)
                close()
                moveTo(21f, 20f)
                lineTo(14.97f, 20f)
                arcTo(4.95f, 4.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 23f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                lineTo(24f, 23f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                close()
            }
        }.also { _Chess = it}
