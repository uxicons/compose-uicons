package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontalAlt: ImageVector? = null

val Icons.Ts.ReflectHorizontalAlt: ImageVector
    get() = _ReflectHorizontalAlt ?: UXIcon(name = "ReflectHorizontalAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.65f, 10.52f)
                curveToRelative(-0.42f, 0.38f, -0.65f, 0.91f, -0.65f, 1.48f)
                curveToRelative(0f, 0.56f, 0.24f, 1.09f, 0.65f, 1.46f)
                lineToRelative(8.35f, 7.64f)
                lineTo(24f, 2.89f)
                lineToRelative(-8.35f, 7.63f)
                close()
                moveTo(23f, 18.83f)
                lineToRelative(-6.68f, -6.11f)
                curveToRelative(-0.21f, -0.18f, -0.32f, -0.45f, -0.32f, -0.72f)
                curveToRelative(0f, -0.29f, 0.11f, -0.54f, 0.33f, -0.74f)
                lineToRelative(6.67f, -6.11f)
                verticalLineToRelative(13.67f)
                close()
                moveTo(0f, 2.89f)
                lineTo(0f, 21.1f)
                lineToRelative(8.35f, -7.63f)
                curveToRelative(0.42f, -0.37f, 0.66f, -0.91f, 0.66f, -1.47f)
                curveToRelative(0f, -0.57f, -0.23f, -1.09f, -0.65f, -1.48f)
                lineTo(0f, 2.89f)
                close()
                moveTo(7.67f, 12.72f)
                lineTo(1f, 18.83f)
                lineTo(1f, 5.16f)
                lineToRelative(6.67f, 6.11f)
                curveToRelative(0.21f, 0.19f, 0.33f, 0.45f, 0.33f, 0.73f)
                curveToRelative(0f, 0.27f, -0.12f, 0.54f, -0.33f, 0.72f)
                close()
                moveTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 24f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 0f)
                close()
            }
        }.also { _ReflectHorizontalAlt = it}
