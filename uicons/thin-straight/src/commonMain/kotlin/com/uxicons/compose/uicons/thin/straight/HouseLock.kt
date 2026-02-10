package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseLock: ImageVector? = null

val Icons.Ts.HouseLock: ImageVector
    get() = _HouseLock ?: UXIcon(name = "HouseLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.99f)
                verticalLineToRelative(3.01f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.09f, -0.98f, -0.44f, -1.89f, -0.97f, -2.65f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0f, -0.52f, -0.24f, -1.01f, -0.65f, -1.33f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(13.04f, 1.36f, 13.04f, 1.36f)
                curveToRelative(-0.61f, -0.48f, -1.47f, -0.48f, -2.08f, 0f)
                lineTo(1.65f, 8.65f)
                curveToRelative(-0.41f, 0.32f, -0.65f, 0.82f, -0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                horizontalLineToRelative(10.28f)
                curveToRelative(0.13f, 0.35f, 0.28f, 0.69f, 0.48f, 1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.82f, 0.39f, -1.61f, 1.03f, -2.12f)
                lineTo(10.34f, 0.57f)
                curveToRelative(0.98f, -0.77f, 2.34f, -0.77f, 3.32f, 0f)
                lineToRelative(9.31f, 7.29f)
                horizontalLineToRelative(0f)
                curveToRelative(0.65f, 0.51f, 1.03f, 1.3f, 1.03f, 2.12f)
                close()
                moveTo(19f, 18.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                close()
                moveTo(22f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(16f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(23f, 16f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.also { _HouseLock = it}
