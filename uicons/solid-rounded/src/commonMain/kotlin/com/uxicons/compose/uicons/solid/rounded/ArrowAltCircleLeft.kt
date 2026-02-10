package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleLeft: ImageVector? = null

val Icons.Sr.ArrowAltCircleLeft: ImageVector
    get() = _ArrowAltCircleLeft ?: UXIcon(name = "ArrowAltCircleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3.36f)
                curveToRelative(0f, 0.69f, -0.85f, 1.04f, -1.35f, 0.55f)
                lineToRelative(-4.42f, -4.36f)
                curveToRelative(-0.31f, -0.3f, -0.31f, -0.8f, 0f, -1.1f)
                lineToRelative(4.42f, -4.36f)
                curveToRelative(0.5f, -0.49f, 1.35f, -0.14f, 1.35f, 0.55f)
                verticalLineToRelative(3.36f)
                horizontalLineToRelative(5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _ArrowAltCircleLeft = it}
