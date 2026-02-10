package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DigitalSignature: ImageVector? = null

val Icons.Bs.DigitalSignature: ImageVector
    get() = _DigitalSignature ?: UXIcon(name = "DigitalSignature") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.4f, 16.7f)
                lineToRelative(-7.3f, 7.3f)
                horizontalLineToRelative(-3.1f)
                verticalLineToRelative(-3.1f)
                lineToRelative(7.3f, -7.3f)
                curveToRelative(0.9f, -0.9f, 2.2f, -0.9f, 3.1f, 0f)
                curveToRelative(0.8f, 0.9f, 0.8f, 2.3f, 0f, 3.1f)
                close()
                moveTo(13.1f, 18f)
                lineTo(11f, 20.1f)
                verticalLineToRelative(3.9f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.7f, 0f, -3f, -1.3f, -3f, -3f)
                verticalLineToRelative(-21f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(10f)
                curveToRelative(-0.6f, -0.6f, -1.5f, -1f, -2.5f, -1f)
                curveToRelative(-0.2f, 0f, -0.3f, 0f, -0.5f, 0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(15f)
                close()
                moveTo(5f, 14f)
                curveToRelative(0.5f, 0f, 1f, -0.2f, 1.5f, -0.4f)
                curveToRelative(-0.9f, -1.2f, -1.5f, -2.5f, -1.5f, -3.6f)
                curveToRelative(0f, -1.6f, 1.3f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.3f, 3f, 3f)
                curveToRelative(0f, 1.1f, -0.6f, 2.4f, -1.5f, 3.5f)
                curveToRelative(0.5f, 0.3f, 1f, 0.4f, 1.5f, 0.4f)
                curveToRelative(0.1f, 0f, 0.6f, 0f, 1.2f, -0.3f)
                curveToRelative(-0.1f, -0.2f, -0.2f, -0.6f, -0.2f, -1.1f)
                curveToRelative(0f, -0.8f, 0.7f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.7f, 1.5f, 1.5f)
                curveToRelative(0f, 1.5f, -1f, 2.9f, -2.5f, 3.3f)
                curveToRelative(-0.5f, 0.1f, -1f, 0.2f, -1.5f, 0.2f)
                curveToRelative(-1.1f, 0f, -2.1f, -0.4f, -3f, -1.1f)
                curveToRelative(-0.9f, 0.7f, -2f, 1.1f, -3f, 1.1f)
                close()
                moveTo(7f, 10f)
                curveToRelative(0f, 0.6f, 0.4f, 1.5f, 1f, 2.2f)
                curveToRelative(0.6f, -0.8f, 1f, -1.6f, 1f, -2.2f)
                reflectiveCurveToRelative(-0.4f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.4f, -1f, 1f)
                close()
            }
        }.also { _DigitalSignature = it}
