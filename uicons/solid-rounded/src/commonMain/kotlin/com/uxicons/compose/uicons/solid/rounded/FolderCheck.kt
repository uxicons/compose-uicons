package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCheck: ImageVector? = null

val Icons.Sr.FolderCheck: ImageVector
    get() = _FolderCheck ?: UXIcon(name = "FolderCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.9f, 7f)
                lineTo(0f, 7f)
                verticalLineToRelative(-1f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(2.53f)
                curveToRelative(0.46f, 0f, 0.93f, 0.11f, 1.34f, 0.32f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.14f, 0.07f, 0.29f, 0.1f, 0.45f, 0.1f)
                horizontalLineToRelative(6.53f)
                curveToRelative(2.41f, 0f, 4.43f, 1.72f, 4.9f, 4f)
                close()
                moveTo(0f, 9f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 9f)
                lineTo(0f, 9f)
                close()
                moveTo(17.69f, 13.72f)
                lineToRelative(-4.55f, 4.35f)
                curveToRelative(-1.24f, 1.24f, -3.27f, 1.23f, -4.52f, -0.02f)
                lineToRelative(-1.84f, -1.86f)
                curveToRelative(-0.39f, -0.39f, -0.38f, -1.03f, 0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.39f, 1.42f, 0.01f)
                lineToRelative(1.83f, 1.85f)
                curveToRelative(0.47f, 0.47f, 1.23f, 0.47f, 1.7f, -0.0f)
                lineToRelative(4.56f, -4.37f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
                close()
            }
        }.also { _FolderCheck = it}
