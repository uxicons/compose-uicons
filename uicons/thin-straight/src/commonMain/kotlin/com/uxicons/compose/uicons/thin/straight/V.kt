package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _V: ImageVector? = null

val Icons.Ts.V: ImageVector
    get() = _V ?: UXIcon(name = "V") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.0f, 0f)
                lineTo(11.39f, 22.52f)
                curveToRelative(0.15f, 0.3f, 0.43f, 0.48f, 0.77f, 0.48f)
                curveToRelative(0.37f, 0f, 0.64f, -0.2f, 0.71f, -0.34f)
                lineTo(22.01f, 0f)
                horizontalLineToRelative(1.08f)
                lineTo(13.78f, 23.07f)
                curveToRelative(-0.29f, 0.56f, -0.93f, 0.93f, -1.62f, 0.93f)
                curveToRelative(-0.72f, 0f, -1.34f, -0.39f, -1.68f, -1.06f)
                lineTo(0.91f, 0f)
                horizontalLineTo(2.0f)
                close()
            }
        }.also { _V = it}
