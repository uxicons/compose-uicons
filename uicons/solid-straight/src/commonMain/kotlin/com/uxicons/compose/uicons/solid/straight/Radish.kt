package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Radish: ImageVector? = null

val Icons.Ss.Radish: ImageVector
    get() = _Radish ?: UXIcon(name = "Radish") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.53f, 12.61f)
                curveToRelative(3.06f, 3.43f, 3.28f, 7.2f, 0.52f, 9.96f)
                curveTo(11.64f, 23.98f, 9.44f, 24f, 7.13f, 24f)
                horizontalLineTo(-0.01f)
                lineToRelative(0.02f, -7.09f)
                curveToRelative(0f, -2.29f, 0.02f, -4.53f, 1.44f, -5.96f)
                arcToRelative(6.03f, 6.03f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.43f, -1.86f)
                arcToRelative(9.26f, 9.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.52f, 2.38f)
                curveToRelative(2f, -3.6f, 5.5f, -9.84f, 5.98f, -10.33f)
                arcToRelative(3.87f, 3.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.6f, 2.74f)
                arcToRelative(3.84f, 3.84f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.13f, 2.74f)
                curveTo(22.29f, 7.17f, 16.12f, 10.63f, 12.53f, 12.61f)
                close()
                moveTo(14.23f, 2.46f)
                arcToRelative(2.61f, 2.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, -5.21f, -0.08f)
                curveTo(8.84f, 4.32f, 10.7f, 5.22f, 11f, 9f)
                curveTo(12.43f, 5.77f, 13.5f, 3.85f, 14.23f, 2.46f)
                close()
                moveTo(21.58f, 9.77f)
                curveTo(19.62f, 10.81f, 17.23f, 12.04f, 15f, 13f)
                curveToRelative(3.77f, 0.3f, 4.67f, 2.16f, 6.6f, 1.99f)
                arcToRelative(2.62f, 2.62f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.02f, -5.22f)
                close()
            }
        }.also { _Radish = it}
