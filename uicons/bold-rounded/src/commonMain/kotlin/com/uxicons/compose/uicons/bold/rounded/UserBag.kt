package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBag: ImageVector? = null

val Icons.Br.UserBag: ImageVector
    get() = _UserBag ?: UXIcon(name = "UserBag") {
        path(fill = SolidColor(Color.Black)) {
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
            curveToRelative(0.06f, 0.83f, -0.57f, 1.54f, -1.4f, 1.59f)
            curveToRelative(-2.99f, 0.2f, -5.39f, 2.6f, -5.58f, 5.58f)
            curveToRelative(-0.05f, 0.83f, -0.78f, 1.46f, -1.59f, 1.4f)
            curveToRelative(-0.83f, -0.05f, -1.45f, -0.77f, -1.4f, -1.59f)
            curveToRelative(0.29f, -4.48f, 3.9f, -8.09f, 8.38f, -8.38f)
            curveToRelative(0.83f, -0.06f, 1.54f, 0.57f, 1.59f, 1.4f)
            close()
            moveTo(22f, 14.05f)
            verticalLineToRelative(-1.05f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            verticalLineToRelative(1.05f)
            curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(3f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
            close()
            moveTo(18f, 12f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            close()
            moveTo(21f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(2.5f)
            close()
        }
    }.also { _UserBag = it }
