package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dev: ImageVector? = null

val Icons.Brand.Dev: ImageVector
    get() = _Dev ?: UXIcon(name = "Dev") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.43f, 9.44f)
            curveTo(6.23f, 9.29f, 6.02f, 9.21f, 5.81f, 9.21f)
            horizontalLineTo(4.88f)
            verticalLineToRelative(5.6f)
            horizontalLineToRelative(0.94f)
            curveToRelative(0.21f, 0f, 0.42f, -0.08f, 0.62f, -0.23f)
            curveToRelative(0.21f, -0.15f, 0.31f, -0.39f, 0.31f, -0.7f)
            verticalLineToRelative(-3.73f)
            curveTo(6.75f, 9.83f, 6.64f, 9.6f, 6.43f, 9.44f)
            lineTo(6.43f, 9.44f)
            close()
            moveTo(21.65f, 0f)
            horizontalLineTo(2.35f)
            curveTo(1.05f, 0f, 0.0f, 1.05f, 0f, 2.35f)
            verticalLineToRelative(19.31f)
            curveTo(0.0f, 22.95f, 1.05f, 24f, 2.35f, 24f)
            horizontalLineToRelative(19.3f)
            curveToRelative(1.3f, 0f, 2.35f, -1.05f, 2.35f, -2.35f)
            verticalLineTo(2.35f)
            curveTo(24.0f, 1.05f, 22.95f, 0f, 21.65f, 0f)
            close()
            moveTo(8.26f, 13.88f)
            curveToRelative(0f, 1.01f, -0.62f, 2.53f, -2.59f, 2.53f)
            horizontalLineTo(3.18f)
            verticalLineTo(7.55f)
            horizontalLineToRelative(2.54f)
            curveToRelative(1.9f, 0f, 2.54f, 1.52f, 2.54f, 2.53f)
            lineTo(8.26f, 13.88f)
            lineTo(8.26f, 13.88f)
            close()
            moveTo(13.65f, 9.14f)
            horizontalLineTo(10.8f)
            verticalLineToRelative(2.06f)
            horizontalLineToRelative(1.75f)
            verticalLineToRelative(1.58f)
            horizontalLineTo(10.8f)
            verticalLineToRelative(2.06f)
            horizontalLineToRelative(2.85f)
            verticalLineToRelative(1.58f)
            horizontalLineToRelative(-3.33f)
            curveToRelative(-0.6f, 0.02f, -1.09f, -0.46f, -1.11f, -1.05f)
            verticalLineTo(8.66f)
            curveTo(9.2f, 8.06f, 9.67f, 7.57f, 10.27f, 7.55f)
            horizontalLineToRelative(3.38f)
            lineTo(13.65f, 9.14f)
            lineTo(13.65f, 9.14f)
            close()
            moveTo(19.21f, 15.31f)
            curveToRelative(-0.71f, 1.65f, -1.97f, 1.32f, -2.54f, 0f)
            lineToRelative(-2.06f, -7.76f)
            horizontalLineToRelative(1.75f)
            lineToRelative(1.59f, 6.09f)
            lineToRelative(1.58f, -6.09f)
            horizontalLineToRelative(1.75f)
            lineTo(19.21f, 15.31f)
            lineTo(19.21f, 15.31f)
            close()
        }
    }.also { _Dev = it }
