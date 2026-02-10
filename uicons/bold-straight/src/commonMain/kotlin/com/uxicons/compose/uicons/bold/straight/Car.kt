package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Car: ImageVector? = null

val Icons.Bs.Car: ImageVector
    get() = _Car ?: UXIcon(name = "Car") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.39f, 3.3f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.1f, 1f)
                horizontalLineTo(6.9f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.63f, 3.26f)
                lineTo(1.47f, 8.7f)
                arcTo(24.29f, 24.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 17.03f)
                verticalLineTo(20f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineTo(20f)
                horizontalLineToRelative(3f)
                verticalLineTo(17.03f)
                arcToRelative(24.35f, 24.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.48f, -8.38f)
                close()
                moveTo(17f, 15.5f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 14f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 15.5f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 17f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15.5f)
                close()
                moveTo(4.27f, 9.77f)
                lineTo(6.43f, 4.33f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.9f, 4f)
                horizontalLineTo(17.1f)
                arcToRelative(0.52f, 0.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.48f, 0.37f)
                lineToRelative(2.13f, 5.35f)
                curveToRelative(0.15f, 0.42f, 0.28f, 0.85f, 0.41f, 1.28f)
                horizontalLineTo(3.88f)
                curveTo(4f, 10.58f, 4.12f, 10.17f, 4.27f, 9.77f)
                close()
                moveTo(5.5f, 17f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 15.5f)
                horizontalLineTo(4f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 14f)
                horizontalLineToRelative(0f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15.5f)
                horizontalLineTo(7f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 17f)
                close()
            }
        }.also { _Car = it}
