package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageImage: ImageVector? = null

val Icons.Rs.MessageImage: ImageVector
    get() = _MessageImage ?: UXIcon(name = "MessageImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(-6.85f)
                lineToRelative(-3.85f, 3.18f)
                curveToRelative(-0.36f, 0.32f, -0.82f, 0.48f, -1.29f, 0.48f)
                curveToRelative(-0.48f, 0f, -0.96f, -0.17f, -1.34f, -0.51f)
                lineToRelative(-3.75f, -3.16f)
                lineTo(0f, 20f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(18f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
                moveTo(2f, 3f)
                verticalLineToRelative(13.59f)
                lineTo(11f, 7.59f)
                lineToRelative(4f, 4f)
                lineToRelative(7f, -7f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(22f, 18f)
                lineTo(22f, 7.41f)
                lineToRelative(-7f, 7f)
                lineToRelative(-4f, -4f)
                lineToRelative(-7.59f, 7.59f)
                horizontalLineToRelative(4.24f)
                lineToRelative(4.33f, 3.65f)
                lineToRelative(4.45f, -3.65f)
                horizontalLineToRelative(5.57f)
                close()
            }
        }.also { _MessageImage = it}
