package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Left: ImageVector? = null

val Icons.Tr.Left: ImageVector
    get() = _Left ?: UXIcon(name = "Left") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.32f, 22f)
                curveToRelative(-0.68f, 0f, -1.34f, -0.27f, -1.86f, -0.78f)
                lineTo(1.12f, 14.67f)
                curveToRelative(-1.48f, -1.48f, -1.48f, -3.85f, -0.02f, -5.31f)
                lineTo(8.48f, 2.77f)
                curveToRelative(0.75f, -0.76f, 1.86f, -0.98f, 2.88f, -0.56f)
                curveToRelative(1.01f, 0.42f, 1.64f, 1.36f, 1.65f, 2.45f)
                verticalLineToRelative(2.34f)
                horizontalLineToRelative(7.53f)
                curveToRelative(1.92f, 0f, 3.47f, 1.57f, 3.47f, 3.5f)
                verticalLineToRelative(2.99f)
                curveToRelative(0f, 1.93f, -1.56f, 3.51f, -3.47f, 3.51f)
                horizontalLineToRelative(-7.53f)
                verticalLineToRelative(2.34f)
                curveToRelative(0f, 1.1f, -0.64f, 2.04f, -1.65f, 2.45f)
                curveToRelative(-0.34f, 0.14f, -0.69f, 0.21f, -1.03f, 0.21f)
                close()
                moveTo(10.32f, 3f)
                curveToRelative(-0.38f, 0f, -0.8f, 0.13f, -1.16f, 0.49f)
                lineTo(1.78f, 10.08f)
                curveToRelative(-1.05f, 1.05f, -1.05f, 2.79f, 0.02f, 3.86f)
                lineToRelative(7.34f, 6.55f)
                reflectiveCurveToRelative(0.01f, 0.01f, 0.02f, 0.02f)
                curveToRelative(0.58f, 0.58f, 1.31f, 0.57f, 1.81f, 0.36f)
                curveToRelative(0.5f, -0.2f, 1.03f, -0.71f, 1.03f, -1.53f)
                verticalLineToRelative(-2.84f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(8.03f)
                curveToRelative(1.36f, 0f, 2.47f, -1.12f, 2.47f, -2.51f)
                verticalLineToRelative(-2.99f)
                curveToRelative(0f, -1.38f, -1.11f, -2.51f, -2.47f, -2.51f)
                lineTo(12.5f, 7.99f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                reflectiveCurveToRelative(-0.15f, -0.22f, -0.15f, -0.35f)
                verticalLineToRelative(-2.84f)
                curveToRelative(0f, -0.82f, -0.53f, -1.33f, -1.03f, -1.53f)
                curveToRelative(-0.19f, -0.08f, -0.41f, -0.13f, -0.65f, -0.13f)
                close()
            }
        }.also { _Left = it}
