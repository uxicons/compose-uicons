package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FollowFolder: ImageVector? = null

val Icons.Sr.FollowFolder: ImageVector
    get() = _FollowFolder ?: UXIcon(name = "FollowFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 16.3f)
                curveToRelative(0f, 2.6f, -3.38f, 5.82f, -5.07f, 7.17f)
                curveToRelative(-0.54f, 0.44f, -1.32f, 0.44f, -1.86f, 0f)
                curveToRelative(-1.69f, -1.35f, -5.07f, -4.58f, -5.07f, -7.17f)
                curveToRelative(0f, -1.82f, 1.34f, -3.3f, 3f, -3.3f)
                curveToRelative(1.46f, 0f, 2.72f, 1.15f, 2.99f, 2.67f)
                horizontalLineToRelative(0f)
                curveToRelative(0.27f, -1.52f, 1.55f, -2.67f, 3.01f, -2.67f)
                curveToRelative(1.66f, 0f, 3f, 1.48f, 3f, 3.3f)
                close()
                moveTo(19f, 2f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.45f, -0.11f)
                lineTo(8.87f, 0.32f)
                curveToRelative(-0.41f, -0.21f, -0.88f, -0.32f, -1.34f, -0.32f)
                horizontalLineToRelative(-2.53f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(1f)
                lineTo(23.9f, 6f)
                curveToRelative(-0.46f, -2.28f, -2.48f, -4f, -4.9f, -4f)
                close()
                moveTo(10f, 16.3f)
                curveToRelative(0f, -2.92f, 2.24f, -5.3f, 5f, -5.3f)
                curveToRelative(1.11f, 0f, 2.15f, 0.38f, 2.99f, 1.03f)
                curveToRelative(0.85f, -0.65f, 1.89f, -1.03f, 3.01f, -1.03f)
                reflectiveCurveToRelative(2.16f, 0.4f, 3f, 1.06f)
                verticalLineToRelative(-4.06f)
                lineTo(0f, 8f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(7.67f)
                curveToRelative(-1.4f, -1.63f, -2.67f, -3.68f, -2.67f, -5.7f)
                close()
            }
        }.also { _FollowFolder = it}
