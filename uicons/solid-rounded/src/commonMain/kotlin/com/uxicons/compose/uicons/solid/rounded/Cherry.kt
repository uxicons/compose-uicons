package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cherry: ImageVector? = null

val Icons.Sr.Cherry: ImageVector
    get() = _Cherry ?: UXIcon(name = "Cherry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.4f, 13f)
                arcToRelative(3.16f, 3.16f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.98f, 0.56f)
                curveTo(18.05f, 9.49f, 16.14f, 4.98f, 12.81f, 0.41f)
                arcToRelative(1.04f, 1.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.62f, 0f)
                curveTo(7.86f, 4.98f, 5.95f, 9.5f, 5.58f, 13.57f)
                curveTo(3.28f, 12f, -0.06f, 13.74f, 0f, 17.5f)
                curveToRelative(0.27f, 8.59f, 12.73f, 8.59f, 13f, 0f)
                curveToRelative(0.01f, -3.64f, -3.01f, -5.41f, -5.41f, -4.05f)
                arcTo(24.51f, 24.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2.74f)
                arcToRelative(24.5f, 24.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.41f, 10.72f)
                arcToRelative(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.79f, -0.28f)
                curveToRelative(1.99f, 2.37f, 1.7f, 6.89f, -0.27f, 9.32f)
                curveToRelative(4.03f, 3.52f, 10.76f, 0.4f, 10.64f, -5f)
                curveTo(24f, 14.68f, 22.17f, 13f, 20.4f, 13f)
                close()
            }
        }.also { _Cherry = it}
