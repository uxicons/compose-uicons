package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarBus: ImageVector? = null

val Icons.Sr.CarBus: ImageVector
    get() = _CarBus ?: UXIcon(name = "CarBus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.83f, 9f)
                arcToRelative(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.62f, 3.08f)
                lineToRelative(0.32f, 0.77f)
                arcToRelative(16.16f, 16.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, 2.15f)
                lineTo(8.53f, 15f)
                arcToRelative(16.03f, 16.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.7f, -2.15f)
                lineToRelative(0.32f, -0.77f)
                arcTo(4.99f, 4.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.17f, 9f)
                close()
                moveTo(23.86f, 17f)
                lineTo(21f, 17f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(19f, 17f)
                lineTo(13f, 17f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                lineTo(11f, 17f)
                lineTo(8.14f, 17f)
                curveToRelative(-0.35f, 1.82f, -0.18f, 4.17f, 1.86f, 4.82f)
                lineTo(10f, 22f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                verticalLineToRelative(-0.18f)
                curveTo(24.04f, 21.17f, 24.21f, 18.82f, 23.86f, 17f)
                close()
                moveTo(13.67f, 0.5f)
                arcTo(13.74f, 13.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.33f, 0.5f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.15f, 5f)
                horizontalLineToRelative(15.7f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.67f, 0.5f)
                close()
                moveTo(2f, 16f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.82f)
                lineTo(4f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(6f, 19f)
                arcToRelative(17.22f, 17.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.12f, -2f)
                lineToRelative(0.47f, -2.5f)
                curveToRelative(0.04f, -0.17f, 0.09f, -0.34f, 0.14f, -0.5f)
                lineTo(2f, 14f)
                close()
                moveTo(14.17f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                lineTo(7.42f, 12f)
                lineToRelative(0.29f, -0.69f)
                arcTo(6.98f, 6.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.17f, 7f)
                close()
            }
        }.also { _CarBus = it}
