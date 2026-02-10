package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeArrows: ImageVector? = null

val Icons.Ss.ModelCubeArrows: ImageVector
    get() = _ModelCubeArrows ?: UXIcon(name = "ModelCubeArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.86f, 9.78f)
                lineToRelative(-5.86f, 3.35f)
                lineToRelative(-5.86f, -3.35f)
                lineToRelative(4.86f, -2.78f)
                verticalLineToRelative(-2.92f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.66f, -2.66f)
                curveToRelative(0.73f, -0.73f, 1.92f, -0.73f, 2.65f, 0f)
                lineToRelative(2.66f, 2.66f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.6f, -1.6f)
                verticalLineToRelative(2.98f)
                lineToRelative(4.86f, 2.78f)
                close()
                moveTo(5f, 17.16f)
                lineToRelative(-2.63f, 1.6f)
                lineToRelative(0.52f, -2.12f)
                lineToRelative(-1.94f, -0.47f)
                lineTo(0.05f, 19.82f)
                curveToRelative(-0.24f, 1.0f, 0.37f, 2.02f, 1.38f, 2.27f)
                lineToRelative(3.65f, 0.89f)
                lineToRelative(0.47f, -1.94f)
                lineToRelative(-2.19f, -0.53f)
                lineToRelative(2.53f, -1.54f)
                lineToRelative(5.11f, 2.92f)
                verticalLineToRelative(-7.02f)
                lineToRelative(-6f, -3.43f)
                verticalLineToRelative(5.73f)
                close()
                moveTo(23.95f, 19.82f)
                lineToRelative(-0.89f, -3.65f)
                lineToRelative(-1.94f, 0.47f)
                lineToRelative(0.52f, 2.12f)
                lineToRelative(-2.63f, -1.6f)
                verticalLineToRelative(-5.73f)
                lineToRelative(-6f, 3.43f)
                verticalLineToRelative(7.02f)
                lineToRelative(5.11f, -2.92f)
                lineToRelative(2.53f, 1.54f)
                lineToRelative(-2.19f, 0.53f)
                lineToRelative(0.47f, 1.94f)
                lineToRelative(3.65f, -0.89f)
                curveToRelative(1.0f, -0.24f, 1.62f, -1.26f, 1.38f, -2.27f)
                close()
            }
        }.also { _ModelCubeArrows = it}
