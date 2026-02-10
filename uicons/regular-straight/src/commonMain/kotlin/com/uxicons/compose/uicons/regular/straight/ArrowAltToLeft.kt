package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToLeft: ImageVector? = null

val Icons.Rs.ArrowAltToLeft: ImageVector
    get() = _ArrowAltToLeft ?: UXIcon(name = "ArrowAltToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 13f)
                horizontalLineTo(8f)
                verticalLineToRelative(5f)
                lineTo(2.44f, 12.98f)
                curveToRelative(-0.3f, -0.26f, -0.45f, -0.62f, -0.45f, -0.98f)
                reflectiveCurveToRelative(0.15f, -0.72f, 0.45f, -0.98f)
                lineToRelative(5.55f, -5.02f)
                verticalLineToRelative(5f)
                horizontalLineTo(24f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 3f)
                verticalLineTo(21f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                horizontalLineTo(0f)
                close()
            }
        }.also { _ArrowAltToLeft = it}
