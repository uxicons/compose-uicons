package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoodCloak: ImageVector? = null

val Icons.Rs.HoodCloak: ImageVector
    get() = _HoodCloak ?: UXIcon(name = "HoodCloak") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                curveToRelative(0f, 5.5f, 6.12f, 10.4f, 6.38f, 10.6f)
                lineToRelative(0.62f, 0.49f)
                lineToRelative(0.62f, -0.49f)
                curveToRelative(0.26f, -0.21f, 6.38f, -5.11f, 6.38f, -10.6f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                close()
                moveTo(12f, 21.5f)
                curveToRelative(-1.46f, -1.32f, -5f, -4.89f, -5f, -8.5f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 3.61f, -3.54f, 7.18f, -5f, 8.5f)
                close()
                moveTo(21.2f, 21.98f)
                horizontalLineToRelative(2.8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6.61f)
                lineToRelative(1.13f, -1.58f)
                curveToRelative(2.68f, -3.76f, 3.66f, -6.81f, 3.46f, -10.87f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(-0.08f, -1.71f, -0.47f, -3.13f, -1.16f, -4.22f)
                curveToRelative(-0.56f, -0.88f, -0.83f, -1.81f, -0.81f, -2.69f)
                curveToRelative(0.03f, -0.96f, 0.32f, -1.89f, 0.63f, -2.63f)
                curveToRelative(-1.72f, -0.01f, -7.36f, 0.02f, -7.36f, 0.02f)
                curveToRelative(-0.69f, 0.01f, -1.3f, 0.01f, -1.77f, 0.03f)
                curveToRelative(-5.04f, 0.25f, -9.19f, 4.38f, -9.46f, 9.4f)
                curveToRelative(-0.21f, 4.1f, 0.76f, 7.17f, 3.46f, 10.95f)
                lineToRelative(1.13f, 1.58f)
                lineTo(0f, 23.98f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2.81f)
                curveTo(0.65f, 18.49f, -0.16f, 15.29f, 0.04f, 11.34f)
                curveTo(0.36f, 5.3f, 5.34f, 0.34f, 11.4f, 0.04f)
                curveToRelative(0.49f, -0.02f, 1.13f, -0.03f, 1.85f, -0.04f)
                lineToRelative(10.89f, 0.01f)
                lineToRelative(-1.04f, 1.55f)
                curveToRelative(-0.01f, 0.01f, -1.05f, 1.58f, -1.1f, 3.13f)
                curveToRelative(-0.02f, 0.47f, 0.16f, 1.02f, 0.5f, 1.55f)
                curveToRelative(0.86f, 1.36f, 1.35f, 3.08f, 1.46f, 5.1f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.2f, 3.95f, -0.61f, 7.15f, -2.77f, 10.64f)
                close()
            }
        }.also { _HoodCloak = it}
