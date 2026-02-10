package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Bs.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.65f, 3f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.24f, 0.08f, 0.46f, 0.24f, 0.64f, 0.45f)
                lineToRelative(5.02f, 5.55f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9f)
                horizontalLineTo(6f)
                lineTo(11.02f, 3.44f)
                curveToRelative(0.18f, -0.2f, 0.4f, -0.36f, 0.64f, -0.45f)
                close()
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(11.65f)
                curveToRelative(0.11f, -0.04f, 0.23f, -0.06f, 0.35f, -0.06f)
                reflectiveCurveToRelative(0.23f, 0.02f, 0.35f, 0.06f)
                horizontalLineToRelative(8.65f)
                verticalLineTo(0f)
                close()
            }
        }.also { _ArrowAltToTop = it}
