package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GarageCar: ImageVector? = null

val Icons.Sr.GarageCar: ImageVector
    get() = _GarageCar ?: UXIcon(name = "GarageCar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.9f, 16.09f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.04f, 14f)
                horizontalLineTo(10.96f)
                arcTo(2.99f, 2.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.1f, 16.09f)
                lineToRelative(-0.67f, 2.12f)
                curveTo(7.21f, 19.31f, 6.26f, 21.81f, 8f, 22f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                verticalLineTo(22f)
                curveToRelative(1.74f, -0.19f, 0.8f, -2.69f, 0.57f, -3.79f)
                close()
                moveTo(10.96f, 16f)
                horizontalLineToRelative(2.07f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.95f, 0.7f)
                lineTo(14.4f, 18f)
                horizontalLineTo(9.6f)
                lineToRelative(0.41f, -1.3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.96f, 16f)
                close()
                moveTo(24f, 9.76f)
                verticalLineToRelative(9.37f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.75f, 4.84f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 22.99f)
                verticalLineTo(13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(9.99f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.25f, 0.97f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 19.13f)
                verticalLineTo(9.76f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.2f, 5.62f)
                lineTo(9.2f, 0.89f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.59f, 0f)
                lineToRelative(7f, 4.72f)
                arcTo(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 9.76f)
                close()
            }
        }.also { _GarageCar = it}
