package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCameraAlt: ImageVector? = null

val Icons.Rr.VideoCameraAlt: ImageVector
    get() = _VideoCameraAlt ?: UXIcon(name = "VideoCameraAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.9f, 6.54f)
                curveToRelative(-0.68f, -0.34f, -1.47f, -0.27f, -2.08f, 0.19f)
                curveToRelative(-0.04f, 0.03f, -0.08f, 0.06f, -0.11f, 0.1f)
                lineToRelative(-1.76f, 1.77f)
                curveToRelative(-0.21f, -2.56f, -2.34f, -4.59f, -4.96f, -4.59f)
                lineTo(5f, 4.0f)
                curveTo(2.24f, 4f, 0f, 6.24f, 0f, 9f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                lineTo(14f, 20f)
                curveToRelative(2.63f, 0f, 4.77f, -2.05f, 4.96f, -4.63f)
                lineToRelative(1.76f, 1.75f)
                curveToRelative(0.03f, 0.03f, 0.07f, 0.06f, 0.11f, 0.09f)
                curveToRelative(0.35f, 0.26f, 0.77f, 0.4f, 1.19f, 0.4f)
                curveToRelative(0.3f, 0f, 0.61f, -0.07f, 0.89f, -0.21f)
                curveToRelative(0.68f, -0.34f, 1.1f, -1.02f, 1.1f, -1.77f)
                verticalLineToRelative(-7.32f)
                curveToRelative(0f, -0.76f, -0.42f, -1.44f, -1.1f, -1.77f)
                close()
                moveTo(14f, 18f)
                lineTo(5f, 18f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                lineTo(14f, 6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(19f, 12.58f)
                verticalLineToRelative(-1.19f)
                lineToRelative(3f, -3.03f)
                lineToRelative(0.03f, 7.24f)
                lineToRelative(-3.02f, -3.02f)
                close()
            }
        }.also { _VideoCameraAlt = it}
