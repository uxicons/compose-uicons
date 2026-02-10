package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _R: ImageVector? = null

val Icons.Bs.R: ImageVector
    get() = _R ?: UXIcon(name = "R") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 8f)
                curveTo(22f, 3.59f, 18.41f, 0f, 14f, 0f)
                horizontalLineTo(5.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineTo(24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                horizontalLineTo(13.97f)
                lineToRelative(4.57f, 8f)
                horizontalLineToRelative(3.46f)
                lineToRelative(-4.92f, -8.62f)
                curveToRelative(2.89f, -1.21f, 4.92f, -4.06f, 4.92f, -7.38f)
                close()
                moveTo(5f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineTo(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                horizontalLineTo(5f)
                verticalLineTo(3.5f)
                close()
            }
        }.also { _R = it}
