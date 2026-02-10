package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Opacity: ImageVector? = null

val Icons.Sr.Opacity: ImageVector
    get() = _Opacity ?: UXIcon(name = "Opacity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.89f, 6.84f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.71f, 6.4f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.52f, 3.63f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.1f, -1.67f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.06f, 5.28f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.83f, 1.56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                arcToRelative(10.11f, 10.11f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.19f, -1.97f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0.23f, 9.64f)
                arcToRelative(12.13f, 12.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4.73f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.98f, 0.8f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.2f, -0.02f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.78f, -1.18f)
                arcTo(10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.53f, 20.37f)
                arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.81f, -2.77f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 1.12f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.37f, 3.31f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.1f, -1.67f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                arcTo(12.11f, 12.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.83f, 0.2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, 1.98f)
                arcToRelative(1.13f, 1.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.18f, -0.02f)
                arcTo(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                verticalLineTo(22f)
                arcToRelative(10.03f, 10.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.81f, -0.16f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.36f, 1.97f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                close()
            }
        }.also { _Opacity = it}
