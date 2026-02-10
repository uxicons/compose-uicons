package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VisionTarget: ImageVector? = null

val Icons.Rs.VisionTarget: ImageVector
    get() = _VisionTarget ?: UXIcon(name = "VisionTarget") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 22f)
                lineTo(7f, 22f)
                verticalLineToRelative(2f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                lineTo(2f, 17f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7f, 2f)
                lineTo(7f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 3f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-4f)
                lineTo(17f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                lineTo(22f, 7f)
                horizontalLineToRelative(2f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-4.58f, 0f, -7.52f, -4.02f, -8.06f, -5.1f)
                curveToRelative(-0.29f, -0.57f, -0.29f, -1.23f, 0f, -1.8f)
                curveToRelative(0.54f, -1.08f, 3.48f, -5.1f, 8.06f, -5.1f)
                reflectiveCurveToRelative(7.52f, 4.02f, 8.06f, 5.1f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0.57f, 0.28f, 1.23f, 0f, 1.8f)
                curveToRelative(-0.54f, 1.08f, -3.48f, 5.1f, -8.06f, 5.1f)
                close()
                moveTo(18.27f, 12.01f)
                curveToRelative(-0.33f, -0.66f, -2.74f, -4.01f, -6.27f, -4.01f)
                reflectiveCurveToRelative(-5.94f, 3.33f, -6.27f, 3.99f)
                curveToRelative(0.33f, 0.67f, 2.74f, 4.01f, 6.27f, 4.01f)
                reflectiveCurveToRelative(5.94f, -3.33f, 6.27f, -3.99f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _VisionTarget = it}
