package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToLeft: ImageVector? = null

val Icons.Bs.ArrowAltToLeft: ImageVector
    get() = _ArrowAltToLeft ?: UXIcon(name = "ArrowAltToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13.5f)
                horizontalLineTo(9f)
                verticalLineToRelative(4.5f)
                lineTo(3.44f, 12.98f)
                curveToRelative(-0.3f, -0.26f, -0.45f, -0.62f, -0.45f, -0.98f)
                reflectiveCurveToRelative(0.15f, -0.72f, 0.45f, -0.98f)
                lineToRelative(5.55f, -5.02f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(3f)
                close()
                moveTo(0f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                close()
            }
        }.also { _ArrowAltToLeft = it}
