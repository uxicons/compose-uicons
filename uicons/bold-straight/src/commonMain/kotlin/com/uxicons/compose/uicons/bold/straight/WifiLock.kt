package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiLock: ImageVector? = null

val Icons.Bs.WifiLock: ImageVector
    get() = _WifiLock ?: UXIcon(name = "WifiLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 4f)
                curveToRelative(-3.47f, 0f, -6.74f, 1.35f, -9.19f, 3.81f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(3.02f, -3.02f, 7.04f, -4.69f, 11.31f, -4.69f)
                reflectiveCurveToRelative(8.29f, 1.67f, 11.31f, 4.69f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-2.46f, -2.46f, -5.72f, -3.81f, -9.19f, -3.81f)
                close()
                moveTo(24f, 15f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(17f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(9f, 17f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(-5.63f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                close()
                moveTo(15.62f, 7.68f)
                curveToRelative(-1.14f, -0.44f, -2.36f, -0.68f, -3.62f, -0.68f)
                curveToRelative(-2.67f, 0f, -5.18f, 1.04f, -7.07f, 2.93f)
                lineToRelative(2.12f, 2.12f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                curveToRelative(0.33f, 0f, 0.66f, 0.03f, 0.98f, 0.08f)
                curveToRelative(0.64f, -1.02f, 1.55f, -1.86f, 2.63f, -2.4f)
                close()
            }
        }.also { _WifiLock = it}
