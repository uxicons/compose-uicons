package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _A: ImageVector? = null

val Icons.Ts.A: ImageVector
    get() = _A ?: UXIcon(name = "A") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.08f, 24f)
                horizontalLineToRelative(1.08f)
                lineTo(13.85f, 0.93f)
                curveToRelative(-0.29f, -0.56f, -0.93f, -0.93f, -1.62f, -0.93f)
                curveToRelative(-0.72f, 0f, -1.34f, 0.39f, -1.68f, 1.06f)
                lineTo(0.98f, 24f)
                horizontalLineToRelative(1.08f)
                lineToRelative(3.34f, -8f)
                horizontalLineToRelative(13.45f)
                lineToRelative(3.23f, 8f)
                close()
                moveTo(5.82f, 15f)
                lineTo(11.46f, 1.48f)
                curveToRelative(0.15f, -0.3f, 0.43f, -0.48f, 0.77f, -0.48f)
                curveToRelative(0.37f, 0f, 0.64f, 0.2f, 0.71f, 0.34f)
                lineToRelative(5.51f, 13.66f)
                horizontalLineTo(5.82f)
                close()
            }
        }.also { _A = it}
