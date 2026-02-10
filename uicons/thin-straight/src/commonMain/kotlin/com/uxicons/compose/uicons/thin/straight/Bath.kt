package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bath: ImageVector? = null

val Icons.Ts.Bath: ImageVector
    get() = _Bath ?: UXIcon(name = "Bath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 12f)
                lineTo(1f, 3.83f)
                curveToRelative(0f, -1.56f, 1.27f, -2.83f, 2.83f, -2.83f)
                curveToRelative(0.78f, 0f, 1.53f, 0.33f, 2.07f, 0.9f)
                lineToRelative(-0.91f, 4.69f)
                lineToRelative(1.36f, 1.86f)
                lineToRelative(6.56f, -4.92f)
                lineToRelative(-1.26f, -1.85f)
                lineToRelative(-4.82f, -0.21f)
                curveToRelative(-0.72f, -0.91f, -1.84f, -1.45f, -3.0f, -1.45f)
                curveTo(1.72f, 0f, 0f, 1.72f, 0f, 3.83f)
                verticalLineToRelative(8.17f)
                horizontalLineToRelative(0f)
                lineToRelative(0.45f, 3.62f)
                curveToRelative(0.29f, 2.31f, 1.5f, 4.31f, 3.24f, 5.64f)
                lineToRelative(-0.75f, 2.74f)
                horizontalLineToRelative(1.03f)
                lineToRelative(0.59f, -2.15f)
                curveToRelative(1.25f, 0.73f, 2.71f, 1.15f, 4.25f, 1.15f)
                horizontalLineToRelative(6.38f)
                curveToRelative(1.54f, 0f, 2.99f, -0.42f, 4.24f, -1.15f)
                lineToRelative(0.59f, 2.15f)
                horizontalLineToRelative(1.03f)
                lineToRelative(-0.75f, -2.74f)
                curveToRelative(1.74f, -1.33f, 2.96f, -3.33f, 3.25f, -5.65f)
                lineToRelative(0.45f, -3.62f)
                lineTo(1f, 12f)
                close()
                moveTo(6.81f, 2.45f)
                lineToRelative(4.3f, 0.19f)
                lineToRelative(0.44f, 0.65f)
                lineToRelative(-4.99f, 3.74f)
                lineToRelative(-0.51f, -0.69f)
                lineToRelative(0.76f, -3.89f)
                close()
                moveTo(22.57f, 15.49f)
                curveToRelative(-0.46f, 3.71f, -3.63f, 6.51f, -7.37f, 6.51f)
                horizontalLineToRelative(-6.38f)
                curveToRelative(-3.74f, 0f, -6.91f, -2.8f, -7.37f, -6.51f)
                lineToRelative(-0.31f, -2.49f)
                horizontalLineToRelative(21.74f)
                lineToRelative(-0.31f, 2.49f)
                close()
            }
        }.also { _Bath = it}
