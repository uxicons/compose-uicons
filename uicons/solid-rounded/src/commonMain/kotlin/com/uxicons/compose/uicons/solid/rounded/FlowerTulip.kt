package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlowerTulip: ImageVector? = null

val Icons.Sr.FlowerTulip: ImageVector
    get() = _FlowerTulip ?: UXIcon(name = "FlowerTulip") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.54f, 14.72f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, -0.72f)
                arcTo(10.42f, 10.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 19.95f)
                verticalLineTo(13.92f)
                arcTo(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8f)
                curveToRelative(0f, -2.79f, -1.94f, -5.15f, -3.84f, -7.09f)
                arcTo(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.8f, 0.6f)
                arcTo(16.95f, 16.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 7.97f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2f, 0.07f)
                arcToRelative(18.57f, 18.57f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.85f, -8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0.87f)
                curveTo(7.94f, 2.85f, 6f, 5.21f, 6f, 8f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 5.92f)
                verticalLineToRelative(6.04f)
                arcToRelative(10.42f, 10.42f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.81f, -5.94f)
                arcToRelative(1.99f, 1.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.73f, 0.72f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.39f, 1.79f)
                curveTo(2.11f, 23.86f, 11.59f, 24f, 11.99f, 24f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.4f, 0f, 9.88f, -0.14f, 11.92f, -7.48f)
                arcTo(1.98f, 1.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.54f, 14.72f)
                close()
            }
        }.also { _FlowerTulip = it}
