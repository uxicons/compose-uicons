package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoldingHandRevenue: ImageVector? = null

val Icons.Ss.HoldingHandRevenue: ImageVector
    get() = _HoldingHandRevenue ?: UXIcon(name = "HoldingHandRevenue") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.0f, 9f)
                horizontalLineToRelative(-2f)
                lineToRelative(0.0f, -9f)
                horizontalLineToRelative(2f)
                lineToRelative(-0.0f, 9f)
                close()
                moveTo(13f, 2f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(-0.0f, 7.0f, -0.0f, 7.0f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0.0f, -7.0f, 0.0f, -7.0f)
                close()
                moveTo(5f, 4f)
                horizontalLineToRelative(-2f)
                reflectiveCurveToRelative(-0.0f, 5.0f, -0.0f, 5.0f)
                horizontalLineToRelative(2f)
                reflectiveCurveToRelative(0.0f, -5.0f, 0.0f, -5.0f)
                close()
                moveTo(23.34f, 12.35f)
                lineToRelative(-10.67f, 11.65f)
                lineTo(3.0f, 24f)
                curveTo(1.35f, 24f, 0.0f, 22.65f, 0.0f, 21f)
                verticalLineToRelative(-7f)
                curveTo(0.0f, 12.35f, 1.35f, 11f, 3.0f, 11f)
                horizontalLineToRelative(8.79f)
                curveToRelative(1.22f, 0f, 2.21f, 0.99f, 2.21f, 2.21f)
                curveToRelative(0f, 1.09f, -0.82f, 2.04f, -1.9f, 2.19f)
                lineToRelative(-4.24f, 0.61f)
                lineToRelative(0.28f, 1.98f)
                lineToRelative(4.24f, -0.61f)
                curveToRelative(2.06f, -0.29f, 3.62f, -2.09f, 3.62f, -4.17f)
                curveToRelative(0f, -0.22f, -0.03f, -0.43f, -0.07f, -0.64f)
                lineToRelative(3.54f, -3.74f)
                curveToRelative(0.46f, -0.5f, 1.1f, -0.8f, 1.79f, -0.83f)
                curveToRelative(0.69f, -0.03f, 1.36f, 0.21f, 1.88f, 0.68f)
                curveToRelative(1.05f, 0.96f, 1.14f, 2.6f, 0.19f, 3.67f)
                close()
            }
        }.also { _HoldingHandRevenue = it}
