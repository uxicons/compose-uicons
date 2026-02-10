package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LaptopSignal: ImageVector? = null

val Icons.Rr.LaptopSignal: ImageVector
    get() = _LaptopSignal ?: UXIcon(name = "LaptopSignal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(19f, 9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(15f, 9f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -1.3f, 0.84f, -2.4f, 2f, -2.82f)
                verticalLineToRelative(-7.18f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.27f, 0f, 0.52f, 0.1f, 0.71f, 0.29f)
                lineToRelative(0.71f, 0.71f)
                horizontalLineToRelative(4.17f)
                lineToRelative(0.71f, -0.71f)
                curveToRelative(0.19f, -0.19f, 0.44f, -0.29f, 0.71f, -0.29f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(6.18f)
                curveToRelative(1.16f, 0.41f, 2f, 1.51f, 2f, 2.82f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5.09f)
                lineToRelative(-0.71f, 0.71f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-0.71f, -0.71f)
                horizontalLineToRelative(-5.09f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _LaptopSignal = it}
