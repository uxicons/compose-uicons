package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcLock: ImageVector? = null

val Icons.Ss.NfcLock: ImageVector
    get() = _NfcLock ?: UXIcon(name = "NfcLock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(12.41f, 5f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(2.09f)
                curveToRelative(-2.51f, 0.42f, -4.49f, 2.4f, -4.92f, 4.91f)
                horizontalLineToRelative(-2.08f)
                lineTo(10f, 7.41f)
                lineToRelative(2.41f, -2.41f)
                close()
                moveTo(10.1f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(5.54f)
                reflectiveCurveToRelative(0f, 0f, -0.01f, 0f)
                curveToRelative(-0.82f, -0.74f, -1.85f, -1.25f, -2.99f, -1.44f)
                lineTo(19f, 3f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                lineTo(5f, 17f)
                lineTo(5f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3f, 3f)
                lineTo(3f, 19f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.34f, 0.04f, 0.68f, 0.1f, 1f)
                close()
            }
        }.also { _NfcLock = it}
