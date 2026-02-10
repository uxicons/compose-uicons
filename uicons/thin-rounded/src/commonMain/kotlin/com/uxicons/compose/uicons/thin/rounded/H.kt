package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H: ImageVector? = null

val Icons.Tr.H: ImageVector
    get() = _H ?: UXIcon(name = "H") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineTo(11f)
                horizontalLineTo(3f)
                verticalLineTo(0.5f)
                curveToRelative(0.01f, -0.65f, -1.01f, -0.65f, -1f, 0f)
                verticalLineTo(23.5f)
                curveToRelative(-0.01f, 0.65f, 1.01f, 0.65f, 1f, 0f)
                verticalLineTo(12f)
                horizontalLineTo(21f)
                verticalLineToRelative(11.5f)
                curveToRelative(-0.01f, 0.65f, 1.01f, 0.65f, 1f, 0f)
                verticalLineTo(0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
            }
        }.also { _H = it}
