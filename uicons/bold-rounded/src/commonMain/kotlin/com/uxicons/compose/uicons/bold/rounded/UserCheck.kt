package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserCheck: ImageVector? = null

val Icons.Br.UserCheck: ImageVector
    get() = _UserCheck ?: UXIcon(name = "UserCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(8f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(11.31f, 0f, 8f, 0f)
            reflectiveCurveTo(2f, 2.69f, 2f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(8f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(16f, 22f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
            close()
            moveTo(23.56f, 10.65f)
            lineToRelative(-3.14f, 3.14f)
            curveToRelative(-0.81f, 0.81f, -1.86f, 1.21f, -2.92f, 1.21f)
            reflectiveCurveToRelative(-2.12f, -0.4f, -2.92f, -1.21f)
            lineToRelative(-1.14f, -1.14f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.58f, 2.12f, 0f)
            lineToRelative(1.14f, 1.14f)
            curveToRelative(0.44f, 0.44f, 1.16f, 0.44f, 1.6f, 0f)
            lineToRelative(3.14f, -3.14f)
            curveToRelative(0.59f, -0.59f, 1.54f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.54f, 0f, 2.12f)
            close()
        }
    }.also { _UserCheck = it }
