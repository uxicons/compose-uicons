package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sculpture: ImageVector? = null

val Icons.Bs.Sculpture: ImageVector
    get() = _Sculpture ?: UXIcon(name = "Sculpture") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.92f, 14.5f)
                curveToRelative(-0.16f, -0.74f, -0.64f, -1.35f, -1.32f, -1.68f)
                curveToRelative(-1.25f, -0.61f, -2.47f, -1.06f, -3.7f, -1.36f)
                curveToRelative(1.33f, -1.57f, 2.1f, -3.76f, 2.1f, -5.46f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                curveToRelative(0f, 1.7f, 0.78f, 3.89f, 2.1f, 5.46f)
                curveToRelative(-1.23f, 0.3f, -2.45f, 0.75f, -3.7f, 1.36f)
                curveToRelative(-0.68f, 0.33f, -1.16f, 0.94f, -1.32f, 1.68f)
                curveToRelative(-0.16f, 0.72f, 0.02f, 1.47f, 0.49f, 2.03f)
                curveToRelative(1.2f, 1.45f, 2.19f, 2.93f, 3.02f, 4.47f)
                horizontalLineToRelative(-2.6f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.6f)
                curveToRelative(0.83f, -1.54f, 1.82f, -3.02f, 3.02f, -4.46f)
                curveToRelative(0.47f, -0.57f, 0.65f, -1.31f, 0.49f, -2.03f)
                close()
                moveTo(12f, 3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 1.86f, -1.55f, 4.5f, -3f, 4.5f)
                reflectiveCurveToRelative(-3f, -2.64f, -3f, -4.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(14.05f, 21f)
                horizontalLineToRelative(-4.09f)
                curveToRelative(-0.95f, -2.02f, -2.12f, -3.93f, -3.58f, -5.79f)
                curveToRelative(1.9f, -0.84f, 3.66f, -1.22f, 5.63f, -1.22f)
                reflectiveCurveToRelative(3.73f, 0.38f, 5.63f, 1.22f)
                curveToRelative(-1.47f, 1.85f, -2.64f, 3.77f, -3.58f, 5.79f)
                close()
            }
        }.also { _Sculpture = it}
