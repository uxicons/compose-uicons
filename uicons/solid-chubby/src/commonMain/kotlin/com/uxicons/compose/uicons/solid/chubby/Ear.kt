package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ear: ImageVector? = null

val Icons.Sc.Ear: ImageVector
    get() = _Ear ?: UXIcon(name = "Ear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 10f)
                curveToRelative(0f, -0.95f, -0.05f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.05f, -1f, 1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -2.62f, 1.38f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.38f, 4f, 4f)
                curveToRelative(0f, 1.88f, -0.96f, 3.38f, -2.5f, 3.92f)
                curveToRelative(-0.76f, 0.27f, -1.64f, -0.13f, -1.91f, -0.92f)
                curveToRelative(-0.27f, -0.78f, 0.14f, -1.64f, 0.92f, -1.91f)
                curveToRelative(0.31f, -0.11f, 0.49f, -0.52f, 0.49f, -1.08f)
                close()
                moveTo(12f, 1f)
                curveToRelative(-6.22f, 0f, -9f, 2.78f, -9f, 9f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -4.6f, 1.4f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.4f, 6f, 6f)
                curveToRelative(0f, 3.27f, -1.1f, 4.35f, -2.76f, 5.97f)
                curveToRelative(-0.78f, 0.71f, -1.57f, 1.7f, -2.05f, 2.44f)
                curveToRelative(-0.84f, 1.21f, -1.15f, 1.59f, -2.14f, 1.59f)
                curveToRelative(-0.35f, 0f, -0.65f, -0.06f, -0.87f, -0.17f)
                curveToRelative(-0.74f, -0.37f, -1.64f, -0.08f, -2.02f, 0.66f)
                reflectiveCurveToRelative(-0.08f, 1.64f, 0.66f, 2.02f)
                curveToRelative(0.65f, 0.33f, 1.4f, 0.49f, 2.23f, 0.49f)
                curveToRelative(2.61f, 0f, 3.72f, -1.6f, 4.61f, -2.88f)
                curveToRelative(0.45f, -0.69f, 1.05f, -1.42f, 1.69f, -2.0f)
                curveToRelative(1.8f, -1.76f, 3.66f, -3.58f, 3.66f, -8.12f)
                curveToRelative(0f, -6.22f, -2.77f, -9f, -9f, -9f)
                close()
            }
        }.also { _Ear = it}
