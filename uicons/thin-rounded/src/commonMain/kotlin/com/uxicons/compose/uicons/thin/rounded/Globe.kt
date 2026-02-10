package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Globe: ImageVector? = null

val Icons.Tr.Globe: ImageVector
    get() = _Globe ?: UXIcon(name = "Globe") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.04f, 0.0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.01f, 0f, -0.03f, -0.0f, -0.04f, -0.0f)
                curveToRelative(-0.01f, 0f, -0.01f, 0f, -0.01f, 0f)
                curveToRelative(-0.0f, 0f, -0.0f, 0f, -0.01f, 0f)
                curveTo(5.37f, 0.01f, 0f, 5.39f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.64f, 0.02f, 12.04f, 0.0f)
                close()
                moveTo(21.79f, 7f)
                horizontalLineToRelative(-4.81f)
                curveToRelative(-1.07f, -2.67f, -2.71f, -4.78f, -3.73f, -5.92f)
                curveToRelative(3.73f, 0.42f, 6.9f, 2.72f, 8.55f, 5.92f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 1.41f, -0.29f, 2.75f, -0.73f, 4f)
                lineTo(7.73f, 16f)
                curveToRelative(-0.44f, -1.25f, -0.73f, -2.59f, -0.73f, -4f)
                reflectiveCurveToRelative(0.29f, -2.75f, 0.73f, -4f)
                horizontalLineToRelative(8.54f)
                curveToRelative(0.44f, 1.25f, 0.73f, 2.59f, 0.73f, 4f)
                close()
                moveTo(15.88f, 17f)
                curveToRelative(-1.23f, 2.84f, -3.12f, 4.99f, -3.88f, 5.79f)
                curveToRelative(-0.76f, -0.8f, -2.65f, -2.95f, -3.88f, -5.79f)
                horizontalLineToRelative(7.75f)
                close()
                moveTo(8.12f, 7f)
                curveToRelative(1.23f, -2.84f, 3.12f, -4.99f, 3.88f, -5.79f)
                curveToRelative(0.76f, 0.8f, 2.65f, 2.95f, 3.88f, 5.79f)
                horizontalLineToRelative(-7.76f)
                close()
                moveTo(10.76f, 1.07f)
                curveToRelative(-1.02f, 1.15f, -2.67f, 3.26f, -3.73f, 5.92f)
                lineTo(2.21f, 7f)
                curveTo(3.86f, 3.79f, 7.02f, 1.5f, 10.76f, 1.07f)
                close()
                moveTo(1.76f, 8f)
                lineTo(6.67f, 8f)
                curveToRelative(-0.4f, 1.25f, -0.67f, 2.59f, -0.67f, 4f)
                reflectiveCurveToRelative(0.27f, 2.75f, 0.67f, 4f)
                lineTo(1.76f, 16f)
                curveToRelative(-0.49f, -1.24f, -0.76f, -2.59f, -0.76f, -4f)
                reflectiveCurveToRelative(0.28f, -2.76f, 0.76f, -4f)
                close()
                moveTo(2.21f, 17f)
                lineTo(7.03f, 17f)
                curveToRelative(1.07f, 2.67f, 2.71f, 4.78f, 3.73f, 5.92f)
                curveToRelative(-3.73f, -0.42f, -6.9f, -2.72f, -8.55f, -5.92f)
                close()
                moveTo(13.24f, 22.93f)
                curveToRelative(1.02f, -1.14f, 2.66f, -3.26f, 3.73f, -5.92f)
                horizontalLineToRelative(4.81f)
                curveToRelative(-1.65f, 3.21f, -4.81f, 5.5f, -8.55f, 5.92f)
                close()
                moveTo(22.24f, 16f)
                horizontalLineToRelative(-4.91f)
                curveToRelative(0.4f, -1.25f, 0.67f, -2.59f, 0.67f, -4f)
                reflectiveCurveToRelative(-0.27f, -2.75f, -0.67f, -4f)
                horizontalLineToRelative(4.91f)
                curveToRelative(0.49f, 1.24f, 0.76f, 2.59f, 0.76f, 4f)
                reflectiveCurveToRelative(-0.28f, 2.76f, -0.76f, 4f)
                close()
            }
        }.also { _Globe = it}
