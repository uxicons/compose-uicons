package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleWhole: ImageVector? = null

val Icons.Rr.AppleWhole: ImageVector
    get() = _AppleWhole ?: UXIcon(name = "AppleWhole") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.25f, 6.19f)
                verticalLineToRelative(0f)
                arcToRelative(6.74f, 6.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.74f, -3.94f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.75f, 0.02f)
                arcTo(6.32f, 6.32f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.13f, 2.6f)
                arcTo(8.16f, 8.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.71f, 0.27f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.43f, 1.4f)
                arcTo(7.58f, 7.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.94f, 6f)
                horizontalLineTo(8.5f)
                arcTo(8.77f, 8.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 15f)
                curveToRelative(-0.16f, 5.6f, 5.64f, 10.77f, 10.75f, 8.38f)
                arcToRelative(2.4f, 2.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.6f, 0.02f)
                arcTo(4.44f, 4.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 24f)
                curveTo(25.76f, 23.72f, 27.07f, 8.58f, 17.25f, 6.19f)
                close()
                moveTo(14.22f, 3.17f)
                arcTo(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 2f)
                verticalLineToRelative(0f)
                arcToRelative(4.8f, 4.8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.17f, 2.77f)
                arcToRelative(4.79f, 4.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.78f, 1.17f)
                arcTo(4.79f, 4.79f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.22f, 3.17f)
                close()
                moveTo(15.5f, 22f)
                arcToRelative(2.54f, 2.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.24f, -0.38f)
                arcTo(4.62f, 4.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
                arcToRelative(4.53f, 4.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.14f, 0.59f)
                curveTo(6.0f, 23.26f, 1.9f, 19.14f, 2f, 15f)
                arcTo(6.77f, 6.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 8f)
                horizontalLineToRelative(7f)
                curveTo(24.1f, 8.32f, 24.1f, 21.68f, 15.5f, 22f)
                close()
            }
        }.also { _AppleWhole = it}
