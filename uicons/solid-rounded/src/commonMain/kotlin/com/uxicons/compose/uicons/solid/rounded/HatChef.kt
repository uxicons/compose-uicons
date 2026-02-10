package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatChef: ImageVector? = null

val Icons.Sr.HatChef: ImageVector
    get() = _HatChef ?: UXIcon(name = "HatChef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.16f, 4.71f)
                curveTo(0.93f, 1.59f, 5.21f, -0.06f, 7.84f, 1.62f)
                arcToRelative(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.32f, 0f)
                curveToRelative(6.44f, -3.28f, 11.42f, 6.11f, 4.51f, 9.09f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, 0.85f)
                verticalLineTo(17f)
                horizontalLineTo(4f)
                verticalLineTo(11.56f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.67f, -0.85f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.16f, 4.71f)
                close()
                moveTo(4f, 19f)
                arcToRelative(4.56f, 4.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 5f)
                horizontalLineToRelative(7f)
                arcTo(4.56f, 4.56f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 19f)
                close()
            }
        }.also { _HatChef = it}
