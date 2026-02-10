package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerTouchscreen: ImageVector? = null

val Icons.Ts.ScannerTouchscreen: ImageVector
    get() = _ScannerTouchscreen ?: UXIcon(name = "ScannerTouchscreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(14f, 4.05f)
                curveToRelative(0.73f, 0.08f, 1.42f, 0.32f, 2f, 0.71f)
                lineTo(16f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.05f)
                close()
                moveTo(9f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                lineTo(9f, 0f)
                close()
                moveTo(18f, 14f)
                horizontalLineToRelative(1f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(14f)
                close()
                moveTo(22f, 0f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(2f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(1f)
                lineTo(21f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(14f)
                close()
                moveTo(16f, 8.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 24.0f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-13f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(15f, 8.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 7.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-13f)
                close()
                moveTo(3f, 9.0f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(12.0f)
                lineTo(3f, 21f)
                verticalLineToRelative(-12.0f)
                close()
                moveTo(4f, 20f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-10.0f)
                lineTo(4f, 10.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }.also { _ScannerTouchscreen = it}
