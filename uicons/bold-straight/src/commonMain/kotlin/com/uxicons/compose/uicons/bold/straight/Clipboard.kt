package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clipboard: ImageVector? = null

val Icons.Bs.Clipboard: ImageVector
    get() = _Clipboard ?: UXIcon(name = "Clipboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 2f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-0.41f, -1.17f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.31f, 0f, -2.42f, 0.83f, -2.83f, 2f)
                horizontalLineToRelative(-2.17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 5.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(19f, 21f)
                lineTo(5f, 21f)
                lineTo(5f, 5.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.41f, 1.17f, 1.52f, 2f, 2.83f, 2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.31f, 0f, 2.42f, -0.83f, 2.83f, -2f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(15.5f)
                close()
            }
        }.also { _Clipboard = it}
