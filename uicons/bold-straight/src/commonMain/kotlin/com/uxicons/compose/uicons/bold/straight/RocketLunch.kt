package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RocketLunch: ImageVector? = null

val Icons.Bs.RocketLunch: ImageVector
    get() = _RocketLunch ?: UXIcon(name = "RocketLunch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 15.5f, 6f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 8.5f)
                close()
                moveTo(16.66f, 17.71f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.83f, 2.22f)
                arcTo(7.63f, 7.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 24f)
                lineTo(8f, 24f)
                lineTo(8f, 19.14f)
                arcTo(3.21f, 3.21f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.86f, 16f)
                lineTo(0f, 16f)
                lineTo(0f, 15f)
                arcTo(7.63f, 7.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.07f, 8.17f)
                arcToRelative(11.04f, 11.04f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.22f, -0.83f)
                curveTo(9.96f, 2.38f, 14.22f, 0.18f, 20.46f, 0f)
                lineTo(20.5f, 0f)
                arcTo(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 3.55f)
                curveTo(23.82f, 9.88f, 21.69f, 14f, 16.66f, 17.71f)
                close()
                moveTo(21f, 3.51f)
                arcTo(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.52f, 3f)
                curveToRelative(-5.46f, 0.16f, -8.84f, 1.97f, -12.04f, 6.43f)
                arcToRelative(28.44f, 28.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.21f, 3.74f)
                arcToRelative(6.29f, 6.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.56f, 4.56f)
                arcToRelative(28.38f, 28.38f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.74f, -2.21f)
                curveTo(19.04f, 12.32f, 20.85f, 8.95f, 21f, 3.51f)
                close()
                moveTo(1.63f, 18.73f)
                curveTo(0.86f, 19.5f, 0.38f, 21.83f, 0.21f, 22.8f)
                lineTo(0f, 24f)
                lineToRelative(1.2f, -0.21f)
                curveToRelative(0.96f, -0.17f, 3.28f, -0.65f, 4.05f, -1.43f)
                arcToRelative(2.58f, 2.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.63f)
                arcTo(2.61f, 2.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.63f, 18.73f)
                close()
            }
        }.also { _RocketLunch = it}
