package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GlassWhiskey: ImageVector? = null

val Icons.Rr.GlassWhiskey: ImageVector
    get() = _GlassWhiskey ?: UXIcon(name = "GlassWhiskey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.99f, 4.3f)
                curveToRelative(0.08f, -0.84f, -0.19f, -1.69f, -0.76f, -2.31f)
                curveToRelative(-0.57f, -0.63f, -1.38f, -0.99f, -2.22f, -0.99f)
                lineTo(3.01f, 1f)
                curveToRelative(-0.84f, 0.0f, -1.65f, 0.36f, -2.22f, 0.98f)
                curveTo(0.22f, 2.6f, -0.06f, 3.44f, 0.02f, 4.28f)
                lineToRelative(1.32f, 14.19f)
                curveToRelative(0.24f, 2.59f, 2.38f, 4.54f, 4.98f, 4.54f)
                horizontalLineToRelative(11.28f)
                curveToRelative(2.58f, -0.0f, 4.72f, -1.94f, 4.98f, -4.5f)
                lineToRelative(1.42f, -14.2f)
                close()
                moveTo(2.27f, 3.33f)
                curveToRelative(0.19f, -0.21f, 0.45f, -0.33f, 0.74f, -0.33f)
                horizontalLineToRelative(18.0f)
                curveToRelative(0.29f, -0.0f, 0.55f, 0.12f, 0.74f, 0.33f)
                curveToRelative(0.19f, 0.21f, 0.28f, 0.49f, 0.25f, 0.77f)
                lineToRelative(-0.99f, 9.9f)
                lineTo(2.94f, 14.0f)
                reflectiveCurveToRelative(-0.93f, -9.91f, -0.93f, -9.91f)
                curveToRelative(-0.03f, -0.28f, 0.06f, -0.56f, 0.26f, -0.77f)
                close()
                moveTo(17.6f, 21f)
                lineTo(6.32f, 21f)
                curveToRelative(-1.56f, 0.0f, -2.84f, -1.17f, -2.99f, -2.72f)
                lineToRelative(-0.21f, -2.28f)
                horizontalLineToRelative(17.69f)
                reflectiveCurveToRelative(-0.23f, 2.3f, -0.23f, 2.3f)
                curveToRelative(-0.15f, 1.54f, -1.44f, 2.7f, -2.98f, 2.7f)
                close()
            }
        }.also { _GlassWhiskey = it}
