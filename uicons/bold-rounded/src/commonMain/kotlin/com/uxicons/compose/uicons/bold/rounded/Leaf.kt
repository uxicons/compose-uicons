package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Leaf: ImageVector? = null

val Icons.Br.Leaf: ImageVector
    get() = _Leaf ?: UXIcon(name = "Leaf") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23f, 0.99f)
            arcTo(3.38f, 3.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.27f, 0.02f)
            curveTo(17.58f, 0.28f, 8.49f, 1.41f, 4.92f, 4.98f)
            arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.97f, 12.95f)
            lineTo(0.44f, 21.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(3.51f, -3.51f)
            arcToRelative(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.95f, -0.97f)
            curveTo(22.64f, 15.46f, 23.74f, 6.4f, 23.98f, 3.71f)
            arcTo(3.39f, 3.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 0.99f)
            close()
            moveTo(16.9f, 16.96f)
            arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.22f, 17.9f)
            lineToRelative(8.34f, -8.34f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, -2.12f)
            lineTo(6.1f, 15.78f)
            arcTo(6.99f, 6.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.04f, 7.1f)
            curveTo(9.32f, 4.82f, 15.75f, 3.47f, 20.57f, 3f)
            arcToRelative(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.32f, 0.11f)
            arcTo(0.39f, 0.39f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3.43f)
            curveTo(20.55f, 8.22f, 19.22f, 14.64f, 16.9f, 16.96f)
            close()
        }
    }.also { _Leaf = it }
