package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TriangleWarning: ImageVector? = null

val Icons.Tr.TriangleWarning: ImageVector
    get() = _TriangleWarning ?: UXIcon(name = "TriangleWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 14.5f)
                lineTo(11.5f, 6.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(12.5f, 14.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(23.61f, 20.07f)
                curveToRelative(-0.64f, 1.23f, -1.99f, 1.93f, -3.71f, 1.93f)
                lineTo(4.1f, 22f)
                curveToRelative(-1.71f, 0f, -3.07f, -0.7f, -3.71f, -1.93f)
                curveToRelative(-0.65f, -1.24f, -0.47f, -2.87f, 0.48f, -4.24f)
                lineTo(9.3f, 2.43f)
                curveToRelative(0.62f, -0.9f, 1.63f, -1.43f, 2.7f, -1.43f)
                reflectiveCurveToRelative(2.08f, 0.53f, 2.69f, 1.41f)
                lineToRelative(8.44f, 13.43f)
                curveToRelative(0.95f, 1.37f, 1.13f, 2.99f, 0.48f, 4.23f)
                close()
                moveTo(22.3f, 16.4f)
                reflectiveCurveToRelative(0f, -0.01f, -0.01f, -0.02f)
                lineTo(13.86f, 2.96f)
                curveToRelative(-0.42f, -0.61f, -1.1f, -0.96f, -1.86f, -0.96f)
                reflectiveCurveToRelative(-1.44f, 0.36f, -1.87f, 0.98f)
                lineTo(1.71f, 16.38f)
                curveToRelative(-0.75f, 1.08f, -0.91f, 2.31f, -0.43f, 3.23f)
                curveToRelative(0.47f, 0.9f, 1.47f, 1.39f, 2.82f, 1.39f)
                horizontalLineToRelative(15.81f)
                curveToRelative(1.35f, 0f, 2.35f, -0.49f, 2.82f, -1.39f)
                curveToRelative(0.48f, -0.91f, 0.32f, -2.14f, -0.42f, -3.21f)
                close()
            }
        }.also { _TriangleWarning = it}
