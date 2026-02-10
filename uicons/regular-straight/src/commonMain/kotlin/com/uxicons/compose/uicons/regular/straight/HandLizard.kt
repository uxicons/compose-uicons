package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandLizard: ImageVector? = null

val Icons.Rs.HandLizard: ImageVector
    get() = _HandLizard ?: UXIcon(name = "HandLizard") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                lineTo(13f, 23f)
                verticalLineToRelative(-7f)
                lineTo(6.39f, 16f)
                curveToRelative(-0.88f, 0f, -1.71f, -0.39f, -2.29f, -1.06f)
                reflectiveCurveToRelative(-0.82f, -1.56f, -0.67f, -2.44f)
                curveToRelative(0.23f, -1.43f, 1.55f, -2.5f, 3.07f, -2.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.43f, 0f, 0.82f, -0.18f, 1.11f, -0.49f)
                curveToRelative(0.29f, -0.32f, 0.42f, -0.73f, 0.38f, -1.16f)
                curveToRelative(-0.08f, -0.75f, -0.79f, -1.34f, -1.63f, -1.34f)
                lineTo(3f, 7.01f)
                curveToRelative(-0.88f, 0f, -1.71f, -0.39f, -2.29f, -1.06f)
                curveTo(0.14f, 5.27f, -0.1f, 4.38f, 0.04f, 3.5f)
                curveTo(0.27f, 2.08f, 1.59f, 1f, 3.11f, 1f)
                lineTo(12.18f, 1f)
                curveToRelative(3.35f, 0f, 6.46f, 1.66f, 8.32f, 4.45f)
                lineToRelative(1.82f, 2.73f)
                curveToRelative(1.1f, 1.65f, 1.68f, 3.57f, 1.68f, 5.55f)
                verticalLineToRelative(9.27f)
                close()
                moveTo(15f, 21f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-7.27f)
                curveToRelative(0f, -1.58f, -0.46f, -3.12f, -1.34f, -4.44f)
                lineToRelative(-1.82f, -2.73f)
                curveToRelative(-1.49f, -2.23f, -3.98f, -3.56f, -6.66f, -3.56f)
                lineTo(3.11f, 3f)
                curveToRelative(-0.54f, 0f, -1.02f, 0.36f, -1.09f, 0.82f)
                curveToRelative(-0.05f, 0.3f, 0.03f, 0.6f, 0.22f, 0.82f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                horizontalLineToRelative(6.36f)
                curveToRelative(1.86f, 0f, 3.45f, 1.38f, 3.62f, 3.14f)
                curveToRelative(0.1f, 0.99f, -0.22f, 1.97f, -0.89f, 2.71f)
                curveToRelative(-0.66f, 0.73f, -1.61f, 1.15f, -2.6f, 1.15f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.54f, 0f, -1.02f, 0.36f, -1.09f, 0.82f)
                curveToRelative(-0.05f, 0.3f, 0.03f, 0.6f, 0.22f, 0.82f)
                curveToRelative(0.19f, 0.22f, 0.47f, 0.35f, 0.76f, 0.35f)
                lineTo(15f, 13.98f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _HandLizard = it}
