package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Olives: ImageVector? = null

val Icons.Sr.Olives: ImageVector
    get() = _Olives ?: UXIcon(name = "Olives") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.04f, 7.1f)
                curveTo(18.33f, 3.45f, 20.41f, 3f, 22f, 3f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, -1f)
                curveToRelative(-0.19f, -1.84f, -3.14f, -0.73f, -4.03f, -0.32f)
                arcTo(21.27f, 21.27f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10.75f, 0f)
                curveTo(7.97f, -0.04f, -0.36f, 1.25f, 2.62f, 3.39f)
                curveToRelative(2.72f, 1.56f, 10.44f, 2.18f, 14.09f, 0.77f)
                arcToRelative(8.61f, 8.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.68f, 2.92f)
                curveTo(7.59f, 8.43f, 8.2f, 23.94f, 17f, 24f)
                curveTo(25.77f, 23.94f, 26.42f, 8.52f, 18.04f, 7.1f)
                close()
                moveTo(16f, 21f)
                curveToRelative(-1.74f, 0f, -3f, -1.68f, -3f, -4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 0f)
                curveToRelative(0f, 1.1f, 0.45f, 2f, 1f, 2f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 21f)
                close()
                moveTo(11.79f, 6.84f)
                curveTo(6.19f, 3.37f, -1.28f, 10.9f, 0.16f, 17.03f)
                arcTo(6.43f, 6.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.4f, 21.27f)
                curveTo(6.86f, 16.98f, 7.92f, 9.63f, 11.79f, 6.84f)
                close()
                moveTo(5.76f, 14.07f)
                curveToRelative(-0.72f, 0.84f, -0.96f, 1.81f, -0.54f, 2.17f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.3f, 1.52f)
                curveToRelative(-1.32f, -1.13f, -1.19f, -3.23f, 0.32f, -4.99f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.76f, 14.07f)
                close()
            }
        }.also { _Olives = it}
