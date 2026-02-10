package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltToBottom: ImageVector? = null

val Icons.Rr.ArrowAltToBottom: ImageVector
    get() = _ArrowAltToBottom ?: UXIcon(name = "ArrowAltToBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.55f, 21.77f)
                curveToRelative(-0.15f, 0.15f, -0.35f, 0.23f, -0.55f, 0.23f)
                reflectiveCurveToRelative(-0.4f, -0.08f, -0.55f, -0.23f)
                lineToRelative(-4.36f, -4.42f)
                curveToRelative(-0.49f, -0.5f, -0.14f, -1.35f, 0.55f, -1.35f)
                horizontalLineToRelative(3.36f)
                lineTo(11f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(3.36f)
                curveToRelative(0.69f, 0f, 1.04f, 0.85f, 0.55f, 1.35f)
                lineToRelative(-4.36f, 4.42f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(20f, 24f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltToBottom = it}
