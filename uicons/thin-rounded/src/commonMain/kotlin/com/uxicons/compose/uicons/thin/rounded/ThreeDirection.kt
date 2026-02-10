package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThreeDirection: ImageVector? = null

val Icons.Tr.ThreeDirection: ImageVector
    get() = _ThreeDirection ?: UXIcon(name = "ThreeDirection") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 8.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3.79f)
                lineToRelative(-4.39f, 4.39f)
                curveToRelative(-1.04f, 1.04f, -1.61f, 2.42f, -1.61f, 3.89f)
                verticalLineToRelative(6.51f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-6.51f)
                curveToRelative(0f, -1.74f, 0.68f, -3.37f, 1.9f, -4.6f)
                lineToRelative(4.39f, -4.39f)
                horizontalLineToRelative(-3.79f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(1.71f, 8f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineTo(1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-3.79f)
                lineToRelative(4.39f, 4.39f)
                curveToRelative(1.04f, 1.04f, 1.61f, 2.42f, 1.61f, 3.89f)
                verticalLineToRelative(6.51f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.51f)
                curveToRelative(0f, -1.74f, -0.68f, -3.37f, -1.9f, -4.6f)
                lineTo(1.71f, 8f)
                close()
                moveTo(15.86f, 3.25f)
                lineTo(13.19f, 0.54f)
                curveToRelative(-0.61f, -0.68f, -1.8f, -0.67f, -2.4f, -0.01f)
                lineToRelative(-2.65f, 2.79f)
                curveToRelative(-0.19f, 0.2f, -0.18f, 0.52f, 0.02f, 0.71f)
                curveToRelative(0.2f, 0.19f, 0.52f, 0.18f, 0.71f, -0.02f)
                lineToRelative(2.64f, -2.77f)
                verticalLineTo(23.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineTo(1.27f)
                lineToRelative(2.64f, 2.68f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.01f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                close()
            }
        }.also { _ThreeDirection = it}
