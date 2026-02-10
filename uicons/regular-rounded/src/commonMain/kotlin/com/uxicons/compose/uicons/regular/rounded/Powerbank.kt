package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Powerbank: ImageVector? = null

val Icons.Rr.Powerbank: ImageVector
    get() = _Powerbank ?: UXIcon(name = "Powerbank") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 19f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(9.6f, 9f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(1.43f, -2.5f)
                curveToRelative(0.27f, -0.48f, 0.11f, -1.09f, -0.37f, -1.36f)
                curveToRelative(-0.48f, -0.27f, -1.09f, -0.11f, -1.36f, 0.37f)
                lineToRelative(-1.98f, 3.47f)
                curveToRelative(-0.22f, 0.44f, -0.2f, 0.95f, 0.06f, 1.36f)
                curveToRelative(0.26f, 0.42f, 0.7f, 0.67f, 1.19f, 0.67f)
                horizontalLineToRelative(2.16f)
                lineToRelative(-1.43f, 2.5f)
                curveToRelative(-0.27f, 0.48f, -0.11f, 1.09f, 0.37f, 1.36f)
                curveToRelative(0.47f, 0.27f, 1.09f, 0.11f, 1.36f, -0.37f)
                lineToRelative(2f, -3.5f)
                curveToRelative(0.2f, -0.44f, 0.17f, -0.94f, -0.09f, -1.34f)
                reflectiveCurveToRelative(-0.7f, -0.65f, -1.18f, -0.65f)
                close()
                moveTo(24f, 9f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.88f, -0.39f, 1.72f, -1.06f, 2.29f)
                curveToRelative(-0.28f, 0.24f, -0.6f, 0.42f, -0.94f, 0.54f)
                verticalLineToRelative(5.17f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-12f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.13f, -0.39f, 2.16f, -1.03f, 3f)
                horizontalLineToRelative(2.03f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-5.17f)
                curveToRelative(-1.17f, -0.43f, -2f, -1.61f, -2f, -2.94f)
                verticalLineToRelative(-1.89f)
                curveToRelative(0f, -0.74f, 0.41f, -1.38f, 1f, -1.72f)
                verticalLineToRelative(-0.78f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.78f)
                curveToRelative(0.59f, 0.35f, 1f, 0.98f, 1f, 1.72f)
                close()
                moveTo(14f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
                moveTo(22f, 9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _Powerbank = it}
