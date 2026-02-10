package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTrust: ImageVector? = null

val Icons.Br.UserTrust: ImageVector
    get() = _UserTrust ?: UXIcon(name = "UserTrust") {
        path(fill = SolidColor(Color.Black)) {
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
            moveTo(9f, 12f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            reflectiveCurveTo(5.69f, 0f, 9f, 0f)
            reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
            reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
            close()
            moveTo(9f, 3f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
            reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
            reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
            close()
            moveTo(1.5f, 24f)
            curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, -0.0f)
            curveToRelative(-0.83f, -0.06f, -1.45f, -0.77f, -1.4f, -1.6f)
            curveToRelative(0.3f, -4.46f, 3.88f, -8.06f, 8.34f, -8.38f)
            curveToRelative(0.83f, -0.06f, 1.54f, 0.56f, 1.6f, 1.39f)
            reflectiveCurveToRelative(-0.56f, 1.54f, -1.39f, 1.6f)
            curveToRelative(-2.98f, 0.21f, -5.37f, 2.61f, -5.56f, 5.58f)
            curveToRelative(-0.05f, 0.79f, -0.71f, 1.4f, -1.5f, 1.4f)
            close()
        }
    }.also { _UserTrust = it }
