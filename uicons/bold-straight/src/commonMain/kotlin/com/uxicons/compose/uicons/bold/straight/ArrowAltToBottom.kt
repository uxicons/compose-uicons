package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToBottom: ImageVector? = null

val Icons.Bs.ArrowAltToBottom: ImageVector
    get() = _ArrowAltToBottom ?: UXIcon(name = "ArrowAltToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 21f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.15f, -0.98f, -0.45f)
                lineToRelative(-5.02f, -5.55f)
                horizontalLineToRelative(4.5f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                lineTo(13.5f, 15f)
                horizontalLineToRelative(4.5f)
                lineToRelative(-5.02f, 5.55f)
                curveToRelative(-0.26f, 0.3f, -0.62f, 0.45f, -0.98f, 0.45f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(3f)
                lineTo(21f, 24f)
                verticalLineToRelative(-3f)
                lineTo(3f, 21f)
                close()
            }
        }.also { _ArrowAltToBottom = it}
