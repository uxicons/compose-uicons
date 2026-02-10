package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderUpload: ImageVector? = null

val Icons.Rs.FolderUpload: ImageVector
    get() = _FolderUpload ?: UXIcon(name = "FolderUpload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                horizontalLineTo(12.24f)
                lineTo(8.24f, 1f)
                horizontalLineTo(3f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                verticalLineTo(23f)
                horizontalLineTo(9f)
                verticalLineToRelative(-2f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                horizontalLineTo(22f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                verticalLineTo(6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineTo(7.76f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineTo(2f)
                close()
                moveTo(13f, 15.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(14.99f)
                lineToRelative(-2.29f, 2.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.38f, -0.38f, 0.88f, -0.58f, 1.41f, -0.58f)
                horizontalLineToRelative(0f)
                curveToRelative(0.53f, 0f, 1.03f, 0.21f, 1.41f, 0.58f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-2.29f, -2.29f)
                close()
            }
        }.also { _FolderUpload = it}
