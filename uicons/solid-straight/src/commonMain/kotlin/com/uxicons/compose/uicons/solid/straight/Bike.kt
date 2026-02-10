package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bike: ImageVector? = null

val Icons.Ss.Bike: ImageVector
    get() = _Bike ?: UXIcon(name = "Bike") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.79f, 12.08f)
                curveToRelative(-0.77f, -2.87f, -1.92f, -6.01f, -2.5f, -7.53f)
                arcToRelative(14.62f, 14.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.5f, -0.52f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.81f, 0.17f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.4f, 0.81f)
                horizontalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.18f, -2.4f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.28f, 2.1f)
                arcToRelative(21.2f, 21.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.69f, 0.99f)
                lineToRelative(-0.87f, 0.39f)
                lineToRelative(0.35f, 0.89f)
                curveToRelative(0.01f, 0.02f, 0.51f, 1.27f, 1.12f, 2.99f)
                lineTo(12.02f, 10.61f)
                lineTo(8.41f, 7f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(4f)
                verticalLineTo(7f)
                horizontalLineTo(5.59f)
                lineToRelative(4.84f, 4.84f)
                lineTo(8.44f, 13.39f)
                arcToRelative(4.95f, 4.95f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.15f, 1.64f)
                lineTo(16.88f, 9.36f)
                curveToRelative(0.3f, 0.92f, 0.6f, 1.88f, 0.87f, 2.82f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 2.04f, -0.1f)
                close()
            }
        }.also { _Bike = it}
