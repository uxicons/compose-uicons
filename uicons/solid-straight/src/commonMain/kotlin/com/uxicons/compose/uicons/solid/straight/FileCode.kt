package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileCode: ImageVector? = null

val Icons.Ss.FileCode: ImageVector
    get() = _FileCode ?: UXIcon(name = "FileCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(22f, 7f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveTo(2f, 1.34f, 3.34f, 0f, 5f, 0f)
                lineTo(15f, 0f)
                lineTo(15f, 7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(8.0f, 16.07f)
                lineToRelative(2.78f, -2.78f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.78f, 2.78f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.04f, 0f, 2.81f)
                lineToRelative(2.73f, 2.73f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.73f, -2.72f)
                close()
                moveTo(17.39f, 14.75f)
                lineToRelative(-2.78f, -2.78f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(2.78f, 2.76f)
                lineToRelative(-2.73f, 2.73f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.73f, -2.73f)
                curveToRelative(0.77f, -0.78f, 0.77f, -2.04f, 0f, -2.81f)
                close()
            }
        }.also { _FileCode = it}
