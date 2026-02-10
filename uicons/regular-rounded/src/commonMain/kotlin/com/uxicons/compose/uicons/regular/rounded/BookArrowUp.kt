package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookArrowUp: ImageVector? = null

val Icons.Rr.BookArrowUp: ImageVector
    get() = _BookArrowUp ?: UXIcon(name = "BookArrowUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.29f, 15.89f)
                lineToRelative(-1.29f, -1.29f)
                verticalLineToRelative(8.4f)
                curveToRelative(-0.01f, 1.31f, -2.0f, 1.31f, -2f, 0f)
                verticalLineTo(14.6f)
                lineToRelative(-1.29f, 1.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(1.61f, -1.61f)
                curveToRelative(1.15f, -1.15f, 3.03f, -1.16f, 4.19f, 0f)
                lineToRelative(1.61f, 1.61f)
                curveToRelative(0.92f, 0.93f, -0.49f, 2.33f, -1.41f, 1.41f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                horizontalLineTo(7f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(10f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineTo(6f)
                curveToRelative(-1.21f, 0f, -2.18f, -1.09f, -1.97f, -2.34f)
                curveToRelative(0.16f, -0.98f, 1.09f, -1.66f, 2.08f, -1.66f)
                horizontalLineToRelative(7.89f)
                curveToRelative(1.31f, -0.01f, 1.31f, -2.0f, 0f, -2f)
                horizontalLineToRelative(-6f)
                verticalLineTo(2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0.01f, 1.31f, 1.99f, 1.31f, 2f, 0f)
                verticalLineTo(5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(6f, 16f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.21f, -2f, 0.56f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(13.82f)
                close()
            }
        }.also { _BookArrowUp = it}
