package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VisionTarget: ImageVector? = null

val Icons.Ss.VisionTarget: ImageVector
    get() = _VisionTarget ?: UXIcon(name = "VisionTarget") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.06f, 11.1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.54f, -1.08f, -3.48f, -5.1f, -8.06f, -5.1f)
                reflectiveCurveTo(4.48f, 10.02f, 3.94f, 11.1f)
                curveToRelative(-0.29f, 0.57f, -0.29f, 1.23f, 0f, 1.8f)
                curveToRelative(0.54f, 1.08f, 3.48f, 5.1f, 8.06f, 5.1f)
                reflectiveCurveToRelative(7.52f, -4.02f, 8.06f, -5.1f)
                curveToRelative(0.28f, -0.57f, 0.28f, -1.23f, 0f, -1.8f)
                close()
                moveTo(12.0f, 14.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(7.0f, 24f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                lineTo(2f, 17f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(7f, 22f)
                verticalLineToRelative(2f)
                close()
                moveTo(21.0f, 24f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(24.0f, 7f)
                horizontalLineToRelative(-2f)
                lineTo(22.0f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                lineTo(17.0f, 0f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24.0f, 7f)
                close()
                moveTo(2f, 7f)
                lineTo(0f, 7f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(7f, 0f)
                lineTo(7f, 2f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 7f)
                close()
            }
        }.also { _VisionTarget = it}
