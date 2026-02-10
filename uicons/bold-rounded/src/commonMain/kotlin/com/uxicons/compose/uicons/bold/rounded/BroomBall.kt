package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BroomBall: ImageVector? = null

val Icons.Br.BroomBall: ImageVector
    get() = _BroomBall ?: UXIcon(name = "BroomBall") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 21f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(15.66f, 11.78f)
            curveToRelative(0.56f, 0.56f, 0.41f, 1.51f, -0.3f, 1.86f)
            lineToRelative(-1.58f, 0.79f)
            curveToRelative(0.15f, 0.53f, 0.22f, 1.07f, 0.22f, 1.64f)
            curveToRelative(0f, 1.62f, -0.63f, 3.15f, -1.78f, 4.29f)
            curveToRelative(-0.43f, 0.42f, -1.72f, 1.72f, -8.89f, 3.56f)
            curveToRelative(-0.23f, 0.06f, -0.45f, 0.09f, -0.68f, 0.09f)
            curveToRelative(-0.7f, 0f, -1.37f, -0.27f, -1.88f, -0.78f)
            curveToRelative(-0.67f, -0.67f, -0.94f, -1.63f, -0.7f, -2.55f)
            curveToRelative(1.84f, -7.17f, 3.13f, -8.46f, 3.56f, -8.89f)
            curveToRelative(1.15f, -1.15f, 2.67f, -1.78f, 4.29f, -1.78f)
            curveToRelative(0.56f, 0f, 1.11f, 0.08f, 1.64f, 0.22f)
            lineToRelative(0.79f, -1.58f)
            curveToRelative(0.35f, -0.71f, 1.3f, -0.86f, 1.86f, -0.3f)
            lineToRelative(0.66f, 0.66f)
            lineTo(21.44f, 0.44f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(-8.56f, 8.56f)
            lineToRelative(0.66f, 0.66f)
            close()
            moveTo(11f, 16.07f)
            curveToRelative(0f, -0.82f, -0.32f, -1.59f, -0.9f, -2.17f)
            horizontalLineToRelative(0f)
            curveToRelative(-0.58f, -0.58f, -1.35f, -0.9f, -2.17f, -0.9f)
            reflectiveCurveToRelative(-1.59f, 0.32f, -2.17f, 0.9f)
            curveToRelative(-0.5f, 0.5f, -1.49f, 2.63f, -2.63f, 6.97f)
            curveToRelative(4.34f, -1.15f, 6.46f, -2.13f, 6.97f, -2.63f)
            curveToRelative(0.58f, -0.58f, 0.9f, -1.35f, 0.9f, -2.17f)
            close()
        }
    }.also { _BroomBall = it }
