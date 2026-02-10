package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileEdit: ImageVector? = null

val Icons.Bs.FileEdit: ImageVector
    get() = _FileEdit ?: UXIcon(name = "FileEdit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 8f)
                lineTo(12f, 3f)
                lineTo(3f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                verticalLineToRelative(5.77f)
                curveToRelative(-0.41f, 0.2f, -0.8f, 0.45f, -1.14f, 0.79f)
                lineToRelative(-1.86f, 1.86f)
                verticalLineToRelative(-6.09f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(23.36f, 13.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
            }
        }.also { _FileEdit = it}
