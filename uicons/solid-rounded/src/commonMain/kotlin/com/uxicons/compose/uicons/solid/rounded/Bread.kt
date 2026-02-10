package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bread: ImageVector? = null

val Icons.Sr.Bread: ImageVector
    get() = _Bread ?: UXIcon(name = "Bread") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.36f, 1.64f)
                curveTo(15.01f, -4.36f, 2.35f, 7.43f, 0.49f, 14.82f)
                curveTo(-1.65f, 21.47f, 3.14f, 25.53f, 9.18f, 23.51f)
                curveTo(16.57f, 21.66f, 28.36f, 8.98f, 22.36f, 1.64f)
                close()
                moveTo(10f, 19f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 19f)
                close()
                moveTo(14f, 15f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 15f)
                close()
                moveTo(18f, 11f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                arcToRelative(2.78f, 2.78f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2f)
                arcToRelative(4.78f, 4.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 11f)
                close()
            }
        }.also { _Bread = it}
