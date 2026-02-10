package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bio: ImageVector? = null

val Icons.Rr.Bio: ImageVector
    get() = _Bio ?: UXIcon(name = "Bio") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
                moveTo(16.7f, 8f)
                curveToRelative(-1.27f, 0f, -2.3f, 1.03f, -2.3f, 2.3f)
                verticalLineToRelative(3.4f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                close()
                moveTo(17.4f, 13.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-3.4f)
                curveToRelative(0f, -0.39f, 0.31f, -0.7f, 0.7f, -0.7f)
                reflectiveCurveToRelative(0.7f, 0.31f, 0.7f, 0.7f)
                verticalLineToRelative(3.4f)
                close()
                moveTo(13f, 8.8f)
                verticalLineToRelative(6.4f)
                curveToRelative(0f, 0.44f, -0.36f, 0.8f, -0.8f, 0.8f)
                reflectiveCurveToRelative(-0.8f, -0.36f, -0.8f, -0.8f)
                verticalLineToRelative(-6.4f)
                curveToRelative(0f, -0.44f, 0.36f, -0.8f, 0.8f, -0.8f)
                reflectiveCurveToRelative(0.8f, 0.36f, 0.8f, 0.8f)
                close()
                moveTo(10.0f, 10.23f)
                curveToRelative(-0.04f, -1.27f, -1.17f, -2.23f, -2.44f, -2.23f)
                horizontalLineToRelative(-1.06f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.37f)
                curveToRelative(1.25f, 0f, 2.4f, -0.86f, 2.59f, -2.09f)
                curveToRelative(0.15f, -0.93f, -0.23f, -1.77f, -0.87f, -2.31f)
                curveToRelative(0.26f, -0.39f, 0.41f, -0.85f, 0.4f, -1.36f)
                close()
                moveTo(7.1f, 9.6f)
                horizontalLineToRelative(0.6f)
                curveToRelative(0.39f, 0f, 0.7f, 0.31f, 0.7f, 0.7f)
                reflectiveCurveToRelative(-0.31f, 0.7f, -0.7f, 0.7f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(-1.4f)
                close()
                moveTo(8f, 14.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                close()
            }
        }.also { _Bio = it}
