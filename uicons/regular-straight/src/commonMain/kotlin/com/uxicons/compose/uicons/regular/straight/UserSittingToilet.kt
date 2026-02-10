package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSittingToilet: ImageVector? = null

val Icons.Rs.UserSittingToilet: ImageVector
    get() = _UserSittingToilet ?: UXIcon(name = "UserSittingToilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14.03f, 14f)
                horizontalLineToRelative(3.7f)
                curveToRelative(1.29f, 0f, 2.24f, 1.2f, 1.95f, 2.46f)
                lineToRelative(-1.71f, 7.27f)
                lineToRelative(-1.95f, -0.46f)
                lineToRelative(1.71f, -7.27f)
                horizontalLineToRelative(-6.74f)
                curveToRelative(-1.88f, 0.05f, -3.43f, -1.9f, -2.91f, -3.71f)
                lineToRelative(1.75f, -4.95f)
                curveToRelative(0.31f, -1.55f, 1.95f, -2.63f, 3.5f, -2.29f)
                curveToRelative(0.79f, 0.15f, 1.47f, 0.6f, 1.92f, 1.27f)
                curveToRelative(0.01f, 0.02f, 5.0f, 6.03f, 5.01f, 6.05f)
                lineToRelative(-1.54f, 1.28f)
                lineToRelative(-3.33f, -4.02f)
                close()
                moveTo(13.76f, 8.13f)
                curveToRelative(0.08f, -0.51f, -0.3f, -1.02f, -0.8f, -1.13f)
                curveToRelative(-0.52f, -0.12f, -1.08f, 0.26f, -1.17f, 0.79f)
                curveToRelative(-0.02f, 0.14f, -1.74f, 4.93f, -1.78f, 5.07f)
                curveToRelative(0.01f, 0.73f, 0.24f, 1.02f, 0.99f, 1.13f)
                horizontalLineToRelative(0.94f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.73f, -1.04f, 5f, -5f, 5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13.85f, 19f)
                horizontalLineToRelative(-8.85f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.26f)
                curveToRelative(0.31f, -0.57f, 0.9f, -1f, 1.74f, -1f)
                horizontalLineToRelative(1f)
                curveToRelative(1.88f, 0f, 2.58f, -1.11f, 2.85f, -2f)
                close()
            }
        }.also { _UserSittingToilet = it}
