package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlowerTulip: ImageVector? = null

val Icons.Rs.FlowerTulip: ImageVector
    get() = _FlowerTulip ?: UXIcon(name = "FlowerTulip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.87f, 14f)
                arcTo(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.78f)
                verticalLineTo(13.92f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                curveToRelative(0f, -2.8f, -1.94f, -5.16f, -3.84f, -7.1f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.31f, 0f)
                curveTo(7.94f, 2.84f, 6f, 5.2f, 6f, 8f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.92f)
                verticalLineToRelative(4.86f)
                arcTo(11.62f, 11.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.13f, 14f)
                horizontalLineTo(0f)
                lineToRelative(0.14f, 1.13f)
                curveToRelative(0.79f, 6.31f, 6.72f, 8.45f, 10.61f, 8.82f)
                arcToRelative(16.45f, 16.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.49f, 0f)
                curveToRelative(3.9f, -0.37f, 9.82f, -2.52f, 10.61f, -8.82f)
                lineTo(24f, 14f)
                close()
                moveTo(2.36f, 16.06f)
                arcToRelative(9.62f, 9.62f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.19f, 5.84f)
                curveTo(8.16f, 21.59f, 3.58f, 20.43f, 2.36f, 16.06f)
                close()
                moveTo(8f, 8f)
                curveToRelative(0f, -2.08f, 1.81f, -4.18f, 3.43f, -5.83f)
                arcTo(21.4f, 21.4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 9f)
                horizontalLineToRelative(2f)
                arcToRelative(19.48f, 19.48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.29f, -6.11f)
                curveTo(14.71f, 4.41f, 16f, 6.16f, 16f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = true, isPositiveArc = true, 8f, 8f)
                close()
                moveTo(13.45f, 21.9f)
                arcToRelative(9.63f, 9.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.19f, -5.84f)
                curveTo(20.41f, 20.43f, 15.84f, 21.59f, 13.45f, 21.9f)
                close()
            }
        }.also { _FlowerTulip = it}
