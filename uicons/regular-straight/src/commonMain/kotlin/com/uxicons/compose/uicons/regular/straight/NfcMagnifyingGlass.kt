package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NfcMagnifyingGlass: ImageVector? = null

val Icons.Rs.NfcMagnifyingGlass: ImageVector
    get() = _NfcMagnifyingGlass ?: UXIcon(name = "NfcMagnifyingGlass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3.59f)
                lineToRelative(-2.41f, 2.41f)
                verticalLineToRelative(4.03f)
                curveToRelative(-0.29f, 0.49f, -0.54f, 1f, -0.71f, 1.56f)
                horizontalLineToRelative(-1.29f)
                lineTo(8f, 7.59f)
                lineToRelative(3.59f, -3.59f)
                horizontalLineToRelative(6.41f)
                verticalLineToRelative(5.29f)
                curveToRelative(-0.63f, -0.19f, -1.3f, -0.29f, -2f, -0.29f)
                close()
                moveTo(10.26f, 20f)
                lineTo(2f, 20f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(19f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7.26f)
                curveToRelative(0.81f, 0.57f, 1.49f, 1.3f, 2f, 2.15f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 22f)
                lineTo(12.41f, 22f)
                curveToRelative(-0.85f, -0.51f, -1.58f, -1.19f, -2.15f, -2f)
                close()
                moveTo(9.23f, 4f)
                lineTo(4f, 4f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(5.29f)
                curveToRelative(-0.19f, -0.63f, -0.29f, -1.3f, -0.29f, -2f)
                horizontalLineToRelative(-3f)
                lineTo(6f, 7.09f)
                lineToRelative(3.23f, -3.09f)
                close()
                moveTo(22.54f, 23.96f)
                lineToRelative(-3.79f, -3.79f)
                curveToRelative(-0.79f, 0.52f, -1.74f, 0.83f, -2.75f, 0.83f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 1.02f, -0.31f, 1.96f, -0.83f, 2.75f)
                lineToRelative(3.79f, 3.79f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(19f, 16f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _NfcMagnifyingGlass = it}
