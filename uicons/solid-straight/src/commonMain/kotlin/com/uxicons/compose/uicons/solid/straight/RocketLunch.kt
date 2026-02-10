package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RocketLunch: ImageVector? = null

val Icons.Ss.RocketLunch: ImageVector
    get() = _RocketLunch ?: UXIcon(name = "RocketLunch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.75f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 14f)
                arcTo(7.63f, 7.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.07f, 7.17f)
                arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.9f, -1.09f)
                quadToRelative(-0.89f, 1.1f, -1.78f, 2.34f)
                arcTo(40.58f, 40.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 15f)
                close()
                moveTo(15.58f, 17.81f)
                arcTo(40.58f, 40.58f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21.25f)
                lineTo(9f, 24f)
                horizontalLineToRelative(1f)
                arcToRelative(7.63f, 7.63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.83f, -4.07f)
                arcToRelative(10.97f, 10.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.09f, -3.9f)
                quadTo(16.83f, 16.92f, 15.58f, 17.81f)
                close()
                moveTo(24f, 2.99f)
                curveToRelative(-0.13f, 4.35f, -3.27f, 8.67f, -9.58f, 13.2f)
                arcTo(34.99f, 34.99f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 19.06f)
                lineTo(9f, 18.5f)
                arcTo(3.52f, 3.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.5f, 15f)
                lineTo(4.94f, 15f)
                arcTo(34.91f, 34.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.81f, 9.58f)
                curveTo(12.33f, 3.28f, 16.64f, 0.14f, 20.99f, 0f)
                curveTo(23.15f, 0f, 24f, 0.89f, 24f, 2.99f)
                close()
                moveTo(18f, 8.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5f, 0f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 8.5f)
                close()
                moveTo(1.37f, 23.79f)
                curveToRelative(1.13f, -0.2f, 3.84f, -0.76f, 4.75f, -1.66f)
                horizontalLineToRelative(0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.24f, -4.24f)
                curveTo(0.97f, 18.79f, 0.41f, 21.5f, 0.21f, 22.63f)
                lineToRelative(-0.25f, 1.41f)
                close()
            }
        }.also { _RocketLunch = it}
