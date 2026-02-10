package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCheck: ImageVector? = null

val Icons.Ss.FolderCheck: ImageVector
    get() = _FolderCheck ?: UXIcon(name = "FolderCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 9f)
                verticalLineToRelative(14f)
                lineTo(24f, 23f)
                lineTo(24f, 9f)
                lineTo(0f, 9f)
                close()
                moveTo(12.53f, 18.41f)
                curveToRelative(-0.4f, 0.4f, -0.92f, 0.59f, -1.43f, 0.59f)
                reflectiveCurveToRelative(-1.04f, -0.2f, -1.43f, -0.59f)
                lineToRelative(-2.87f, -2.87f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.87f, 2.87f)
                lineToRelative(4.96f, -4.93f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.93f, 4.93f)
                close()
                moveTo(0f, 7f)
                verticalLineToRelative(-3f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                close()
            }
        }.also { _FolderCheck = it}
