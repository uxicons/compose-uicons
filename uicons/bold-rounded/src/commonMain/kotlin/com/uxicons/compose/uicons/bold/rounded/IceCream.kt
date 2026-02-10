package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Br.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.9f, 4.03f)
            arcToRelative(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -9.8f, 0f)
            arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 8.7f)
            lineToRelative(5.87f, 9.41f)
            arcToRelative(3.91f, 3.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.62f, 0.01f)
            lineTo(21.2f, 12.7f)
            curveTo(23.35f, 9.21f, 20.92f, 4.32f, 16.9f, 4.03f)
            close()
            moveTo(18.98f, 9.6f)
            curveToRelative(-1.17f, 0.11f, -3.36f, 0.3f, -5.47f, 0.38f)
            lineTo(13.5f, 9.8f)
            arcTo(2.74f, 2.74f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.98f, 9.6f)
            close()
            moveTo(12f, 3f)
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.93f, 1.51f)
            arcToRelative(5.79f, 5.79f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.93f, 1.41f)
            arcToRelative(5.83f, 5.83f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.94f, -1.41f)
            arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 3f)
            close()
            moveTo(7.71f, 7f)
            arcToRelative(2.82f, 2.82f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.8f, 2.88f)
            lineToRelative(0.01f, 0.09f)
            curveTo(8.39f, 9.9f, 6.19f, 9.71f, 5.02f, 9.6f)
            arcTo(2.7f, 2.7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.71f, 7f)
            close()
            moveTo(12.76f, 20.58f)
            arcToRelative(0.89f, 0.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.51f, -0.01f)
            lineTo(6.35f, 12.73f)
            arcToRelative(62.68f, 62.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.3f, 0f)
            close()
        }
    }.also { _IceCream = it }
