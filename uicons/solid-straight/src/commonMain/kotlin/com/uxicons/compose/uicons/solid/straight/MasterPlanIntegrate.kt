package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MasterPlanIntegrate: ImageVector? = null

val Icons.Ss.MasterPlanIntegrate: ImageVector
    get() = _MasterPlanIntegrate ?: UXIcon(name = "MasterPlanIntegrate") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 2.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3.45f)
                reflectiveCurveToRelative(1.79f, -1.79f, 1.79f, -1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.89f, 2.89f)
                curveToRelative(-0.73f, 0.73f, -1.91f, 0.73f, -2.64f, 0f)
                lineToRelative(-2.89f, -2.89f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                verticalLineToRelative(-3.44f)
                lineTo(6f, 12.0f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                lineTo(0f, 8.0f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(7.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(5.5f)
                lineTo(6f, 8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                lineTo(14f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(21f, 15f)
                horizontalLineToRelative(-2.14f)
                lineToRelative(-4.17f, 4.14f)
                curveToRelative(-1.49f, 1.48f, -3.9f, 1.48f, -5.4f, 0f)
                lineToRelative(-4.16f, -4.14f)
                lineTo(3f, 15.0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(6f)
                lineTo(24f, 24.0f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _MasterPlanIntegrate = it}
