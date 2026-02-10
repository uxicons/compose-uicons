package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Sr.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                reflectiveCurveTo(9.52f, 0f, 12f, 0f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                close()
                moveTo(22.2f, 11.16f)
                curveToRelative(-1.14f, -0.95f, -2.63f, -1.35f, -4.16f, -1.07f)
                lineToRelative(-1.76f, 0.43f)
                curveToRelative(-1.9f, 0.35f, -3.28f, 2.0f, -3.28f, 3.94f)
                verticalLineToRelative(7.47f)
                curveToRelative(-0.66f, 0.1f, -1.34f, 0.1f, -2f, 0f)
                verticalLineToRelative(-7.47f)
                curveToRelative(0f, -1.93f, -1.38f, -3.59f, -3.23f, -3.92f)
                lineToRelative(-1.88f, -0.46f)
                curveToRelative(-1.46f, -0.26f, -2.96f, 0.13f, -4.1f, 1.08f)
                curveToRelative(-1.14f, 0.95f, -1.8f, 2.35f, -1.8f, 3.84f)
                verticalLineToRelative(2.79f)
                curveToRelative(0f, 2.42f, 1.73f, 4.49f, 4.11f, 4.92f)
                lineToRelative(6.29f, 1.14f)
                curveToRelative(0.53f, 0.1f, 1.07f, 0.15f, 1.61f, 0.15f)
                reflectiveCurveToRelative(1.07f, -0.05f, 1.61f, -0.15f)
                lineToRelative(6.29f, -1.14f)
                curveToRelative(2.38f, -0.43f, 4.11f, -2.5f, 4.11f, -4.92f)
                verticalLineToRelative(-2.79f)
                curveToRelative(0f, -1.49f, -0.65f, -2.89f, -1.8f, -3.84f)
                close()
            }
        }.also { _BookOpenReader = it}
