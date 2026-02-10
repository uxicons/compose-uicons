package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheeseAlt: ImageVector? = null

val Icons.Bs.CheeseAlt: ImageVector
    get() = _CheeseAlt ?: UXIcon(name = "CheeseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 16f)
                curveToRelative(0f, 2.34f, 0.62f, 4.22f, 1.14f, 5.39f)
                curveToRelative(0.71f, 1.59f, 2.31f, 2.61f, 4.09f, 2.61f)
                lineTo(24f, 24f)
                reflectiveCurveToRelative(0f, -15.23f, 0f, -15.23f)
                lineTo(14.03f, 0.93f)
                curveTo(13.13f, 0.33f, 12.09f, 0.01f, 11.02f, 0f)
                curveToRelative(-1.23f, -0.01f, -2.33f, 0.35f, -3.27f, 1.06f)
                curveTo(2.89f, 4.69f, 1.03f, 10.52f, 0.63f, 11.97f)
                curveTo(0.21f, 13.26f, 0f, 14.63f, 0f, 16f)
                close()
                moveTo(18.17f, 8f)
                lineTo(5.59f, 8f)
                curveToRelative(0.94f, -1.58f, 2.22f, -3.25f, 3.95f, -4.54f)
                curveToRelative(0.41f, -0.31f, 0.95f, -0.47f, 1.44f, -0.46f)
                curveToRelative(0.47f, 0f, 0.94f, 0.14f, 1.34f, 0.4f)
                lineToRelative(5.85f, 4.6f)
                close()
                moveTo(3f, 16f)
                curveToRelative(0f, -2.09f, 0.76f, -3.89f, 0.88f, -4.16f)
                curveToRelative(0.23f, -0.51f, 0.76f, -0.84f, 1.35f, -0.84f)
                horizontalLineToRelative(15.77f)
                verticalLineToRelative(10f)
                lineTo(5.23f, 21f)
                curveToRelative(-0.59f, 0f, -1.12f, -0.33f, -1.35f, -0.84f)
                curveToRelative(-0.4f, -0.9f, -0.88f, -2.34f, -0.88f, -4.16f)
                close()
            }
        }.also { _CheeseAlt = it}
