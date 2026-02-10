package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBooth: ImageVector? = null

val Icons.Bs.PersonBooth: ImageVector
    get() = _PersonBooth ?: UXIcon(name = "PersonBooth") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(0f, 18.12f)
                verticalLineToRelative(5.88f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3.97f)
                lineToRelative(-2.38f, -1.46f)
                curveToRelative(-0.22f, -0.14f, -0.43f, -0.29f, -0.62f, -0.45f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.96f, 1.32f, -5.26f, 2.52f, -6.69f)
                curveToRelative(-3.03f, -2.0f, -4.66f, -4.76f, -5.52f, -7.17f)
                verticalLineToRelative(6.36f)
                horizontalLineToRelative(-6.33f)
                lineToRelative(-1.67f, -2.67f)
                verticalLineToRelative(5.03f)
                lineToRelative(3f, 1.79f)
                verticalLineToRelative(6.85f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-5.15f)
                lineToRelative(-3.56f, -2.12f)
                curveToRelative(-0.9f, -0.55f, -1.45f, -1.53f, -1.45f, -2.57f)
                verticalLineToRelative(-5.66f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(1.39f)
                curveToRelative(1.21f, 0f, 2.32f, 0.61f, 2.97f, 1.64f)
                lineToRelative(1.47f, 2.36f)
                horizontalLineToRelative(1.67f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 11.8f)
                verticalLineToRelative(-8.3f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-5.36f)
                curveToRelative(0.35f, 2.25f, 1.59f, 6.47f, 5.86f, 8.8f)
                close()
                moveTo(21f, 19f)
                verticalLineToRelative(-3.46f)
                curveToRelative(-0.66f, 0.71f, -1.49f, 1.88f, -1.84f, 3.46f)
                close()
            }
        }.also { _PersonBooth = it}
