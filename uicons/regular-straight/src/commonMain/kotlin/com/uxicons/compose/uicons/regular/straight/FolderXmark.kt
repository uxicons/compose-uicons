package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmark: ImageVector? = null

val Icons.Rs.FolderXmark: ImageVector
    get() = _FolderXmark ?: UXIcon(name = "FolderXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.95f, 12.46f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(-2.54f, 2.54f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(-2.54f, -2.54f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.54f, 2.54f)
                lineToRelative(2.54f, -2.54f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(24f, 6f)
                lineTo(24f, 23f)
                lineTo(0f, 23f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(3f)
                lineTo(22f, 7f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(11.76f, 5f)
                lineTo(7.76f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 21f)
                lineTo(22f, 9f)
                lineTo(2f, 9f)
                verticalLineToRelative(12f)
                lineTo(22f, 21f)
                close()
            }
        }.also { _FolderXmark = it}
