package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlagAlt: ImageVector? = null

val Icons.Br.FlagAlt: ImageVector
    get() = _FlagAlt ?: UXIcon(name = "FlagAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.48f, 8f)
            lineToRelative(3.01f, -4.0f)
            curveToRelative(0.57f, -0.76f, 0.67f, -1.77f, 0.24f, -2.62f)
            curveToRelative(-0.43f, -0.85f, -1.28f, -1.39f, -2.24f, -1.39f)
            horizontalLineTo(4.5f)
            curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
            verticalLineTo(22.5f)
            curveToRelative(0.03f, 1.97f, 2.97f, 1.97f, 3f, 0f)
            verticalLineToRelative(-6.5f)
            horizontalLineTo(21.5f)
            curveToRelative(0.95f, 0f, 1.81f, -0.53f, 2.24f, -1.39f)
            curveToRelative(0.43f, -0.85f, 0.33f, -1.86f, -0.24f, -2.62f)
            lineToRelative(-3.01f, -4.0f)
            close()
            moveTo(3f, 13f)
            verticalLineTo(4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15.99f)
            lineToRelative(-3.09f, 4.1f)
            curveToRelative(-0.4f, 0.53f, -0.4f, 1.27f, 0f, 1.8f)
            lineToRelative(3.09f, 4.1f)
            horizontalLineTo(3f)
            close()
        }
    }.also { _FlagAlt = it }
