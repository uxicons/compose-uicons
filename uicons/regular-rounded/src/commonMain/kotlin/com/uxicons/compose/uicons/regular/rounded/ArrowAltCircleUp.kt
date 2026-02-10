package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltCircleUp: ImageVector? = null

val Icons.Rr.ArrowAltCircleUp: ImageVector
    get() = _ArrowAltCircleUp ?: UXIcon(name = "ArrowAltCircleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.91f, 10.65f)
                curveToRelative(0.49f, 0.5f, 0.14f, 1.35f, -0.55f, 1.35f)
                horizontalLineToRelative(-3.36f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-3.36f)
                curveToRelative(-0.69f, 0f, -1.04f, -0.85f, -0.55f, -1.35f)
                lineToRelative(4.36f, -4.42f)
                curveToRelative(0.3f, -0.31f, 0.8f, -0.31f, 1.1f, 0f)
                lineToRelative(4.36f, 4.42f)
                close()
            }
        }.also { _ArrowAltCircleUp = it}
