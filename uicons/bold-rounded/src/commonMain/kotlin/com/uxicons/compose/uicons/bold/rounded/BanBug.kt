package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BanBug: ImageVector? = null

val Icons.Br.BanBug: ImageVector
    get() = _BanBug ?: UXIcon(name = "BanBug") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
            lineToRelative(-3.34f, -3.34f)
            curveToRelative(0f, -0.25f, -0.04f, -0.54f, -0.09f, -0.87f)
            horizontalLineToRelative(1.1f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.09f, -0.37f, -0.17f, -0.72f, -0.25f, -1.03f)
            curveToRelative(1.54f, -0.13f, 2.75f, -1.41f, 2.75f, -2.97f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-0.32f)
            curveToRelative(-0.52f, -1.33f, -1.33f, -2f, -2.68f, -2f)
            curveToRelative(-1.15f, 0f, -1.9f, 0.49f, -2.42f, 1.45f)
            lineToRelative(-2.78f, -2.78f)
            curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
            curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
            close()
            moveTo(3f, 12f)
            curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
            lineToRelative(12.53f, 12.53f)
            curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            close()
            moveTo(12.96f, 17.87f)
            curveToRelative(-0.31f, 0.08f, -0.63f, 0.13f, -0.96f, 0.13f)
            curveToRelative(-1.44f, 0f, -2.69f, -0.77f, -3.39f, -1.92f)
            curveToRelative(-0.36f, 0.15f, -0.61f, 0.51f, -0.61f, 0.92f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            curveToRelative(0f, -1.3f, 0.84f, -2.39f, 2f, -2.8f)
            verticalLineToRelative(-0.2f)
            curveToRelative(0f, -0.27f, 0.04f, -0.61f, 0.1f, -0.99f)
            lineToRelative(4.86f, 4.86f)
            close()
            moveTo(6f, 12f)
            curveToRelative(0f, -0.29f, 0.13f, -0.55f, 0.32f, -0.73f)
            lineToRelative(1.73f, 1.73f)
            horizontalLineToRelative(-1.05f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            close()
        }
    }.also { _BanBug = it }
