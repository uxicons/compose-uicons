package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileVideo: ImageVector? = null

val Icons.Rs.FileVideo: ImageVector
    get() = _FileVideo ?: UXIcon(name = "FileVideo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.41f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.59f)
                lineTo(14.41f, 0f)
                close()
                moveTo(15f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(15f, 3.41f)
                close()
                moveTo(20f, 22f)
                lineTo(4f, 22f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(13f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(13f)
                close()
                moveTo(6f, 20f)
                lineTo(15f, 20f)
                verticalLineToRelative(-2.25f)
                lineToRelative(3f, 2.25f)
                lineTo(18f, 12f)
                lineToRelative(-3f, 2.25f)
                verticalLineToRelative(-2.25f)
                lineTo(6f, 12f)
                verticalLineToRelative(8f)
                close()
                moveTo(8f, 14f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _FileVideo = it}
