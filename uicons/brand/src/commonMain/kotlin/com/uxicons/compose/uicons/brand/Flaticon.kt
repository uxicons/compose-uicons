package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Flaticon: ImageVector? = null

val Icons.Brand.Flaticon: ImageVector
    get() = _Flaticon ?: UXIcon(name = "Flaticon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 8.73f)
            horizontalLineTo(7.54f)
            lineToRelative(-1.71f, -2.96f)
            horizontalLineTo(14.7f)
            lineToRelative(2.59f, -4.5f)
            horizontalLineTo(2.63f)
            curveToRelative(-0.93f, 0f, -1.82f, 0.5f, -2.28f, 1.32f)
            curveTo(-0.12f, 3.41f, -0.12f, 4.41f, 0.36f, 5.23f)
            lineTo(9.71f, 21.44f)
            curveToRelative(0.74f, 1.25f, 2.35f, 1.67f, 3.62f, 0.93f)
            curveToRelative(0.39f, -0.24f, 0.72f, -0.54f, 0.93f, -0.93f)
            lineToRelative(0.3f, -0.54f)
            lineToRelative(-4.3f, -7.46f)
            lineToRelative(2.74f, -4.71f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.65f, 2.59f)
            curveToRelative(-0.48f, -0.82f, -1.34f, -1.32f, -2.28f, -1.32f)
            horizontalLineToRelative(-0.65f)
            lineToRelative(-7.03f, 12.16f)
            lineToRelative(2.57f, 4.5f)
            lineToRelative(7.35f, -12.73f)
            curveToRelative(0.51f, -0.79f, 0.51f, -1.79f, 0.03f, -2.61f)
            horizontalLineToRelative(0f)
            close()
        }
    }.also { _Flaticon = it }
