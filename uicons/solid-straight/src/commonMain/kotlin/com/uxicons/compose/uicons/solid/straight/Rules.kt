package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Rules: ImageVector? = null

val Icons.Ss.Rules: ImageVector
    get() = _Rules ?: UXIcon(name = "Rules") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.92f, 1.73f)
                curveToRelative(-0.69f, -0.57f, -1.58f, -0.81f, -2.52f, -0.64f)
                lineToRelative(-4.12f, 1.0f)
                curveToRelative(-1.9f, 0.35f, -3.28f, 2.0f, -3.28f, 3.94f)
                verticalLineToRelative(14.8f)
                lineToRelative(-1f, 0.18f)
                lineToRelative(-1f, -0.18f)
                lineTo(11f, 6.03f)
                curveToRelative(0f, -1.94f, -1.38f, -3.59f, -3.23f, -3.92f)
                lineTo(3.54f, 1.08f)
                curveToRelative(-0.88f, -0.16f, -1.77f, 0.08f, -2.46f, 0.65f)
                curveToRelative(-0.69f, 0.57f, -1.08f, 1.41f, -1.08f, 2.3f)
                verticalLineToRelative(16.83f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                lineTo(24f, 4.03f)
                curveToRelative(0f, -0.89f, -0.39f, -1.73f, -1.08f, -2.3f)
                close()
                moveTo(5.89f, 13.65f)
                curveToRelative(-0.46f, 0.47f, -1.22f, 0.47f, -1.67f, -0.01f)
                lineToRelative(-2.04f, -2.15f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(1.5f, 1.58f)
                lineToRelative(2.54f, -2.63f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-3.11f, 3.22f)
                close()
                moveTo(21.91f, 13.39f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(-1.79f, -1.79f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.79f, 1.79f)
                lineToRelative(1.79f, -1.79f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.79f, 1.79f)
                lineToRelative(1.79f, 1.79f)
                close()
            }
        }.also { _Rules = it}
