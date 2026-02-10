package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromTop: ImageVector? = null

val Icons.Rr.ArrowAltFromTop: ImageVector
    get() = _ArrowAltFromTop ?: UXIcon(name = "ArrowAltFromTop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                horizontalLineTo(4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                verticalLineTo(18f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.69f, 0f, -1.04f, 0.85f, -0.55f, 1.35f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.3f, 0.31f, 0.8f, 0.31f, 1.1f, 0f)
                lineToRelative(4.36f, -4.42f)
                curveToRelative(0.49f, -0.5f, 0.14f, -1.35f, -0.55f, -1.35f)
                horizontalLineToRelative(-3.36f)
                verticalLineTo(2f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltFromTop = it}
