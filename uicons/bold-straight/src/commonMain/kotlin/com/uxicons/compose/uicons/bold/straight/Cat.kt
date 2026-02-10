package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cat: ImageVector? = null

val Icons.Bs.Cat: ImageVector
    get() = _Cat ?: UXIcon(name = "Cat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.5f)
                lineTo(24f, 0f)
                lineToRelative(-3.29f, 2.46f)
                curveToRelative(-0.68f, -0.3f, -1.43f, -0.47f, -2.21f, -0.47f)
                reflectiveCurveToRelative(-1.53f, 0.17f, -2.21f, 0.47f)
                lineToRelative(-3.29f, -2.46f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.49f, 0.06f, 0.96f, 0.18f, 1.41f)
                curveToRelative(-6.61f, 1.99f, -8.8f, 7.41f, -9.14f, 11.11f)
                curveToRelative(-0.62f, -0.53f, -1.04f, -1.23f, -1.04f, -2.0f)
                curveToRelative(0f, -1.85f, 0.48f, -2.82f, 0.98f, -3.85f)
                curveToRelative(0.48f, -0.97f, 1.02f, -2.07f, 1.02f, -3.68f)
                curveToRelative(0f, -2.65f, -2.06f, -4.5f, -5f, -4.5f)
                verticalLineToRelative(3f)
                curveToRelative(0.47f, 0f, 2f, 0.11f, 2f, 1.5f)
                curveToRelative(0f, 0.92f, -0.3f, 1.52f, -0.71f, 2.35f)
                curveToRelative(-0.57f, 1.17f, -1.29f, 2.62f, -1.29f, 5.17f)
                curveToRelative(0f, 3.52f, 3.46f, 5.98f, 6.56f, 5.98f)
                horizontalLineToRelative(17.44f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9.26f)
                curveToRelative(1.22f, -1.01f, 2f, -2.54f, 2f, -4.24f)
                close()
                moveTo(18.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(19f, 21f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(0.05f, -1.69f, 0.73f, -7.75f, 7.81f, -9.42f)
                curveToRelative(0.98f, 0.88f, 2.27f, 1.42f, 3.69f, 1.42f)
                curveToRelative(0.17f, 0f, 0.34f, -0.01f, 0.5f, -0.02f)
                verticalLineToRelative(8.02f)
                close()
            }
        }.also { _Cat = it}
