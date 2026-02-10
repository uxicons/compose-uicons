package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerImage: ImageVector? = null

val Icons.Br.ScannerImage: ImageVector
    get() = _ScannerImage ?: UXIcon(name = "ScannerImage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.7f, 16.34f)
            curveToRelative(-0.02f, -0.02f, -19.25f, -16.0f, -19.25f, -16.0f)
            curveTo(2.82f, -0.18f, 1.88f, -0.1f, 1.35f, 0.54f)
            curveToRelative(-0.53f, 0.64f, -0.44f, 1.58f, 0.2f, 2.11f)
            lineToRelative(14.87f, 12.35f)
            lineTo(4.5f, 15f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(15f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            curveToRelative(0f, -1.23f, -0.5f, -2.35f, -1.3f, -3.16f)
            close()
            moveTo(19.5f, 21f)
            lineTo(4.5f, 21f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _ScannerImage = it }
