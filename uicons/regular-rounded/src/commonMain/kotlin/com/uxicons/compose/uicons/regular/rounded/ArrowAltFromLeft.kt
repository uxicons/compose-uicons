package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromLeft: ImageVector? = null

val Icons.Rr.ArrowAltFromLeft: ImageVector
    get() = _ArrowAltFromLeft ?: UXIcon(name = "ArrowAltFromLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.77f, 11.45f)
                lineToRelative(-4.42f, -4.36f)
                curveToRelative(-0.5f, -0.49f, -1.35f, -0.14f, -1.35f, 0.55f)
                verticalLineToRelative(3.36f)
                horizontalLineTo(2f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineTo(18f)
                verticalLineToRelative(3.36f)
                curveToRelative(0f, 0.69f, 0.85f, 1.04f, 1.35f, 0.55f)
                lineToRelative(4.42f, -4.36f)
                curveToRelative(0.31f, -0.3f, 0.31f, -0.8f, 0f, -1.1f)
                close()
            }
        }.also { _ArrowAltFromLeft = it}
