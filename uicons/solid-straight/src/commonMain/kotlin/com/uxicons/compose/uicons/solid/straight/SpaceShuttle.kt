package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceShuttle: ImageVector? = null

val Icons.Ss.SpaceShuttle: ImageVector
    get() = _SpaceShuttle ?: UXIcon(name = "SpaceShuttle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 0.79f, -0.38f, 1.93f, -2.18f, 2.95f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.33f, 1f)
                arcToRelative(6.06f, 6.06f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -7.89f)
                arcToRelative(8.4f, 8.4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.33f, 1f)
                curveTo(23.62f, 10.07f, 24f, 11.21f, 24f, 12f)
                close()
                moveTo(3f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(8f)
                lineTo(3f, 16f)
                close()
                moveTo(12.46f, 6f)
                lineTo(9.98f, 1.56f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.35f, 0f)
                lineTo(2f, 0f)
                lineTo(2f, 6f)
                close()
                moveTo(15.37f, 16f)
                curveToRelative(3.47f, -1.97f, 3.47f, -6.03f, 0f, -8f)
                lineTo(5f, 8f)
                verticalLineToRelative(8f)
                close()
                moveTo(2f, 18f)
                verticalLineToRelative(6f)
                lineTo(7.35f, 24f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.98f, 22.44f)
                lineTo(12.46f, 18f)
                close()
            }
        }.also { _SpaceShuttle = it}
