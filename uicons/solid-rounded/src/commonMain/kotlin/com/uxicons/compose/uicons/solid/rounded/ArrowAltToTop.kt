package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToTop: ImageVector? = null

val Icons.Sr.ArrowAltToTop: ImageVector
    get() = _ArrowAltToTop ?: UXIcon(name = "ArrowAltToTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.65f)
                curveToRelative(-0.07f, 0.04f, -0.14f, 0.09f, -0.2f, 0.15f)
                lineTo(7.09f, 6.65f)
                curveToRelative(-0.49f, 0.5f, -0.14f, 1.35f, 0.55f, 1.35f)
                horizontalLineToRelative(3.36f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(8f)
                horizontalLineToRelative(3.36f)
                curveToRelative(0.69f, 0f, 1.04f, -0.85f, 0.55f, -1.35f)
                lineTo(12.55f, 2.15f)
                curveToRelative(-0.06f, -0.06f, -0.13f, -0.11f, -0.2f, -0.15f)
                horizontalLineToRelative(7.65f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltToTop = it}
