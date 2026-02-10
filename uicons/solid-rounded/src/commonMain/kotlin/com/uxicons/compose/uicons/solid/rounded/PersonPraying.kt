package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPraying: ImageVector? = null

val Icons.Sr.PersonPraying: ImageVector
    get() = _PersonPraying ?: UXIcon(name = "PersonPraying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.47f)
                curveTo(13f, 1.09f, 14.12f, -0.03f, 15.5f, -0.03f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21.66f, 9.75f)
                lineToRelative(-3.21f, 2.84f)
                curveToRelative(-0.04f, 0.03f, -0.07f, 0.06f, -0.11f, 0.09f)
                curveToRelative(-0.88f, 0.58f, -2.05f, 0.36f, -2.66f, -0.5f)
                lineToRelative(-1.26f, -1.81f)
                lineToRelative(-3.38f, 7.67f)
                lineToRelative(4.36f, 3.27f)
                curveToRelative(0.52f, 0.38f, 0.73f, 1.05f, 0.53f, 1.67f)
                curveToRelative(-0.2f, 0.61f, -0.77f, 1.02f, -1.42f, 1.02f)
                lineTo(4.98f, 24.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(7.98f)
                lineToRelative(-5.51f, -4.06f)
                curveToRelative(-1.46f, -1.19f, -1.79f, -2.48f, -1.06f, -3.97f)
                lineToRelative(2.65f, -6.17f)
                curveToRelative(0.42f, -0.85f, 1.15f, -1.46f, 2.02f, -1.69f)
                curveToRelative(0.69f, -0.18f, 1.4f, -0.12f, 2.07f, 0.18f)
                curveToRelative(0.93f, 0.34f, 1.74f, 1.05f, 2.22f, 1.99f)
                lineToRelative(1.92f, 2.69f)
                lineToRelative(3.06f, -2.71f)
                curveToRelative(0.41f, -0.37f, 1.04f, -0.33f, 1.41f, 0.08f)
                curveToRelative(0.37f, 0.41f, 0.33f, 1.04f, -0.09f, 1.41f)
                close()
            }
        }.also { _PersonPraying = it}
