package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Monument: ImageVector? = null

val Icons.Sr.Monument: ImageVector
    get() = _Monument ?: UXIcon(name = "Monument") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(17.38f, 5f)
                curveToRelative(-0.18f, -1.0f, -0.65f, -1.93f, -1.37f, -2.65f)
                lineToRelative(-1.18f, -1.18f)
                curveToRelative(-1.51f, -1.51f, -4.15f, -1.51f, -5.66f, 0f)
                lineToRelative(-1.18f, 1.18f)
                curveToRelative(-0.72f, 0.72f, -1.19f, 1.65f, -1.37f, 2.65f)
                horizontalLineToRelative(10.76f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(-1.29f, -11f)
                horizontalLineToRelative(-4.64f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11.0f, 7f)
                lineTo(6.36f, 7f)
                lineToRelative(-1.29f, 11f)
                lineTo(3f, 18f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineTo(21f, 20f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Monument = it}
