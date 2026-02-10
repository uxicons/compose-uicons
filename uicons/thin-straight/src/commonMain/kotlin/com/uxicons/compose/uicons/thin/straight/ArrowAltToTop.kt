package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Ts.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.36f, 1.61f)
                curveToRelative(-0.69f, -0.78f, -2.02f, -0.78f, -2.71f, 0f)
                lineToRelative(-5.77f, 6.39f)
                horizontalLineToRelative(6.62f)
                lineTo(11.5f, 24f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 8f)
                horizontalLineToRelative(6.62f)
                lineTo(13.36f, 1.61f)
                close()
                moveTo(11.39f, 2.28f)
                lineToRelative(0.0f, -0.0f)
                curveToRelative(0.32f, -0.36f, 0.9f, -0.36f, 1.22f, 0.0f)
                lineToRelative(4.26f, 4.72f)
                lineTo(7.12f, 7f)
                lineTo(11.39f, 2.28f)
                close()
                moveTo(21f, 0f)
                lineTo(21f, 1f)
                lineTo(3f, 1f)
                lineTo(3f, 0f)
                lineTo(21f, 0f)
                close()
            }
        }.also { _ArrowAltToTop = it}
