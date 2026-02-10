package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlane: ImageVector? = null

val Icons.Ts.PaperPlane: ImageVector
    get() = _PaperPlane ?: UXIcon(name = "PaperPlane") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 20.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-8.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(5.5f, 18f)
                curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
                reflectiveCurveToRelative(2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(6f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(12f, 7.09f)
                lineToRelative(-2f, -5.47f)
                curveToRelative(0f, -0.27f, 0.06f, -0.53f, 0.18f, -0.77f)
                curveToRelative(0.2f, -0.39f, 0.54f, -0.68f, 0.95f, -0.79f)
                curveToRelative(0.39f, -0.11f, 0.8f, -0.06f, 1.16f, 0.16f)
                lineToRelative(11.66f, 7.29f)
                lineToRelative(-11.65f, 7.28f)
                curveToRelative(-0.24f, 0.14f, -0.5f, 0.22f, -0.76f, 0.22f)
                curveToRelative(-1.53f, 0f, -1.53f, -1.2f, -1.53f, -1.62f)
                lineToRelative(2f, -5.46f)
                verticalLineToRelative(-0.82f)
                close()
                moveTo(12.84f, 6.55f)
                lineToRelative(6.16f, 0.95f)
                lineToRelative(-6.13f, 0.94f)
                lineToRelative(-1.86f, 5.01f)
                curveToRelative(0.01f, 0.14f, 0.07f, 0.27f, 0.16f, 0.37f)
                curveToRelative(0.03f, 0.03f, 0.07f, 0.07f, 0.11f, 0.09f)
                curveToRelative(0.15f, 0.1f, 0.33f, 0.1f, 0.49f, 0.01f)
                lineToRelative(10.29f, -6.43f)
                lineTo(11.76f, 1.06f)
                curveToRelative(-0.14f, -0.08f, -0.27f, -0.07f, -0.36f, -0.05f)
                curveToRelative(-0.14f, 0.04f, -0.26f, 0.14f, -0.33f, 0.28f)
                curveToRelative(-0.04f, 0.07f, -0.06f, 0.15f, -0.07f, 0.24f)
                lineToRelative(1.83f, 5.01f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(0f, 23f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _PaperPlane = it}
