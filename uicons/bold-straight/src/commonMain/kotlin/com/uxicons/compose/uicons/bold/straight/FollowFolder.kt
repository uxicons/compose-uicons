package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FollowFolder: ImageVector? = null

val Icons.Bs.FollowFolder: ImageVector
    get() = _FollowFolder ?: UXIcon(name = "FollowFolder") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5.5f)
                lineTo(24f, 13.79f)
                curveToRelative(-0.72f, -0.5f, -1.58f, -0.79f, -2.5f, -0.79f)
                curveToRelative(-0.17f, 0f, -0.34f, 0f, -0.5f, 0.03f)
                lineTo(21f, 7f)
                lineTo(3f, 7f)
                verticalLineToRelative(12f)
                lineTo(12.19f, 19f)
                curveToRelative(0.3f, 1.06f, 0.93f, 2.08f, 1.68f, 3f)
                lineTo(0f, 22f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21.5f, 15f)
                curveToRelative(-1.38f, 0f, -2.5f, 0.96f, -2.5f, 2.45f)
                curveToRelative(0f, -1.49f, -1.12f, -2.45f, -2.5f, -2.45f)
                reflectiveCurveToRelative(-2.5f, 1.21f, -2.5f, 2.7f)
                curveToRelative(0f, 2.83f, 5f, 6.3f, 5f, 6.3f)
                curveToRelative(0f, 0f, 5f, -3.47f, 5f, -6.3f)
                curveToRelative(0f, -1.49f, -1.12f, -2.7f, -2.5f, -2.7f)
                close()
            }
        }.also { _FollowFolder = it}
