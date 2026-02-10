package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Bs.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 12.85f)
                curveTo(22f, 8.47f, 16.61f, 2.77f, 14f, 0.7f)
                arcToRelative(3.2f, 3.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4f, 0f)
                curveTo(6.91f, 3.16f, 2f, 8.61f, 2f, 12.79f)
                curveTo(2f, 16.27f, 4.42f, 19f, 7.5f, 19f)
                arcToRelative(6.29f, 6.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.95f, -0.76f)
                curveTo(9.65f, 20.2f, 9f, 21f, 5f, 21f)
                verticalLineToRelative(3f)
                lineTo(19f, 24f)
                lineTo(19f, 21f)
                curveToRelative(-4f, 0f, -4.65f, -0.8f, -5.45f, -2.76f)
                arcTo(6.28f, 6.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 16.5f, 19f)
                curveTo(19.64f, 19f, 22f, 16.36f, 22f, 12.85f)
                close()
                moveTo(13.22f, 14.12f)
                lineTo(12.01f, 12.46f)
                lineTo(10.79f, 14.12f)
                arcTo(4.77f, 4.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 16f)
                curveTo(5.88f, 16f, 5f, 14.35f, 5f, 12.79f)
                curveToRelative(0f, -2.52f, 3.62f, -7.16f, 6.87f, -9.74f)
                arcToRelative(0.21f, 0.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.27f, 0f)
                curveTo(15.38f, 5.63f, 19f, 10.29f, 19f, 12.85f)
                curveTo(19f, 14.65f, 17.93f, 16f, 16.5f, 16f)
                arcTo(4.77f, 4.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.22f, 14.12f)
                close()
            }
        }.also { _Spade = it}
