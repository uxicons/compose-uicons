package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Bs.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(20.5f, 9f)
                curveToRelative(1.33f, 0f, 2.55f, -0.47f, 3.5f, -1.26f)
                lineTo(24f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                lineTo(15.02f, 3f)
                curveToRelative(-0.01f, 0.16f, -0.02f, 0.33f, -0.02f, 0.5f)
                curveToRelative(0f, 0.9f, 0.22f, 1.75f, 0.6f, 2.5f)
                lineTo(3.5f, 6f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(0.46f)
                lineToRelative(7.36f, 7.36f)
                curveToRelative(0.44f, 0.44f, 1.04f, 0.66f, 1.64f, 0.66f)
                curveToRelative(0.6f, 0f, 1.2f, -0.22f, 1.64f, -0.66f)
                lineToRelative(5.49f, -5.49f)
                curveToRelative(0.44f, 0.11f, 0.9f, 0.17f, 1.37f, 0.17f)
                close()
                moveTo(21f, 11.2f)
                lineToRelative(-5.24f, 5.24f)
                curveToRelative(-1f, 1f, -2.34f, 1.56f, -3.76f, 1.56f)
                reflectiveCurveToRelative(-2.76f, -0.55f, -3.76f, -1.56f)
                lineTo(3f, 11.2f)
                verticalLineToRelative(9.8f)
                lineTo(21f, 21f)
                lineTo(21f, 11.2f)
                close()
            }
        }.also { _EnvelopeDot = it}
