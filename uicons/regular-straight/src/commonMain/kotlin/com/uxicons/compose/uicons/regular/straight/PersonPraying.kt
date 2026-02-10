package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPraying: ImageVector? = null

val Icons.Rs.PersonPraying: ImageVector
    get() = _PersonPraying ?: UXIcon(name = "PersonPraying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.47f)
                curveTo(13f, 1.09f, 14.12f, -0.03f, 15.5f, -0.03f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(12.27f, 16.8f)
                lineToRelative(2.46f, -5.96f)
                lineToRelative(1.93f, 2.71f)
                lineToRelative(5.6f, -3.74f)
                lineToRelative(-1.11f, -1.66f)
                lineToRelative(-4.0f, 2.66f)
                lineToRelative(-1.82f, -2.53f)
                curveToRelative(-0.49f, -0.94f, -1.29f, -1.65f, -2.22f, -1.99f)
                curveToRelative(-0.68f, -0.31f, -1.38f, -0.37f, -2.07f, -0.18f)
                curveToRelative(-0.87f, 0.23f, -1.6f, 0.83f, -2.02f, 1.7f)
                lineToRelative(-2.65f, 6.35f)
                curveToRelative(-0.73f, 1.5f, -0.4f, 2.79f, 1.04f, 3.96f)
                lineToRelative(5.05f, 3.88f)
                lineTo(4f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1.8f)
                lineToRelative(-7.34f, -5.65f)
                curveToRelative(-0.83f, -0.68f, -0.73f, -1.02f, -0.46f, -1.57f)
                lineToRelative(2.65f, -6.35f)
                curveToRelative(0.14f, -0.29f, 0.41f, -0.51f, 0.72f, -0.59f)
                curveToRelative(0.24f, -0.07f, 0.47f, -0.04f, 0.79f, 0.1f)
                curveToRelative(0.41f, 0.15f, 0.75f, 0.41f, 1.01f, 0.75f)
                lineToRelative(-2.74f, 6.65f)
                lineToRelative(1.64f, 1.26f)
                close()
            }
        }.also { _PersonPraying = it}
