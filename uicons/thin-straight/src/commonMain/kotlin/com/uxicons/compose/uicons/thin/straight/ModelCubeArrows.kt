package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeArrows: ImageVector? = null

val Icons.Ts.ModelCubeArrows: ImageVector
    get() = _ModelCubeArrows ?: UXIcon(name = "ModelCubeArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 20.04f)
                lineToRelative(-0.89f, -3.65f)
                lineToRelative(-0.97f, 0.24f)
                lineToRelative(0.8f, 3.3f)
                lineToRelative(-3.9f, -2.37f)
                verticalLineToRelative(-7.11f)
                lineToRelative(-6.5f, -3.71f)
                lineTo(12.5f, 2.32f)
                lineToRelative(2.45f, 2.45f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.66f, -2.66f)
                curveToRelative(-0.54f, -0.53f, -1.41f, -0.53f, -1.94f, 0f)
                lineToRelative(-2.66f, 2.66f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.4f, -2.4f)
                verticalLineToRelative(4.35f)
                lineToRelative(-6.5f, 3.71f)
                verticalLineToRelative(7.11f)
                lineToRelative(-3.9f, 2.37f)
                lineToRelative(0.8f, -3.3f)
                lineToRelative(-0.97f, -0.24f)
                lineTo(0.04f, 20.04f)
                curveToRelative(-0.09f, 0.36f, -0.03f, 0.73f, 0.16f, 1.04f)
                curveToRelative(0.19f, 0.31f, 0.49f, 0.54f, 0.85f, 0.62f)
                lineToRelative(3.65f, 0.89f)
                lineToRelative(0.24f, -0.97f)
                lineToRelative(-3.37f, -0.82f)
                lineToRelative(3.65f, -2.22f)
                lineToRelative(6.77f, 3.87f)
                lineToRelative(6.77f, -3.87f)
                lineToRelative(3.65f, 2.22f)
                lineToRelative(-3.37f, 0.82f)
                lineToRelative(0.24f, 0.97f)
                lineToRelative(3.65f, -0.89f)
                curveToRelative(0.36f, -0.09f, 0.66f, -0.31f, 0.85f, -0.62f)
                curveToRelative(0.19f, -0.31f, 0.25f, -0.68f, 0.16f, -1.04f)
                close()
                moveTo(12f, 13.69f)
                lineToRelative(-5.34f, -3.05f)
                lineToRelative(5.34f, -3.05f)
                lineToRelative(5.34f, 3.05f)
                lineToRelative(-5.34f, 3.05f)
                close()
                moveTo(12.5f, 14.56f)
                lineToRelative(5.5f, -3.14f)
                verticalLineToRelative(6.45f)
                lineToRelative(-5.5f, 3.14f)
                verticalLineToRelative(-6.45f)
                close()
                moveTo(6f, 11.41f)
                lineToRelative(5.5f, 3.14f)
                verticalLineToRelative(6.45f)
                lineToRelative(-5.5f, -3.14f)
                verticalLineToRelative(-6.45f)
                close()
            }
        }.also { _ModelCubeArrows = it}
