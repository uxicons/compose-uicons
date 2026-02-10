package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hourglass: ImageVector? = null

val Icons.Ts.Hourglass: ImageVector
    get() = _Hourglass ?: UXIcon(name = "Hourglass") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-2.59f)
                curveToRelative(0f, -3.36f, 1.75f, -6.53f, 5.21f, -9.41f)
                curveTo(4.71f, 9.09f, 2.96f, 5.89f, 3f, 2.49f)
                curveTo(3.02f, 1.13f, 4.14f, 0.03f, 5.5f, 0.03f)
                lineToRelative(13.0f, -0.0f)
                curveToRelative(1.36f, 0f, 2.49f, 1.11f, 2.5f, 2.47f)
                curveToRelative(0.04f, 3.38f, -1.72f, 6.58f, -5.21f, 9.51f)
                curveToRelative(3.46f, 2.9f, 5.21f, 6.06f, 5.21f, 9.41f)
                verticalLineToRelative(2.59f)
                close()
                moveTo(4f, 23f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -3.18f, -1.79f, -6.21f, -5.31f, -9.02f)
                lineToRelative(-0.49f, -0.39f)
                lineToRelative(0.49f, -0.39f)
                curveToRelative(3.56f, -2.83f, 5.35f, -5.89f, 5.31f, -9.1f)
                curveToRelative(-0.01f, -0.82f, -0.68f, -1.48f, -1.5f, -1.48f)
                lineToRelative(-13.0f, 0.0f)
                curveToRelative(-0.81f, 0f, -1.49f, 0.66f, -1.5f, 1.48f)
                curveToRelative(-0.04f, 3.22f, 1.75f, 6.28f, 5.31f, 9.1f)
                lineToRelative(0.49f, 0.39f)
                lineToRelative(-0.49f, 0.39f)
                curveToRelative(-3.52f, 2.79f, -5.31f, 5.82f, -5.31f, 9.02f)
                verticalLineToRelative(1.59f)
                close()
            }
        }.also { _Hourglass = it}
