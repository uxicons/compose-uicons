package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenFancySlash: ImageVector? = null

val Icons.Rs.PenFancySlash: ImageVector
    get() = _PenFancySlash ?: UXIcon(name = "PenFancySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.12f, 5.12f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-8.28f, 8.3f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-9.12f, -9.12f)
                lineToRelative(8.28f, -8.31f)
                close()
                moveTo(20.29f, 2.29f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(0.19f, 0.19f, 0.29f, 0.44f, 0.29f, 0.71f)
                reflectiveCurveToRelative(-0.1f, 0.52f, -0.29f, 0.71f)
                lineToRelative(-8.28f, 8.3f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(20.29f, 2.29f)
                close()
                moveTo(10.74f, 14.98f)
                lineToRelative(1.66f, 1.66f)
                lineToRelative(-1.16f, 4.74f)
                lineTo(0.03f, 24.0f)
                lineToRelative(2.63f, -11.21f)
                lineToRelative(4.75f, -1.14f)
                lineToRelative(1.66f, 1.66f)
                lineToRelative(-4.74f, 1.14f)
                lineToRelative(-1.18f, 5.02f)
                lineToRelative(3.28f, -3.28f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.28f, 3.28f)
                lineToRelative(5.02f, -1.18f)
                lineToRelative(1.15f, -4.72f)
                close()
            }
        }.also { _PenFancySlash = it}
