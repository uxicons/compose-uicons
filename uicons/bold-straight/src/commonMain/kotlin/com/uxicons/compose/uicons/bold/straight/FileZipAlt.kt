package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileZipAlt: ImageVector? = null

val Icons.Bs.FileZipAlt: ImageVector
    get() = _FileZipAlt ?: UXIcon(name = "FileZipAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.56f, 4.47f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-2.29f, 2.29f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(2.29f, -2.29f)
                close()
                moveTo(8.62f, 4.47f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.29f, 2.29f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(-2.29f, -2.29f)
                close()
                moveTo(22f, 3.5f)
                lineTo(22f, 24f)
                lineTo(2f, 24f)
                lineTo(2f, 3.5f)
                curveTo(2f, 1.57f, 3.57f, 0f, 5.5f, 0f)
                horizontalLineToRelative(13f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(19f, 21f)
                lineTo(19f, 5.28f)
                lineToRelative(-0.1f, 0.1f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(0.26f, -0.26f)
                lineTo(7.15f, 3.0f)
                lineToRelative(0.26f, 0.26f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(-0.29f, -0.29f)
                verticalLineToRelative(15.91f)
                horizontalLineToRelative(14f)
                close()
                moveTo(10.5f, 13f)
                lineToRelative(-1f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                lineToRelative(-1f, -5f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(10.82f, 11f)
                horizontalLineToRelative(2.37f)
                lineToRelative(0.91f, -0.91f)
                lineToRelative(-2.09f, -2.09f)
                lineToRelative(-2.09f, 2.09f)
                lineToRelative(0.91f, 0.91f)
                close()
            }
        }.also { _FileZipAlt = it}
