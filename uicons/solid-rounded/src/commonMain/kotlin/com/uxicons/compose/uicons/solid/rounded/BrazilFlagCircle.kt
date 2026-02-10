package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrazilFlagCircle: ImageVector? = null

val Icons.Sr.BrazilFlagCircle: ImageVector
    get() = _BrazilFlagCircle ?: UXIcon(name = "BrazilFlagCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.68f, 6.23f)
                curveToRelative(-0.4f, -0.31f, -0.96f, -0.31f, -1.36f, 0f)
                lineToRelative(-7.18f, 5.49f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.35f, 0f, 0.55f)
                lineToRelative(7.18f, 5.49f)
                curveToRelative(0.4f, 0.31f, 0.96f, 0.31f, 1.37f, 0f)
                lineToRelative(7.18f, -5.49f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.35f, 0f, -0.55f)
                lineToRelative(-7.18f, -5.49f)
                close()
                moveTo(12f, 15.5f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -0.17f, 0.03f, -0.33f, 0.05f, -0.5f)
                curveToRelative(0.45f, 0.02f, 3.71f, 0.23f, 6.19f, 2.65f)
                curveToRelative(-0.64f, 0.81f, -1.62f, 1.34f, -2.74f, 1.34f)
                close()
                moveTo(15.49f, 12.14f)
                curveToRelative(-2.2f, -1.83f, -4.67f, -2.39f, -6.0f, -2.56f)
                curveToRelative(0.64f, -0.66f, 1.53f, -1.08f, 2.52f, -1.08f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                curveToRelative(0f, 0.05f, -0.01f, 0.09f, -0.01f, 0.14f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(21.08f, 13.87f)
                lineToRelative(-7.18f, 5.49f)
                curveToRelative(-1.12f, 0.85f, -2.68f, 0.85f, -3.79f, 0f)
                lineTo(2.92f, 13.87f)
                curveToRelative(-1.22f, -0.88f, -1.22f, -2.85f, 0f, -3.73f)
                lineToRelative(7.18f, -5.49f)
                horizontalLineToRelative(0f)
                curveToRelative(1.12f, -0.85f, 2.68f, -0.85f, 3.79f, 0f)
                lineToRelative(7.18f, 5.49f)
                curveToRelative(1.22f, 0.88f, 1.22f, 2.85f, 0f, 3.73f)
                close()
            }
        }.also { _BrazilFlagCircle = it}
