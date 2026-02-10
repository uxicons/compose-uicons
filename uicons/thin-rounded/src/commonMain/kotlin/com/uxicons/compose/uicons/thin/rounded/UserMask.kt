package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserMask: ImageVector? = null

val Icons.Tr.UserMask: ImageVector
    get() = _UserMask ?: UXIcon(name = "UserMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 22f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                close()
                moveTo(6f, 6f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 2.49f, -1.5f, 4.68f, -3.82f, 5.59f)
                curveToRelative(-0.01f, 0.0f, -0.01f, 0.0f, -0.02f, 0.0f)
                curveToRelative(-0.34f, 0.25f, -0.75f, 0.41f, -1.2f, 0.41f)
                horizontalLineToRelative(-1.92f)
                curveToRelative(-0.45f, 0f, -0.87f, -0.15f, -1.2f, -0.4f)
                curveToRelative(-0.01f, -0.0f, -0.01f, -0.0f, -0.02f, -0.0f)
                curveToRelative(-2.32f, -0.91f, -3.82f, -3.1f, -3.82f, -5.59f)
                close()
                moveTo(9.04f, 10.02f)
                curveToRelative(-0.11f, -0.68f, 0.04f, -1.68f, 0.22f, -2.12f)
                curveToRelative(-0.7f, -0.17f, -1.43f, -0.57f, -2.2f, -1.22f)
                curveToRelative(0.18f, 1.35f, 0.9f, 2.54f, 1.99f, 3.34f)
                close()
                moveTo(12.96f, 11.0f)
                curveToRelative(0.5f, 0f, 0.92f, -0.36f, 0.99f, -0.86f)
                curveToRelative(0.14f, -0.63f, -0.06f, -1.86f, -0.25f, -2.14f)
                horizontalLineToRelative(-3.42f)
                curveToRelative(-0.19f, 0.27f, -0.39f, 1.51f, -0.25f, 2.14f)
                curveToRelative(0.07f, 0.5f, 0.49f, 0.86f, 0.99f, 0.86f)
                horizontalLineToRelative(1.92f)
                close()
                moveTo(16.95f, 6.67f)
                curveToRelative(-0.77f, 0.65f, -1.5f, 1.06f, -2.2f, 1.23f)
                curveToRelative(0.18f, 0.44f, 0.33f, 1.44f, 0.22f, 2.12f)
                curveToRelative(1.08f, -0.8f, 1.81f, -1.99f, 1.99f, -3.34f)
                close()
                moveTo(7.07f, 5.34f)
                curveToRelative(1.1f, 1.09f, 2.09f, 1.66f, 2.93f, 1.66f)
                horizontalLineToRelative(4f)
                curveToRelative(0.84f, 0f, 1.83f, -0.57f, 2.93f, -1.67f)
                curveToRelative(-0.33f, -2.44f, -2.4f, -4.33f, -4.93f, -4.33f)
                reflectiveCurveToRelative(-4.6f, 1.9f, -4.93f, 4.34f)
                close()
            }
        }.also { _UserMask = it}
