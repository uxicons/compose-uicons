package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bio: ImageVector? = null

val Icons.Sr.Bio: ImageVector
    get() = _Bio ?: UXIcon(name = "Bio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.4f, 10.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                close()
                moveTo(8f, 12.6f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, -0.4f, 0.9f, -0.9f)
                reflectiveCurveToRelative(-0.4f, -0.9f, -0.9f, -0.9f)
                close()
                moveTo(8.4f, 10.3f)
                curveToRelative(0f, -0.39f, -0.31f, -0.7f, -0.7f, -0.7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(1.4f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.39f, 0f, 0.7f, -0.31f, 0.7f, -0.7f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(9.6f, 11.59f)
                curveToRelative(0.26f, -0.39f, 0.41f, -0.85f, 0.4f, -1.36f)
                curveToRelative(-0.04f, -1.27f, -1.17f, -2.23f, -2.44f, -2.23f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.37f)
                curveToRelative(1.25f, 0f, 2.4f, -0.86f, 2.59f, -2.09f)
                curveToRelative(0.15f, -0.93f, -0.23f, -1.77f, -0.87f, -2.31f)
                close()
                moveTo(13f, 8.8f)
                curveToRelative(0f, -0.44f, -0.36f, -0.8f, -0.8f, -0.8f)
                reflectiveCurveToRelative(-0.8f, 0.36f, -0.8f, 0.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0f, 0.44f, 0.36f, 0.8f, 0.8f, 0.8f)
                reflectiveCurveToRelative(0.8f, -0.36f, 0.8f, -0.8f)
                verticalLineToRelative(-6.4f)
                close()
                moveTo(19f, 10.3f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                reflectiveCurveToRelative(-2.3f, 1.03f, -2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                close()
            }
        }.also { _Bio = it}
