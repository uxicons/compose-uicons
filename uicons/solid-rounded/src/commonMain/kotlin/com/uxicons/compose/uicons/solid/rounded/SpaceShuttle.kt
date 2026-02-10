package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SpaceShuttle: ImageVector? = null

val Icons.Sr.SpaceShuttle: ImageVector
    get() = _SpaceShuttle ?: UXIcon(name = "SpaceShuttle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 0.79f, -0.38f, 1.93f, -2.18f, 2.95f)
                arcToRelative(8.29f, 8.29f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.96f, 0.96f)
                arcToRelative(6.91f, 6.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.26f, -7.85f)
                arcToRelative(8.38f, 8.38f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.22f, 1f)
                curveTo(23.62f, 10.07f, 24f, 11.21f, 24f, 12f)
                close()
                moveTo(15.9f, 8f)
                lineTo(6f, 8f)
                verticalLineToRelative(8f)
                lineTo(16.42f, 16f)
                curveTo(18.57f, 13.34f, 18.52f, 10.27f, 15.9f, 8f)
                close()
                moveTo(4f, 8f)
                lineTo(3f, 8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                verticalLineToRelative(2f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(4f, 16f)
                close()
                moveTo(12.48f, 6f)
                lineTo(10.56f, 2.56f)
                arcTo(5.01f, 5.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.19f, 0f)
                lineTo(5.04f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, 3f)
                lineTo(2.04f, 6f)
                close()
                moveTo(2f, 18f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 3f)
                lineTo(6.16f, 24f)
                arcToRelative(5.0f, 5.0f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.36f, -2.56f)
                lineTo(12.45f, 18f)
                close()
            }
        }.also { _SpaceShuttle = it}
