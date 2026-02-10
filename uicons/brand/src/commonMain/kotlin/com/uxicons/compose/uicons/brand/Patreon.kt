package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Patreon: ImageVector? = null

val Icons.Brand.Patreon: ImageVector
    get() = _Patreon ?: UXIcon(name = "Patreon") {
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(15.38f, 0.48f)
            curveToRelative(-4.76f, 0f, -8.64f, 3.88f, -8.64f, 8.65f)
            curveToRelative(0f, 4.75f, 3.88f, 8.62f, 8.64f, 8.62f)
            curveToRelative(4.75f, 0f, 8.62f, -3.87f, 8.62f, -8.62f)
            curveTo(24f, 4.36f, 20.14f, 0.48f, 15.38f, 0.48f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(0f, 23.52f)
            horizontalLineToRelative(4.22f)
            verticalLineTo(0.48f)
            horizontalLineTo(0f)
            verticalLineTo(23.52f)
            close()
        }
    }.also { _Patreon = it }
