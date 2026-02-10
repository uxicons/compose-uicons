package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAudio: ImageVector? = null

val Icons.Rs.FileAudio: ImageVector
    get() = _FileAudio ?: UXIcon(name = "FileAudio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.11f, 14f)
                lineToRelative(3.89f, -2.56f)
                verticalLineToRelative(9.12f)
                lineToRelative(-3.89f, -2.56f)
                horizontalLineToRelative(-2.11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2.11f)
                close()
                moveTo(15f, 14f)
                verticalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(22f, 7.59f)
                verticalLineToRelative(16.41f)
                lineTo(2f, 24f)
                lineTo(2f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9.41f)
                lineToRelative(7.59f, 7.59f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(20f, 22f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-7f)
                lineTo(13f, 2f)
                lineTo(5f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(19f)
                horizontalLineToRelative(16f)
                close()
            }
        }.also { _FileAudio = it}
