package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipoardWrong: ImageVector? = null

val Icons.Ss.ClipoardWrong: ImageVector
    get() = _ClipoardWrong ?: UXIcon(name = "ClipoardWrong") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(15f, 7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(16.21f, 18.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(2.79f, -2.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(2.79f, 2.79f)
                close()
            }
        }.also { _ClipoardWrong = it}
