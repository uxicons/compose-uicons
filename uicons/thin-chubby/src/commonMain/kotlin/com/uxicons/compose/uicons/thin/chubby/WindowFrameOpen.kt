package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WindowFrameOpen: ImageVector? = null

val Icons.Tc.WindowFrameOpen: ImageVector
    get() = _WindowFrameOpen ?: UXIcon(name = "WindowFrameOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.5f, 12f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.27f, 0.01f, 0.51f, -0.23f, 0.5f, -0.5f)
                curveToRelative(-0.03f, -6.0f, -1.05f, -9.01f, -1.09f, -9.13f)
                curveToRelative(-0.05f, -0.15f, -0.17f, -0.26f, -0.32f, -0.31f)
                curveToRelative(-0.13f, -0.04f, -3.29f, -1.05f, -7.59f, -1.05f)
                reflectiveCurveToRelative(-7.46f, 1.01f, -7.59f, 1.05f)
                curveToRelative(-0.15f, 0.05f, -0.27f, 0.16f, -0.32f, 0.31f)
                curveToRelative(-0.04f, 0.13f, -1.06f, 3.14f, -1.09f, 9.13f)
                curveToRelative(-0.01f, 0.27f, 0.23f, 0.51f, 0.5f, 0.5f)
                close()
                moveTo(19.99f, 11f)
                horizontalLineToRelative(-7.49f)
                verticalLineToRelative(-8.99f)
                curveToRelative(3.22f, 0.06f, 5.76f, 0.7f, 6.53f, 0.92f)
                curveToRelative(0.22f, 0.79f, 0.89f, 3.5f, 0.96f, 8.07f)
                close()
                moveTo(4.97f, 2.93f)
                curveToRelative(0.78f, -0.22f, 3.31f, -0.85f, 6.53f, -0.92f)
                verticalLineToRelative(8.99f)
                horizontalLineToRelative(-7.49f)
                curveToRelative(0.07f, -4.58f, 0.74f, -7.29f, 0.96f, -8.07f)
                close()
                moveTo(21.98f, 22.64f)
                curveToRelative(-0.07f, 0.27f, -0.36f, 0.42f, -0.62f, 0.34f)
                curveToRelative(-0.04f, -0.01f, -3.52f, -0.98f, -9.36f, -0.98f)
                reflectiveCurveToRelative(-9.33f, 0.97f, -9.36f, 0.98f)
                curveToRelative(-0.26f, 0.08f, -0.54f, -0.08f, -0.62f, -0.34f)
                curveToRelative(-0.08f, -0.27f, 0.08f, -0.54f, 0.34f, -0.62f)
                curveToRelative(0.06f, -0.02f, 0.61f, -0.17f, 1.61f, -0.35f)
                curveToRelative(-0.17f, -0.65f, -0.76f, -3.19f, -0.97f, -7.14f)
                curveToRelative(-0.01f, -0.28f, 0.2f, -0.51f, 0.47f, -0.53f)
                curveToRelative(0.28f, -0.03f, 0.51f, 0.2f, 0.53f, 0.47f)
                curveToRelative(0.21f, 4.06f, 0.86f, 6.63f, 0.96f, 7.03f)
                curveToRelative(1.64f, -0.25f, 4.02f, -0.5f, 7.04f, -0.5f)
                reflectiveCurveToRelative(5.4f, 0.25f, 7.04f, 0.5f)
                curveToRelative(0.1f, -0.4f, 0.74f, -2.97f, 0.96f, -7.03f)
                curveToRelative(0.01f, -0.28f, 0.26f, -0.51f, 0.53f, -0.47f)
                curveToRelative(0.28f, 0.01f, 0.49f, 0.25f, 0.47f, 0.53f)
                curveToRelative(-0.21f, 3.95f, -0.8f, 6.49f, -0.97f, 7.14f)
                curveToRelative(1.0f, 0.18f, 1.55f, 0.34f, 1.61f, 0.35f)
                curveToRelative(0.27f, 0.07f, 0.42f, 0.35f, 0.34f, 0.62f)
                close()
            }
        }.also { _WindowFrameOpen = it}
