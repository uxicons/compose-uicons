package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserVneckHair: ImageVector? = null

val Icons.Br.UserVneckHair: ImageVector
    get() = _UserVneckHair ?: UXIcon(name = "UserVneckHair") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(12f, 9f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            curveToRelative(0f, -0.02f, 0.01f, -0.03f, 0.01f, -0.05f)
            curveToRelative(0.16f, 0.01f, 0.31f, 0.05f, 0.47f, 0.05f)
            curveToRelative(1.82f, 0f, 3.39f, -0.98f, 4.26f, -2.43f)
            curveToRelative(0.76f, 0.55f, 1.26f, 1.43f, 1.26f, 2.43f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            close()
            moveTo(21f, 20.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.4f, -0.5f, -2.55f, -1.53f, -3.51f)
            lineToRelative(-3.4f, 3.55f)
            curveToRelative(-0.56f, 0.61f, -1.61f, 0.6f, -2.17f, -0.02f)
            lineToRelative(-3.27f, -3.49f)
            curveToRelative(-1.1f, 0.97f, -1.63f, 2.12f, -1.63f, 3.46f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.19f, 0.87f, -4.11f, 2.58f, -5.71f)
            curveToRelative(0.58f, -0.55f, 1.35f, -0.83f, 2.16f, -0.79f)
            curveToRelative(0.81f, 0.04f, 1.58f, 0.41f, 2.11f, 1.01f)
            lineToRelative(2.17f, 2.31f)
            lineToRelative(2.28f, -2.36f)
            curveToRelative(0.49f, -0.56f, 1.26f, -0.92f, 2.07f, -0.96f)
            curveToRelative(0.81f, -0.03f, 1.57f, 0.24f, 2.15f, 0.79f)
            curveToRelative(1.64f, 1.54f, 2.47f, 3.46f, 2.47f, 5.7f)
            close()
        }
    }.also { _UserVneckHair = it }
