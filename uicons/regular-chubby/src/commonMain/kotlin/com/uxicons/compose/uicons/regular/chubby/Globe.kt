package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Globe: ImageVector? = null

val Icons.Rc.Globe: ImageVector
    get() = _Globe ?: UXIcon(name = "Globe") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(12.11f, 21f)
                curveToRelative(-0.04f, 0f, -0.18f, 0f, -0.22f, 0f)
                curveToRelative(-0.97f, -0.01f, -2.63f, -0.17f, -3.31f, -4.44f)
                horizontalLineToRelative(6.83f)
                curveToRelative(-0.67f, 4.27f, -2.33f, 4.43f, -3.31f, 4.44f)
                close()
                moveTo(8.37f, 14.56f)
                curveToRelative(-0.05f, -0.76f, -0.08f, -1.61f, -0.08f, -2.56f)
                reflectiveCurveToRelative(0.03f, -1.8f, 0.08f, -2.56f)
                horizontalLineToRelative(7.26f)
                curveToRelative(0.05f, 0.76f, 0.08f, 1.61f, 0.08f, 2.56f)
                reflectiveCurveToRelative(-0.03f, 1.8f, -0.08f, 2.56f)
                horizontalLineToRelative(-7.26f)
                close()
                moveTo(3.0f, 12f)
                curveToRelative(0f, -0.95f, 0.06f, -1.8f, 0.17f, -2.56f)
                horizontalLineToRelative(3.19f)
                curveToRelative(-0.05f, 0.85f, -0.07f, 1.72f, -0.07f, 2.56f)
                curveToRelative(0f, 0.86f, 0.02f, 1.72f, 0.07f, 2.56f)
                lineTo(3.17f, 14.56f)
                curveToRelative(-0.11f, -0.77f, -0.17f, -1.62f, -0.17f, -2.56f)
                close()
                moveTo(11.88f, 3f)
                curveToRelative(0.04f, 0f, 0.2f, 0f, 0.24f, 0f)
                curveToRelative(0.97f, 0.01f, 2.62f, 0.18f, 3.29f, 4.44f)
                horizontalLineToRelative(-6.83f)
                curveToRelative(0.67f, -4.25f, 2.32f, -4.43f, 3.29f, -4.44f)
                close()
                moveTo(17.65f, 9.44f)
                horizontalLineToRelative(3.18f)
                curveToRelative(0.11f, 0.77f, 0.17f, 1.62f, 0.17f, 2.56f)
                reflectiveCurveToRelative(-0.06f, 1.8f, -0.17f, 2.56f)
                horizontalLineToRelative(-3.19f)
                curveToRelative(0.05f, -0.85f, 0.07f, -1.72f, 0.07f, -2.56f)
                curveToRelative(0f, -0.86f, -0.02f, -1.72f, -0.07f, -2.56f)
                close()
                moveTo(20.35f, 7.44f)
                horizontalLineToRelative(-2.89f)
                curveToRelative(-0.2f, -1.48f, -0.55f, -2.83f, -1.15f, -3.91f)
                curveToRelative(1.88f, 0.59f, 3.28f, 1.76f, 4.04f, 3.91f)
                close()
                moveTo(7.74f, 3.51f)
                curveToRelative(-0.61f, 1.09f, -0.97f, 2.46f, -1.18f, 3.92f)
                lineTo(3.65f, 7.44f)
                curveToRelative(0.77f, -2.17f, 2.19f, -3.34f, 4.09f, -3.92f)
                close()
                moveTo(3.65f, 16.56f)
                horizontalLineToRelative(2.89f)
                curveToRelative(0.2f, 1.48f, 0.55f, 2.83f, 1.15f, 3.91f)
                curveToRelative(-1.88f, -0.59f, -3.28f, -1.76f, -4.04f, -3.91f)
                close()
                moveTo(16.26f, 20.49f)
                curveToRelative(0.61f, -1.09f, 0.97f, -2.46f, 1.18f, -3.92f)
                horizontalLineToRelative(2.91f)
                curveToRelative(-0.77f, 2.17f, -2.19f, 3.34f, -4.09f, 3.92f)
                close()
            }
        }.also { _Globe = it}
