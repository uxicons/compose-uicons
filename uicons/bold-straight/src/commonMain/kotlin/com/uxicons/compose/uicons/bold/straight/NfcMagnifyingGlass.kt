package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcMagnifyingGlass: ImageVector? = null

val Icons.Bs.NfcMagnifyingGlass: ImageVector
    get() = _NfcMagnifyingGlass ?: UXIcon(name = "NfcMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 10.68f)
                verticalLineToRelative(-2.68f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(2.55f)
                verticalLineToRelative(5f)
                curveToRelative(-1.08f, 0f, -2.09f, 0.25f, -3f, 0.68f)
                close()
                moveTo(3f, 19f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(15f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(6.79f)
                curveToRelative(1.15f, 0.34f, 2.18f, 0.97f, 3f, 1.81f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 22f)
                lineTo(12.11f, 22f)
                curveToRelative(-0.84f, -0.82f, -1.47f, -1.85f, -1.81f, -3f)
                lineTo(3f, 19f)
                close()
                moveTo(21.79f, 23.91f)
                lineToRelative(-2.47f, -2.47f)
                curveToRelative(-0.69f, 0.36f, -1.48f, 0.57f, -2.31f, 0.57f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.83f, -0.21f, 1.62f, -0.57f, 2.31f)
                lineToRelative(2.47f, 2.47f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(19f, 17f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
                moveTo(11.62f, 5f)
                lineTo(5f, 5f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(5f)
                curveToRelative(0f, -1.08f, 0.25f, -2.09f, 0.68f, -3f)
                horizontalLineToRelative(-2.68f)
                verticalLineToRelative(-5.38f)
                lineToRelative(3.62f, -3.62f)
                close()
            }
        }.also { _NfcMagnifyingGlass = it}
