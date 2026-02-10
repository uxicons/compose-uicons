package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToBottom: ImageVector? = null

val Icons.Bs.ArrowToBottom: ImageVector
    get() = _ArrowToBottom ?: UXIcon(name = "ArrowToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.07f, 16.67f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-3.45f, 3.45f)
                lineToRelative(0f, -18.0f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, 18.0f)
                lineToRelative(-3.45f, -3.45f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(4.33f, 4.33f)
                lineToRelative(-4.26f, 0f)
                lineToRelative(0f, 3f)
                lineToRelative(14f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(-4.26f, 0f)
                lineToRelative(4.33f, -4.33f)
                close()
            }
        }.also { _ArrowToBottom = it}
