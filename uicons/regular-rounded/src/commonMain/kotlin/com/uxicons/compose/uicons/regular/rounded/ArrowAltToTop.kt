package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Rr.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.45f, 2.23f)
                curveToRelative(0.15f, -0.15f, 0.35f, -0.23f, 0.55f, -0.23f)
                reflectiveCurveToRelative(0.4f, 0.08f, 0.55f, 0.23f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.49f, 0.5f, 0.14f, 1.35f, -0.55f, 1.35f)
                horizontalLineToRelative(-3.36f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineTo(8f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.69f, 0f, -1.04f, -0.85f, -0.55f, -1.35f)
                lineTo(11.45f, 2.23f)
                close()
                moveTo(20f, 0f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineTo(20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltToTop = it}
