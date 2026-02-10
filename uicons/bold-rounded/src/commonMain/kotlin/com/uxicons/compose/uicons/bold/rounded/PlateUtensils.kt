package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlateUtensils: ImageVector? = null

val Icons.Br.PlateUtensils: ImageVector
    get() = _PlateUtensils ?: UXIcon(name = "PlateUtensils") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.39f, -0.82f, 2.58f, -2f, 3.15f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8.65f)
            curveToRelative(-1.18f, -0.56f, -2f, -1.76f, -2f, -3.15f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 3.07f, 2.14f, 5.64f, 5f, 6.32f)
            verticalLineToRelative(9.18f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-9.18f)
            curveToRelative(2.86f, -0.68f, 5f, -3.25f, 5f, -6.32f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.86f, 20.94f)
            lineToRelative(-0.18f, 0.02f)
            curveToRelative(-0.23f, 0.02f, -0.45f, 0.05f, -0.68f, 0.05f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            curveToRelative(0f, -3.66f, 2.19f, -6.92f, 5.57f, -8.32f)
            curveToRelative(0.77f, -0.32f, 1.13f, -1.19f, 0.81f, -1.96f)
            curveToRelative(-0.32f, -0.77f, -1.19f, -1.13f, -1.96f, -0.81f)
            curveTo(2.92f, 2.77f, 0f, 7.12f, 0f, 12f)
            curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
            curveToRelative(0.33f, 0f, 0.65f, -0.03f, 0.98f, -0.06f)
            lineToRelative(0.17f, -0.02f)
            curveToRelative(0.82f, -0.08f, 1.43f, -0.81f, 1.35f, -1.63f)
            curveToRelative(-0.08f, -0.82f, -0.81f, -1.44f, -1.63f, -1.35f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.03f, 7.15f)
            curveToRelative(-0.6f, -0.57f, -1.55f, -0.54f, -2.12f, 0.06f)
            curveToRelative(-1.23f, 1.31f, -1.91f, 3.01f, -1.91f, 4.79f)
            curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -1.01f, 0.39f, -1.98f, 1.09f, -2.73f)
            curveToRelative(0.57f, -0.6f, 0.54f, -1.55f, -0.06f, -2.12f)
            close()
        }
    }.also { _PlateUtensils = it }
