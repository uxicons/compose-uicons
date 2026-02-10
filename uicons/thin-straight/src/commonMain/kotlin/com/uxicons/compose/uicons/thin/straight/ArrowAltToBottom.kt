package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToBottom: ImageVector? = null

val Icons.Ts.ArrowAltToBottom: ImageVector
    get() = _ArrowAltToBottom ?: UXIcon(name = "ArrowAltToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.35f, 22.39f)
                lineToRelative(5.77f, -6.39f)
                horizontalLineToRelative(-6.62f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 16f)
                lineTo(4.88f, 16f)
                lineToRelative(5.77f, 6.39f)
                curveToRelative(0.35f, 0.39f, 0.84f, 0.61f, 1.36f, 0.61f)
                reflectiveCurveToRelative(1.01f, -0.22f, 1.35f, -0.61f)
                close()
                moveTo(11.39f, 21.72f)
                lineToRelative(-4.27f, -4.72f)
                horizontalLineToRelative(9.75f)
                lineToRelative(-4.27f, 4.72f)
                curveToRelative(-0.32f, 0.36f, -0.9f, 0.36f, -1.22f, 0f)
                close()
                moveTo(21.0f, 23.0f)
                verticalLineToRelative(1f)
                lineTo(3f, 24.0f)
                verticalLineToRelative(-1f)
                lineTo(21f, 23.0f)
                close()
            }
        }.also { _ArrowAltToBottom = it}
