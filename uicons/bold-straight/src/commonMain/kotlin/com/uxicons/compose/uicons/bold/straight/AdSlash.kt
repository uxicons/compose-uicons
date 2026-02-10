package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdSlash: ImageVector? = null

val Icons.Bs.AdSlash: ImageVector
    get() = _AdSlash ?: UXIcon(name = "AdSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 22f)
                verticalLineToRelative(-17.05f)
                lineToRelative(3f, 3f)
                verticalLineToRelative(11.05f)
                horizontalLineToRelative(11.05f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(-17.05f)
                close()
                moveTo(24f, 5.5f)
                verticalLineToRelative(16.4f)
                lineToRelative(-2.11f, 2.1f)
                lineToRelative(-7.01f, -7f)
                horizontalLineToRelative(-1.88f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(3f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.33f, -0.66f, 2.5f, -1.65f, 3.23f)
                lineToRelative(2.65f, 2.65f)
                verticalLineToRelative(-13.38f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-13.38f)
                lineToRelative(2.04f, 2.04f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(0.8f, 0.58f, 0.92f, 1.66f, 0.92f, 1.66f)
                lineToRelative(1.92f, 8.29f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(-0.46f, -2f)
                horizontalLineToRelative(-2.97f)
                lineToRelative(-0.46f, 2f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(1.94f, -8.36f)
                reflectiveCurveToRelative(0.04f, -0.19f, 0.14f, -0.44f)
                lineToRelative(-6.03f, -6.03f)
                lineToRelative(2.12f, -2.16f)
                lineToRelative(1.96f, 2f)
                horizontalLineToRelative(16.38f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6.98f, 13f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-0.91f, -3.91f)
                curveToRelative(-0.02f, -0.12f, -0.2f, -0.12f, -0.23f, 0f)
                close()
                moveTo(18f, 11f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _AdSlash = it}
