package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VestPatches: ImageVector? = null

val Icons.Ss.VestPatches: ImageVector
    get() = _VestPatches ?: UXIcon(name = "VestPatches") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.35f, 0.01f)
                lineToRelative(-3.35f, 9.1f)
                lineTo(8.65f, 0.01f)
                curveToRelative(0.2f, -0.01f, 0.33f, -0.01f, 0.35f, -0.01f)
                horizontalLineToRelative(6f)
                curveToRelative(0.02f, 0f, 0.15f, 0f, 0.35f, 0.01f)
                close()
                moveTo(23f, 11.63f)
                verticalLineToRelative(12.37f)
                lineTo(13f, 24f)
                lineTo(13f, 12.18f)
                lineTo(17.41f, 0.21f)
                curveToRelative(0.44f, 0.07f, 0.92f, 0.16f, 1.39f, 0.29f)
                curveToRelative(1.3f, 0.35f, 2.2f, 1.54f, 2.2f, 2.9f)
                verticalLineToRelative(4.61f)
                curveToRelative(0f, 0.97f, 1.43f, 2.96f, 2f, 3.63f)
                close()
                moveTo(20f, 15f)
                lineToRelative(-2f, -3f)
                lineToRelative(-2f, 3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(6.59f, 0.21f)
                lineToRelative(4.41f, 11.97f)
                verticalLineToRelative(11.82f)
                lineTo(1f, 24f)
                lineTo(1f, 11.63f)
                curveToRelative(0.68f, -0.8f, 2f, -2.7f, 2f, -3.63f)
                lineTo(3f, 3.39f)
                curveToRelative(0f, -1.36f, 0.91f, -2.55f, 2.2f, -2.9f)
                curveToRelative(0.47f, -0.13f, 0.94f, -0.22f, 1.39f, -0.29f)
                close()
                moveTo(8f, 19.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(8f, 12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _VestPatches = it}
