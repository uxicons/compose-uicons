package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IpAddress: ImageVector? = null

val Icons.Sr.IpAddress: ImageVector
    get() = _IpAddress ?: UXIcon(name = "IpAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.9f, 9.5f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                close()
                moveTo(22.91f, 11f)
                curveToRelative(0f, 2.94f, -1.14f, 5.7f, -3.22f, 7.78f)
                lineToRelative(-3.99f, 3.69f)
                curveToRelative(-1.0f, 0.98f, -2.35f, 1.53f, -3.79f, 1.53f)
                reflectiveCurveToRelative(-2.78f, -0.55f, -3.81f, -1.55f)
                lineToRelative(-3.94f, -3.64f)
                curveToRelative(-2.11f, -2.1f, -3.25f, -4.87f, -3.25f, -7.8f)
                reflectiveCurveToRelative(1.14f, -5.7f, 3.22f, -7.78f)
                curveTo(6.21f, 1.15f, 8.97f, 0f, 11.91f, 0f)
                reflectiveCurveToRelative(5.7f, 1.15f, 7.78f, 3.22f)
                curveToRelative(2.08f, 2.08f, 3.22f, 4.84f, 3.22f, 7.78f)
                close()
                moveTo(10f, 7.8f)
                curveToRelative(0f, -0.44f, -0.36f, -0.8f, -0.8f, -0.8f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.44f, 0f, -0.8f, 0.36f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0f, 0.44f, 0.36f, 0.8f, 0.8f, 0.8f)
                horizontalLineToRelative(0f)
                curveToRelative(0.44f, 0f, 0.8f, -0.36f, 0.8f, -0.8f)
                verticalLineToRelative(-6.4f)
                close()
                moveTo(16.5f, 9.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.7f)
                curveToRelative(-0.44f, 0f, -0.8f, 0.36f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0f, 0.44f, 0.36f, 0.8f, 0.8f, 0.8f)
                reflectiveCurveToRelative(0.8f, -0.36f, 0.8f, -0.8f)
                verticalLineToRelative(-2.2f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _IpAddress = it}
