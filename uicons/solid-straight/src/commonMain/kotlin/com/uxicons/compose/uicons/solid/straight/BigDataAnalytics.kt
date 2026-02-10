package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BigDataAnalytics: ImageVector? = null

val Icons.Ss.BigDataAnalytics: ImageVector
    get() = _BigDataAnalytics ?: UXIcon(name = "BigDataAnalytics") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.41f, 5f)
                horizontalLineToRelative(-4.41f)
                verticalLineToRelative(-4.41f)
                close()
                moveTo(19.5f, 18f)
                curveToRelative(3.04f, 0f, 4.28f, -0.81f, 4.5f, -1.08f)
                verticalLineToRelative(-2.42f)
                curveToRelative(0f, -0.88f, -1.85f, -1.5f, -4.5f, -1.5f)
                reflectiveCurveToRelative(-4.5f, 0.62f, -4.5f, 1.5f)
                verticalLineToRelative(2.42f)
                curveToRelative(0.22f, 0.27f, 1.46f, 1.08f, 4.5f, 1.08f)
                moveToRelative(0f, 6f)
                curveToRelative(2.86f, 0f, 4.5f, -0.79f, 4.5f, -2.17f)
                verticalLineToRelative(-2.83f)
                reflectiveCurveToRelative(-1f, 1f, -4.5f, 1f)
                reflectiveCurveToRelative(-4.5f, -1f, -4.5f, -1f)
                verticalLineToRelative(2.83f)
                curveToRelative(0f, 1.38f, 1.64f, 2.17f, 4.5f, 2.17f)
                moveToRelative(-6.5f, -2.17f)
                verticalLineToRelative(-7.33f)
                curveToRelative(0f, -1.05f, 0.63f, -3.5f, 6.5f, -3.5f)
                curveToRelative(0.18f, 0f, 0.33f, 0.01f, 0.5f, 0.01f)
                verticalLineToRelative(-4.01f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(13.75f)
                curveToRelative(-0.65f, -0.84f, -0.75f, -1.73f, -0.75f, -2.17f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(10f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _BigDataAnalytics = it}
