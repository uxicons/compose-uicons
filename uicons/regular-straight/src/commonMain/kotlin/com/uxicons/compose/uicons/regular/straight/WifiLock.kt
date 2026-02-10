package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WifiLock: ImageVector? = null

val Icons.Rs.WifiLock: ImageVector
    get() = _WifiLock ?: UXIcon(name = "WifiLock") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 14f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-7f)
                close()
                moveTo(16f, 13f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(8f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 4f)
                curveToRelative(-3.74f, 0f, -7.25f, 1.46f, -9.9f, 4.1f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(3.02f, -3.02f, 7.04f, -4.69f, 11.31f, -4.69f)
                reflectiveCurveToRelative(8.29f, 1.67f, 11.31f, 4.69f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-2.65f, -2.64f, -6.16f, -4.1f, -9.9f, -4.1f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-1.87f, 0f, -3.63f, 0.73f, -4.95f, 2.05f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.7f, -1.7f, 3.96f, -2.64f, 6.36f, -2.64f)
                curveToRelative(0.56f, 0f, 1.1f, 0.06f, 1.64f, 0.15f)
                curveToRelative(-0.43f, 0.55f, -0.75f, 1.19f, -0.94f, 1.88f)
                curveToRelative(-0.23f, -0.02f, -0.47f, -0.04f, -0.7f, -0.04f)
                close()
            }
        }.also { _WifiLock = it}
