package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToRight: ImageVector? = null

val Icons.Sr.ArrowAltToRight: ImageVector
    get() = _ArrowAltToRight ?: UXIcon(name = "ArrowAltToRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.77f, 11.45f)
                curveToRelative(0.15f, 0.15f, 0.23f, 0.35f, 0.23f, 0.55f)
                reflectiveCurveToRelative(-0.08f, 0.4f, -0.23f, 0.55f)
                lineToRelative(-4.42f, 4.36f)
                curveToRelative(-0.5f, 0.49f, -1.35f, 0.14f, -1.35f, -0.55f)
                verticalLineToRelative(-3.36f)
                lineTo(1f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(-3.36f)
                curveToRelative(0f, -0.69f, 0.85f, -1.04f, 1.35f, -0.55f)
                lineToRelative(4.42f, 4.36f)
                close()
                moveTo(23f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(22f, 20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltToRight = it}
