package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPraying: ImageVector? = null

val Icons.Ts.PersonPraying: ImageVector
    get() = _PersonPraying ?: UXIcon(name = "PersonPraying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 4.97f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveTo(16.88f, -0.03f, 15.5f, -0.03f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(15.5f, 0.97f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(10.58f, 16.51f)
                lineToRelative(3.39f, -8.04f)
                curveToRelative(-0.38f, -0.62f, -0.9f, -1.06f, -1.53f, -1.3f)
                curveToRelative(-0.42f, -0.19f, -0.8f, -0.23f, -1.18f, -0.12f)
                curveToRelative(-0.49f, 0.13f, -0.9f, 0.47f, -1.13f, 0.93f)
                lineToRelative(-2.83f, 6.78f)
                curveToRelative(-0.39f, 0.8f, -0.41f, 1.45f, 0.65f, 2.32f)
                lineToRelative(8.04f, 5.83f)
                verticalLineToRelative(1.08f)
                lineToRelative(-13f, 0.01f)
                verticalLineToRelative(-1f)
                reflectiveCurveToRelative(11.41f, -0.01f, 11.41f, -0.01f)
                lineToRelative(-7.07f, -5.12f)
                curveToRelative(-1.31f, -1.07f, -1.61f, -2.19f, -0.95f, -3.52f)
                lineToRelative(2.83f, -6.78f)
                curveToRelative(0.36f, -0.74f, 1.01f, -1.27f, 1.78f, -1.48f)
                curveToRelative(0.61f, -0.16f, 1.22f, -0.11f, 1.82f, 0.17f)
                curveToRelative(0.92f, 0.34f, 1.68f, 1.03f, 2.13f, 1.94f)
                lineToRelative(2.33f, 3.13f)
                lineToRelative(4.7f, -3.14f)
                lineToRelative(0.56f, 0.83f)
                lineToRelative(-5.5f, 3.66f)
                lineToRelative(-2.4f, -3.24f)
                lineToRelative(-3.23f, 7.67f)
                lineToRelative(-0.83f, -0.6f)
                close()
            }
        }.also { _PersonPraying = it}
