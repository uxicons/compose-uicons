package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandMiddleFinger: ImageVector? = null

val Icons.Ts.HandMiddleFinger: ImageVector
    get() = _HandMiddleFinger ?: UXIcon(name = "HandMiddleFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 9.82f)
                lineTo(16f, 2.61f)
                curveToRelative(0f, -1.27f, -0.9f, -2.38f, -2.08f, -2.57f)
                curveToRelative(-0.73f, -0.12f, -1.48f, 0.09f, -2.04f, 0.56f)
                curveToRelative(-0.56f, 0.48f, -0.88f, 1.17f, -0.88f, 1.91f)
                verticalLineToRelative(6.26f)
                lineToRelative(-0.49f, -0.1f)
                curveToRelative(-0.86f, -0.18f, -1.75f, 0.03f, -2.43f, 0.58f)
                curveToRelative(-0.63f, 0.51f, -1.01f, 1.24f, -1.07f, 2.04f)
                lineToRelative(-4.28f, 4.21f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.3f, 0.73f, 1.77f)
                lineToRelative(4.97f, 4.97f)
                horizontalLineToRelative(14.29f)
                verticalLineToRelative(-12.9f)
                lineToRelative(-6f, -1.27f)
                close()
                moveTo(21f, 23f)
                horizontalLineToRelative(-12.88f)
                lineToRelative(-4.68f, -4.68f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineToRelative(3.56f, -3.51f)
                verticalLineToRelative(4.31f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.58f, 0.26f, -1.12f, 0.71f, -1.48f)
                curveToRelative(0.45f, -0.36f, 1.03f, -0.51f, 1.6f, -0.38f)
                lineToRelative(1.7f, 0.36f)
                lineTo(12f, 2.5f)
                curveToRelative(0f, -0.44f, 0.19f, -0.86f, 0.53f, -1.14f)
                curveToRelative(0.34f, -0.29f, 0.78f, -0.41f, 1.23f, -0.34f)
                curveToRelative(0.71f, 0.12f, 1.24f, 0.8f, 1.24f, 1.59f)
                verticalLineToRelative(8.03f)
                lineToRelative(6f, 1.27f)
                verticalLineToRelative(11.1f)
                close()
            }
        }.also { _HandMiddleFinger = it}
