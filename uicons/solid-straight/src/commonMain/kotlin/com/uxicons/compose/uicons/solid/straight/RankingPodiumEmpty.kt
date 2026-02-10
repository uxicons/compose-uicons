package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingPodiumEmpty: ImageVector? = null

val Icons.Ss.RankingPodiumEmpty: ImageVector
    get() = _RankingPodiumEmpty ?: UXIcon(name = "RankingPodiumEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 21f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(8f)
                close()
                moveTo(4.5f, 9f)
                horizontalLineToRelative(-2.5f)
                curveTo(0.9f, 9f, 0f, 9.89f, 0f, 11f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-10f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(13.5f, 3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(7f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _RankingPodiumEmpty = it}
