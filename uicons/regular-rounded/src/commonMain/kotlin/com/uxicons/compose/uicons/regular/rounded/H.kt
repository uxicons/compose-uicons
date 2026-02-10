package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H: ImageVector? = null

val Icons.Rr.H: ImageVector
    get() = _H ?: UXIcon(name = "H") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                verticalLineTo(1f)
                curveToRelative(-0.01f, -1.31f, -1.99f, -1.31f, -2f, 0f)
                verticalLineTo(23f)
                curveToRelative(0.01f, 1.31f, 1.99f, 1.31f, 2f, 0f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineToRelative(10f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _H = it}
