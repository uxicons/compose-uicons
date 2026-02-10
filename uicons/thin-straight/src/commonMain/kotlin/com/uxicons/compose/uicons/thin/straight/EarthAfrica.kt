package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarthAfrica: ImageVector? = null

val Icons.Ts.EarthAfrica: ImageVector
    get() = _EarthAfrica ?: UXIcon(name = "EarthAfrica") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(21.36f, 6.23f)
                lineToRelative(-2.19f, 2.19f)
                curveToRelative(-0.37f, 0.37f, -0.89f, 0.58f, -1.41f, 0.58f)
                horizontalLineToRelative(-2.76f)
                verticalLineToRelative(-2.41f)
                lineToRelative(-2.35f, -2.35f)
                lineToRelative(-2.93f, 1.76f)
                horizontalLineToRelative(-0.72f)
                verticalLineToRelative(-1.45f)
                lineToRelative(-2.34f, -2.17f)
                curveToRelative(1.58f, -0.88f, 3.4f, -1.39f, 5.34f, -1.39f)
                curveToRelative(3.95f, 0f, 7.42f, 2.09f, 9.36f, 5.23f)
                close()
                moveTo(16f, 11.91f)
                verticalLineToRelative(1.81f)
                lineToRelative(-2.57f, 4.28f)
                horizontalLineToRelative(-0.65f)
                lineToRelative(-1f, -4f)
                horizontalLineToRelative(-2.78f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.47f)
                lineToRelative(2.3f, -1.53f)
                horizontalLineToRelative(3.78f)
                lineToRelative(1.91f, 1.91f)
                close()
                moveTo(12f, 23.0f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                curveToRelative(0f, -3.76f, 1.9f, -7.08f, 4.78f, -9.07f)
                lineToRelative(2.22f, 2.06f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(2f)
                lineToRelative(2.5f, -1.5f)
                lineToRelative(1.5f, 1.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                lineToRelative(-3f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, 4f)
                horizontalLineToRelative(2f)
                lineToRelative(3f, -5f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-1.5f, -1.5f)
                horizontalLineToRelative(2.26f)
                curveToRelative(0.79f, 0f, 1.56f, -0.32f, 2.12f, -0.88f)
                lineToRelative(1.99f, -1.99f)
                curveToRelative(0.73f, 1.47f, 1.14f, 3.12f, 1.14f, 4.86f)
                curveToRelative(0f, 6.07f, -4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _EarthAfrica = it}
