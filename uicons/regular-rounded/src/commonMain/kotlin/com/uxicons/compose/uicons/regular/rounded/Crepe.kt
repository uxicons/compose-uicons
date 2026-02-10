package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Crepe: ImageVector? = null

val Icons.Rr.Crepe: ImageVector
    get() = _Crepe ?: UXIcon(name = "Crepe") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(18.5f, 12f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.84f, 17.07f)
                lineTo(3.7f, 23.82f)
                curveToRelative(-0.32f, 0.12f, -0.65f, 0.17f, -0.97f, 0.17f)
                curveToRelative(-0.71f, 0f, -1.4f, -0.28f, -1.92f, -0.8f)
                curveToRelative(-0.76f, -0.76f, -1.0f, -1.86f, -0.64f, -2.87f)
                lineToRelative(6.76f, -17.16f)
                curveToRelative(0.94f, -2.33f, 3.44f, -3.62f, 5.83f, -3.01f)
                curveToRelative(5.28f, 1.36f, 9.73f, 5.82f, 11.09f, 11.09f)
                curveToRelative(0.61f, 2.39f, -0.68f, 4.89f, -3.0f, 5.82f)
                close()
                moveTo(11.55f, 2f)
                curveToRelative(-0.57f, 0f, -1.12f, 0.17f, -1.59f, 0.48f)
                curveToRelative(0.55f, 1.16f, 1.35f, 3.18f, 2.0f, 6.18f)
                lineToRelative(2.34f, -0.62f)
                curveToRelative(1.01f, -0.26f, 1.92f, 0.66f, 1.66f, 1.66f)
                lineToRelative(-0.71f, 2.6f)
                curveToRelative(3.02f, 0.69f, 5.21f, 1.42f, 6.23f, 1.79f)
                curveToRelative(0.46f, -0.68f, 0.65f, -1.53f, 0.43f, -2.35f)
                curveToRelative(-1.18f, -4.59f, -5.06f, -8.47f, -9.66f, -9.66f)
                curveToRelative(-0.23f, -0.06f, -0.47f, -0.09f, -0.71f, -0.09f)
                close()
                moveTo(12.98f, 18.02f)
                lineTo(19.38f, 15.5f)
                curveToRelative(-1.76f, -0.56f, -4.08f, -1.18f, -6.64f, -1.67f)
                curveToRelative(0.12f, 1.29f, 0.21f, 2.69f, 0.24f, 4.19f)
                close()
                moveTo(10.99f, 18.8f)
                curveToRelative(-0.09f, -7.37f, -1.47f, -12.07f, -2.4f, -14.42f)
                lineToRelative(-6.55f, 16.65f)
                curveToRelative(-0.14f, 0.37f, 0.08f, 0.65f, 0.18f, 0.75f)
                curveToRelative(0.1f, 0.1f, 0.37f, 0.32f, 0.77f, 0.17f)
                lineToRelative(8.01f, -3.15f)
                close()
            }
        }.also { _Crepe = it}
