package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _KissWinkHeart: ImageVector? = null

val Icons.Bs.KissWinkHeart: ImageVector
    get() = _KissWinkHeart ?: UXIcon(name = "KissWinkHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.31f, 20.36f)
                arcTo(14.75f, 14.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.4f, 23.15f)
                curveTo(8.8f, 26.35f, -0.17f, 20.29f, 0f, 12f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 23.37f, 3.8f)
                arcToRelative(3.79f, 3.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.42f, -0.19f)
                arcToRelative(3.82f, 3.82f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.3f, -1.13f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.33f, 5.89f)
                close()
                moveTo(18f, 9.67f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                lineTo(13f, 11f)
                horizontalLineToRelative(5f)
                close()
                moveTo(11f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                close()
                moveTo(22.94f, 17.78f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.42f, 0.92f)
                arcToRelative(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.89f, -2.52f)
                arcToRelative(1.8f, 1.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.42f, 0.92f)
                curveTo(16.31f, 19.11f, 18.6f, 23f, 18.6f, 23f)
                reflectiveCurveToRelative(4.34f, -0.7f, 5.23f, -2.7f)
                arcTo(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22.94f, 17.78f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 12f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
                horizontalLineTo(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1f)
                horizontalLineTo(11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                arcToRelative(2.51f, 2.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, -4f)
                arcTo(2.47f, 2.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 14.5f)
                close()
            }
        }.also { _KissWinkHeart = it}
