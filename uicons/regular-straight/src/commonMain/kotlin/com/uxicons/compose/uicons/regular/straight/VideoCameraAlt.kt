package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCameraAlt: ImageVector? = null

val Icons.Rs.VideoCameraAlt: ImageVector
    get() = _VideoCameraAlt ?: UXIcon(name = "VideoCameraAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 4.09f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-1.09f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(13f)
                lineTo(20f, 20f)
                verticalLineToRelative(-4.09f)
                lineToRelative(4f, 4f)
                lineTo(24f, 4.09f)
                close()
                moveTo(18f, 18f)
                lineTo(2f, 18f)
                lineTo(2f, 7f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(11f)
                close()
                moveTo(22f, 15.09f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-2.17f)
                lineToRelative(2f, -2f)
                verticalLineToRelative(6.17f)
                close()
            }
        }.also { _VideoCameraAlt = it}
