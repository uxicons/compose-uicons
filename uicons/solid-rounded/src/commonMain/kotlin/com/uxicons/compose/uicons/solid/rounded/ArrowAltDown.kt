package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltDown: ImageVector? = null

val Icons.Sr.ArrowAltDown: ImageVector
    get() = _ArrowAltDown ?: UXIcon(name = "ArrowAltDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.36f, 18f)
                horizontalLineToRelative(-3.36f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineTo(18f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.69f, 0f, -1.04f, 0.85f, -0.55f, 1.35f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.3f, 0.31f, 0.8f, 0.31f, 1.1f, 0f)
                lineToRelative(4.36f, -4.42f)
                curveToRelative(0.49f, -0.5f, 0.14f, -1.35f, -0.55f, -1.35f)
                close()
            }
        }.also { _ArrowAltDown = it}
