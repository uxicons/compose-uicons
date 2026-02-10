package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smartphone: ImageVector? = null

val Icons.Rc.Smartphone: ImageVector
    get() = _Smartphone ?: UXIcon(name = "Smartphone") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.14f, 17.15f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.04f, 2.94f)
                curveToRelative(-0.07f, -0.32f, -0.29f, -0.59f, -0.6f, -0.72f)
                curveToRelative(-0.12f, -0.05f, -3.02f, -1.23f, -6.44f, -1.23f)
                curveToRelative(-3.36f, 0f, -6.31f, 1.17f, -6.44f, 1.22f)
                curveToRelative(-0.31f, 0.12f, -0.54f, 0.4f, -0.6f, 0.73f)
                curveToRelative(-0.03f, 0.16f, -0.81f, 4.0f, -0.81f, 9.05f)
                reflectiveCurveToRelative(0.78f, 8.89f, 0.81f, 9.05f)
                curveToRelative(0.07f, 0.33f, 0.3f, 0.6f, 0.61f, 0.73f)
                curveToRelative(0.13f, 0.05f, 3.13f, 1.22f, 6.43f, 1.22f)
                curveToRelative(3.42f, 0f, 6.32f, -1.18f, 6.44f, -1.23f)
                curveToRelative(0.31f, -0.13f, 0.53f, -0.4f, 0.6f, -0.72f)
                curveToRelative(0.03f, -0.16f, 0.81f, -3.97f, 0.81f, -9.05f)
                curveToRelative(0f, -5.13f, -0.78f, -8.9f, -0.81f, -9.05f)
                close()
                moveTo(6.82f, 3.9f)
                curveToRelative(0.92f, -0.31f, 2.98f, -0.9f, 5.18f, -0.9f)
                curveToRelative(2.24f, 0f, 4.28f, 0.59f, 5.18f, 0.9f)
                curveToRelative(0.21f, 1.2f, 0.67f, 4.28f, 0.67f, 8.11f)
                curveToRelative(0f, 0.33f, -0.0f, 0.65f, -0.01f, 0.97f)
                curveToRelative(-1.01f, 0.14f, -3.31f, 0.4f, -5.84f, 0.4f)
                curveToRelative(-2.46f, 0f, -4.81f, -0.27f, -5.84f, -0.41f)
                curveToRelative(-0.01f, -0.32f, -0.01f, -0.64f, -0.01f, -0.96f)
                curveToRelative(0f, -3.77f, 0.46f, -6.89f, 0.67f, -8.1f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-2.17f, 0f, -4.25f, -0.59f, -5.18f, -0.9f)
                curveToRelative(-0.15f, -0.87f, -0.43f, -2.73f, -0.57f, -5.11f)
                curveToRelative(1.2f, 0.15f, 3.41f, 0.38f, 5.76f, 0.38f)
                curveToRelative(2.41f, 0f, 4.57f, -0.22f, 5.76f, -0.37f)
                curveToRelative(-0.14f, 2.39f, -0.43f, 4.24f, -0.57f, 5.11f)
                curveToRelative(-0.91f, 0.31f, -2.94f, 0.89f, -5.18f, 0.89f)
                close()
            }
        }.also { _Smartphone = it}
