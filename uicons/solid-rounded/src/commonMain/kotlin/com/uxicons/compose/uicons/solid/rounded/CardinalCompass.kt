package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardinalCompass: ImageVector? = null

val Icons.Sr.CardinalCompass: ImageVector
    get() = _CardinalCompass ?: UXIcon(name = "CardinalCompass") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-0.51f, 0f, -0.97f, -0.31f, -1.16f, -0.79f)
                lineToRelative(-2.02f, -8.03f)
                lineTo(0.79f, 13.16f)
                curveToRelative(-0.47f, -0.19f, -0.79f, -0.65f, -0.79f, -1.16f)
                reflectiveCurveToRelative(0.31f, -0.97f, 0.79f, -1.16f)
                lineToRelative(8.03f, -2.02f)
                lineTo(10.84f, 0.79f)
                curveToRelative(0.19f, -0.47f, 0.65f, -0.79f, 1.16f, -0.79f)
                reflectiveCurveToRelative(0.97f, 0.31f, 1.16f, 0.79f)
                lineToRelative(2.02f, 8.03f)
                lineToRelative(8.03f, 2.02f)
                curveToRelative(0.47f, 0.19f, 0.79f, 0.65f, 0.79f, 1.16f)
                reflectiveCurveToRelative(-0.31f, 0.97f, -0.79f, 1.16f)
                lineToRelative(-8.03f, 2.02f)
                lineToRelative(-2.02f, 8.03f)
                curveToRelative(-0.19f, 0.47f, -0.65f, 0.79f, -1.16f, 0.79f)
                close()
                moveTo(5.23f, 7.66f)
                lineToRelative(1.94f, -0.49f)
                lineToRelative(0.49f, -1.93f)
                lineToRelative(-1.84f, -1.13f)
                curveToRelative(-0.49f, -0.21f, -1.06f, -0.1f, -1.44f, 0.28f)
                curveToRelative(-0.38f, 0.38f, -0.49f, 0.95f, -0.28f, 1.44f)
                lineToRelative(1.13f, 1.84f)
                close()
                moveTo(16.83f, 7.17f)
                lineToRelative(1.9f, 0.48f)
                lineToRelative(1.17f, -1.83f)
                curveToRelative(0.21f, -0.49f, 0.1f, -1.06f, -0.28f, -1.44f)
                reflectiveCurveToRelative(-0.95f, -0.49f, -1.44f, -0.28f)
                lineToRelative(-1.84f, 1.11f)
                lineToRelative(0.49f, 1.96f)
                close()
                moveTo(7.17f, 16.83f)
                lineToRelative(-1.95f, -0.49f)
                lineToRelative(-1.12f, 1.85f)
                curveToRelative(-0.21f, 0.49f, -0.1f, 1.06f, 0.28f, 1.44f)
                curveToRelative(0.38f, 0.38f, 0.95f, 0.49f, 1.44f, 0.28f)
                lineToRelative(1.83f, -1.15f)
                lineToRelative(-0.48f, -1.92f)
                close()
                moveTo(18.75f, 16.35f)
                lineToRelative(-1.92f, 0.48f)
                lineToRelative(-0.49f, 1.92f)
                lineToRelative(1.84f, 1.15f)
                curveToRelative(0.17f, 0.07f, 0.34f, 0.1f, 0.51f, 0.1f)
                curveToRelative(0.34f, 0f, 0.67f, -0.13f, 0.92f, -0.38f)
                curveToRelative(0.38f, -0.38f, 0.49f, -0.95f, 0.28f, -1.44f)
                lineToRelative(-1.15f, -1.83f)
                close()
            }
        }.also { _CardinalCompass = it}
