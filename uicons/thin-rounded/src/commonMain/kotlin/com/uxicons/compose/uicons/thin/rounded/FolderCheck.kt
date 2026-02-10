package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCheck: ImageVector? = null

val Icons.Tr.FolderCheck: ImageVector
    get() = _FolderCheck ?: UXIcon(name = "FolderCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.36f, 12.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.52f, -0.01f, 0.71f)
                lineToRelative(-4.52f, 4.42f)
                curveToRelative(-1.04f, 1.04f, -2.73f, 1.03f, -3.77f, -0.0f)
                lineToRelative(-2.41f, -2.42f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(2.41f, 2.42f)
                curveToRelative(0.65f, 0.65f, 1.71f, 0.65f, 2.36f, 0f)
                lineToRelative(4.53f, -4.42f)
                curveToRelative(0.2f, -0.19f, 0.51f, -0.19f, 0.71f, 0.01f)
                close()
                moveTo(24f, 7.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 5.5f)
                curveTo(0f, 3.02f, 2.02f, 1f, 4.5f, 1f)
                horizontalLineToRelative(3.03f)
                curveToRelative(0.39f, 0f, 0.77f, 0.09f, 1.12f, 0.26f)
                lineToRelative(3.16f, 1.58f)
                curveToRelative(0.21f, 0.1f, 0.44f, 0.16f, 0.67f, 0.16f)
                horizontalLineToRelative(7.03f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(1f, 5.5f)
                verticalLineToRelative(1.5f)
                lineTo(22.95f, 7f)
                curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
                horizontalLineToRelative(-7.03f)
                curveToRelative(-0.39f, 0f, -0.77f, -0.09f, -1.12f, -0.26f)
                lineToRelative(-3.16f, -1.58f)
                curveToRelative(-0.21f, -0.1f, -0.44f, -0.16f, -0.67f, -0.16f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                close()
                moveTo(23f, 18.5f)
                lineTo(23f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(10.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
            }
        }.also { _FolderCheck = it}
