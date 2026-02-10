package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Br.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8.58f, 12.04f)
            curveToRelative(-1.39f, -1.33f, -3.77f, -1.33f, -5.16f, 0f)
            lineToRelative(-1.65f, 1.85f)
            curveToRelative(-1.14f, 1.12f, -1.77f, 2.61f, -1.77f, 4.2f)
            reflectiveCurveToRelative(0.63f, 3.08f, 1.77f, 4.19f)
            curveToRelative(1.13f, 1.11f, 2.63f, 1.72f, 4.23f, 1.72f)
            reflectiveCurveToRelative(3.1f, -0.61f, 4.23f, -1.72f)
            curveToRelative(1.14f, -1.12f, 1.77f, -2.61f, 1.77f, -4.19f)
            reflectiveCurveToRelative(-0.63f, -3.08f, -1.7f, -4.12f)
            lineToRelative(-1.72f, -1.92f)
            close()
            moveTo(8.13f, 20.14f)
            horizontalLineToRelative(0f)
            curveToRelative(-1.13f, 1.11f, -3.13f, 1.11f, -4.26f, 0f)
            curveToRelative(-0.56f, -0.55f, -0.87f, -1.28f, -0.87f, -2.05f)
            reflectiveCurveToRelative(0.31f, -1.5f, 0.94f, -2.13f)
            lineToRelative(1.59f, -1.79f)
            curveToRelative(0.17f, -0.15f, 0.37f, -0.17f, 0.47f, -0.17f)
            reflectiveCurveToRelative(0.3f, 0.02f, 0.47f, 0.17f)
            lineToRelative(1.66f, 1.86f)
            curveToRelative(0.56f, 0.55f, 0.87f, 1.28f, 0.87f, 2.05f)
            reflectiveCurveToRelative(-0.31f, 1.5f, -0.87f, 2.05f)
            close()
            moveTo(22.44f, 7.67f)
            lineToRelative(-1.51f, -1.66f)
            curveToRelative(-1.3f, -1.29f, -3.5f, -1.35f, -4.91f, 0.06f)
            lineToRelative(-1.42f, 1.56f)
            curveToRelative(-2.13f, 2.16f, -2.13f, 5.68f, 0f, 7.84f)
            curveToRelative(1.04f, 1.05f, 2.42f, 1.63f, 3.9f, 1.63f)
            reflectiveCurveToRelative(2.86f, -0.58f, 3.9f, -1.63f)
            curveToRelative(2.13f, -2.16f, 2.13f, -5.68f, 0.04f, -7.8f)
            close()
            moveTo(20.26f, 13.35f)
            curveToRelative(-0.94f, 0.95f, -2.58f, 0.95f, -3.52f, 0f)
            curveToRelative(-0.99f, -1f, -0.99f, -2.63f, 0.04f, -3.67f)
            lineToRelative(1.41f, -1.55f)
            curveToRelative(0.11f, -0.11f, 0.23f, -0.13f, 0.31f, -0.13f)
            reflectiveCurveToRelative(0.2f, 0.02f, 0.26f, 0.07f)
            lineToRelative(1.5f, 1.65f)
            curveToRelative(0.99f, 1f, 0.99f, 2.63f, 0f, 3.63f)
            close()
            moveTo(11.97f, 2.02f)
            curveToRelative(1.37f, 1.37f, 1.37f, 3.58f, 0f, 4.95f)
            curveToRelative(-0.68f, 0.68f, -1.58f, 1.02f, -2.48f, 1.02f)
            curveToRelative(-0.9f, 0f, -1.79f, -0.34f, -2.48f, -1.02f)
            curveToRelative(-1.37f, -1.37f, -1.37f, -3.58f, 0f, -4.95f)
            lineToRelative(1.34f, -1.31f)
            curveToRelative(0.63f, -0.61f, 1.63f, -0.61f, 2.26f, 0f)
            lineToRelative(1.34f, 1.31f)
            close()
        }
    }.also { _Blood = it }
