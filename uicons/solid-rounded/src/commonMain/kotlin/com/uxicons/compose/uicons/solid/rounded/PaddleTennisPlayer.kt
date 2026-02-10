package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaddleTennisPlayer: ImageVector? = null

val Icons.Sr.PaddleTennisPlayer: ImageVector
    get() = _PaddleTennisPlayer ?: UXIcon(name = "PaddleTennisPlayer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                moveToRelative(-3.35f, -8f)
                curveToRelative(-0.83f, -2.33f, -3.04f, -4f, -5.65f, -4f)
                reflectiveCurveToRelative(-4.82f, 1.67f, -5.65f, 4f)
                close()
                moveTo(9f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(-12f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                close()
                moveTo(21.8f, 18.8f)
                curveToRelative(-1.46f, 1.46f, -3.12f, 2.21f, -4.7f, 2.21f)
                curveToRelative(-0.09f, -0.02f, -3.75f, 0f, -3.85f, -0.01f)
                lineToRelative(-3.09f, 2.75f)
                curveToRelative(-0.41f, 0.36f, -1.04f, 0.33f, -1.41f, -0.08f)
                curveToRelative(-0.37f, -0.41f, -0.33f, -1.04f, 0.08f, -1.41f)
                lineToRelative(3.17f, -2.81f)
                verticalLineToRelative(-3.36f)
                curveToRelative(-0.06f, -1.63f, 0.68f, -3.36f, 2.2f, -4.88f)
                curveToRelative(0f, 0f, 0.0f, -0.0f, 0.0f, -0.0f)
                curveToRelative(0.51f, 1.62f, 2.01f, 2.8f, 3.8f, 2.8f)
                curveToRelative(2.17f, 0f, 3.94f, -1.74f, 3.99f, -3.9f)
                curveToRelative(0.17f, 0.13f, 0.33f, 0.27f, 0.48f, 0.43f)
                curveToRelative(2.27f, 2.27f, 2.0f, 5.59f, -0.67f, 8.27f)
                close()
                moveTo(16f, 19f)
                lineTo(14f, 17f)
                verticalLineToRelative(2f)
                close()
                moveTo(8.36f, 17.52f)
                curveToRelative(-0.45f, 0.67f, -1.43f, 0.67f, -1.88f, 0f)
                lineToRelative(-1.29f, -2.66f)
                curveToRelative(-3.06f, 1.44f, -5.19f, 4.54f, -5.19f, 8.14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(5.68f)
                curveToRelative(-0.39f, -1.12f, -0.11f, -2.41f, 0.83f, -3.24f)
                lineToRelative(2.49f, -2.22f)
                verticalLineToRelative(-4.24f)
                close()
            }
        }.also { _PaddleTennisPlayer = it}
