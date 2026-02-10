package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaddleTennisPlayer: ImageVector? = null

val Icons.Ss.PaddleTennisPlayer: ImageVector
    get() = _PaddleTennisPlayer ?: UXIcon(name = "PaddleTennisPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                moveToRelative(-9f, 0f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(-12f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(14.65f, 4f)
                curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
                reflectiveCurveToRelative(-4.82f, 1.67f, -5.65f, 4f)
                close()
                moveTo(10f, 18.53f)
                verticalLineToRelative(-2.44f)
                curveToRelative(-0.03f, -0.66f, 0.06f, -1.32f, 0.23f, -1.98f)
                lineToRelative(-2.73f, 3.9f)
                lineToRelative(-2.66f, -3.98f)
                curveToRelative(-2.68f, 0.09f, -4.84f, 2.28f, -4.84f, 4.98f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.76f)
                close()
                moveTo(22.47f, 10.53f)
                curveToRelative(-0.15f, -0.15f, -0.32f, -0.3f, -0.48f, -0.43f)
                curveToRelative(-0.06f, 2.16f, -1.81f, 3.9f, -3.99f, 3.9f)
                curveToRelative(-1.79f, 0f, -3.29f, -1.18f, -3.8f, -2.8f)
                curveToRelative(0f, 0f, -0.0f, 0.0f, -0.0f, 0.0f)
                curveToRelative(-1.52f, 1.52f, -2.26f, 3.25f, -2.2f, 4.88f)
                verticalLineToRelative(3.33f)
                lineToRelative(-3.45f, 3.12f)
                lineToRelative(1.34f, 1.48f)
                lineToRelative(3.33f, -3.02f)
                horizontalLineToRelative(3.77f)
                verticalLineToRelative(-0.0f)
                curveToRelative(1.63f, 0.05f, 3.3f, -0.71f, 4.8f, -2.2f)
                curveToRelative(2.67f, -2.67f, 2.94f, -6.0f, 0.67f, -8.27f)
                close()
                moveTo(14f, 19f)
                verticalLineToRelative(-2f)
                lineToRelative(2f, 2f)
                close()
            }
        }.also { _PaddleTennisPlayer = it}
