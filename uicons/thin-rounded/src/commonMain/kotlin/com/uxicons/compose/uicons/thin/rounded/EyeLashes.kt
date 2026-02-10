package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeLashes: ImageVector? = null

val Icons.Tr.EyeLashes: ImageVector
    get() = _EyeLashes ?: UXIcon(name = "EyeLashes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
                close()
                moveTo(12f, 18f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                close()
                moveTo(23.32f, 11.66f)
                curveToRelative(-0.63f, -1f, -1.58f, -2.27f, -2.89f, -3.43f)
                lineToRelative(2.21f, -2.74f)
                curveToRelative(0.17f, -0.21f, 0.14f, -0.53f, -0.08f, -0.7f)
                curveToRelative(-0.22f, -0.17f, -0.53f, -0.14f, -0.7f, 0.08f)
                lineToRelative(-2.2f, 2.73f)
                curveToRelative(-0.86f, -0.66f, -1.85f, -1.25f, -2.98f, -1.71f)
                lineToRelative(1.14f, -3.34f)
                curveToRelative(0.09f, -0.26f, -0.05f, -0.55f, -0.31f, -0.64f)
                curveToRelative(-0.26f, -0.09f, -0.55f, 0.05f, -0.64f, 0.31f)
                lineToRelative(-1.14f, 3.33f)
                curveToRelative(-0.98f, -0.3f, -2.06f, -0.49f, -3.23f, -0.54f)
                verticalLineToRelative(-3.52f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3.52f)
                curveToRelative(-1.17f, 0.04f, -2.25f, 0.23f, -3.23f, 0.54f)
                lineToRelative(-1.14f, -3.33f)
                curveToRelative(-0.09f, -0.26f, -0.38f, -0.4f, -0.64f, -0.31f)
                curveToRelative(-0.26f, 0.09f, -0.4f, 0.37f, -0.31f, 0.64f)
                lineToRelative(1.14f, 3.34f)
                curveToRelative(-1.14f, 0.46f, -2.14f, 1.05f, -3.0f, 1.72f)
                lineToRelative(-2.21f, -2.75f)
                curveToRelative(-0.17f, -0.21f, -0.49f, -0.25f, -0.7f, -0.08f)
                curveToRelative(-0.21f, 0.17f, -0.25f, 0.49f, -0.08f, 0.7f)
                lineToRelative(2.22f, 2.76f)
                curveToRelative(-1.3f, 1.16f, -2.25f, 2.42f, -2.87f, 3.42f)
                curveToRelative(-0.91f, 1.44f, -0.91f, 3.23f, -0.0f, 4.67f)
                curveToRelative(1.56f, 2.49f, 5.11f, 6.67f, 11.32f, 6.67f)
                reflectiveCurveToRelative(9.76f, -4.17f, 11.32f, -6.66f)
                curveToRelative(0.91f, -1.44f, 0.91f, -3.23f, 0f, -4.67f)
                close()
                moveTo(22.47f, 15.8f)
                curveToRelative(-1.45f, 2.31f, -4.74f, 6.2f, -10.47f, 6.2f)
                reflectiveCurveToRelative(-9.02f, -3.88f, -10.47f, -6.2f)
                curveToRelative(-0.7f, -1.11f, -0.7f, -2.49f, 0.0f, -3.6f)
                curveToRelative(1.45f, -2.31f, 4.74f, -6.2f, 10.47f, -6.2f)
                reflectiveCurveToRelative(9.02f, 3.88f, 10.47f, 6.2f)
                curveToRelative(0.7f, 1.11f, 0.7f, 2.49f, -0.0f, 3.6f)
                close()
            }
        }.also { _EyeLashes = it}
