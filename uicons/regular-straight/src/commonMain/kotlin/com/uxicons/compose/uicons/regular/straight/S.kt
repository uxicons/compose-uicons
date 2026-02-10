package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _S: ImageVector? = null

val Icons.Rs.S: ImageVector
    get() = _S ?: UXIcon(name = "S") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.15f, 24f)
                horizontalLineTo(7.92f)
                curveToRelative(-3.26f, 0f, -5.92f, -2.65f, -5.92f, -5.92f)
                verticalLineToRelative(-1.08f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1.08f)
                curveToRelative(0f, 2.16f, 1.76f, 3.92f, 3.92f, 3.92f)
                horizontalLineToRelative(8.23f)
                curveToRelative(2.12f, 0f, 3.85f, -1.73f, 3.85f, -3.85f)
                curveToRelative(0f, -1.73f, -1.17f, -3.26f, -2.84f, -3.71f)
                lineToRelative(-10.85f, -2.94f)
                curveToRelative(-2.54f, -0.69f, -4.32f, -3.01f, -4.32f, -5.64f)
                curveTo(2f, 2.62f, 4.62f, 0f, 7.85f, 0f)
                horizontalLineToRelative(8.23f)
                curveToRelative(3.26f, 0f, 5.92f, 2.65f, 5.92f, 5.92f)
                verticalLineToRelative(1.08f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.08f)
                curveToRelative(0f, -2.16f, -1.76f, -3.92f, -3.92f, -3.92f)
                horizontalLineTo(7.85f)
                curveToRelative(-2.12f, 0f, -3.85f, 1.73f, -3.85f, 3.85f)
                curveToRelative(0f, 1.73f, 1.17f, 3.26f, 2.84f, 3.71f)
                lineToRelative(10.85f, 2.94f)
                curveToRelative(2.54f, 0.69f, 4.32f, 3.01f, 4.32f, 5.64f)
                curveToRelative(0f, 3.23f, -2.62f, 5.85f, -5.85f, 5.85f)
                close()
            }
        }.also { _S = it}
