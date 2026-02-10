package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heat: ImageVector? = null

val Icons.Ss.Heat: ImageVector
    get() = _Heat ?: UXIcon(name = "Heat") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.98f, 24.0f)
                lineToRelative(-1.93f, -0.51f)
                curveToRelative(0.12f, -0.44f, 0.25f, -0.85f, 0.38f, -1.25f)
                curveToRelative(1.29f, -2.84f, 0.19f, -7.14f, -1.26f, -9.12f)
                arcTo(13.55f, 13.55f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.35f, 0.09f)
                lineToRelative(1.83f, 0.81f)
                arcToRelative(11.53f, 11.53f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.69f, 11.17f)
                curveToRelative(1.66f, 2.23f, 2.96f, 7.48f, 1.46f, 10.77f)
                curveTo(21.21f, 23.22f, 21.09f, 23.6f, 20.98f, 24.0f)
                close()
                moveTo(14.33f, 22.85f)
                curveToRelative(1.51f, -3.29f, 0.2f, -8.54f, -1.46f, -10.77f)
                arcTo(11.53f, 11.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.18f, 0.91f)
                lineTo(10.35f, 0.09f)
                arcToRelative(13.55f, 13.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, 13.02f)
                curveToRelative(1.45f, 1.99f, 2.56f, 6.29f, 1.26f, 9.12f)
                curveToRelative(-0.13f, 0.4f, -0.26f, 0.81f, -0.38f, 1.25f)
                lineToRelative(1.93f, 0.51f)
                curveTo(14.09f, 23.6f, 14.21f, 23.22f, 14.33f, 22.85f)
                close()
                moveTo(7.33f, 22.85f)
                curveToRelative(1.51f, -3.29f, 0.2f, -8.54f, -1.46f, -10.77f)
                arcTo(11.53f, 11.53f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.18f, 0.91f)
                lineTo(3.35f, 0.09f)
                arcToRelative(13.55f, 13.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.81f, 13.02f)
                curveTo(5.61f, 15.1f, 6.72f, 19.4f, 5.42f, 22.24f)
                curveToRelative(-0.13f, 0.4f, -0.26f, 0.81f, -0.38f, 1.25f)
                lineToRelative(1.93f, 0.51f)
                curveTo(7.09f, 23.6f, 7.21f, 23.22f, 7.33f, 22.85f)
                close()
            }
        }.also { _Heat = it}
