package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RankingPodiumEmpty: ImageVector? = null

val Icons.Br.RankingPodiumEmpty: ImageVector
    get() = _RankingPodiumEmpty ?: UXIcon(name = "RankingPodiumEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.5f, 11f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.17f, 0f, -0.34f, 0.03f, -0.5f, 0.05f)
            verticalLineToRelative(-4.55f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(2.55f)
            curveToRelative(-0.17f, -0.02f, -0.33f, -0.05f, -0.5f, -0.05f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(17f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(3f, 17.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            close()
            moveTo(10f, 6.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(11.5f)
            horizontalLineToRelative(-4f)
            lineTo(10f, 6.5f)
            close()
            moveTo(21f, 17.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(3f)
            close()
        }
    }.also { _RankingPodiumEmpty = it }
