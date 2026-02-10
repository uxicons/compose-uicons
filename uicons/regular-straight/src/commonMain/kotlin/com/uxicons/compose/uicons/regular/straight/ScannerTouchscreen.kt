package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerTouchscreen: ImageVector? = null

val Icons.Rs.ScannerTouchscreen: ImageVector
    get() = _ScannerTouchscreen ?: UXIcon(name = "ScannerTouchscreen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(15f, 4.42f)
                curveToRelative(0.8f, 0.35f, 1.48f, 0.9f, 2f, 1.59f)
                lineTo(17f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.42f)
                close()
                moveTo(16f, 9f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(14f, 9f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-12f)
                close()
                moveTo(4f, 10f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(10f)
                lineTo(4f, 20f)
                verticalLineToRelative(-10f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6f)
                close()
                moveTo(10f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                lineTo(10f, 0f)
                close()
                moveTo(18f, 14f)
                horizontalLineToRelative(2f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(14f)
                close()
                moveTo(21f, 0f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(3f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _ScannerTouchscreen = it}
