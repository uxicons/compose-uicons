package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleK: ImageVector? = null

val Icons.Sr.CircleK: ImageVector
    get() = _CircleK ?: UXIcon(name = "CircleK") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(16.78f, 16.38f)
                curveToRelative(0.34f, 0.43f, 0.27f, 1.06f, -0.16f, 1.41f)
                curveToRelative(-0.18f, 0.15f, -0.41f, 0.22f, -0.62f, 0.22f)
                curveToRelative(-0.29f, 0f, -0.58f, -0.13f, -0.78f, -0.38f)
                lineToRelative(-3.7f, -4.62f)
                horizontalLineToRelative(-2.52f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(7f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2.52f)
                lineToRelative(3.7f, -4.62f)
                curveToRelative(0.35f, -0.43f, 0.97f, -0.5f, 1.41f, -0.16f)
                curveToRelative(0.43f, 0.34f, 0.5f, 0.97f, 0.16f, 1.41f)
                lineToRelative(-3.5f, 4.38f)
                lineToRelative(3.5f, 4.38f)
                close()
            }
        }.also { _CircleK = it}
