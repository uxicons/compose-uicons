package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltFromRight: ImageVector? = null

val Icons.Sr.ArrowAltFromRight: ImageVector
    get() = _ArrowAltFromRight ?: UXIcon(name = "ArrowAltFromRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7f)
                horizontalLineTo(6f)
                verticalLineToRelative(-3.36f)
                curveToRelative(0f, -0.69f, -0.85f, -1.04f, -1.35f, -0.55f)
                lineTo(0.23f, 11.45f)
                curveToRelative(-0.31f, 0.3f, -0.31f, 0.8f, 0f, 1.1f)
                lineToRelative(4.42f, 4.36f)
                curveToRelative(0.5f, 0.49f, 1.35f, 0.14f, 1.35f, -0.55f)
                verticalLineToRelative(-3.36f)
                horizontalLineTo(22f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowAltFromRight = it}
