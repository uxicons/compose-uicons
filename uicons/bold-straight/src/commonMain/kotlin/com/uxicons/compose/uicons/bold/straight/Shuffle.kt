package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shuffle: ImageVector? = null

val Icons.Bs.Shuffle: ImageVector
    get() = _Shuffle ?: UXIcon(name = "Shuffle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.66f, 17.16f)
                lineTo(20.03f, 13.54f)
                verticalLineToRelative(2.94f)
                arcToRelative(9.1f, 9.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.17f, -3f)
                curveToRelative(-0.2f, 0.23f, -0.4f, 0.46f, -0.61f, 0.7f)
                curveToRelative(-0.44f, 0.51f, -0.9f, 1.03f, -1.38f, 1.56f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.03f, 19.48f)
                verticalLineToRelative(2.87f)
                lineToRelative(3.63f, -3.63f)
                arcTo(1.1f, 1.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23.66f, 17.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.01f, 7.51f)
                verticalLineToRelative(2.9f)
                lineToRelative(3.64f, -3.64f)
                arcToRelative(1.11f, 1.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.56f)
                lineTo(20.01f, 1.57f)
                verticalLineTo(4.51f)
                curveToRelative(-4.53f, 0.21f, -7.25f, 2.67f, -9.52f, 5.21f)
                curveTo(8.07f, 7.04f, 5.12f, 4.49f, -0.02f, 4.49f)
                verticalLineTo(7.49f)
                curveToRelative(4.09f, 0f, 6.29f, 1.99f, 8.52f, 4.51f)
                curveToRelative(-2.23f, 2.52f, -4.43f, 4.51f, -8.52f, 4.51f)
                verticalLineToRelative(3.0f)
                curveToRelative(6.05f, 0f, 9.06f, -3.53f, 11.75f, -6.65f)
                curveTo(14.1f, 10.13f, 16.16f, 7.75f, 20.01f, 7.51f)
                close()
            }
        }.also { _Shuffle = it}
