package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Ss.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.02f, 2.44f)
                curveToRelative(0.26f, -0.3f, 0.62f, -0.45f, 0.98f, -0.45f)
                reflectiveCurveToRelative(0.72f, 0.15f, 0.98f, 0.45f)
                lineToRelative(5.02f, 5.55f)
                horizontalLineToRelative(-5f)
                verticalLineTo(24f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8f)
                horizontalLineTo(6f)
                lineTo(11.02f, 2.44f)
                close()
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(2f)
                horizontalLineTo(21f)
                verticalLineTo(0f)
                close()
            }
        }.also { _ArrowAltToTop = it}
