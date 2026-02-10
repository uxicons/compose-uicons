package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Navigation: ImageVector? = null

val Icons.Sr.Navigation: ImageVector
    get() = _Navigation ?: UXIcon(name = "Navigation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.64f, 8.35f)
                arcToRelative(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.33f, 1.12f)
                lineTo(13.32f, 16.51f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 0.49f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.68f, -0.38f)
                lineToRelative(-0.91f, -2.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, -0.68f)
                lineToRelative(-2.82f, -0.7f)
                arcToRelative(0.76f, 0.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, -1.43f)
                lineToRelative(7.06f, -2.8f)
                arcTo(1.16f, 1.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.64f, 8.35f)
                close()
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(17.05f, 6.93f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.07f, -0.82f)
                curveToRelative(-0.04f, 0.01f, -7.23f, 2.86f, -7.23f, 2.86f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.2f, 5.21f)
                lineToRelative(2.35f, 0.59f)
                lineToRelative(0.77f, 2.52f)
                arcTo(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.62f, 19f)
                horizontalLineToRelative(0.04f)
                arcToRelative(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.53f, -1.79f)
                reflectiveCurveToRelative(2.69f, -7.17f, 2.7f, -7.2f)
                arcTo(3.18f, 3.18f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.05f, 6.93f)
                close()
            }
        }.also { _Navigation = it}
