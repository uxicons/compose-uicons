package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSittingToilet: ImageVector? = null

val Icons.Bs.UserSittingToilet: ImageVector
    get() = _UserSittingToilet ?: UXIcon(name = "UserSittingToilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 17f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.61f, -2.06f, 4f, -5f, 4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(20.47f, 13.93f)
                curveToRelative(-0.48f, -0.59f, -1.19f, -0.93f, -1.94f, -0.93f)
                horizontalLineToRelative(-4.36f)
                lineToRelative(1.26f, -3.25f)
                lineToRelative(3.39f, 3.05f)
                lineToRelative(2.01f, -2.23f)
                lineToRelative(-5.46f, -4.92f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(-0.43f, -0.4f, -1.01f, -0.66f, -1.67f, -0.66f)
                curveToRelative(-1.01f, 0f, -1.92f, 0.62f, -2.29f, 1.56f)
                lineToRelative(-2.15f, 5.53f)
                curveToRelative(-0.45f, 0.98f, -0.3f, 2.12f, 0.42f, 2.96f)
                curveToRelative(0.55f, 0.64f, 1.39f, 0.94f, 2.22f, 0.94f)
                horizontalLineToRelative(6.01f)
                lineToRelative(-1.45f, 6.9f)
                lineToRelative(2.94f, 0.62f)
                lineToRelative(1.58f, -7.5f)
                curveToRelative(0.16f, -0.74f, -0.03f, -1.5f, -0.51f, -2.09f)
                close()
            }
        }.also { _UserSittingToilet = it}
