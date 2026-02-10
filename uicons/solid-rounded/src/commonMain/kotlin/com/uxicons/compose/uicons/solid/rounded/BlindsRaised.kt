package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsRaised: ImageVector? = null

val Icons.Sr.BlindsRaised: ImageVector
    get() = _BlindsRaised ?: UXIcon(name = "BlindsRaised") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.18f)
                verticalLineTo(5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                horizontalLineTo(5f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineTo(15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(5f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineTo(10f)
                horizontalLineToRelative(15f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineTo(2f)
                verticalLineToRelative(-2f)
                horizontalLineTo(18f)
                verticalLineToRelative(-1.83f)
                curveToRelative(1.16f, 0.41f, 2f, 1.52f, 2f, 2.83f)
                verticalLineToRelative(13.18f)
                curveToRelative(-1.34f, 0.48f, -2.25f, 1.86f, -1.94f, 3.42f)
                curveToRelative(0.23f, 1.18f, 1.2f, 2.13f, 2.38f, 2.35f)
                curveToRelative(1.9f, 0.35f, 3.56f, -1.11f, 3.56f, -2.95f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
            }
        }.also { _BlindsRaised = it}
