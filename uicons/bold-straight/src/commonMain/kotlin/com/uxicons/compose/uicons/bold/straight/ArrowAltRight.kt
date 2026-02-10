package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltRight: ImageVector? = null

val Icons.Bs.ArrowAltRight: ImageVector
    get() = _ArrowAltRight ?: UXIcon(name = "ArrowAltRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.55f, 11.0f)
                lineToRelative(-5.55f, -5.08f)
                verticalLineToRelative(4.58f)
                horizontalLineTo(0f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                verticalLineToRelative(4.58f)
                lineToRelative(5.55f, -5.08f)
                curveToRelative(0.59f, -0.53f, 0.59f, -1.46f, 0f, -1.99f)
                close()
            }
        }.also { _ArrowAltRight = it}
