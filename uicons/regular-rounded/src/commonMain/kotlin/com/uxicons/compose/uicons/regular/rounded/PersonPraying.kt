package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPraying: ImageVector? = null

val Icons.Rr.PersonPraying: ImageVector
    get() = _PersonPraying ?: UXIcon(name = "PersonPraying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 2.47f)
                curveTo(13f, 1.09f, 14.12f, -0.03f, 15.5f, -0.03f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(21.75f, 8.34f)
                curveToRelative(-0.37f, -0.41f, -1f, -0.45f, -1.41f, -0.08f)
                lineToRelative(-3.06f, 2.71f)
                lineToRelative(-1.92f, -2.69f)
                curveToRelative(-0.49f, -0.94f, -1.29f, -1.65f, -2.22f, -1.99f)
                curveToRelative(-0.67f, -0.31f, -1.39f, -0.37f, -2.07f, -0.18f)
                curveToRelative(-0.87f, 0.23f, -1.6f, 0.83f, -2.02f, 1.69f)
                lineToRelative(-2.65f, 6.17f)
                curveToRelative(-0.73f, 1.5f, -0.4f, 2.79f, 1.06f, 3.97f)
                lineToRelative(5.51f, 4.06f)
                horizontalLineToRelative(-7.98f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9.53f)
                curveToRelative(0.65f, 0f, 1.21f, -0.41f, 1.42f, -1.02f)
                curveToRelative(0.2f, -0.61f, -0.01f, -1.28f, -0.53f, -1.67f)
                lineToRelative(-6.72f, -4.95f)
                curveToRelative(-0.83f, -0.68f, -0.73f, -1.02f, -0.47f, -1.56f)
                lineToRelative(2.65f, -6.17f)
                curveToRelative(0.14f, -0.29f, 0.41f, -0.51f, 0.72f, -0.59f)
                curveToRelative(0.24f, -0.07f, 0.47f, -0.04f, 0.79f, 0.1f)
                curveToRelative(0.41f, 0.15f, 0.75f, 0.41f, 1.01f, 0.75f)
                lineToRelative(-2.4f, 5.73f)
                curveToRelative(-0.21f, 0.51f, 0.03f, 1.09f, 0.54f, 1.31f)
                curveToRelative(0.13f, 0.05f, 0.26f, 0.08f, 0.39f, 0.08f)
                curveToRelative(0.39f, 0f, 0.76f, -0.23f, 0.92f, -0.61f)
                lineToRelative(1.91f, -4.55f)
                lineToRelative(0.95f, 1.34f)
                curveToRelative(0.61f, 0.86f, 1.78f, 1.08f, 2.66f, 0.5f)
                curveToRelative(0.04f, -0.03f, 3.32f, -2.93f, 3.32f, -2.93f)
                curveToRelative(0.41f, -0.37f, 0.45f, -1.0f, 0.09f, -1.41f)
                close()
            }
        }.also { _PersonPraying = it}
