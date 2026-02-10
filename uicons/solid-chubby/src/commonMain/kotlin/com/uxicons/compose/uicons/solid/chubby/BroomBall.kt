package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroomBall: ImageVector? = null

val Icons.Sc.BroomBall: ImageVector
    get() = _BroomBall ?: UXIcon(name = "BroomBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 20f)
                moveToRelative(-3f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6f, 0f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = true, isPositiveArc = true, -6f, 0f)
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.25f, 10.87f)
                lineToRelative(7.31f, -7.31f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                lineToRelative(-7.31f, 7.31f)
                curveToRelative(-1.43f, -1.17f, -2.32f, -1.36f, -2.52f, -1.39f)
                curveToRelative(-0.3f, -0.04f, -0.61f, 0.05f, -0.84f, 0.27f)
                curveToRelative(0f, 0f, -0.52f, 0.49f, -1.18f, 1.16f)
                curveToRelative(-0.59f, 0.59f, -0.95f, 1.34f, -1.12f, 1.75f)
                curveToRelative(-3.33f, -0.14f, -5.94f, 2.51f, -6.42f, 6.58f)
                curveToRelative(-0.28f, 2.39f, 0.42f, 4.64f, 0.45f, 4.73f)
                curveToRelative(0.1f, 0.31f, 0.34f, 0.56f, 0.65f, 0.65f)
                curveToRelative(0.08f, 0.03f, 1.66f, 0.52f, 3.56f, 0.52f)
                curveToRelative(0.38f, 0f, 0.77f, -0.02f, 1.17f, -0.07f)
                curveToRelative(4.07f, -0.48f, 6.72f, -3.09f, 6.58f, -6.42f)
                curveToRelative(0.4f, -0.17f, 1.16f, -0.53f, 1.75f, -1.12f)
                curveToRelative(0.67f, -0.67f, 1.16f, -1.18f, 1.16f, -1.18f)
                curveToRelative(0.21f, -0.22f, 0.31f, -0.53f, 0.27f, -0.83f)
                curveToRelative(-0.03f, -0.2f, -0.22f, -1.09f, -1.39f, -2.52f)
                close()
            }
        }.also { _BroomBall = it}
