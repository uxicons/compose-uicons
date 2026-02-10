package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderUpload: ImageVector? = null

val Icons.Ts.FolderUpload: ImageVector
    get() = _FolderUpload ?: UXIcon(name = "FolderUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.69f, 13.28f)
                curveToRelative(-0.06f, -0.06f, -0.12f, -0.11f, -0.19f, -0.15f)
                verticalLineToRelative(9.87f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 13.13f)
                curveToRelative(-0.07f, 0.04f, -0.13f, 0.09f, -0.19f, 0.15f)
                lineToRelative(-3.2f, 3.2f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.2f, -3.2f)
                curveToRelative(0.77f, -0.77f, 2.02f, -0.77f, 2.79f, 0f)
                lineToRelative(3.2f, 3.2f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.2f, -3.2f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 23f)
                lineTo(15f, 23f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                lineTo(23f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(14f)
                lineTo(9f, 22f)
                verticalLineToRelative(1f)
                lineTo(0f, 23f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(5.62f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.38f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 7f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(11.88f, 4f)
                lineTo(7.88f, 2f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                lineTo(23f, 7f)
                close()
            }
        }.also { _FolderUpload = it}
