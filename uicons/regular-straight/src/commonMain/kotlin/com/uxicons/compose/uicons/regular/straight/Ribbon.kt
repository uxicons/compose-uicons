package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ribbon: ImageVector? = null

val Icons.Rs.Ribbon: ImageVector
    get() = _Ribbon ?: UXIcon(name = "Ribbon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.99f, 18.73f)
                lineToRelative(-4.73f, -4.69f)
                lineToRelative(0.39f, -0.39f)
                curveToRelative(3.12f, -3.12f, 3.12f, -8.19f, 0f, -11.3f)
                curveToRelative(-1.51f, -1.51f, -3.52f, -2.34f, -5.65f, -2.34f)
                reflectiveCurveToRelative(-4.14f, 0.83f, -5.65f, 2.34f)
                curveToRelative(-3.12f, 3.12f, -3.12f, 8.19f, 0f, 11.3f)
                lineToRelative(0.32f, 0.32f)
                lineToRelative(-4.67f, 4.63f)
                lineToRelative(5.35f, 5.35f)
                lineToRelative(4.65f, -4.65f)
                lineToRelative(4.63f, 4.63f)
                lineToRelative(5.35f, -5.2f)
                close()
                moveTo(17.99f, 7.99f)
                curveToRelative(0f, 1.6f, -0.62f, 3.1f, -1.76f, 4.24f)
                lineToRelative(-0.4f, 0.4f)
                lineToRelative(-2.34f, -2.32f)
                curveToRelative(1.33f, -1.15f, 3.5f, -3.32f, 3.5f, -5.3f)
                curveToRelative(0f, -0.11f, -0.0f, -0.22f, -0.01f, -0.33f)
                curveToRelative(0.65f, 0.98f, 1.0f, 2.12f, 1.0f, 3.32f)
                close()
                moveTo(15f, 5.0f)
                curveToRelative(0f, 1.02f, -1.6f, 2.77f, -3f, 3.95f)
                curveToRelative(-1.4f, -1.18f, -3f, -2.93f, -3f, -3.95f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                close()
                moveTo(6.01f, 7.99f)
                curveToRelative(0f, -1.2f, 0.35f, -2.35f, 1.0f, -3.32f)
                curveToRelative(-0.01f, 0.11f, -0.01f, 0.22f, -0.01f, 0.33f)
                curveToRelative(0f, 2.53f, 3.54f, 5.37f, 4.36f, 6.0f)
                lineToRelative(7.78f, 7.71f)
                lineToRelative(-2.48f, 2.41f)
                lineTo(7.76f, 12.23f)
                curveToRelative(-1.13f, -1.13f, -1.75f, -2.64f, -1.75f, -4.24f)
                close()
                moveTo(7.35f, 21.12f)
                lineToRelative(-2.52f, -2.52f)
                lineToRelative(3.25f, -3.23f)
                lineToRelative(2.5f, 2.5f)
                lineToRelative(-3.24f, 3.24f)
                close()
            }
        }.also { _Ribbon = it}
