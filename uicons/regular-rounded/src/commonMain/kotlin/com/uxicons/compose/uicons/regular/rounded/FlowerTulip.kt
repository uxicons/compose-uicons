package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlowerTulip: ImageVector? = null

val Icons.Rr.FlowerTulip: ImageVector
    get() = _FlowerTulip ?: UXIcon(name = "FlowerTulip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.54f, 14.72f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, -0.72f)
                arcTo(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 18.99f)
                lineTo(13f, 13.91f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                curveToRelative(0f, -2.79f, -1.94f, -5.15f, -3.84f, -7.09f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.31f, 0f)
                curveTo(7.94f, 2.85f, 6f, 5.21f, 6f, 8f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.91f)
                verticalLineToRelative(5.08f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.81f, -4.98f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, 0.72f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.39f, 1.79f)
                curveTo(2.11f, 23.86f, 11.59f, 24f, 11.99f, 24f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.4f, 0f, 9.88f, -0.14f, 11.92f, -7.48f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.54f, 14.72f)
                close()
                moveTo(8f, 8f)
                curveToRelative(0f, -2.65f, 3.32f, -5.72f, 3.34f, -5.74f)
                curveTo(10.97f, 3.2f, 8.69f, 8.9f, 11f, 9f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                arcToRelative(13.47f, 13.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.26f, -5.14f)
                curveTo(14.69f, 4.39f, 16f, 6.15f, 16f, 8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
                close()
                moveTo(2.01f, 16f)
                arcToRelative(10.27f, 10.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.46f, 5.86f)
                curveTo(7.97f, 21.52f, 3.2f, 20.3f, 2.01f, 16f)
                close()
                moveTo(13.54f, 21.86f)
                arcTo(10.38f, 10.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 15.98f)
                curveTo(20.81f, 20.28f, 16.05f, 21.51f, 13.54f, 21.86f)
                close()
            }
        }.also { _FlowerTulip = it}
