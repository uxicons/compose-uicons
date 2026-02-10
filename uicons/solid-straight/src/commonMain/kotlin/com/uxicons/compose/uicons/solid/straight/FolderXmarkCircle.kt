package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderXmarkCircle: ImageVector? = null

val Icons.Ss.FolderXmarkCircle: ImageVector
    get() = _FolderXmarkCircle ?: UXIcon(name = "FolderXmarkCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.24f, 13.76f)
                curveToRelative(-2.34f, -2.34f, -6.14f, -2.34f, -8.48f, 0f)
                curveToRelative(-2.34f, 2.34f, -2.34f, 6.14f, 0f, 8.48f)
                curveToRelative(2.34f, 2.34f, 6.14f, 2.34f, 8.48f, 0f)
                curveToRelative(2.34f, -2.34f, 2.34f, -6.14f, 0f, -8.48f)
                close()
                moveTo(21.54f, 20.12f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.12f, 2.12f)
                close()
                moveTo(11.08f, 22f)
                lineTo(0f, 22f)
                lineTo(0f, 8f)
                lineTo(24f, 8f)
                verticalLineToRelative(4.72f)
                curveToRelative(-1.47f, -1.67f, -3.61f, -2.72f, -6f, -2.72f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                curveToRelative(0f, 1.46f, 0.4f, 2.82f, 1.08f, 4f)
                close()
                moveTo(24f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _FolderXmarkCircle = it}
