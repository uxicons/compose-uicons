package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VestPatches: ImageVector? = null

val Icons.Rs.VestPatches: ImageVector
    get() = _VestPatches ?: UXIcon(name = "VestPatches") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(23f, 11.63f)
                verticalLineToRelative(12.37f)
                lineTo(1f, 24f)
                lineTo(1f, 11.63f)
                curveToRelative(0.68f, -0.8f, 2f, -2.7f, 2f, -3.63f)
                lineTo(3f, 3.39f)
                curveToRelative(0f, -1.36f, 0.91f, -2.55f, 2.2f, -2.9f)
                curveToRelative(1.85f, -0.49f, 3.72f, -0.5f, 3.8f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.08f, 0f, 1.95f, 0.01f, 3.8f, 0.5f)
                curveToRelative(1.3f, 0.35f, 2.2f, 1.54f, 2.2f, 2.9f)
                verticalLineToRelative(4.61f)
                curveToRelative(0f, 0.97f, 1.43f, 2.96f, 2f, 3.63f)
                close()
                moveTo(11f, 12.18f)
                lineTo(7.34f, 2.12f)
                curveToRelative(-0.5f, 0.06f, -1.07f, 0.16f, -1.63f, 0.31f)
                curveToRelative(-0.42f, 0.11f, -0.72f, 0.51f, -0.72f, 0.96f)
                verticalLineToRelative(4.61f)
                curveToRelative(0f, 1.65f, -1.41f, 3.6f, -2f, 4.36f)
                verticalLineToRelative(9.64f)
                lineTo(11f, 22.0f)
                lineTo(11f, 12.18f)
                close()
                moveTo(12f, 9.07f)
                lineToRelative(2.57f, -7.07f)
                horizontalLineToRelative(-5.14f)
                lineToRelative(2.57f, 7.07f)
                close()
                moveTo(21f, 12.36f)
                curveToRelative(-0.59f, -0.75f, -2f, -2.71f, -2f, -4.36f)
                lineTo(19f, 3.39f)
                curveToRelative(0f, -0.45f, -0.29f, -0.85f, -0.72f, -0.96f)
                curveToRelative(-0.56f, -0.15f, -1.12f, -0.25f, -1.63f, -0.31f)
                lineToRelative(-3.66f, 10.05f)
                verticalLineToRelative(9.82f)
                horizontalLineToRelative(8f)
                lineTo(21f, 12.36f)
                close()
                moveTo(15f, 15f)
                horizontalLineToRelative(4f)
                lineToRelative(-2f, -3f)
                lineToRelative(-2f, 3f)
                close()
                moveTo(8f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _VestPatches = it}
