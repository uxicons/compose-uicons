package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CheeseAlt: ImageVector? = null

val Icons.Rs.CheeseAlt: ImageVector
    get() = _CheeseAlt ?: UXIcon(name = "CheeseAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 16f)
                curveToRelative(0f, 2.3f, 0.62f, 4.29f, 1.14f, 5.54f)
                curveToRelative(0.62f, 1.49f, 2.07f, 2.46f, 3.69f, 2.46f)
                horizontalLineTo(24f)
                verticalLineTo(8.5f)
                reflectiveCurveTo(13.79f, 0.88f, 13.79f, 0.88f)
                curveToRelative(-1.8f, -1.2f, -4.1f, -1.16f, -5.75f, 0.08f)
                curveTo(2.98f, 4.74f, 1.32f, 9.86f, 1.12f, 10.51f)
                curveTo(0.6f, 11.77f, 0f, 13.73f, 0f, 16f)
                close()
                moveTo(19.99f, 8f)
                horizontalLineTo(4.83f)
                curveToRelative(-0.13f, 0f, -0.27f, 0f, -0.4f, 0.02f)
                curveToRelative(0.96f, -1.67f, 2.5f, -3.73f, 4.8f, -5.46f)
                curveToRelative(0.98f, -0.73f, 2.35f, -0.75f, 3.4f, -0.05f)
                lineToRelative(7.35f, 5.49f)
                close()
                moveTo(2f, 16f)
                curveToRelative(0f, -1.98f, 0.54f, -3.69f, 0.99f, -4.78f)
                curveToRelative(0.31f, -0.74f, 1.03f, -1.22f, 1.84f, -1.22f)
                horizontalLineTo(22f)
                reflectiveCurveToRelative(0f, 12f, 0f, 12f)
                horizontalLineTo(4.83f)
                curveToRelative(-0.81f, 0f, -1.54f, -0.48f, -1.84f, -1.22f)
                curveToRelative(-0.45f, -1.09f, -0.99f, -2.8f, -0.99f, -4.78f)
                close()
            }
        }.also { _CheeseAlt = it}
