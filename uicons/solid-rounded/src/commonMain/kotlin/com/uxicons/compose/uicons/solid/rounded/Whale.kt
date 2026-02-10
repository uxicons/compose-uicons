package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whale: ImageVector? = null

val Icons.Sr.Whale: ImageVector
    get() = _Whale ?: UXIcon(name = "Whale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.51f, 8.0f)
                reflectiveCurveToRelative(-1.14f, 0f, -1.21f, 0.0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveToRelative(-3.21f, 0.08f, -6.48f, 2.03f, -8.62f, 3.76f)
                curveToRelative(-0.68f, 0.55f, -1.69f, 0.08f, -1.69f, -0.79f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -0.3f, 0.12f, -0.58f, 0.35f, -0.78f)
                curveToRelative(0.58f, -0.49f, 1.24f, -0.92f, 1.96f, -1.4f)
                curveToRelative(0.03f, -0.23f, 0.07f, -0.46f, 0.11f, -0.68f)
                lineToRelative(0.47f, -2.77f)
                curveToRelative(2.21f, -0.57f, 3.9f, -2.51f, 4.13f, -4.83f)
                curveToRelative(0.03f, -0.29f, -0.23f, -0.54f, -0.51f, -0.52f)
                curveToRelative(-3.75f, 0.23f, -4.99f, 2.77f, -4.99f, 2.77f)
                curveTo(5.5f, 2.78f, 4.22f, 0.23f, 0.52f, 0f)
                curveTo(0.23f, -0.02f, -0.03f, 0.23f, 0.0f, 0.52f)
                curveToRelative(0.2f, 2.05f, 1.54f, 3.79f, 3.36f, 4.57f)
                lineToRelative(-0.5f, 0.76f)
                curveTo(0.99f, 8.64f, 0f, 11.92f, 0f, 15.27f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, 4.82f, 3.91f, 8.73f, 8.73f, 8.73f)
                horizontalLineToRelative(10.27f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -4.68f, -3.81f, -8.5f, -8.49f, -8.5f)
                close()
                moveTo(15.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Whale = it}
