package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAudio: ImageVector? = null

val Icons.Bs.FileAudio: ImageVector
    get() = _FileAudio ?: UXIcon(name = "FileAudio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.11f, 13f)
                lineToRelative(3.89f, -2.56f)
                verticalLineToRelative(9.12f)
                lineToRelative(-3.89f, -2.56f)
                horizontalLineToRelative(-2.11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.11f)
                close()
                moveTo(22f, 5.67f)
                verticalLineToRelative(18.34f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(11.38f)
                lineToRelative(5.62f, 5.67f)
                close()
                moveTo(19f, 21f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-5f)
                lineTo(14f, 3f)
                lineTo(5f, 3f)
                verticalLineToRelative(18f)
                horizontalLineToRelative(14f)
                close()
                moveTo(15f, 13f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _FileAudio = it}
