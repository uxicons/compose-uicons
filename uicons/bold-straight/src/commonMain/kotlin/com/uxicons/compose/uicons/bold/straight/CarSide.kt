package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarSide: ImageVector? = null

val Icons.Bs.CarSide: ImageVector
    get() = _CarSide ?: UXIcon(name = "CarSide") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.21f, -3.49f)
                lineTo(16.25f, 3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.38f, 2f)
                horizontalLineToRelative(-6.5f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.61f, 4.26f)
                lineTo(1.05f, 11f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 13.5f)
                verticalLineTo(19f)
                horizontalLineTo(3.05f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineToRelative(8.1f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 4.9f, 0f)
                horizontalLineTo(24f)
                close()
                moveTo(13.79f, 5.21f)
                lineTo(17.13f, 10f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineToRelative(1.38f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.79f, 5.21f)
                close()
                moveTo(6.88f, 5f)
                horizontalLineTo(9f)
                verticalLineToRelative(5f)
                horizontalLineTo(4.64f)
                lineTo(6.41f, 5.32f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.88f, 5f)
                close()
                moveTo(21f, 16f)
                horizontalLineTo(3f)
                verticalLineTo(13.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                close()
            }
        }.also { _CarSide = it}
