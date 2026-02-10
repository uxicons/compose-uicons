package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromBottom: ImageVector? = null

val Icons.Bs.ArrowAltFromBottom: ImageVector
    get() = _ArrowAltFromBottom ?: UXIcon(name = "ArrowAltFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 21f)
                verticalLineTo(6f)
                horizontalLineToRelative(4.5f)
                lineTo(12.98f, 0.45f)
                curveToRelative(-0.53f, -0.59f, -1.44f, -0.59f, -1.97f, 0f)
                lineTo(6f, 6f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(15f)
                horizontalLineTo(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(21f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.5f)
                close()
            }
        }.also { _ArrowAltFromBottom = it}
