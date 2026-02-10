package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonPraying: ImageVector? = null

val Icons.Tr.PersonPraying: ImageVector
    get() = _PersonPraying ?: UXIcon(name = "PersonPraying") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(15.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(21.84f, 9.87f)
                lineToRelative(-3.13f, 2.83f)
                curveToRelative(-0.74f, 0.5f, -1.65f, 0.33f, -2.12f, -0.34f)
                lineToRelative(-2.03f, -2.92f)
                lineToRelative(-3.04f, 7.25f)
                curveToRelative(-0.08f, 0.19f, -0.27f, 0.31f, -0.46f, 0.31f)
                curveToRelative(-0.07f, 0f, -0.13f, -0.01f, -0.19f, -0.04f)
                curveToRelative(-0.26f, -0.11f, -0.38f, -0.4f, -0.27f, -0.65f)
                lineToRelative(3.3f, -7.87f)
                curveToRelative(-0.37f, -0.6f, -0.89f, -1.03f, -1.51f, -1.26f)
                curveToRelative(-0.42f, -0.19f, -0.8f, -0.23f, -1.18f, -0.12f)
                curveToRelative(-0.49f, 0.13f, -0.9f, 0.47f, -1.13f, 0.93f)
                lineToRelative(-2.83f, 6.58f)
                curveToRelative(-0.39f, 0.79f, -0.41f, 1.45f, 0.66f, 2.31f)
                lineToRelative(7.69f, 5.27f)
                curveToRelative(0.38f, 0.28f, 0.52f, 0.72f, 0.38f, 1.15f)
                curveToRelative(-0.14f, 0.43f, -0.52f, 0.7f, -0.97f, 0.7f)
                lineTo(4.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10.5f)
                lineToRelative(-7.69f, -5.32f)
                curveToRelative(-1.33f, -1.08f, -1.62f, -2.19f, -0.97f, -3.53f)
                lineToRelative(2.83f, -6.58f)
                curveToRelative(0.36f, -0.74f, 1.0f, -1.27f, 1.77f, -1.48f)
                curveToRelative(0.61f, -0.16f, 1.22f, -0.11f, 1.82f, 0.17f)
                curveToRelative(0.91f, 0.34f, 1.68f, 1.02f, 2.13f, 1.92f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.0f, 0.01f, 0.01f, 0.01f)
                lineToRelative(2.51f, 3.6f)
                curveToRelative(0.16f, 0.22f, 0.46f, 0.28f, 0.69f, 0.13f)
                lineToRelative(3.06f, -2.79f)
                curveToRelative(0.2f, -0.18f, 0.52f, -0.17f, 0.71f, 0.04f)
                curveToRelative(0.19f, 0.2f, 0.17f, 0.52f, -0.03f, 0.71f)
                close()
            }
        }.also { _PersonPraying = it}
