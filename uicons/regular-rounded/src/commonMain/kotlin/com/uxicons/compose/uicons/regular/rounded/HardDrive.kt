package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HardDrive: ImageVector? = null

val Icons.Rr.HardDrive: ImageVector
    get() = _HardDrive ?: UXIcon(name = "HardDrive") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 19.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(18.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23f, 16.2f)
                verticalLineToRelative(2.8f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-2.8f)
                curveToRelative(0.01f, -0.17f, 0.01f, -0.33f, 0.03f, -0.5f)
                lineToRelative(1.12f, -11.2f)
                curveToRelative(0.26f, -2.57f, 2.4f, -4.5f, 4.97f, -4.5f)
                horizontalLineToRelative(9.76f)
                curveToRelative(2.58f, 0f, 4.72f, 1.94f, 4.98f, 4.5f)
                lineToRelative(1.12f, 11.2f)
                curveToRelative(0.0f, 0.11f, 0.03f, 0.45f, 0.03f, 0.5f)
                close()
                moveTo(3.1f, 15f)
                horizontalLineToRelative(17.79f)
                lineToRelative(-1.03f, -10.3f)
                curveToRelative(-0.15f, -1.54f, -1.44f, -2.7f, -2.98f, -2.7f)
                horizontalLineToRelative(-9.76f)
                curveToRelative(-1.55f, 0f, -2.83f, 1.16f, -2.98f, 2.7f)
                close()
                moveTo(21f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _HardDrive = it}
