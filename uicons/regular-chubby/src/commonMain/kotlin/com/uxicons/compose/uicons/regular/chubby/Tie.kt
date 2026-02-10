package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tie: ImageVector? = null

val Icons.Rc.Tie: ImageVector
    get() = _Tie ?: UXIcon(name = "Tie") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.08f, 6.04f)
                curveToRelative(0.42f, -0.66f, 0.92f, -1.8f, 0.92f, -3.54f)
                curveToRelative(0f, -0.43f, -0.28f, -0.81f, -0.68f, -0.95f)
                curveToRelative(-0.07f, -0.02f, -1.67f, -0.55f, -3.32f, -0.55f)
                reflectiveCurveToRelative(-3.25f, 0.53f, -3.32f, 0.55f)
                curveToRelative(-0.41f, 0.14f, -0.68f, 0.52f, -0.68f, 0.95f)
                curveToRelative(0f, 1.75f, 0.49f, 2.88f, 0.92f, 3.54f)
                curveToRelative(-2.38f, 6.33f, -2.89f, 10.78f, -2.91f, 10.97f)
                curveToRelative(-0.03f, 0.23f, 0.03f, 0.46f, 0.16f, 0.66f)
                curveToRelative(1.42f, 2.17f, 3.2f, 3.96f, 5.3f, 5.29f)
                curveToRelative(0.17f, 0.1f, 0.35f, 0.16f, 0.54f, 0.16f)
                reflectiveCurveToRelative(0.38f, -0.05f, 0.54f, -0.16f)
                curveToRelative(2.09f, -1.34f, 3.88f, -3.12f, 5.3f, -5.29f)
                curveToRelative(0.13f, -0.19f, 0.18f, -0.42f, 0.16f, -0.66f)
                curveToRelative(-0.02f, -0.19f, -0.53f, -4.64f, -2.91f, -10.97f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0.71f, 0f, 1.44f, 0.13f, 1.96f, 0.25f)
                curveToRelative(-0.1f, 0.89f, -0.38f, 1.45f, -0.57f, 1.75f)
                horizontalLineToRelative(-2.77f)
                curveToRelative(-0.19f, -0.3f, -0.47f, -0.85f, -0.57f, -1.75f)
                curveToRelative(0.52f, -0.12f, 1.25f, -0.25f, 1.96f, -0.25f)
                close()
                moveTo(12f, 20.92f)
                curveToRelative(-1.53f, -1.07f, -2.86f, -2.43f, -3.96f, -4.04f)
                curveToRelative(0.16f, -1.13f, 0.8f, -4.9f, 2.65f, -9.88f)
                horizontalLineToRelative(2.61f)
                curveToRelative(1.84f, 4.97f, 2.49f, 8.75f, 2.65f, 9.88f)
                curveToRelative(-1.1f, 1.61f, -2.43f, 2.97f, -3.96f, 4.04f)
                close()
            }
        }.also { _Tie = it}
