package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PadlockCheck: ImageVector? = null

val Icons.Br.PadlockCheck: ImageVector
    get() = _PadlockCheck ?: UXIcon(name = "PadlockCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8.5f, 20f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9.35f)
            curveToRelative(0.61f, 0f, 1.2f, 0.22f, 1.65f, 0.62f)
            curveToRelative(0.62f, 0.55f, 1.57f, 0.49f, 2.12f, -0.13f)
            curveToRelative(0.55f, -0.62f, 0.49f, -1.57f, -0.13f, -2.12f)
            curveToRelative(-0.45f, -0.39f, -0.95f, -0.69f, -1.49f, -0.92f)
            verticalLineToRelative(-0.45f)
            curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
            reflectiveCurveTo(3f, 3.14f, 3f, 7f)
            verticalLineToRelative(0.61f)
            curveToRelative(-1.78f, 0.91f, -3f, 2.76f, -3f, 4.89f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(10f, 3f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            lineTo(6f, 7f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            close()
            moveTo(18f, 12f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(21.68f, 17.71f)
            lineToRelative(-2.7f, 2.61f)
            curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
            reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
            lineToRelative(-1.35f, -1.33f)
            curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
            curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
            lineToRelative(1.35f, 1.33f)
            curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
            lineToRelative(2.71f, -2.62f)
            curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
            curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
            close()
            moveTo(9.5f, 14f)
            horizontalLineToRelative(1.58f)
            curveToRelative(-0.53f, 0.9f, -0.88f, 1.92f, -1.01f, 3f)
            horizontalLineToRelative(-0.57f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            close()
        }
    }.also { _PadlockCheck = it }
