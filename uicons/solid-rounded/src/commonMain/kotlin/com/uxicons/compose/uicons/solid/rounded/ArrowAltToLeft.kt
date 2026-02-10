package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToLeft: ImageVector? = null

val Icons.Sr.ArrowAltToLeft: ImageVector
    get() = _ArrowAltToLeft ?: UXIcon(name = "ArrowAltToLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineTo(8f)
                verticalLineToRelative(3.36f)
                curveToRelative(0f, 0.69f, -0.85f, 1.04f, -1.35f, 0.55f)
                lineTo(2.23f, 12.55f)
                curveToRelative(-0.15f, -0.15f, -0.23f, -0.35f, -0.23f, -0.55f)
                reflectiveCurveToRelative(0.08f, -0.4f, 0.23f, -0.55f)
                lineTo(6.65f, 7.09f)
                curveToRelative(0.5f, -0.49f, 1.35f, -0.14f, 1.35f, 0.55f)
                verticalLineToRelative(3.36f)
                horizontalLineToRelative(15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(1f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltToLeft = it}
