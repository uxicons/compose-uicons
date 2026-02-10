package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromRight: ImageVector? = null

val Icons.Rs.ArrowAltFromRight: ImageVector
    get() = _ArrowAltFromRight ?: UXIcon(name = "ArrowAltFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 3f)
                verticalLineTo(11f)
                horizontalLineTo(6f)
                verticalLineTo(6f)
                lineTo(0.45f, 11.08f)
                curveToRelative(-0.59f, 0.53f, -0.59f, 1.46f, 0f, 1.99f)
                lineToRelative(5.55f, 5.08f)
                verticalLineToRelative(-5.16f)
                horizontalLineTo(22f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(3f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _ArrowAltFromRight = it}
