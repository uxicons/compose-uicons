package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SoftwareDevelopment: ImageVector? = null

val Icons.Bs.SoftwareDevelopment: ImageVector
    get() = _SoftwareDevelopment ?: UXIcon(name = "SoftwareDevelopment") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(5.51f)
                curveToRelative(0.46f, -0.6f, 1.17f, -1f, 1.99f, -1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                curveToRelative(-0.81f, 0f, -1.53f, -0.4f, -1.99f, -1f)
                horizontalLineToRelative(-2.51f)
                close()
                moveTo(3.5f, 5f)
                curveToRelative(0.81f, 0f, 1.53f, -0.4f, 1.99f, -1f)
                horizontalLineToRelative(2.51f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-5.51f)
                curveToRelative(-0.46f, -0.6f, -1.17f, -1f, -1.99f, -1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(21f, 6.95f)
                verticalLineToRelative(9.05f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-9.05f)
                curveToRelative(-1.21f, -0.14f, -2.27f, -0.75f, -3f, -1.66f)
                verticalLineToRelative(13.71f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-13.71f)
                curveToRelative(-0.73f, 0.91f, -1.79f, 1.52f, -3f, 1.66f)
                close()
            }
        }.also { _SoftwareDevelopment = it}
