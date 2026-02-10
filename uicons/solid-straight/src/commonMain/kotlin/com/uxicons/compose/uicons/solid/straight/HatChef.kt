package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatChef: ImageVector? = null

val Icons.Ss.HatChef: ImageVector
    get() = _HatChef ?: UXIcon(name = "HatChef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 6f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 1f)
                arcToRelative(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.71f, 0.8f)
                arcToRelative(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.57f, 0f)
                arcTo(4.94f, 4.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 1f)
                arcToRelative(5f, 5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 9.9f)
                verticalLineTo(18f)
                horizontalLineTo(4f)
                verticalLineTo(10.9f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 6f)
                close()
                moveTo(4f, 20f)
                verticalLineToRelative(4f)
                horizontalLineTo(20f)
                verticalLineTo(20f)
                close()
            }
        }.also { _HatChef = it}
