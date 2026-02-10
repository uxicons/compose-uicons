package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Highlighter: ImageVector? = null

val Icons.Bs.Highlighter: ImageVector
    get() = _Highlighter ?: UXIcon(name = "Highlighter") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.0f, 3.52f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(-1.27f, -1.27f, -3.32f, -1.33f, -4.67f, -0.13f)
                lineTo(2f, 13.18f)
                verticalLineToRelative(6.7f)
                lineTo(-0.06f, 21.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.06f, -2.06f)
                horizontalLineToRelative(6.7f)
                lineToRelative(12.31f, -13.81f)
                curveToRelative(1.2f, -1.34f, 1.14f, -3.4f, -0.13f, -4.67f)
                close()
                moveTo(20.9f, 6.19f)
                lineToRelative(-11.12f, 12.47f)
                lineToRelative(-4.44f, -4.44f)
                lineTo(17.81f, 3.1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.16f, -0.14f, 0.4f, -0.14f, 0.55f, 0.01f)
                lineToRelative(2.53f, 2.53f)
                curveToRelative(0.15f, 0.15f, 0.16f, 0.39f, 0.02f, 0.55f)
                close()
            }
        }.also { _Highlighter = it}
