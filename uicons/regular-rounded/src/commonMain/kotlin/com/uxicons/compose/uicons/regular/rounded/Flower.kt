package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flower: ImageVector? = null

val Icons.Rr.Flower: ImageVector
    get() = _Flower ?: UXIcon(name = "Flower") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 16f)
                close()
                moveTo(12f, 10f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
                moveTo(12f, 24f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.82f, -3.65f)
                arcToRelative(5.07f, 5.07f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.82f, -8.4f)
                curveToRelative(-3.4f, -3.51f, 0.01f, -9.6f, 4.83f, -8.35f)
                arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 0f)
                curveTo(21.7f, 2.38f, 25f, 8.41f, 21.63f, 11.99f)
                curveToRelative(3.41f, 3.54f, 0.01f, 9.44f, -4.81f, 8.36f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(8f, 18f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 0f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.51f, -0.86f)
                curveToRelative(3.47f, 1.68f, 6.4f, -3.18f, 3.02f, -5.26f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.76f)
                curveToRelative(3.31f, -2.01f, 0.52f, -7.22f, -3.02f, -5.25f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 5f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 5f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0.87f)
                curveTo(4f, 3.91f, 1.14f, 9.08f, 4.48f, 11.07f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.76f)
                curveTo(1.13f, 14.94f, 3.96f, 19.8f, 7.49f, 18.14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 18f)
                close()
            }
        }.also { _Flower = it}
