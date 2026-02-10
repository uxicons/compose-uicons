package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileEdit: ImageVector? = null

val Icons.Ss.FileEdit: ImageVector
    get() = _FileEdit ?: UXIcon(name = "FileEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(15f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(24f, 14.54f)
                curveToRelative(0f, 0.68f, -0.26f, 1.32f, -0.74f, 1.79f)
                lineToRelative(-7.67f, 7.67f)
                horizontalLineToRelative(-3.59f)
                verticalLineToRelative(-3.59f)
                lineToRelative(7.67f, -7.67f)
                curveToRelative(0.99f, -0.99f, 2.6f, -0.99f, 3.59f, 0f)
                curveToRelative(0.48f, 0.48f, 0.74f, 1.12f, 0.74f, 1.79f)
                close()
                moveTo(10.0f, 19.58f)
                lineToRelative(8.25f, -8.25f)
                curveToRelative(0.5f, -0.5f, 1.1f, -0.87f, 1.75f, -1.09f)
                verticalLineToRelative(-3.24f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 0f)
                lineTo(3f, 0f)
                curveTo(1.34f, 0f, 0f, 1.34f, 0f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-4.42f)
                close()
            }
        }.also { _FileEdit = it}
