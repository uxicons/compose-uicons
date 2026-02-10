package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Life: ImageVector? = null

val Icons.Rr.Life: ImageVector
    get() = _Life ?: UXIcon(name = "Life") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 13.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(22.23f, 11.32f)
                curveToRelative(-0.37f, -0.41f, -1.01f, -0.43f, -1.41f, -0.06f)
                lineToRelative(-5.64f, 5.2f)
                curveToRelative(-0.37f, 0.34f, -0.85f, 0.53f, -1.36f, 0.53f)
                horizontalLineToRelative(-3.65f)
                curveToRelative(-0.5f, 0f, -0.99f, -0.19f, -1.36f, -0.53f)
                lineToRelative(-5.64f, -5.21f)
                curveToRelative(-0.41f, -0.37f, -1.04f, -0.35f, -1.41f, 0.06f)
                curveToRelative(-0.38f, 0.41f, -0.35f, 1.04f, 0.06f, 1.41f)
                lineToRelative(5.64f, 5.21f)
                curveToRelative(0.17f, 0.15f, 0.35f, 0.29f, 0.54f, 0.41f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.02f)
                curveToRelative(0.06f, 0.0f, 0.11f, 0.02f, 0.17f, 0.02f)
                horizontalLineToRelative(3.65f)
                curveToRelative(0.06f, 0f, 0.12f, -0.01f, 0.17f, -0.02f)
                verticalLineToRelative(4.02f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0.19f, -0.12f, 0.37f, -0.26f, 0.54f, -0.41f)
                lineToRelative(5.64f, -5.21f)
                curveToRelative(0.41f, -0.38f, 0.43f, -1.01f, 0.06f, -1.41f)
                close()
                moveTo(7f, 3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(0.77f, 0f, 1.47f, 0.29f, 2f, 0.77f)
                curveToRelative(0.53f, -0.48f, 1.23f, -0.77f, 2f, -0.77f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                curveToRelative(0f, 2.67f, -3.62f, 5.47f, -3.78f, 5.59f)
                curveToRelative(-0.36f, 0.27f, -0.79f, 0.41f, -1.22f, 0.41f)
                reflectiveCurveToRelative(-0.86f, -0.14f, -1.22f, -0.41f)
                curveToRelative(-0.15f, -0.12f, -3.78f, -2.91f, -3.78f, -5.59f)
                close()
                moveTo(9f, 3f)
                curveToRelative(0f, 1.06f, 1.55f, 2.9f, 2.99f, 4.0f)
                curveToRelative(1.46f, -1.1f, 3.01f, -2.94f, 3.01f, -4.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _Life = it}
