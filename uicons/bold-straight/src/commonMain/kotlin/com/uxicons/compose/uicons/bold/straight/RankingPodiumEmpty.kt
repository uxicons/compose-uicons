package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingPodiumEmpty: ImageVector? = null

val Icons.Bs.RankingPodiumEmpty: ImageVector
    get() = _RankingPodiumEmpty ?: UXIcon(name = "RankingPodiumEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(3f)
                lineTo(3f, 9f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 12f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                lineTo(3f, 18f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10f, 6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 6f)
                close()
                moveTo(21f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _RankingPodiumEmpty = it}
