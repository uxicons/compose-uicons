package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Bs.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.77f, 9.79f)
                curveToRelative(-0.78f, -0.65f, -1.8f, -0.92f, -2.79f, -0.74f)
                lineToRelative(-5.9f, 1.07f)
                curveToRelative(-0.8f, 0.14f, -1.51f, 0.5f, -2.08f, 1f)
                curveToRelative(-0.58f, -0.5f, -1.29f, -0.85f, -2.08f, -1f)
                lineToRelative(-5.9f, -1.07f)
                curveToRelative(-1.0f, -0.18f, -2.02f, 0.09f, -2.79f, 0.74f)
                curveToRelative(-0.78f, 0.65f, -1.23f, 1.6f, -1.23f, 2.62f)
                verticalLineToRelative(9.43f)
                lineToRelative(12f, 2.18f)
                lineToRelative(12f, -2.18f)
                lineTo(24f, 12.41f)
                curveToRelative(0f, -1.01f, -0.45f, -1.97f, -1.23f, -2.62f)
                close()
                moveTo(10.5f, 20.7f)
                lineToRelative(-7.5f, -1.36f)
                verticalLineToRelative(-6.93f)
                curveToRelative(0f, -0.17f, 0.09f, -0.27f, 0.15f, -0.31f)
                curveToRelative(0.06f, -0.05f, 0.17f, -0.12f, 0.34f, -0.09f)
                lineToRelative(5.9f, 1.07f)
                curveToRelative(0.65f, 0.12f, 1.12f, 0.68f, 1.12f, 1.34f)
                verticalLineToRelative(6.28f)
                close()
                moveTo(21f, 19.34f)
                lineToRelative(-7.5f, 1.36f)
                verticalLineToRelative(-6.28f)
                curveToRelative(0f, -0.66f, 0.47f, -1.22f, 1.12f, -1.34f)
                lineToRelative(5.9f, -1.07f)
                curveToRelative(0.17f, -0.03f, 0.28f, 0.04f, 0.34f, 0.09f)
                curveToRelative(0.06f, 0.05f, 0.15f, 0.15f, 0.15f, 0.31f)
                verticalLineToRelative(6.93f)
                close()
                moveTo(7.5f, 4.5f)
                curveTo(7.5f, 2.02f, 9.52f, 0f, 12f, 0f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                reflectiveCurveToRelative(-2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                close()
            }
        }.also { _BookOpenReader = it}
