package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltUp: ImageVector? = null

val Icons.Ts.ArrowAltUp: ImageVector
    get() = _ArrowAltUp ?: UXIcon(name = "ArrowAltUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.37f, 0.61f)
                curveToRelative(-0.7f, -0.78f, -2.04f, -0.77f, -2.73f, -0.0f)
                lineTo(4.79f, 7f)
                horizontalLineToRelative(6.71f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(7f)
                horizontalLineToRelative(6.71f)
                lineTo(13.37f, 0.61f)
                close()
                moveTo(7.06f, 6f)
                lineTo(11.38f, 1.28f)
                curveToRelative(0.32f, -0.36f, 0.93f, -0.36f, 1.25f, 0f)
                lineToRelative(4.32f, 4.72f)
                horizontalLineTo(7.06f)
                close()
            }
        }.also { _ArrowAltUp = it}
