package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToDot: ImageVector? = null

val Icons.Ts.ArrowsToDot: ImageVector
    get() = _ArrowsToDot ?: UXIcon(name = "ArrowsToDot") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10.96f, 8.06f)
                lineTo(7.05f, 4.18f)
                lineTo(7.76f, 3.47f)
                lineTo(11.5f, 7.2f)
                verticalLineToRelative(-7.2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.21f)
                lineToRelative(3.74f, -3.74f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.89f, 3.89f)
                curveToRelative(-0.28f, 0.28f, -0.65f, 0.44f, -1.05f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.05f, -0.44f)
                close()
                moveTo(13.04f, 15.94f)
                lineTo(16.95f, 19.82f)
                lineTo(16.24f, 20.53f)
                lineTo(12.5f, 16.81f)
                verticalLineToRelative(7.2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.21f)
                lineToRelative(-3.74f, 3.74f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.89f, -3.89f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0f)
                close()
                moveTo(8.06f, 13.04f)
                lineTo(4.18f, 16.95f)
                lineTo(3.47f, 16.24f)
                lineTo(7.2f, 12.5f)
                horizontalLineToRelative(-7.2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7.21f)
                lineToRelative(-3.74f, -3.74f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.89f, 3.89f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.52f, 0f, 2.1f)
                close()
                moveTo(24.0f, 12.5f)
                horizontalLineToRelative(-7.21f)
                lineToRelative(3.74f, 3.74f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.89f, -3.89f)
                curveToRelative(-0.58f, -0.58f, -0.58f, -1.52f, 0f, -2.1f)
                lineToRelative(3.89f, -3.9f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.73f, 3.74f)
                horizontalLineToRelative(7.2f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _ArrowsToDot = it}
