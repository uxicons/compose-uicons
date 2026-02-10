package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsRaised: ImageVector? = null

val Icons.Ss.BlindsRaised: ImageVector
    get() = _BlindsRaised ?: UXIcon(name = "BlindsRaised") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.1f, 22f)
                curveToRelative(0.15f, 0.74f, 0.48f, 1.42f, 0.92f, 2f)
                lineTo(0f, 24f)
                lineTo(0f, 6f)
                lineTo(18f, 6f)
                verticalLineToRelative(4f)
                lineTo(2f, 10f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(14.1f)
                close()
                moveTo(22f, 18.18f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(1f)
                lineTo(18f, 4f)
                lineTo(18f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
            }
        }.also { _BlindsRaised = it}
