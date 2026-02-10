package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleXmark: ImageVector? = null

val Icons.Bs.RectangleXmark: ImageVector
    get() = _RectangleXmark ?: UXIcon(name = "RectangleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 2f)
                lineTo(3.5f, 2f)
                curveTo(1.57f, 2f, 0f, 3.57f, 0f, 5.5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 19f)
                lineTo(3f, 19f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(13.5f)
                close()
                moveTo(16.81f, 9.31f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(2.69f, 2.69f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(-2.69f, 2.69f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(-2.69f, -2.69f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.69f, 2.69f)
                lineToRelative(2.69f, -2.69f)
                lineToRelative(2.12f, 2.12f)
                close()
            }
        }.also { _RectangleXmark = it}
