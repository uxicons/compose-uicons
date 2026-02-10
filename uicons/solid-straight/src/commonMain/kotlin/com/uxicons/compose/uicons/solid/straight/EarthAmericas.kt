package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAmericas: ImageVector? = null

val Icons.Ss.EarthAmericas: ImageVector
    get() = _EarthAmericas ?: UXIcon(name = "EarthAmericas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.37f, 0f, -0.03f, 5.38f, -0.03f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.6f, 0f, 12f, 0f)
                close()
                moveTo(13f, 19f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-2f)
                lineToRelative(-1f, -1f)
                horizontalLineToRelative(-3f)
                lineToRelative(-2.1f, -2.2f)
                curveToRelative(1.59f, -3.42f, 5.07f, -5.8f, 9.1f, -5.8f)
                curveToRelative(0.21f, 0f, 0.41f, 0.01f, 0.62f, 0.02f)
                curveToRelative(-0.88f, 1.33f, -1.62f, 2.48f, -1.62f, 2.48f)
                lineToRelative(1.5f, 2.5f)
                lineToRelative(-1f, 1f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1.5f, 1.5f)
                lineToRelative(1.5f, 1.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-3f, 6.5f)
                close()
                moveTo(19f, 12f)
                lineToRelative(-1f, -4f)
                lineToRelative(2.4f, -1.39f)
                curveToRelative(1.0f, 1.55f, 1.57f, 3.4f, 1.57f, 5.39f)
                curveToRelative(0f, 0.48f, -0.04f, 0.96f, -0.1f, 1.43f)
                lineToRelative(-2.87f, -1.43f)
                close()
            }
        }.also { _EarthAmericas = it}
