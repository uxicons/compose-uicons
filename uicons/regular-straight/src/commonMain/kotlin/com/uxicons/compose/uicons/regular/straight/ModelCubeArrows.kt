package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeArrows: ImageVector? = null

val Icons.Rs.ModelCubeArrows: ImageVector
    get() = _ModelCubeArrows ?: UXIcon(name = "ModelCubeArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 19.82f)
                lineToRelative(-0.89f, -3.65f)
                lineToRelative(-1.94f, 0.47f)
                lineToRelative(0.52f, 2.12f)
                lineToRelative(-2.63f, -1.6f)
                verticalLineToRelative(-6.73f)
                lineToRelative(-6f, -3.43f)
                verticalLineToRelative(-2.98f)
                lineToRelative(1.6f, 1.6f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.73f, -0.73f, -1.92f, -0.73f, -2.65f, 0f)
                lineToRelative(-2.66f, 2.66f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.54f, -1.54f)
                verticalLineToRelative(2.92f)
                lineToRelative(-6f, 3.43f)
                verticalLineToRelative(6.73f)
                lineToRelative(-2.63f, 1.6f)
                lineToRelative(0.52f, -2.12f)
                lineToRelative(-1.94f, -0.47f)
                lineTo(0.05f, 19.82f)
                curveToRelative(-0.24f, 1.0f, 0.37f, 2.02f, 1.38f, 2.27f)
                lineToRelative(3.65f, 0.89f)
                lineToRelative(0.47f, -1.94f)
                lineToRelative(-2.19f, -0.53f)
                lineToRelative(2.53f, -1.54f)
                lineToRelative(6.11f, 3.49f)
                lineToRelative(6.11f, -3.49f)
                lineToRelative(2.53f, 1.54f)
                lineToRelative(-2.19f, 0.53f)
                lineToRelative(0.47f, 1.94f)
                lineToRelative(3.65f, -0.89f)
                curveToRelative(1.0f, -0.24f, 1.62f, -1.26f, 1.38f, -2.27f)
                close()
                moveTo(12f, 13.13f)
                lineToRelative(-3.85f, -2.2f)
                lineToRelative(3.85f, -2.2f)
                lineToRelative(3.85f, 2.2f)
                lineToRelative(-3.85f, 2.2f)
                close()
                moveTo(7f, 12.57f)
                lineToRelative(4f, 2.29f)
                verticalLineToRelative(4.72f)
                lineToRelative(-4f, -2.29f)
                verticalLineToRelative(-4.71f)
                close()
                moveTo(13f, 19.57f)
                verticalLineToRelative(-4.72f)
                lineToRelative(4f, -2.29f)
                verticalLineToRelative(4.71f)
                lineToRelative(-4f, 2.29f)
                close()
            }
        }.also { _ModelCubeArrows = it}
