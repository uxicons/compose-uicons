package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCircleCheck: ImageVector? = null

val Icons.Br.BoxCircleCheck: ImageVector
    get() = _BoxCircleCheck ?: UXIcon(name = "BoxCircleCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.95f, 0.38f, 1.81f, 1f, 2.45f)
            verticalLineToRelative(9.55f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8.5f)
            horizontalLineToRelative(16.5f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 6.5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            lineTo(3.5f, 7f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(1f)
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
        }
    }.also { _BoxCircleCheck = it }
