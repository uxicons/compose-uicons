package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Massage: ImageVector? = null

val Icons.Br.Massage: ImageVector
    get() = _Massage ?: UXIcon(name = "Massage") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.26f, 9.24f)
            curveToRelative(-0.54f, -0.54f, -1.29f, -0.81f, -2.05f, -0.72f)
            curveToRelative(-1.57f, 0.18f, -3.05f, 0.65f, -4.37f, 1.36f)
            curveToRelative(-0.33f, -2.69f, -1.2f, -4.96f, -2.58f, -6.77f)
            curveToRelative(-0.54f, -0.7f, -1.36f, -1.11f, -2.26f, -1.11f)
            reflectiveCurveToRelative(-1.72f, 0.4f, -2.26f, 1.11f)
            curveToRelative(-1.43f, 1.87f, -2.35f, 4.23f, -2.65f, 6.73f)
            curveToRelative(-1.3f, -0.69f, -2.75f, -1.15f, -4.3f, -1.32f)
            curveToRelative(-0.76f, -0.09f, -1.51f, 0.18f, -2.05f, 0.72f)
            reflectiveCurveTo(-0.07f, 10.53f, 0.02f, 11.29f)
            curveToRelative(0.68f, 6.11f, 5.83f, 10.71f, 11.98f, 10.71f)
            reflectiveCurveToRelative(11.3f, -4.61f, 11.98f, -10.71f)
            curveToRelative(0.09f, -0.76f, -0.18f, -1.51f, -0.72f, -2.05f)
            close()
            moveTo(12f, 5.09f)
            curveToRelative(1.27f, 1.74f, 1.93f, 4.01f, 1.99f, 6.91f)
            curveToRelative(-0.78f, 0.79f, -1.45f, 1.68f, -1.99f, 2.66f)
            curveToRelative(-0.55f, -0.99f, -1.23f, -1.89f, -2.02f, -2.69f)
            curveToRelative(-0.07f, -2.55f, 0.66f, -5.03f, 2.02f, -6.88f)
            close()
            moveTo(3.09f, 11.59f)
            curveToRelative(3.65f, 0.69f, 6.56f, 3.64f, 7.25f, 7.25f)
            curveToRelative(-3.61f, -0.69f, -6.56f, -3.59f, -7.25f, -7.25f)
            close()
            moveTo(13.66f, 18.84f)
            curveToRelative(0.69f, -3.61f, 3.59f, -6.56f, 7.25f, -7.25f)
            curveToRelative(-0.69f, 3.65f, -3.64f, 6.56f, -7.25f, 7.25f)
            close()
        }
    }.also { _Massage = it }
