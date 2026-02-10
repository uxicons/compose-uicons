package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VestPatches: ImageVector? = null

val Icons.Bs.VestPatches: ImageVector
    get() = _VestPatches ?: UXIcon(name = "VestPatches") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(6f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(14.5f, 15f)
                horizontalLineToRelative(4f)
                lineToRelative(-2f, -3f)
                lineToRelative(-2f, 3f)
                close()
                moveTo(23f, 12.1f)
                verticalLineToRelative(11.9f)
                lineTo(1f, 24f)
                lineTo(1f, 12.1f)
                curveToRelative(0.69f, -0.81f, 2f, -2.74f, 2f, -3.45f)
                lineTo(3f, 3.89f)
                curveToRelative(0f, -1.58f, 1.06f, -2.97f, 2.57f, -3.38f)
                curveTo(7.48f, 0.01f, 9.42f, 0f, 9.5f, 0f)
                horizontalLineToRelative(5f)
                curveToRelative(0.08f, 0f, 2.02f, 0.01f, 3.93f, 0.52f)
                curveToRelative(1.52f, 0.41f, 2.57f, 1.79f, 2.57f, 3.38f)
                verticalLineToRelative(4.76f)
                curveToRelative(0f, 0.72f, 1.31f, 2.64f, 2f, 3.45f)
                close()
                moveTo(10.5f, 12.91f)
                lineTo(7.04f, 3.26f)
                curveToRelative(-0.23f, 0.04f, -0.46f, 0.1f, -0.69f, 0.16f)
                curveToRelative(-0.2f, 0.05f, -0.35f, 0.26f, -0.35f, 0.48f)
                verticalLineToRelative(4.76f)
                curveToRelative(0f, 1.71f, -1.3f, 3.63f, -2f, 4.53f)
                verticalLineToRelative(7.82f)
                horizontalLineToRelative(6.5f)
                lineTo(10.5f, 12.91f)
                close()
                moveTo(12f, 8.21f)
                lineToRelative(1.87f, -5.21f)
                horizontalLineToRelative(-3.74f)
                lineToRelative(1.87f, 5.21f)
                close()
                moveTo(20f, 13.18f)
                curveToRelative(-0.7f, -0.9f, -2f, -2.82f, -2f, -4.53f)
                lineTo(18f, 3.89f)
                curveToRelative(0f, -0.23f, -0.15f, -0.43f, -0.35f, -0.48f)
                curveToRelative(-0.23f, -0.06f, -0.46f, -0.11f, -0.69f, -0.16f)
                lineToRelative(-3.46f, 9.66f)
                verticalLineToRelative(8.09f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-7.82f)
                close()
            }
        }.also { _VestPatches = it}
