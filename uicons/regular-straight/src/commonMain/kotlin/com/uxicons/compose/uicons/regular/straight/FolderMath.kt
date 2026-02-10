package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderMath: ImageVector? = null

val Icons.Rs.FolderMath: ImageVector
    get() = _FolderMath ?: UXIcon(name = "FolderMath") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 16f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 15f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 10f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
                moveTo(7f, 11.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(9.29f, 12.79f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(-1.41f, 1.42f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(-1.29f, 1.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(1.29f, 1.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-1.29f, -1.29f)
                lineToRelative(1.29f, -1.29f)
                lineToRelative(-1.41f, -1.42f)
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
                moveTo(22f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(11.76f, 5f)
                lineTo(7.76f, 3f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 21f)
                lineTo(22f, 21f)
                lineTo(22f, 6f)
                close()
            }
        }.also { _FolderMath = it}
