package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatChef: ImageVector? = null

val Icons.Rr.HatChef: ImageVector
    get() = _HatChef ?: UXIcon(name = "HatChef") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.84f, 4.71f)
                curveToRelative(-0.76f, -3.11f, -5.05f, -4.76f, -7.68f, -3.08f)
                arcToRelative(6.16f, 6.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8.32f, 0f)
                curveTo(1.41f, -1.66f, -3.59f, 7.73f, 3.33f, 10.71f)
                arcTo(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 11.56f)
                verticalLineTo(19.5f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 24f)
                horizontalLineToRelative(7f)
                arcTo(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 19.5f)
                verticalLineTo(11.56f)
                arcToRelative(0.93f, 0.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.67f, -0.85f)
                arcTo(5.02f, 5.02f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.84f, 4.71f)
                close()
                moveTo(18f, 19.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.5f, 22f)
                horizontalLineToRelative(-7f)
                arcTo(2.59f, 2.59f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 19f)
                horizontalLineTo(18f)
                close()
                moveTo(20f, 8.83f)
                arcToRelative(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2.74f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(11.56f)
                arcTo(2.91f, 2.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 8.83f)
                arcTo(3.03f, 3.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.1f, 5.2f)
                curveToRelative(0.59f, -2.1f, 3.73f, -2.98f, 5.18f, -1.5f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, -0.14f)
                curveToRelative(1.25f, -2.08f, 5.09f, -2.08f, 6.34f, 0f)
                arcToRelative(1.01f, 1.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.54f, 0.14f)
                arcToRelative(3.17f, 3.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.9f, -0.64f)
                horizontalLineToRelative(0f)
                arcTo(3.01f, 3.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8.83f)
                close()
            }
        }.also { _HatChef = it}
