package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JumpingRope: ImageVector? = null

val Icons.Bs.JumpingRope: ImageVector
    get() = _JumpingRope ?: UXIcon(name = "JumpingRope") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.66f, 15.39f)
                lineToRelative(4f, 4f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-0.94f, -0.94f)
                lineToRelative(-3.54f, 3.54f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(3.54f, -3.54f)
                lineToRelative(-0.94f, -0.94f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(17.25f, 0f)
                curveTo(11.15f, 0f, 6f, 4.58f, 6f, 10f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                curveToRelative(0f, -1.79f, -0.57f, -3.48f, -1.54f, -4.95f)
                curveToRelative(-1.08f, 0.12f, -2.09f, 0.48f, -2.94f, 1.01f)
                curveToRelative(0.93f, 1.13f, 1.48f, 2.49f, 1.48f, 3.94f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                curveToRelative(0f, -3.79f, 3.78f, -7f, 8.25f, -7f)
                curveToRelative(2.35f, 0f, 3.75f, 1.68f, 3.75f, 4.5f)
                curveToRelative(0f, 2.57f, -0.58f, 4.5f, -1.53f, 7f)
                lineToRelative(2.25f, 2.25f)
                curveToRelative(1.47f, -3.21f, 2.28f, -5.96f, 2.28f, -9.25f)
                curveToRelative(0f, -5.18f, -3.39f, -7.5f, -6.75f, -7.5f)
                close()
                moveTo(8.46f, 17.51f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-4f, 4f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.94f, -0.94f)
                lineToRelative(3.54f, 3.54f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-3.54f, -3.54f)
                lineToRelative(0.94f, -0.94f)
                close()
                moveTo(3f, 7.5f)
                curveToRelative(0f, -2.74f, 1.34f, -4.4f, 3.57f, -4.48f)
                curveToRelative(0.83f, -1.02f, 1.83f, -1.93f, 2.96f, -2.68f)
                curveToRelative(-0.89f, -0.21f, -1.82f, -0.34f, -2.78f, -0.34f)
                curveTo(3.39f, 0f, 0f, 2.32f, 0f, 7.5f)
                curveToRelative(0f, 3.29f, 0.81f, 6.04f, 2.28f, 9.25f)
                lineToRelative(2.25f, -2.25f)
                curveToRelative(-0.95f, -2.5f, -1.53f, -4.43f, -1.53f, -7f)
                close()
            }
        }.also { _JumpingRope = it}
