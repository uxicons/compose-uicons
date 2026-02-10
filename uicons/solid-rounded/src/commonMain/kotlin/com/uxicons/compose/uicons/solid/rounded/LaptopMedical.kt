package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopMedical: ImageVector? = null

val Icons.Sr.LaptopMedical: ImageVector
    get() = _LaptopMedical ?: UXIcon(name = "LaptopMedical") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.15f, 14f)
                curveToRelative(0.98f, 0f, 1.92f, 0.36f, 2.65f, 1f)
                horizontalLineToRelative(2.4f)
                curveToRelative(0.73f, -0.64f, 1.66f, -1f, 2.65f, -1f)
                horizontalLineToRelative(5.15f)
                curveToRelative(0.34f, 0f, 0.68f, 0.04f, 1f, 0.11f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(7f, 3f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6.11f)
                curveToRelative(0.32f, -0.07f, 0.66f, -0.11f, 1f, -0.11f)
                horizontalLineToRelative(5.15f)
                close()
                moveTo(9f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(24f, 18.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(2.5f, 21f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(5.65f)
                curveToRelative(0.59f, 0f, 1.15f, 0.26f, 1.53f, 0.71f)
                lineToRelative(0.25f, 0.29f)
                horizontalLineToRelative(4.15f)
                lineToRelative(0.25f, -0.29f)
                curveToRelative(0.38f, -0.45f, 0.94f, -0.71f, 1.53f, -0.71f)
                horizontalLineToRelative(5.65f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
            }
        }.also { _LaptopMedical = it}
