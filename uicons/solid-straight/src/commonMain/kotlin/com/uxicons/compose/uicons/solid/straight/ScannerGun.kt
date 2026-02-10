package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerGun: ImageVector? = null

val Icons.Ss.ScannerGun: ImageVector
    get() = _ScannerGun ?: UXIcon(name = "ScannerGun") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                lineTo(17f, 0f)
                horizontalLineToRelative(7f)
                close()
                moveTo(17f, 6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 21f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 18f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                close()
                moveTo(0f, 8f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                lineTo(15f, 3f)
                lineTo(5f, 3f)
                curveTo(2.24f, 3f, 0f, 5.24f, 0f, 8f)
                close()
                moveTo(5f, 15f)
                curveToRelative(-0.98f, 0f, -1.91f, -0.2f, -2.76f, -0.57f)
                lineTo(0.11f, 20.76f)
                curveToRelative(-0.41f, 1.32f, 0.33f, 2.72f, 1.65f, 3.13f)
                curveToRelative(1.32f, 0.41f, 2.72f, -0.33f, 3.13f, -1.65f)
                lineToRelative(1.76f, -5.24f)
                horizontalLineToRelative(2.35f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _ScannerGun = it}
