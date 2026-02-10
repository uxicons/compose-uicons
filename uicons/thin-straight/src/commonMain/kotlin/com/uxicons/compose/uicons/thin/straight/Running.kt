package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Running: ImageVector? = null

val Icons.Ts.Running: ImageVector
    get() = _Running ?: UXIcon(name = "Running") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.78f)
                lineToRelative(-2.57f, -4.27f)
                curveToRelative(-0.03f, -0.04f, -0.06f, -0.09f, -0.09f, -0.13f)
                lineToRelative(-3.06f, 7.15f)
                lineToRelative(-0.86f, -0.55f)
                lineToRelative(3.06f, -7.16f)
                curveToRelative(-0.11f, -0.03f, -0.23f, -0.04f, -0.34f, -0.04f)
                horizontalLineToRelative(-2.58f)
                lineToRelative(-2.61f, 6.24f)
                curveToRelative(-0.28f, 0.67f, -0.03f, 1.44f, 0.59f, 1.83f)
                lineToRelative(5.25f, 3.14f)
                verticalLineToRelative(5.78f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-5.22f)
                lineToRelative(-4.77f, -2.85f)
                curveToRelative(-1.04f, -0.66f, -1.45f, -1.94f, -0.99f, -3.07f)
                lineToRelative(2.45f, -5.86f)
                horizontalLineToRelative(-3.88f)
                lineToRelative(-1.86f, 3.72f)
                lineToRelative(-0.9f, -0.45f)
                lineToRelative(2.14f, -4.28f)
                lineTo(14.36f, 6.0f)
                curveToRelative(0.87f, 0f, 1.69f, 0.46f, 2.14f, 1.21f)
                lineToRelative(2.28f, 3.79f)
                horizontalLineToRelative(4.22f)
                close()
                moveTo(12f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(13f, 2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(7.86f, 17.39f)
                lineToRelative(-0.69f, 1.61f)
                lineTo(2f, 19f)
                verticalLineToRelative(1f)
                lineTo(7.83f, 20f)
                lineToRelative(0.88f, -2.05f)
                lineToRelative(-0.51f, -0.3f)
                curveToRelative(-0.12f, -0.08f, -0.23f, -0.17f, -0.34f, -0.26f)
                close()
            }
        }.also { _Running = it}
