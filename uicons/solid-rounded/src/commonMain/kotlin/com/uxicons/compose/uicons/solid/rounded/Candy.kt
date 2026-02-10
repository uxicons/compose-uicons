package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Candy: ImageVector? = null

val Icons.Sr.Candy: ImageVector
    get() = _Candy ?: UXIcon(name = "Candy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.79f, 3.73f)
                arcTo(8.16f, 8.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.29f, 0.21f)
                arcToRelative(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.28f, 2.13f)
                verticalLineTo(3.91f)
                curveTo(9.5f, -0.08f, -0.08f, 9.51f, 3.91f, 17.02f)
                horizontalLineTo(2.35f)
                arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.21f, 20.29f)
                arcToRelative(8.16f, 8.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.51f, 3.49f)
                arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 21.65f)
                verticalLineTo(20.08f)
                curveTo(14.59f, 24.16f, 24.07f, 14.28f, 20.1f, 7f)
                horizontalLineToRelative(1.56f)
                arcTo(2.33f, 2.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.79f, 3.73f)
                close()
                moveTo(14.64f, 15.49f)
                curveTo(12.8f, 17.01f, 10.3f, 17.61f, 8.4f, 16.26f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.6f, 14.66f)
                curveToRelative(0.86f, 0.65f, 2.51f, 0.34f, 3.75f, -0.7f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.64f, 15.49f)
                close()
            }
        }.also { _Candy = it}
