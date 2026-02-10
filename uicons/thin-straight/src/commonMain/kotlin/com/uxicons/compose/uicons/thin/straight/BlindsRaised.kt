package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsRaised: ImageVector? = null

val Icons.Ts.BlindsRaised: ImageVector
    get() = _BlindsRaised ?: UXIcon(name = "BlindsRaised") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19.05f)
                lineTo(22f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 24f)
                lineTo(17.76f, 24f)
                curveToRelative(-0.2f, -0.31f, -0.36f, -0.65f, -0.48f, -1f)
                lineTo(1f, 23f)
                lineTo(1f, 9f)
                lineTo(19f, 9f)
                lineTo(19f, 1f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                lineTo(21f, 19.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(18f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3f)
                lineTo(18f, 5f)
                verticalLineToRelative(3f)
                close()
                moveTo(18f, 4f)
                lineTo(1f, 4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _BlindsRaised = it}
