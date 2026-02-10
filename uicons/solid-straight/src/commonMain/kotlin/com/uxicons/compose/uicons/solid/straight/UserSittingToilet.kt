package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSittingToilet: ImageVector? = null

val Icons.Ss.UserSittingToilet: ImageVector
    get() = _UserSittingToilet ?: UXIcon(name = "UserSittingToilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(19.3f, 14.76f)
                curveToRelative(0.38f, 0.48f, 0.52f, 1.1f, 0.38f, 1.7f)
                lineToRelative(-1.71f, 7.27f)
                lineToRelative(-1.95f, -0.46f)
                lineToRelative(1.71f, -7.27f)
                horizontalLineToRelative(-6.74f)
                curveToRelative(-0.9f, 0f, -1.74f, -0.4f, -2.31f, -1.09f)
                curveToRelative(-0.57f, -0.69f, -0.8f, -1.59f, -0.63f, -2.48f)
                curveToRelative(0.02f, -0.14f, 1.75f, -4.95f, 1.79f, -5.09f)
                curveToRelative(0.17f, -0.75f, 0.61f, -1.4f, 1.25f, -1.83f)
                curveToRelative(0.66f, -0.45f, 1.46f, -0.61f, 2.25f, -0.46f)
                curveToRelative(0.79f, 0.15f, 1.47f, 0.6f, 1.92f, 1.27f)
                curveToRelative(0.0f, 0.01f, 0.01f, 0.01f, 0.01f, 0.01f)
                lineToRelative(5.0f, 6.04f)
                lineToRelative(-1.54f, 1.28f)
                lineToRelative(-4.1f, -4.94f)
                lineToRelative(-1.63f, 5.31f)
                horizontalLineToRelative(4.74f)
                curveToRelative(0.61f, 0f, 1.19f, 0.28f, 1.57f, 0.76f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(7f)
                reflectiveCurveToRelative(0f, 0f, 0f, -1f)
                reflectiveCurveToRelative(1f, -1f, 1f, -1f)
                curveToRelative(3.96f, 0f, 5f, -3.27f, 5f, -5f)
                horizontalLineToRelative(-11f)
                close()
            }
        }.also { _UserSittingToilet = it}
