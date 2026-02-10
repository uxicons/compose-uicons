package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowToBottom: ImageVector? = null

val Icons.Ts.ArrowToBottom: ImageVector
    get() = _ArrowToBottom ?: UXIcon(name = "ArrowToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23f)
                horizontalLineToRelative(-6.29f)
                lineToRelative(6.15f, -6.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-5.65f, 5.65f)
                verticalLineTo(0f)
                horizontalLineToRelative(-1f)
                verticalLineTo(21.79f)
                lineToRelative(-5.65f, -5.65f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(6.15f, 6.15f)
                horizontalLineTo(5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ArrowToBottom = it}
