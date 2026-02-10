package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcLock: ImageVector? = null

val Icons.Bs.NfcLock: ImageVector
    get() = _NfcLock ?: UXIcon(name = "NfcLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.08f, 8f)
                horizontalLineToRelative(-3.63f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(2.18f)
                curveToRelative(-0.69f, 0.16f, -1.34f, 0.45f, -1.92f, 0.82f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.53f)
                curveToRelative(1.1f, 0.08f, 2.12f, 0.44f, 3f, 1.01f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 22f)
                lineTo(11f, 22f)
                verticalLineToRelative(-3f)
                lineTo(3f, 19f)
                lineTo(3f, 3.5f)
                close()
                moveTo(8f, 8.62f)
                lineToRelative(3.62f, -3.62f)
                lineTo(5f, 5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.38f)
                close()
            }
        }.also { _NfcLock = it}
