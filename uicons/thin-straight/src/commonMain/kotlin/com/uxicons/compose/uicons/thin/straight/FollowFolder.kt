package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FollowFolder: ImageVector? = null

val Icons.Ts.FollowFolder: ImageVector
    get() = _FollowFolder ?: UXIcon(name = "FollowFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 14f)
                curveToRelative(-1.08f, 0f, -1.98f, 0.48f, -2.5f, 1.25f)
                curveToRelative(-0.52f, -0.77f, -1.42f, -1.25f, -2.5f, -1.25f)
                curveToRelative(-1.65f, 0f, -3f, 1.44f, -3f, 3.2f)
                curveToRelative(0f, 3.06f, 5.01f, 6.46f, 5.22f, 6.6f)
                lineToRelative(0.28f, 0.19f)
                lineToRelative(0.28f, -0.19f)
                curveToRelative(0.21f, -0.14f, 5.22f, -3.54f, 5.22f, -6.6f)
                curveToRelative(0f, -1.76f, -1.35f, -3.2f, -3f, -3.2f)
                close()
                moveTo(18.5f, 22.78f)
                curveToRelative(-1.48f, -1.05f, -4.5f, -3.61f, -4.5f, -5.58f)
                curveToRelative(0f, -1.21f, 0.9f, -2.2f, 2f, -2.2f)
                curveToRelative(1.18f, 0f, 2f, 0.85f, 2f, 2f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.15f, 0.82f, -2f, 2f, -2f)
                curveToRelative(1.1f, 0f, 2f, 0.99f, 2f, 2.2f)
                curveToRelative(0f, 1.96f, -3.02f, 4.52f, -4.5f, 5.58f)
                close()
                moveTo(21.5f, 2f)
                lineTo(12.12f, 2f)
                lineTo(8.12f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                lineTo(0f, 22f)
                lineTo(13.16f, 22f)
                curveToRelative(-0.27f, -0.32f, -0.53f, -0.65f, -0.77f, -1f)
                lineTo(1f, 21f)
                lineTo(1f, 7f)
                lineTo(23f, 7f)
                verticalLineToRelative(5.44f)
                curveToRelative(0.36f, 0.16f, 0.69f, 0.38f, 1f, 0.63f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 6f)
                lineTo(1f, 6f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.88f, 1f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _FollowFolder = it}
