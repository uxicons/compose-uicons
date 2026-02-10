package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderOpen: ImageVector? = null

val Icons.Tr.FolderOpen: ImageVector
    get() = _FolderOpen ?: UXIcon(name = "FolderOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.6f, 11.83f)
                curveToRelative(-0.39f, -0.53f, -0.99f, -0.83f, -1.65f, -0.83f)
                horizontalLineToRelative(-0.94f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                horizontalLineToRelative(-6.06f)
                curveToRelative(-0.23f, 0f, -0.46f, -0.06f, -0.67f, -0.16f)
                lineToRelative(-3.15f, -1.58f)
                curveToRelative(-0.34f, -0.17f, -0.73f, -0.26f, -1.12f, -0.26f)
                horizontalLineToRelative(-2f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(13.56f)
                curveToRelative(2.0f, 0f, 3.73f, -1.29f, 4.32f, -3.23f)
                lineToRelative(1.54f, -6.14f)
                curveToRelative(0.19f, -0.63f, 0.07f, -1.28f, -0.32f, -1.81f)
                close()
                moveTo(1f, 18.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2f)
                curveToRelative(0.23f, 0f, 0.46f, 0.06f, 0.67f, 0.16f)
                lineToRelative(3.15f, 1.58f)
                curveToRelative(0.34f, 0.17f, 0.73f, 0.26f, 1.12f, 0.26f)
                horizontalLineToRelative(6.06f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-11.88f)
                curveToRelative(-1.49f, 0f, -2.82f, 0.94f, -3.31f, 2.35f)
                lineToRelative(-2.43f, 7.92f)
                curveToRelative(-0.83f, -0.64f, -1.37f, -1.65f, -1.37f, -2.78f)
                close()
                moveTo(22.95f, 13.37f)
                lineToRelative(-1.54f, 6.14f)
                curveToRelative(-0.45f, 1.49f, -1.8f, 2.49f, -3.35f, 2.49f)
                lineTo(4.5f, 22f)
                curveToRelative(-0.43f, 0f, -0.85f, -0.08f, -1.23f, -0.23f)
                lineToRelative(2.49f, -8.11f)
                curveToRelative(0.35f, -1.0f, 1.29f, -1.67f, 2.36f, -1.67f)
                horizontalLineToRelative(13.83f)
                curveToRelative(0.34f, 0f, 0.65f, 0.15f, 0.85f, 0.42f)
                curveToRelative(0.2f, 0.27f, 0.26f, 0.6f, 0.15f, 0.94f)
                close()
            }
        }.also { _FolderOpen = it}
