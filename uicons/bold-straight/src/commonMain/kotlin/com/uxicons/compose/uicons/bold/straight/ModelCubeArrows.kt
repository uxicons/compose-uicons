package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ModelCubeArrows: ImageVector? = null

val Icons.Bs.ModelCubeArrows: ImageVector
    get() = _ModelCubeArrows ?: UXIcon(name = "ModelCubeArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.93f, 20.21f)
                lineToRelative(-1.68f, -4.65f)
                lineToRelative(-1.2f, 2.19f)
                lineToRelative(-2.05f, -1.12f)
                verticalLineToRelative(-6.2f)
                lineToRelative(-5.5f, -3.14f)
                verticalLineToRelative(-2.28f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-3.27f, -3.71f)
                curveToRelative(-0.41f, -0.39f, -1.06f, -0.39f, -1.47f, 0f)
                lineToRelative(-3.27f, 3.71f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.28f)
                lineToRelative(-5.5f, 3.14f)
                verticalLineToRelative(6.2f)
                lineToRelative(-2.05f, 1.12f)
                lineToRelative(-1.2f, -2.19f)
                lineTo(0.07f, 20.21f)
                curveToRelative(-0.15f, 0.54f, 0.17f, 1.12f, 0.7f, 1.29f)
                lineToRelative(4.82f, 1.08f)
                lineToRelative(-1.2f, -2.19f)
                lineToRelative(2.04f, -1.12f)
                lineToRelative(5.57f, 3.19f)
                lineToRelative(5.57f, -3.19f)
                lineToRelative(2.04f, 1.12f)
                lineToRelative(-1.2f, 2.19f)
                lineToRelative(4.82f, -1.08f)
                curveToRelative(0.54f, -0.17f, 0.85f, -0.74f, 0.7f, -1.29f)
                close()
                moveTo(12f, 13.14f)
                lineToRelative(-2.85f, -1.63f)
                lineToRelative(2.85f, -1.63f)
                lineToRelative(2.85f, 1.63f)
                lineToRelative(-2.85f, 1.63f)
                close()
                moveTo(8f, 13.16f)
                lineToRelative(3f, 1.71f)
                verticalLineToRelative(3.56f)
                lineToRelative(-3f, -1.72f)
                verticalLineToRelative(-3.55f)
                close()
                moveTo(13f, 18.43f)
                verticalLineToRelative(-3.56f)
                lineToRelative(3f, -1.71f)
                verticalLineToRelative(3.55f)
                lineToRelative(-3f, 1.72f)
                close()
            }
        }.also { _ModelCubeArrows = it}
