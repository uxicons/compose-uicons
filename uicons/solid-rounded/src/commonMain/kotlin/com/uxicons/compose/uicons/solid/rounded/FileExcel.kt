package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExcel: ImageVector? = null

val Icons.Sr.FileExcel: ImageVector
    get() = _FileExcel ?: UXIcon(name = "FileExcel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                lineTo(14f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.24f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 10.49f)
                verticalLineToRelative(8.51f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.32f, 0.01f, 0.49f, 0.02f)
                lineTo(12f, 7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.49f)
                close()
                moveTo(13.3f, 17f)
                lineToRelative(1.97f, -2.36f)
                curveToRelative(0.35f, -0.42f, 0.3f, -1.05f, -0.13f, -1.41f)
                curveToRelative(-0.43f, -0.35f, -1.05f, -0.3f, -1.41f, 0.13f)
                lineToRelative(-1.73f, 2.08f)
                lineToRelative(-1.73f, -2.08f)
                curveToRelative(-0.35f, -0.42f, -0.98f, -0.48f, -1.41f, -0.13f)
                curveToRelative(-0.42f, 0.35f, -0.48f, 0.98f, -0.13f, 1.41f)
                lineToRelative(1.97f, 2.36f)
                lineToRelative(-1.97f, 2.36f)
                curveToRelative(-0.35f, 0.42f, -0.3f, 1.05f, 0.13f, 1.41f)
                curveToRelative(0.19f, 0.16f, 0.41f, 0.23f, 0.64f, 0.23f)
                curveToRelative(0.29f, 0f, 0.57f, -0.12f, 0.77f, -0.36f)
                lineToRelative(1.73f, -2.08f)
                lineToRelative(1.73f, 2.08f)
                curveToRelative(0.2f, 0.24f, 0.48f, 0.36f, 0.77f, 0.36f)
                curveToRelative(0.23f, 0f, 0.45f, -0.08f, 0.64f, -0.23f)
                curveToRelative(0.42f, -0.35f, 0.48f, -0.98f, 0.13f, -1.41f)
                lineToRelative(-1.97f, -2.36f)
                close()
            }
        }.also { _FileExcel = it}
