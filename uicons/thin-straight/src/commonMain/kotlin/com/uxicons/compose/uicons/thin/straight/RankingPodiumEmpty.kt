package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingPodiumEmpty: ImageVector? = null

val Icons.Ts.RankingPodiumEmpty: ImageVector
    get() = _RankingPodiumEmpty ?: UXIcon(name = "RankingPodiumEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 11f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.37f, 0f, -0.7f, 0.11f, -1f, 0.28f)
                verticalLineToRelative(-6.28f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4.28f)
                curveToRelative(-0.29f, -0.17f, -0.63f, -0.28f, -1f, -0.28f)
                lineTo(2f, 9f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(1f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                lineTo(1f, 20f)
                verticalLineToRelative(-9f)
                close()
                moveTo(8f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-8f)
                lineTo(8f, 5f)
                close()
                moveTo(23f, 20f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _RankingPodiumEmpty = it}
