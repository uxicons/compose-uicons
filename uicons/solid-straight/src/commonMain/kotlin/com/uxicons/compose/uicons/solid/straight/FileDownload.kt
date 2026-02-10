package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileDownload: ImageVector? = null

val Icons.Ss.FileDownload: ImageVector
    get() = _FileDownload ?: UXIcon(name = "FileDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(13.41f, 19.42f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.01f)
                lineToRelative(2.29f, -2.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
            }
        }.also { _FileDownload = it}
