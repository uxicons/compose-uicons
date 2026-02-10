package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcMagnifyingGlass: ImageVector? = null

val Icons.Ss.NfcMagnifyingGlass: ImageVector
    get() = _NfcMagnifyingGlass ?: UXIcon(name = "NfcMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 22.54f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(12.41f, 5f)
                horizontalLineToRelative(4.59f)
                verticalLineToRelative(5f)
                curveToRelative(-1.91f, 0f, -3.63f, 0.76f, -4.89f, 2f)
                horizontalLineToRelative(-2.11f)
                lineTo(10f, 7.41f)
                lineToRelative(2.41f, -2.41f)
                close()
                moveTo(12.1f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(19f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(22f, 12.11f)
                curveToRelative(-0.82f, -0.84f, -1.85f, -1.47f, -3f, -1.81f)
                lineTo(19f, 3f)
                horizontalLineToRelative(-7.41f)
                lineToRelative(-3.59f, 3.59f)
                verticalLineToRelative(7.41f)
                horizontalLineToRelative(2.68f)
                curveToRelative(-0.43f, 0.91f, -0.68f, 1.92f, -0.68f, 3f)
                lineTo(5f, 17f)
                lineTo(5f, 6.09f)
                lineToRelative(3.23f, -3.09f)
                lineTo(3f, 3f)
                lineTo(3f, 19f)
                horizontalLineToRelative(7.29f)
                curveToRelative(0.34f, 1.15f, 0.97f, 2.18f, 1.81f, 3f)
                close()
            }
        }.also { _NfcMagnifyingGlass = it}
