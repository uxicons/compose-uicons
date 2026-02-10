package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedAlt: ImageVector? = null

val Icons.Rr.BedAlt: ImageVector
    get() = _BedAlt ?: UXIcon(name = "BedAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineTo(5f, 2f)
                curveTo(2.24f, 2f, 0f, 4.24f, 0f, 7f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                lineTo(22f, 19f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(5f, 4f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.19f, 0f, -2.27f, 0.53f, -3f, 1.36f)
                curveToRelative(-0.73f, -0.83f, -1.81f, -1.36f, -3f, -1.36f)
                horizontalLineToRelative(-1f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                lineTo(2f, 13f)
                lineTo(2f, 7f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(13f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(6f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                lineTo(6f, 13f)
                close()
                moveTo(2f, 17f)
                verticalLineToRelative(-2f)
                lineTo(22f, 15f)
                verticalLineToRelative(2f)
                lineTo(2f, 17f)
                close()
            }
        }.also { _BedAlt = it}
