package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Insurance: ImageVector? = null

val Icons.Sr.Insurance: ImageVector
    get() = _Insurance ?: UXIcon(name = "Insurance") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 24f)
                curveToRelative(-0.24f, 0f, -0.45f, -0.1f, -0.65f, -0.21f)
                curveToRelative(-1.14f, -0.57f, -4.85f, -2.7f, -4.85f, -6.27f)
                verticalLineToRelative(-3.19f)
                curveToRelative(0f, -1.29f, 0.83f, -2.44f, 2.06f, -2.85f)
                lineToRelative(2.5f, -0.83f)
                curveToRelative(0.61f, -0.2f, 1.28f, -0.2f, 1.89f, 0f)
                lineToRelative(2.5f, 0.83f)
                curveToRelative(1.23f, 0.41f, 2.06f, 1.55f, 2.06f, 2.85f)
                verticalLineToRelative(3.19f)
                curveToRelative(0f, 4.03f, -3.76f, 5.86f, -4.92f, 6.32f)
                curveToRelative(-0.18f, 0.07f, -0.34f, 0.16f, -0.58f, 0.16f)
                close()
                moveTo(11.03f, 18f)
                horizontalLineToRelative(-6.03f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-1.67f)
                curveToRelative(0f, -0.11f, 0.02f, -0.22f, 0.03f, -0.34f)
                horizontalLineToRelative(-6.03f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.58f)
                curveToRelative(0.59f, -1.11f, 1.59f, -1.99f, 2.84f, -2.41f)
                lineToRelative(2.5f, -0.83f)
                curveToRelative(0.35f, -0.12f, 0.71f, -0.18f, 1.07f, -0.21f)
                verticalLineToRelative(-1.55f)
                curveToRelative(0.01f, -2.82f, -2f, -5f, -5.17f, -5f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                curveToRelative(-3.17f, -0.0f, -5.18f, 2.18f, -5.17f, 5.0f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(9.49f)
                curveToRelative(-1.59f, -1.28f, -3.28f, -3.27f, -3.46f, -6f)
                close()
                moveTo(5f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
            }
        }.also { _Insurance = it}
