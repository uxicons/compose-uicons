package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pretzel: ImageVector? = null

val Icons.Ss.Pretzel: ImageVector
    get() = _Pretzel ?: UXIcon(name = "Pretzel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 2f)
                curveToRelative(-1.51f, 0f, -2.88f, 0.43f, -4f, 1.18f)
                curveToRelative(-1.12f, -0.75f, -2.49f, -1.18f, -4f, -1.18f)
                curveToRelative(-4.56f, 0f, -8f, 3.44f, -8f, 8f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                curveToRelative(0f, -4.56f, -3.44f, -8f, -8f, -8f)
                close()
                moveTo(12f, 5.89f)
                curveToRelative(0.64f, 0.84f, 1f, 1.91f, 1f, 3.11f)
                reflectiveCurveToRelative(-0.36f, 2.27f, -1f, 3.11f)
                curveToRelative(-0.64f, -0.84f, -1f, -1.91f, -1f, -3.11f)
                reflectiveCurveToRelative(0.36f, -2.27f, 1f, -3.11f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -3.42f, 2.58f, -6f, 6f, -6f)
                curveToRelative(0.92f, 0f, 1.76f, 0.21f, 2.48f, 0.59f)
                curveToRelative(-0.93f, 1.19f, -1.48f, 2.71f, -1.48f, 4.41f)
                reflectiveCurveToRelative(0.55f, 3.22f, 1.48f, 4.41f)
                curveToRelative(-0.72f, 0.38f, -1.56f, 0.59f, -2.48f, 0.59f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(0.44f, 0.75f, 0.99f, 1.43f, 1.64f, 2f)
                horizontalLineToRelative(1.27f)
                curveToRelative(1.51f, 0f, 2.88f, -0.43f, 4f, -1.18f)
                curveToRelative(1.12f, 0.75f, 2.49f, 1.18f, 4f, 1.18f)
                horizontalLineToRelative(1.27f)
                curveToRelative(0.65f, -0.57f, 1.21f, -1.25f, 1.64f, -2f)
                horizontalLineToRelative(-2.92f)
                curveToRelative(-0.92f, 0f, -1.76f, -0.21f, -2.48f, -0.59f)
                curveToRelative(0.93f, -1.19f, 1.48f, -2.71f, 1.48f, -4.41f)
                reflectiveCurveToRelative(-0.55f, -3.22f, -1.48f, -4.41f)
                curveToRelative(0.72f, -0.38f, 1.56f, -0.59f, 2.48f, -0.59f)
                curveToRelative(3.42f, 0f, 6f, 2.58f, 6f, 6f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _Pretzel = it}
