package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToBottom: ImageVector? = null

val Icons.Ss.ArrowAltToBottom: ImageVector
    get() = _ArrowAltToBottom ?: UXIcon(name = "ArrowAltToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                curveToRelative(-0.36f, 0f, -0.72f, -0.15f, -0.98f, -0.45f)
                lineToRelative(-5.02f, -5.55f)
                horizontalLineToRelative(5f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                lineTo(13f, 16f)
                horizontalLineToRelative(5f)
                lineToRelative(-5.02f, 5.55f)
                curveToRelative(-0.26f, 0.3f, -0.62f, 0.45f, -0.98f, 0.45f)
                close()
                moveTo(3f, 22f)
                verticalLineToRelative(2f)
                lineTo(21f, 24f)
                verticalLineToRelative(-2f)
                lineTo(3f, 22f)
                close()
            }
        }.also { _ArrowAltToBottom = it}
