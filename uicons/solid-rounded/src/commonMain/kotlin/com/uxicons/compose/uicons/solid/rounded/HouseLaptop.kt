package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseLaptop: ImageVector? = null

val Icons.Sr.HouseLaptop: ImageVector
    get() = _HouseLaptop ?: UXIcon(name = "HouseLaptop") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 10f)
                horizontalLineToRelative(7f)
                curveToRelative(2.49f, 0f, 4.5f, 2.01f, 4.5f, 4.5f)
                verticalLineToRelative(3.5f)
                lineTo(7f, 18f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.49f, 2.01f, -4.5f, 4.5f, -4.5f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-3.59f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.11f, -0.71f, 0.29f)
                lineToRelative(-0.41f, 0.41f)
                curveToRelative(-0.19f, 0.19f, -0.44f, 0.29f, -0.71f, 0.29f)
                horizontalLineToRelative(-3.17f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.11f, -0.71f, -0.29f)
                lineToRelative(-0.41f, -0.41f)
                curveToRelative(-0.19f, -0.19f, -0.44f, -0.29f, -0.71f, -0.29f)
                horizontalLineToRelative(-3.59f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(11.5f, 8f)
                horizontalLineToRelative(6.47f)
                curveToRelative(-0.13f, -1.24f, -0.72f, -2.39f, -1.67f, -3.22f)
                lineToRelative(-0.3f, -0.27f)
                lineTo(16f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1.75f)
                lineToRelative(-1.92f, -1.69f)
                curveTo(10.27f, -0.36f, 7.73f, -0.36f, 5.92f, 1.06f)
                lineTo(1.92f, 4.19f)
                curveToRelative(-1.22f, 0.95f, -1.92f, 2.39f, -1.92f, 3.94f)
                verticalLineToRelative(5.87f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                close()
            }
        }.also { _HouseLaptop = it}
