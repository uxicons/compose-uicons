package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserForbiddenAlt: ImageVector? = null

val Icons.Br.UserForbiddenAlt: ImageVector
    get() = _UserForbiddenAlt ?: UXIcon(name = "UserForbiddenAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.25f, 22.23f)
            curveToRelative(1.08f, -1.09f, 1.75f, -2.58f, 1.75f, -4.23f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            curveToRelative(-3.31f, 0f, -6.0f, 2.69f, -6f, 6f)
            curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
            curveToRelative(1.66f, 0f, 3.17f, -0.68f, 4.25f, -1.77f)
            close()
            moveTo(21f, 18f)
            curveToRelative(0f, 0.27f, -0.05f, 0.52f, -0.11f, 0.77f)
            lineToRelative(-3.65f, -3.66f)
            curveToRelative(0.25f, -0.07f, 0.5f, -0.11f, 0.77f, -0.11f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            close()
            moveTo(15f, 18f)
            curveToRelative(0f, -0.27f, 0.05f, -0.52f, 0.11f, -0.77f)
            lineToRelative(3.65f, 3.66f)
            curveToRelative(-0.25f, 0.07f, -0.5f, 0.11f, -0.77f, 0.11f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            close()
            moveTo(9f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(12.31f, 0f, 9f, 0f)
            reflectiveCurveTo(3f, 2.69f, 3f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(9f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(10.0f, 15.42f)
            curveToRelative(0.05f, 0.83f, -0.57f, 1.54f, -1.4f, 1.59f)
            curveToRelative(-2.99f, 0.2f, -5.39f, 2.6f, -5.58f, 5.58f)
            curveToRelative(-0.05f, 0.79f, -0.71f, 1.4f, -1.5f, 1.4f)
            curveToRelative(-0.03f, 0f, -0.07f, 0f, -0.1f, -0.0f)
            curveToRelative(-0.83f, -0.05f, -1.45f, -0.77f, -1.4f, -1.59f)
            curveToRelative(0.29f, -4.48f, 3.9f, -8.09f, 8.38f, -8.38f)
            curveToRelative(0.84f, -0.06f, 1.54f, 0.57f, 1.6f, 1.4f)
            close()
        }
    }.also { _UserForbiddenAlt = it }
