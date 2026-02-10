package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EarDeaf: ImageVector? = null

val Icons.Ts.EarDeaf: ImageVector
    get() = _EarDeaf ?: UXIcon(name = "EarDeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.15f, 12.15f)
                lineToRelative(0.71f, 0.71f)
                lineTo(0.7f, 24f)
                lineTo(0f, 23.3f)
                lineTo(11.15f, 12.15f)
                close()
                moveTo(19.57f, 5.14f)
                lineTo(24f, 0.7f)
                lineTo(23.3f, 0f)
                lineToRelative(-4.32f, 4.32f)
                curveToRelative(-1.45f, -1.77f, -3.57f, -3f, -5.93f, -3.26f)
                curveToRelative(-2.6f, -0.29f, -5.1f, 0.5f, -7.03f, 2.23f)
                curveToRelative(-1.91f, 1.71f, -3f, 4.15f, -3f, 6.71f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.27f, 0.97f, -4.45f, 2.67f, -5.97f)
                curveToRelative(1.72f, -1.54f, 3.94f, -2.24f, 6.26f, -1.98f)
                curveToRelative(3.62f, 0.41f, 6.57f, 3.32f, 7.01f, 6.93f)
                curveToRelative(0.29f, 2.34f, -0.41f, 4.58f, -1.95f, 6.32f)
                curveToRelative(-0.7f, 0.79f, -0.98f, 1.57f, -0.98f, 2.69f)
                curveToRelative(0f, 2.66f, -2.34f, 5f, -5f, 5f)
                verticalLineToRelative(1f)
                curveToRelative(3.2f, 0f, 6f, -2.8f, 6f, -6f)
                curveToRelative(0f, -0.88f, 0.2f, -1.43f, 0.73f, -2.03f)
                curveToRelative(1.71f, -1.93f, 2.52f, -4.52f, 2.2f, -7.11f)
                curveToRelative(-0.17f, -1.35f, -0.65f, -2.62f, -1.36f, -3.73f)
                close()
                moveTo(15.75f, 13.31f)
                curveToRelative(0.81f, -0.91f, 1.25f, -2.09f, 1.25f, -3.31f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.98f, -0.35f, 1.92f, -1f, 2.65f)
                lineToRelative(0.75f, 0.66f)
                close()
            }
        }.also { _EarDeaf = it}
