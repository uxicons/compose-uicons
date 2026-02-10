package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Plane: ImageVector? = null

val Icons.Sr.Plane: ImageVector
    get() = _Plane ?: UXIcon(name = "Plane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 16f)
                horizontalLineTo(17.46f)
                lineToRelative(-4.23f, 6.49f)
                arcTo(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.63f, 24f)
                arcToRelative(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.46f, -3.55f)
                lineTo(10.02f, 16f)
                horizontalLineTo(6f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.47f, -2.02f)
                lineTo(0.2f, 10.16f)
                arcToRelative(1.44f, 1.44f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.53f, -2f)
                arcToRelative(1.41f, 1.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.65f, 0.25f)
                lineTo(3.79f, 9.83f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.62f, 11f)
                horizontalLineTo(21.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 13.5f)
                close()
                moveTo(17.73f, 9f)
                lineToRelative(-4.5f, -7.49f)
                arcTo(2.97f, 2.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.63f, 0f)
                arcTo(2.63f, 2.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.17f, 3.55f)
                lineTo(10.29f, 9f)
                close()
            }
        }.also { _Plane = it}
