package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserKey: ImageVector? = null

val Icons.Sr.UserKey: ImageVector
    get() = _UserKey ?: UXIcon(name = "UserKey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(4.69f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(19.31f, 10.01f)
                curveToRelative(-2.09f, -0.13f, -3.93f, 1.17f, -4.84f, 3.05f)
                curveToRelative(-0.64f, 1.33f, -0.54f, 2.51f, -0.17f, 3.56f)
                curveToRelative(0f, 0f, -0.29f, 0.38f, -0.29f, 0.88f)
                curveToRelative(0f, 1f, -0.02f, 1.5f, -0.02f, 1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.98f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.78f)
                curveToRelative(0.53f, 0f, 1.04f, -0.21f, 1.41f, -0.59f)
                lineToRelative(3.83f, -3.83f)
                curveToRelative(0.95f, 0.41f, 2.04f, 0.54f, 3.19f, 0.27f)
                curveToRelative(1.89f, -0.45f, 3.37f, -2.04f, 3.71f, -3.94f)
                curveToRelative(0.54f, -3.06f, -1.7f, -5.72f, -4.61f, -5.9f)
                close()
                moveTo(20f, 15.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(8f, 23f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.34f, 0.89f, -2.48f, 2.1f, -2.86f)
                curveToRelative(0.28f, -0.93f, 1.0f, -1.67f, 1.91f, -1.98f)
                curveToRelative(0.03f, -0.26f, 0.08f, -0.5f, 0.15f, -0.71f)
                curveToRelative(-0.1f, -0.46f, -0.14f, -0.91f, -0.15f, -1.36f)
                curveToRelative(-1.18f, -0.69f, -2.55f, -1.09f, -4.02f, -1.09f)
                curveTo(3.59f, 14f, 0f, 17.59f, 0f, 22f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.18f)
                curveToRelative(-0.11f, -0.31f, -0.18f, -0.65f, -0.18f, -1f)
                close()
            }
        }.also { _UserKey = it}
