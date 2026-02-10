package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cat: ImageVector? = null

val Icons.Rs.Cat: ImageVector
    get() = _Cat ?: UXIcon(name = "Cat") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 7.5f)
                lineTo(24f, 0f)
                lineToRelative(-3.29f, 2.46f)
                curveToRelative(-0.68f, -0.3f, -1.43f, -0.47f, -2.21f, -0.47f)
                reflectiveCurveToRelative(-1.53f, 0.17f, -2.21f, 0.47f)
                lineToRelative(-3.29f, -2.46f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.88f, 0.21f, 1.72f, 0.58f, 2.46f)
                curveToRelative(-8.15f, 2.58f, -8.58f, 10.4f, -8.59f, 11.82f)
                curveToRelative(-1.53f, -0.43f, -3.0f, -1.49f, -3.0f, -3.28f)
                curveToRelative(0f, -1.56f, 0.72f, -2.72f, 1.48f, -3.95f)
                curveToRelative(0.75f, -1.21f, 1.52f, -2.45f, 1.52f, -4.05f)
                curveToRelative(0f, -1.68f, -0.65f, -4.5f, -5f, -4.5f)
                verticalLineToRelative(2f)
                curveToRelative(2.64f, 0f, 3f, 1.2f, 3f, 2.5f)
                curveToRelative(0f, 1.03f, -0.57f, 1.94f, -1.22f, 3.0f)
                curveToRelative(-0.83f, 1.34f, -1.78f, 2.87f, -1.78f, 5.0f)
                curveToRelative(0f, 3.44f, 3.33f, 5.5f, 6.56f, 5.5f)
                horizontalLineToRelative(17.44f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10.26f)
                curveToRelative(1.22f, -1.01f, 2f, -2.54f, 2f, -4.24f)
                close()
                moveTo(18.5f, 4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                lineTo(7.0f, 22f)
                verticalLineToRelative(-0.05f)
                curveToRelative(-0.02f, -0.34f, -0.29f, -8.18f, 7.91f, -10.29f)
                curveToRelative(0.96f, 0.83f, 2.22f, 1.34f, 3.59f, 1.34f)
                curveToRelative(0.52f, 0f, 1.02f, -0.07f, 1.5f, -0.21f)
                verticalLineToRelative(9.21f)
                close()
            }
        }.also { _Cat = it}
