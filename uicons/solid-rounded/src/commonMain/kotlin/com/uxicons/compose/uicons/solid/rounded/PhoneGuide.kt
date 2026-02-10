package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PhoneGuide: ImageVector? = null

val Icons.Sr.PhoneGuide: ImageVector
    get() = _PhoneGuide ?: UXIcon(name = "PhoneGuide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.36f, 19.76f)
                lineToRelative(1.3f, 1.21f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                lineToRelative(-0.52f, 0.6f)
                curveToRelative(-0.55f, 0.55f, -1.28f, 0.81f, -2f, 0.81f)
                curveToRelative(-3.71f, 0f, -9.14f, -5.14f, -9.14f, -9.14f)
                curveToRelative(0f, -0.72f, 0.26f, -1.45f, 0.81f, -2f)
                lineToRelative(0.6f, -0.52f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                lineToRelative(1.21f, 1.3f)
                curveToRelative(0.45f, 0.45f, 0.45f, 1.17f, 0f, 1.62f)
                lineToRelative(-1.02f, 1.04f)
                curveToRelative(0.9f, 2.24f, 2.43f, 3.71f, 4.5f, 4.5f)
                lineToRelative(1.04f, -1.02f)
                curveToRelative(0.45f, -0.45f, 1.17f, -0.45f, 1.62f, 0f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(1f)
                lineTo(4f, 0.1f)
                curveTo(1.67f, 0.57f, 0f, 2.62f, 0f, 5f)
                verticalLineToRelative(12.03f)
                curveToRelative(0.7f, -0.53f, 1.52f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                close()
                moveTo(10.72f, 18f)
                lineTo(3f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                reflectiveCurveToRelative(1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(0.22f, 0f, 0.42f, -0.04f, 0.63f, -0.06f)
                curveToRelative(-2.12f, -1.52f, -3.95f, -3.69f, -4.91f, -5.94f)
                close()
                moveTo(10f, 14.86f)
                curveToRelative(0f, -1.3f, 0.5f, -2.51f, 1.4f, -3.41f)
                lineToRelative(0.66f, -0.58f)
                curveToRelative(1.19f, -1.13f, 3.22f, -1.11f, 4.38f, 0.06f)
                lineToRelative(1.26f, 1.35f)
                curveToRelative(0.98f, 0.98f, 1.13f, 2.52f, 0.44f, 3.72f)
                horizontalLineToRelative(1.85f)
                lineTo(20.0f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                lineTo(6f, 0f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(4.11f)
                curveToRelative(-0.07f, -0.39f, -0.11f, -0.77f, -0.11f, -1.14f)
                close()
            }
        }.also { _PhoneGuide = it}
