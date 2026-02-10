package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerImage: ImageVector? = null

val Icons.Tr.ScannerImage: ImageVector
    get() = _ScannerImage ?: UXIcon(name = "ScannerImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(8f, 19f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(24f, 19.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(3.5f, 24f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(16.73f)
                lineTo(2.18f, 0.88f)
                curveToRelative(-0.21f, -0.18f, -0.24f, -0.49f, -0.06f, -0.7f)
                curveToRelative(0.18f, -0.21f, 0.49f, -0.24f, 0.7f, -0.06f)
                curveTo(2.82f, 0.12f, 22.76f, 16.83f, 22.78f, 16.85f)
                curveToRelative(0.74f, 0.64f, 1.22f, 1.59f, 1.22f, 2.65f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(3.5f, 17f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(17f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _ScannerImage = it}
