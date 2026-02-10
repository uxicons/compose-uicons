package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserAdd: ImageVector? = null

val Icons.Sc.UserAdd: ImageVector
    get() = _UserAdd ?: UXIcon(name = "UserAdd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.31f, 13.66f)
                curveToRelative(-5.33f, 0.03f, -8.19f, 2.91f, -8.29f, 8.32f)
                curveToRelative(-0.01f, 0.27f, 0.1f, 0.53f, 0.29f, 0.72f)
                curveToRelative(0.19f, 0.19f, 0.44f, 0.3f, 0.71f, 0.3f)
                horizontalLineToRelative(14.6f)
                curveToRelative(0.27f, 0f, 0.53f, -0.11f, 0.71f, -0.3f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.45f, 0.29f, -0.72f)
                curveToRelative(-0.09f, -5.33f, -3.04f, -8.29f, -8.3f, -8.32f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.48f, 11.2f)
                horizontalLineToRelative(-1.26f)
                verticalLineToRelative(-1.26f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.26f)
                horizontalLineToRelative(-1.26f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.26f)
                verticalLineToRelative(1.26f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.26f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.33f, 12.31f)
                curveToRelative(3.61f, -0.02f, 5.55f, -1.97f, 5.62f, -5.67f)
                curveToRelative(-0.06f, -3.56f, -2.11f, -5.61f, -5.63f, -5.64f)
                curveToRelative(-3.56f, 0.02f, -5.62f, 2.12f, -5.62f, 5.67f)
                reflectiveCurveToRelative(2.06f, 5.62f, 5.63f, 5.64f)
                close()
            }
        }.also { _UserAdd = it}
