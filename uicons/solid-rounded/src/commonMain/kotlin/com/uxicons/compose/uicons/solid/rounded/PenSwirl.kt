package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Sr.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.27f, 7.48f)
                lineTo(20.08f, 0.67f)
                curveToRelative(0.9f, -0.9f, 2.35f, -0.9f, 3.25f, 0f)
                reflectiveCurveToRelative(0.9f, 2.35f, 0f, 3.25f)
                lineToRelative(-6.81f, 6.81f)
                curveToRelative(-0.81f, 0.81f, -1.92f, 1.27f, -3.06f, 1.27f)
                horizontalLineToRelative(-1.46f)
                verticalLineToRelative(-1.46f)
                curveToRelative(0f, -1.15f, 0.46f, -2.25f, 1.27f, -3.06f)
                close()
                moveTo(8.3f, 22.13f)
                curveToRelative(-4.0f, -2.22f, -6.29f, -5.91f, -6.29f, -10.13f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                curveToRelative(0.93f, 0f, 1.84f, 0.13f, 2.73f, 0.38f)
                curveToRelative(0.09f, 0.03f, 0.18f, 0.04f, 0.27f, 0.04f)
                curveToRelative(0.44f, 0f, 0.84f, -0.29f, 0.96f, -0.73f)
                curveToRelative(0.15f, -0.53f, -0.16f, -1.08f, -0.69f, -1.23f)
                curveToRelative(-1.06f, -0.3f, -2.16f, -0.45f, -3.27f, -0.45f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 4.96f, 2.67f, 9.29f, 7.32f, 11.87f)
                curveToRelative(0.15f, 0.09f, 0.32f, 0.13f, 0.48f, 0.13f)
                curveToRelative(0.35f, 0f, 0.69f, -0.19f, 0.88f, -0.52f)
                curveToRelative(0.27f, -0.48f, 0.09f, -1.09f, -0.39f, -1.36f)
                close()
                moveTo(22.32f, 8.04f)
                curveToRelative(-0.53f, 0.15f, -0.84f, 0.7f, -0.69f, 1.23f)
                curveToRelative(0.25f, 0.89f, 0.38f, 1.8f, 0.38f, 2.73f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -1.11f, -0.15f, -2.21f, -0.45f, -3.27f)
                curveToRelative(-0.15f, -0.53f, -0.7f, -0.84f, -1.23f, -0.69f)
                close()
            }
        }.also { _PenSwirl = it}
