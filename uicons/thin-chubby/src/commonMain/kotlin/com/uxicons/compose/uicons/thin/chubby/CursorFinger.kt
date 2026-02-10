package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CursorFinger: ImageVector? = null

val Icons.Tc.CursorFinger: ImageVector
    get() = _CursorFinger ?: UXIcon(name = "CursorFinger") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.87f, 11.16f)
                curveToRelative(-0.04f, -0.12f, -0.12f, -0.21f, -0.22f, -0.28f)
                curveToRelative(-0.11f, -0.07f, -2.78f, -1.64f, -5.96f, -1.64f)
                curveToRelative(-0.69f, 0f, -1.4f, 0.04f, -2.14f, 0.11f)
                lineTo(11.56f, 3.57f)
                curveToRelative(0f, -1.42f, -1.15f, -2.57f, -2.56f, -2.57f)
                reflectiveCurveToRelative(-2.56f, 1.15f, -2.56f, 2.57f)
                verticalLineToRelative(7.86f)
                curveToRelative(-0.31f, 0.19f, -0.84f, 0.55f, -1.45f, 1.19f)
                curveToRelative(-3.95f, 4.1f, 0.57f, 8.72f, 0.59f, 8.74f)
                curveToRelative(0.14f, 0.17f, 1.56f, 1.64f, 6.63f, 1.64f)
                reflectiveCurveToRelative(7.29f, -1.49f, 7.38f, -1.56f)
                curveToRelative(0.09f, -0.06f, 0.15f, -0.14f, 0.19f, -0.24f)
                reflectiveCurveToRelative(0.86f, -2.47f, 0.86f, -5.15f)
                curveToRelative(0f, -2.45f, -0.73f, -4.79f, -0.76f, -4.89f)
                close()
                moveTo(18.89f, 20.7f)
                curveToRelative(-0.53f, 0.29f, -2.63f, 1.3f, -6.68f, 1.3f)
                curveToRelative(-4.61f, 0f, -5.87f, -1.29f, -5.9f, -1.32f)
                curveToRelative(-0.16f, -0.16f, -3.87f, -3.98f, -0.6f, -7.37f)
                curveToRelative(0.27f, -0.28f, 0.52f, -0.5f, 0.73f, -0.67f)
                verticalLineToRelative(3.79f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(7.43f, 3.57f)
                curveToRelative(0f, -0.86f, 0.7f, -1.57f, 1.56f, -1.57f)
                reflectiveCurveToRelative(1.56f, 0.7f, 1.56f, 1.57f)
                verticalLineToRelative(6.34f)
                curveToRelative(0.02f, 0.46f, 0.42f, 0.51f, 0.56f, 0.5f)
                curveToRelative(0.89f, -0.11f, 1.76f, -0.16f, 2.58f, -0.16f)
                curveToRelative(2.46f, 0f, 4.67f, 1.08f, 5.28f, 1.41f)
                curveToRelative(0.17f, 0.59f, 0.66f, 2.48f, 0.66f, 4.4f)
                curveToRelative(0f, 2.11f, -0.57f, 4.08f, -0.75f, 4.65f)
                close()
            }
        }.also { _CursorFinger = it}
