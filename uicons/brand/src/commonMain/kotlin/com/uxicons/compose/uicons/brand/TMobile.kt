package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TMobile: ImageVector? = null

val Icons.Brand.TMobile: ImageVector
    get() = _TMobile ?: UXIcon(name = "TMobile") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.19f, 15.92f)
            lineToRelative(4.85f, 0f)
            lineToRelative(0f, -4.86f)
            lineToRelative(-4.85f, 0f)
            lineToRelative(0f, 4.86f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.87f, 1.15f)
            curveToRelative(3.96f, 0.07f, 6.31f, 2.71f, 6.66f, 7.53f)
            lineToRelative(1.28f, -0.21f)
            lineTo(21.57f, 0f)
            horizontalLineTo(2.43f)
            lineTo(2.19f, 8.46f)
            lineToRelative(1.28f, 0.21f)
            curveToRelative(0.35f, -4.82f, 2.67f, -7.46f, 6.66f, -7.53f)
            verticalLineToRelative(17.72f)
            curveToRelative(0f, 3.23f, -0.56f, 3.75f, -4.02f, 3.78f)
            verticalLineTo(24f)
            horizontalLineToRelative(11.79f)
            verticalLineToRelative(-1.35f)
            curveToRelative(-3.47f, -0.03f, -4.02f, -0.56f, -4.02f, -3.78f)
            verticalLineTo(1.15f)
            lineTo(13.87f, 1.15f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.92f, 15.92f)
            lineToRelative(4.85f, 0f)
            lineToRelative(0f, -4.86f)
            lineToRelative(-4.85f, 0f)
            lineToRelative(0f, 4.86f)
            close()
        }
    }.also { _TMobile = it }
