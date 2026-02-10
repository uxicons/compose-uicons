package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Sr.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(17.79f, 0f, 20f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(12f, 15.42f)
                curveToRelative(0.77f, 0f, 1.54f, -0.29f, 2.12f, -0.88f)
                lineToRelative(4.67f, -4.67f)
                curveToRelative(-2.73f, -0.56f, -4.79f, -2.98f, -4.79f, -5.88f)
                curveToRelative(0f, -0.34f, 0.04f, -0.67f, 0.09f, -1f)
                lineTo(5f, 2.99f)
                curveToRelative(-1.81f, 0f, -3.38f, 0.97f, -4.26f, 2.41f)
                lineTo(9.88f, 14.55f)
                curveToRelative(0.58f, 0.58f, 1.35f, 0.88f, 2.12f, 0.88f)
                close()
                moveTo(21.76f, 9.73f)
                lineToRelative(-6.23f, 6.23f)
                curveToRelative(-0.97f, 0.97f, -2.26f, 1.46f, -3.54f, 1.46f)
                reflectiveCurveToRelative(-2.56f, -0.49f, -3.54f, -1.46f)
                lineTo(0.05f, 7.54f)
                curveToRelative(-0.01f, 0.15f, -0.05f, 0.3f, -0.05f, 0.46f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineToRelative(-0.02f, -10.53f)
                curveToRelative(-0.64f, 0.57f, -1.39f, 1f, -2.22f, 1.26f)
                close()
            }
        }.also { _EnvelopeDot = it}
