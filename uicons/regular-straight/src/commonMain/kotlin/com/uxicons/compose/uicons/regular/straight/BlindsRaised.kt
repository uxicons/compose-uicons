package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlindsRaised: ImageVector? = null

val Icons.Rs.BlindsRaised: ImageVector
    get() = _BlindsRaised ?: UXIcon(name = "BlindsRaised") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18.17f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(17.02f, 24f)
                curveToRelative(-0.44f, -0.58f, -0.77f, -1.26f, -0.92f, -2f)
                lineTo(2f, 22f)
                lineTo(2f, 10f)
                lineTo(18f, 10f)
                lineTo(18f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15.17f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.52f, -2f, 2.83f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.3f, -0.84f, -2.42f, -2f, -2.83f)
                close()
                moveTo(2f, 8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(2f)
                lineTo(2f, 8f)
                close()
                moveTo(16f, 4f)
                lineTo(2f, 4f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _BlindsRaised = it}
