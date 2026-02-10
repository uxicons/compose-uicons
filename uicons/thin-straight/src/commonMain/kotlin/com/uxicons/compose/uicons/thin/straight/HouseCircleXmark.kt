package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleXmark: ImageVector? = null

val Icons.Ts.HouseCircleXmark: ImageVector
    get() = _HouseCircleXmark ?: UXIcon(name = "HouseCircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(20.2f, 15.51f)
                lineToRelative(-1.99f, 1.99f)
                lineToRelative(1.99f, 1.99f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-1.99f, -1.99f)
                lineToRelative(-1.99f, 1.99f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(1.99f, -1.99f)
                lineToRelative(-1.99f, -1.99f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(1.99f, 1.99f)
                lineToRelative(1.99f, -1.99f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(24f, 9.99f)
                verticalLineToRelative(2.04f)
                curveToRelative(-0.3f, -0.36f, -0.64f, -0.7f, -1f, -1.0f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0f, -0.52f, -0.24f, -1.01f, -0.65f, -1.33f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(13.04f, 1.36f, 13.04f, 1.36f)
                curveToRelative(-0.61f, -0.48f, -1.47f, -0.48f, -2.08f, 0f)
                lineTo(1.65f, 8.65f)
                curveToRelative(-0.41f, 0.32f, -0.65f, 0.81f, -0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                horizontalLineToRelative(10.03f)
                curveToRelative(0.31f, 0.36f, 0.64f, 0.69f, 1.0f, 1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.83f, 0.38f, -1.61f, 1.03f, -2.12f)
                lineTo(10.34f, 0.57f)
                curveToRelative(0.98f, -0.77f, 2.34f, -0.77f, 3.32f, 0f)
                lineToRelative(9.31f, 7.29f)
                curveToRelative(0.65f, 0.51f, 1.03f, 1.3f, 1.03f, 2.12f)
                close()
            }
        }.also { _HouseCircleXmark = it}
