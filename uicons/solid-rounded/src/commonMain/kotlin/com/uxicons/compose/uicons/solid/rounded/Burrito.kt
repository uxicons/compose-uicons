package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Burrito: ImageVector? = null

val Icons.Sr.Burrito: ImageVector
    get() = _Burrito ?: UXIcon(name = "Burrito") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                verticalLineToRelative(6.5f)
                arcToRelative(19.48f, 19.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.26f, -4.68f)
                arcTo(9.77f, 9.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                close()
                moveTo(19.93f, 18.87f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 24f)
                lineTo(10f, 24f)
                arcToRelative(6.01f, 6.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6f, -6f)
                lineTo(4f, 8f)
                curveTo(8.08f, 8f, 18.43f, 12.57f, 19.93f, 18.87f)
                close()
                moveTo(9f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 20f)
                close()
                moveTo(11f, 17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17f)
                close()
                moveTo(13f, 20f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 0f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 20f)
                close()
                moveTo(18f, 1f)
                arcToRelative(2.98f, 2.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.14f, 0.22f)
                arcTo(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0.55f)
                arcToRelative(4.07f, 4.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.86f, 0.68f)
                curveTo(4.23f, 0.05f, 1.81f, 3.52f, 3.62f, 6f)
                arcTo(13.09f, 13.09f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 7.05f)
                curveToRelative(0.82f, -0.87f, 2.23f, -3.63f, 3.54f, -2.11f)
                curveToRelative(0.67f, 1.22f, -1.15f, 1.91f, -1.65f, 2.91f)
                curveToRelative(0.7f, 0.33f, 1.41f, 0.7f, 2.13f, 1.11f)
                arcTo(12.38f, 12.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.38f, 6f)
                arcTo(3.12f, 3.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 1f)
                close()
            }
        }.also { _Burrito = it}
