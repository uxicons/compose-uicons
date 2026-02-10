package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerGun: ImageVector? = null

val Icons.Bs.ScannerGun: ImageVector
    get() = _ScannerGun ?: UXIcon(name = "ScannerGun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 21f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-3f)
                close()
                moveTo(5.5f, 2f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-4.42f)
                lineToRelative(-0.67f, 2f)
                horizontalLineToRelative(1.09f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.1f)
                lineToRelative(-1.07f, 3.19f)
                curveToRelative(-0.52f, 1.69f, -2.1f, 2.78f, -3.81f, 2.78f)
                curveToRelative(-0.39f, 0f, -0.79f, -0.06f, -1.19f, -0.18f)
                curveToRelative(-2.1f, -0.66f, -3.29f, -2.9f, -2.63f, -5.01f)
                lineToRelative(2.25f, -6.71f)
                curveToRelative(-1.48f, -0.99f, -2.45f, -2.67f, -2.45f, -4.58f)
                curveTo(0f, 4.47f, 2.47f, 2f, 5.5f, 2f)
                close()
                moveTo(7.41f, 13f)
                horizontalLineToRelative(-1.91f)
                curveToRelative(-0.07f, 0f, -0.13f, -0.0f, -0.19f, -0.0f)
                lineToRelative(-2.25f, 6.71f)
                curveToRelative(-0.15f, 0.49f, 0.14f, 1.05f, 0.67f, 1.22f)
                curveToRelative(0.53f, 0.16f, 1.09f, -0.13f, 1.25f, -0.66f)
                lineToRelative(2.44f, -7.27f)
                close()
                moveTo(12f, 5f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(17f, 9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4f)
                close()
                moveTo(17f, 0f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _ScannerGun = it}
