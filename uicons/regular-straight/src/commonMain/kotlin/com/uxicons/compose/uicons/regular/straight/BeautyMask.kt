package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BeautyMask: ImageVector? = null

val Icons.Rs.BeautyMask: ImageVector
    get() = _BeautyMask ?: UXIcon(name = "BeautyMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 14.0f)
                curveToRelative(0f, 1.0f, -1.6f, 3.0f, -4.0f, 3.0f)
                reflectiveCurveToRelative(-4.0f, -2f, -4.0f, -3.0f)
                curveToRelative(0f, -0.0f, 8f, 0f, 8f, 0f)
                close()
                moveTo(24f, 10.95f)
                curveToRelative(0f, 6.46f, -6.06f, 13.05f, -12f, 13.05f)
                reflectiveCurveTo(0f, 17.41f, 0f, 10.95f)
                curveTo(0f, 4.61f, 5.05f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 4.61f, 12f, 10.95f)
                close()
                moveTo(21.61f, 13.55f)
                lineToRelative(-3.11f, -1.55f)
                lineToRelative(3.47f, -1.73f)
                curveToRelative(-0.2f, -2.93f, -1.71f, -5.3f, -4.09f, -6.75f)
                lineToRelative(-2.84f, 2.48f)
                verticalLineToRelative(-3.64f)
                curveToRelative(-0.94f, -0.23f, -1.96f, -0.36f, -3.04f, -0.36f)
                reflectiveCurveToRelative(-2.09f, 0.13f, -3.04f, 0.36f)
                verticalLineToRelative(3.64f)
                lineToRelative(-2.84f, -2.48f)
                curveToRelative(-2.38f, 1.44f, -3.89f, 3.82f, -4.09f, 6.75f)
                lineToRelative(3.47f, 1.73f)
                lineToRelative(-3.11f, 1.55f)
                curveToRelative(0.7f, 2.43f, 2.28f, 4.73f, 4.24f, 6.31f)
                lineToRelative(2.36f, -2.36f)
                verticalLineToRelative(3.81f)
                curveToRelative(0.98f, 0.43f, 2.0f, 0.69f, 3f, 0.69f)
                reflectiveCurveToRelative(2.02f, -0.25f, 3f, -0.69f)
                verticalLineToRelative(-3.81f)
                lineToRelative(2.36f, 2.36f)
                curveToRelative(1.97f, -1.58f, 3.55f, -3.88f, 4.24f, -6.31f)
                close()
                moveTo(11.0f, 10f)
                curveToRelative(0f, -1.1f, -1.12f, -2f, -2.5f, -2f)
                reflectiveCurveToRelative(-2.5f, 0.9f, -2.5f, 2f)
                reflectiveCurveToRelative(1.12f, 2f, 2.5f, 2f)
                reflectiveCurveToRelative(2.5f, -0.9f, 2.5f, -2f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 0.9f, -2.5f, 2f)
                reflectiveCurveToRelative(1.12f, 2f, 2.5f, 2f)
                reflectiveCurveToRelative(2.5f, -0.9f, 2.5f, -2f)
                reflectiveCurveToRelative(-1.12f, -2f, -2.5f, -2f)
                close()
            }
        }.also { _BeautyMask = it}
