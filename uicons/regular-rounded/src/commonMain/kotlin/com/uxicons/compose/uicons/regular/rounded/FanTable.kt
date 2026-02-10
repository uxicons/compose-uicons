package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FanTable: ImageVector? = null

val Icons.Rr.FanTable: ImageVector
    get() = _FanTable ?: UXIcon(name = "FanTable") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 9.5f)
                curveTo(21.5f, 4.25f, 17.25f, 0f, 12f, 0f)
                reflectiveCurveTo(2.5f, 4.25f, 2.5f, 9.5f)
                curveToRelative(0f, 4.9f, 3.73f, 8.95f, 8.5f, 9.45f)
                verticalLineToRelative(3.05f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.05f)
                curveToRelative(4.77f, -0.5f, 8.5f, -4.55f, 8.5f, -9.45f)
                close()
                moveTo(17.36f, 14.74f)
                curveToRelative(-0.93f, -0.93f, -2.23f, -2.56f, -3.23f, -3.91f)
                curveToRelative(1.64f, 0.35f, 3.69f, 0.91f, 4.87f, 1.35f)
                curveToRelative(-0.37f, 0.96f, -0.93f, 1.84f, -1.64f, 2.56f)
                close()
                moveTo(19.5f, 9.5f)
                curveToRelative(0f, 0.24f, -0.01f, 0.48f, -0.04f, 0.72f)
                curveToRelative(-1.64f, -0.59f, -4.2f, -1.25f, -5.98f, -1.55f)
                curveToRelative(0.68f, -1.61f, 1.56f, -4.08f, 1.96f, -5.82f)
                curveToRelative(2.4f, 1.25f, 4.05f, 3.76f, 4.05f, 6.65f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.53f, 0f, 1.05f, 0.06f, 1.55f, 0.16f)
                curveToRelative(-0.25f, 1.21f, -0.93f, 3.26f, -1.55f, 4.86f)
                curveToRelative(-0.62f, -1.6f, -1.3f, -3.65f, -1.55f, -4.86f)
                curveToRelative(0.5f, -0.11f, 1.02f, -0.16f, 1.55f, -0.16f)
                close()
                moveTo(4.5f, 9.5f)
                curveToRelative(0f, -2.89f, 1.65f, -5.4f, 4.05f, -6.65f)
                curveToRelative(0.4f, 1.74f, 1.28f, 4.21f, 1.96f, 5.82f)
                curveToRelative(-1.78f, 0.3f, -4.33f, 0.97f, -5.98f, 1.55f)
                curveToRelative(-0.02f, -0.24f, -0.04f, -0.48f, -0.04f, -0.72f)
                close()
                moveTo(5.0f, 12.18f)
                curveToRelative(1.18f, -0.44f, 3.23f, -1.0f, 4.87f, -1.35f)
                curveToRelative(-1.0f, 1.35f, -2.3f, 2.98f, -3.23f, 3.91f)
                curveToRelative(-0.71f, -0.73f, -1.27f, -1.6f, -1.64f, -2.56f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-1.38f, 0f, -2.66f, -0.38f, -3.77f, -1.03f)
                curveToRelative(1.24f, -1.28f, 2.78f, -3.28f, 3.77f, -4.68f)
                curveToRelative(0.99f, 1.4f, 2.53f, 3.4f, 3.77f, 4.68f)
                curveToRelative(-1.11f, 0.65f, -2.39f, 1.03f, -3.77f, 1.03f)
                close()
            }
        }.also { _FanTable = it}
