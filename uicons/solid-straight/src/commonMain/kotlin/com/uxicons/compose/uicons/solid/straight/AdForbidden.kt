package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdForbidden: ImageVector? = null

val Icons.Ss.AdForbidden: ImageVector
    get() = _AdForbidden ?: UXIcon(name = "AdForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(2.06f, 2.06f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.06f, -2.06f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(1.79f, 1.79f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(9.26f, 8.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.76f, 0f, -1.28f, 0.59f, -1.39f, 1.17f)
                lineToRelative(-1.37f, 6.83f)
                horizontalLineToRelative(1.47f)
                lineToRelative(0.28f, -1.47f)
                horizontalLineToRelative(2.01f)
                lineToRelative(0.26f, 1.47f)
                horizontalLineToRelative(1.49f)
                lineToRelative(-1.4f, -6.81f)
                curveToRelative(-0.12f, -0.67f, -0.59f, -1.19f, -1.35f, -1.19f)
                close()
                moveTo(8.61f, 13f)
                lineToRelative(0.62f, -3.29f)
                lineToRelative(0.64f, 3.29f)
                horizontalLineToRelative(-1.26f)
                close()
                moveTo(17.6f, 13.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                close()
                moveTo(16f, 13.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.7f)
                verticalLineToRelative(-4.8f)
                horizontalLineToRelative(0.7f)
                curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
            }
        }.also { _AdForbidden = it}
