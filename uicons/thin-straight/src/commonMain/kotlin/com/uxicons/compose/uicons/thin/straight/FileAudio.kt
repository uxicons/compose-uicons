package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAudio: ImageVector? = null

val Icons.Ts.FileAudio: ImageVector
    get() = _FileAudio ?: UXIcon(name = "FileAudio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2.36f)
                lineToRelative(4.64f, 2.9f)
                verticalLineToRelative(-10.8f)
                lineToRelative(-4.64f, 2.9f)
                horizontalLineToRelative(-2.36f)
                close()
                moveTo(13f, 11.9f)
                verticalLineToRelative(7.2f)
                lineToRelative(-3.36f, -2.1f)
                horizontalLineToRelative(-1.64f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1.64f)
                lineToRelative(3.36f, -2.1f)
                close()
                moveTo(17.5f, 15.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                verticalLineToRelative(-1f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(14.71f, 0f)
                lineTo(4.5f, 0f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7.29f)
                lineTo(14.71f, 0f)
                close()
                moveTo(15f, 1.71f)
                lineToRelative(5.29f, 5.29f)
                horizontalLineToRelative(-5.29f)
                lineTo(15f, 1.71f)
                close()
                moveTo(3f, 23f)
                lineTo(3f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                lineTo(3f, 23f)
                close()
            }
        }.also { _FileAudio = it}
