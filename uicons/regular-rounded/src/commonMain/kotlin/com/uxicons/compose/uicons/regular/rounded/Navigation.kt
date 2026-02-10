package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Navigation: ImageVector? = null

val Icons.Rr.Navigation: ImageVector
    get() = _Navigation ?: UXIcon(name = "Navigation") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.99f, 6.11f)
                curveToRelative(-0.04f, 0.01f, -7.23f, 2.86f, -7.23f, 2.86f)
                arcToRelative(2.76f, 2.76f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.2f, 5.21f)
                lineToRelative(2.35f, 0.59f)
                lineToRelative(0.77f, 2.52f)
                arcTo(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.62f, 19f)
                horizontalLineToRelative(0.04f)
                arcToRelative(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.53f, -1.79f)
                reflectiveCurveToRelative(2.69f, -7.17f, 2.7f, -7.2f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.91f, -3.91f)
                close()
                moveTo(15.97f, 9.47f)
                lineTo(13.32f, 16.51f)
                arcToRelative(0.74f, 0.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 0.49f)
                curveToRelative(-0.1f, -0.01f, -0.53f, -0.03f, -0.68f, -0.38f)
                lineToRelative(-0.91f, -2.98f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, -0.68f)
                lineToRelative(-2.82f, -0.7f)
                arcToRelative(0.76f, 0.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.03f, -1.43f)
                lineToRelative(7.06f, -2.8f)
                arcToRelative(1.15f, 1.15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.09f, 0.32f)
                arcTo(1.19f, 1.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.97f, 9.47f)
                close()
                moveTo(12f, 0f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = true, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                close()
            }
        }.also { _Navigation = it}
