package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipoardWrong: ImageVector? = null

val Icons.Bs.ClipoardWrong: ImageVector
    get() = _ClipoardWrong ?: UXIcon(name = "ClipoardWrong") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.56f, 12.06f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(-2.44f, 2.44f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(-2.44f, -2.44f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(2.44f, -2.44f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(22f, 5.67f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.35f, 3.35f, 0f, 5f, 0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.66f)
                close()
                moveTo(19f, 21.0f)
                lineTo(19f, 8f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 21f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _ClipoardWrong = it}
