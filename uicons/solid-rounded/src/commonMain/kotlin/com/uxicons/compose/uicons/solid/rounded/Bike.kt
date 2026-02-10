package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bike: ImageVector? = null

val Icons.Sr.Bike: ImageVector
    get() = _Bike ?: UXIcon(name = "Bike") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.78f, 12.08f)
                curveToRelative(-0.16f, -0.59f, -0.35f, -1.21f, -0.56f, -1.87f)
                arcTo(23.04f, 23.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                arcToRelative(10.64f, 10.64f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.32f, 2.26f)
                lineTo(11.52f, 11f)
                lineTo(5.97f, 7f)
                horizontalLineTo(9f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                horizontalLineTo(5.97f)
                arcTo(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.81f, 8.56f)
                lineTo(9.88f, 12.27f)
                lineTo(8.44f, 13.39f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.15f, 1.64f)
                lineToRelative(7.29f, -5.67f)
                curveToRelative(0.14f, 0.48f, 0.73f, 2.38f, 0.86f, 2.82f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.05f, -0.1f)
                close()
            }
        }.also { _Bike = it}
