package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DurationAlt: ImageVector? = null

val Icons.Ss.DurationAlt: ImageVector
    get() = _DurationAlt ?: UXIcon(name = "DurationAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 6f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(19.08f, 14.44f)
                lineToRelative(-2.08f, -2.02f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.58f)
                lineToRelative(1.47f, 1.43f)
                lineToRelative(-1.39f, 1.44f)
                close()
                moveTo(12.62f, 19f)
                horizontalLineToRelative(-7.24f)
                curveToRelative(0.73f, -1.9f, 2.38f, -3.37f, 3.63f, -4.27f)
                curveToRelative(1.25f, 0.9f, 2.88f, 2.36f, 3.61f, 4.27f)
                close()
                moveTo(17.93f, 20.0f)
                curveToRelative(0.03f, 0.33f, 0.07f, 0.66f, 0.07f, 1.0f)
                verticalLineToRelative(3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -4.01f, 2.24f, -7.01f, 4.44f, -9f)
                curveTo(2.24f, 10.01f, 0f, 7.01f, 0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 0.34f, -0.04f, 0.67f, -0.07f, 1.0f)
                curveToRelative(-4.38f, 0.04f, -7.93f, 3.61f, -7.93f, 8.0f)
                curveToRelative(0f, 0.35f, 0.03f, 0.69f, 0.07f, 1.03f)
                curveToRelative(-0.18f, -0.13f, -0.35f, -0.25f, -0.51f, -0.35f)
                lineToRelative(-0.55f, -0.36f)
                lineToRelative(-0.55f, 0.36f)
                curveToRelative(-1.76f, 1.16f, -4.81f, 3.62f, -5.37f, 7.17f)
                lineToRelative(-0.19f, 1.16f)
                horizontalLineToRelative(12.19f)
                lineToRelative(-0.18f, -1.16f)
                curveToRelative(-0.03f, -0.17f, -0.07f, -0.34f, -0.1f, -0.52f)
                curveToRelative(0.96f, 0.42f, 2.02f, 0.66f, 3.12f, 0.67f)
                close()
            }
        }.also { _DurationAlt = it}
