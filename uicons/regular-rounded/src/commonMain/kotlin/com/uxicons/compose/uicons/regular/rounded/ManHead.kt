package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ManHead: ImageVector? = null

val Icons.Rr.ManHead: ImageVector
    get() = _ManHead ?: UXIcon(name = "ManHead") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.5f, 13f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 16f, 11.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 13f)
                close()
                moveTo(21.85f, 8.27f)
                arcTo(9.97f, 9.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                curveTo(5.1f, 0f, 3.12f, 4.67f, 1.82f, 7.77f)
                arcTo(6.37f, 6.37f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 10.14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.38f, 1.86f)
                arcToRelative(15.81f, 15.81f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.26f, -1.1f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 1.72f, -0.84f)
                arcToRelative(15.09f, 15.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.96f, -4.47f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.63f, -1.16f)
                arcTo(13.36f, 13.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 10.03f)
                curveToRelative(0.23f, -0.45f, 0.44f, -0.96f, 0.66f, -1.48f)
                curveTo(4.89f, 5.63f, 6.42f, 2f, 12f, 2f)
                arcToRelative(7.98f, 7.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.95f, 7.15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.82f, 0.88f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 13f)
                arcToRelative(1.61f, 1.61f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.25f, -0.03f)
                arcToRelative(0.99f, 0.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.12f, 0.65f)
                curveTo(18.21f, 16.22f, 15.13f, 19f, 12f, 19f)
                horizontalLineToRelative(0f)
                curveToRelative(-2.9f, 0f, -5.6f, -2.28f, -6.77f, -4.54f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.78f, 0.92f)
                arcTo(11.26f, 11.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 19.95f)
                lineTo(8f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(10f, 20.74f)
                arcToRelative(7.71f, 7.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                lineTo(14f, 23f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 0f)
                lineTo(16f, 19.95f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.73f, -4.96f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.12f, -6.72f)
                close()
            }
        }.also { _ManHead = it}
