package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniversalAccess: ImageVector? = null

val Icons.Sc.UniversalAccess: ImageVector
    get() = _UniversalAccess ?: UXIcon(name = "UniversalAccess") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 5f)
                curveToRelative(1.12f, 0.01f, 1.98f, 0.55f, 2.0f, 2f)
                curveToRelative(-0.03f, 1.51f, -0.87f, 1.99f, -2.0f, 2f)
                curveToRelative(-1.12f, -0.01f, -1.97f, -0.49f, -2.0f, -2f)
                curveToRelative(0.03f, -1.48f, 0.87f, -1.99f, 2.0f, -2f)
                close()
                moveTo(17.71f, 9.71f)
                curveToRelative(-1.05f, 1.05f, -2.49f, 1.67f, -3.46f, 1.98f)
                curveToRelative(0.04f, 0.24f, 0.06f, 0.51f, 0.06f, 0.81f)
                curveToRelative(0f, 0.64f, -0.11f, 1.25f, -0.2f, 1.67f)
                curveToRelative(0.53f, 0.66f, 1.47f, 2f, 1.87f, 3.59f)
                curveToRelative(0.14f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.52f, 0.13f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.43f, -1.71f, -1.81f, -3.23f, -1.83f, -3.24f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-0.01f, 0.01f, -1.4f, 1.53f, -1.83f, 3.24f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.54f, -0.13f, -0.86f, -0.68f, -0.73f, -1.21f)
                curveToRelative(0.4f, -1.58f, 1.32f, -2.91f, 1.85f, -3.58f)
                curveToRelative(-0.11f, -0.42f, -0.23f, -1.03f, -0.23f, -1.68f)
                curveToRelative(0f, -0.31f, 0.03f, -0.58f, 0.07f, -0.82f)
                curveToRelative(-0.97f, -0.32f, -2.39f, -0.93f, -3.43f, -1.97f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                curveToRelative(1.01f, 1.01f, 2.71f, 1.55f, 3.4f, 1.71f)
                horizontalLineToRelative(1.78f)
                curveToRelative(0.42f, -0.1f, 2.29f, -0.59f, 3.4f, -1.71f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
                close()
            }
        }.also { _UniversalAccess = it}
