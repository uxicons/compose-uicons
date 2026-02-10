package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltDown: ImageVector? = null

val Icons.Bs.ArrowAltDown: ImageVector
    get() = _ArrowAltDown ?: UXIcon(name = "ArrowAltDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 18f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(18f)
                horizontalLineTo(5.92f)
                lineToRelative(5.08f, 5.55f)
                curveToRelative(0.53f, 0.59f, 1.46f, 0.59f, 1.99f, 0f)
                lineToRelative(5.08f, -5.55f)
                horizontalLineToRelative(-4.58f)
                close()
            }
        }.also { _ArrowAltDown = it}
