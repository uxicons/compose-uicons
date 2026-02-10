package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _QuranUser: ImageVector? = null

val Icons.Sr.QuranUser: ImageVector
    get() = _QuranUser ?: UXIcon(name = "QuranUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.05f, 0f)
                curveToRelative(1.69f, 0f, 2.95f, 1.34f, 2.95f, 3f)
                reflectiveCurveToRelative(-1.26f, 3f, -2.95f, 3f)
                reflectiveCurveToRelative(-3.05f, -1.34f, -3.05f, -3f)
                reflectiveCurveToRelative(1.37f, -3f, 3.05f, -3f)
                close()
                moveTo(21.21f, 20.82f)
                lineTo(17.37f, 17.8f)
                lineTo(21.42f, 15.91f)
                curveToRelative(0.5f, -0.23f, 0.72f, -0.83f, 0.48f, -1.33f)
                curveToRelative(-0.23f, -0.5f, -0.83f, -0.71f, -1.33f, -0.48f)
                lineToRelative(-8.13f, 3.8f)
                curveToRelative(-0.28f, 0.14f, -0.61f, 0.14f, -0.92f, -0.01f)
                lineToRelative(-8.11f, -3.79f)
                curveToRelative(-0.5f, -0.23f, -1.09f, -0.02f, -1.33f, 0.48f)
                reflectiveCurveToRelative(-0.02f, 1.1f, 0.48f, 1.33f)
                lineToRelative(4.06f, 1.9f)
                lineToRelative(-3.84f, 3.02f)
                curveToRelative(-1.47f, 0.86f, -0.71f, 3.27f, 1.0f, 3.18f)
                horizontalLineToRelative(6.37f)
                curveToRelative(-0.11f, -0.31f, -0.17f, -0.65f, -0.17f, -1f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                lineToRelative(2.47f, 2f)
                horizontalLineToRelative(-6.47f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7.2f)
                curveToRelative(1.72f, 0.09f, 2.47f, -2.31f, 1.0f, -3.18f)
                close()
                moveTo(12.45f, 15.89f)
                lineTo(16.45f, 13.89f)
                curveToRelative(0.34f, -0.17f, 0.55f, -0.52f, 0.55f, -0.9f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.38f, 0.21f, 0.72f, 0.55f, 0.9f)
                lineToRelative(4f, 2f)
                curveToRelative(0.28f, 0.14f, 0.61f, 0.14f, 0.9f, 0f)
                close()
            }
        }.also { _QuranUser = it}
