package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdForbidden: ImageVector? = null

val Icons.Bs.AdForbidden: ImageVector
    get() = _AdForbidden ?: UXIcon(name = "AdForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
                lineToRelative(1.52f, 1.52f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-1.52f, -1.52f)
                curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
                lineToRelative(-1.27f, -1.27f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
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
