package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderCheck: ImageVector? = null

val Icons.Rs.FolderCheck: ImageVector
    get() = _FolderCheck ?: UXIcon(name = "FolderCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(12.24f, 3f)
                lineTo(8.24f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(3f, 3f)
                lineTo(7.76f, 3f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(2f, 21f)
                lineTo(2f, 9f)
                lineTo(22f, 9f)
                verticalLineToRelative(12f)
                lineTo(2f, 21f)
                close()
                moveTo(16.04f, 11.07f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-4.93f, 4.93f)
                curveToRelative(-0.79f, 0.79f, -2.08f, 0.79f, -2.87f, 0f)
                lineToRelative(-2.87f, -2.87f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.87f, 2.87f)
                lineToRelative(4.96f, -4.93f)
                close()
            }
        }.also { _FolderCheck = it}
