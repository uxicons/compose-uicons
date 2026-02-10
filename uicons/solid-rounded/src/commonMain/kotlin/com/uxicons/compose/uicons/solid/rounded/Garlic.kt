package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Garlic: ImageVector? = null

val Icons.Sr.Garlic: ImageVector
    get() = _Garlic ?: UXIcon(name = "Garlic") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 20f)
                arcToRelative(5.98f, 5.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.54f, 2.48f)
                arcTo(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.43f, 23f)
                arcTo(4.72f, 4.72f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.01f, 17.93f)
                curveTo(0.31f, 11.92f, 5.16f, 7.6f, 7.38f, 5.92f)
                arcTo(8.23f, 8.23f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.26f, 9.68f)
                curveTo(7.86f, 12.12f, 6f, 15.96f, 6f, 20f)
                close()
                moveTo(12f, 7f)
                arcToRelative(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.3f, 0.49f)
                arcToRelative(14.73f, 14.73f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.7f, -3.9f)
                arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 0f)
                lineTo(11f, 0f)
                arcTo(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 3.59f)
                arcTo(14.36f, 14.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.7f, 7.5f)
                arcTo(1.97f, 1.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7f)
                close()
                moveTo(16.63f, 5.92f)
                arcToRelative(8.08f, 8.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.89f, 3.75f)
                curveToRelative(1.59f, 2.83f, 4.45f, 8.59f, 2.72f, 12.81f)
                curveToRelative(3.09f, 1.74f, 6.83f, -1.15f, 6.53f, -4.56f)
                curveTo(23.69f, 11.93f, 18.85f, 7.61f, 16.63f, 5.92f)
                close()
                moveTo(12f, 8.99f)
                curveTo(10.41f, 11.17f, 3.92f, 23.31f, 12f, 24f)
                curveTo(20.09f, 23.3f, 13.58f, 11.17f, 12f, 8.99f)
                close()
            }
        }.also { _Garlic = it}
