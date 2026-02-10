package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Toilet: ImageVector? = null

val Icons.Sr.Toilet: ImageVector
    get() = _Toilet ?: UXIcon(name = "Toilet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 8f)
                verticalLineToRelative(-4f)
                curveTo(5f, 1.79f, 6.79f, 0f, 9f, 0f)
                horizontalLineToRelative(6f)
                curveToRelative(1.86f, 0f, 3.43f, 1.28f, 3.87f, 3f)
                horizontalLineToRelative(1.13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(18.21f, 11f)
                lineTo(5.79f, 11f)
                curveToRelative(-1.17f, 0f, -2.3f, 0.69f, -2.65f, 1.8f)
                curveToRelative(-0.04f, 0.12f, -0.07f, 0.25f, -0.09f, 0.37f)
                curveToRelative(0.51f, 1.63f, 5.3f, 1.83f, 8.95f, 1.83f)
                reflectiveCurveToRelative(8.44f, -0.2f, 8.95f, -1.83f)
                curveToRelative(-0.02f, -0.12f, -0.05f, -0.24f, -0.09f, -0.37f)
                curveToRelative(-0.36f, -1.11f, -1.48f, -1.8f, -2.65f, -1.8f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-3.04f, 0f, -6.2f, -0.11f, -8.35f, -0.91f)
                curveToRelative(-0.04f, -0.02f, -0.07f, -0.05f, -0.11f, -0.07f)
                curveToRelative(1.19f, 2.15f, 3.42f, 3.92f, 6.76f, 4.37f)
                curveToRelative(-0.58f, 1.26f, -2.31f, 1.61f, -2.31f, 1.61f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(0f, 0f, -1.73f, -0.34f, -2.31f, -1.61f)
                curveToRelative(3.33f, -0.45f, 5.55f, -2.2f, 6.75f, -4.34f)
                curveToRelative(-0.03f, 0.01f, -0.06f, 0.03f, -0.09f, 0.04f)
                curveToRelative(-2.15f, 0.8f, -5.3f, 0.91f, -8.35f, 0.91f)
                close()
            }
        }.also { _Toilet = it}
