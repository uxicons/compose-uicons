package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BeautyMask: ImageVector? = null

val Icons.Ss.BeautyMask: ImageVector
    get() = _BeautyMask ?: UXIcon(name = "BeautyMask") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 10.04f)
                curveToRelative(-0.3f, -3.77f, -2.42f, -6.83f, -5.65f, -8.54f)
                lineToRelative(-3.3f, 2.94f)
                lineToRelative(-0.01f, -4.12f)
                curveToRelative(-0.95f, -0.2f, -1.95f, -0.32f, -3f, -0.32f)
                reflectiveCurveToRelative(-2.05f, 0.12f, -3f, 0.32f)
                lineToRelative(0.01f, 4.12f)
                lineToRelative(-3.34f, -2.92f)
                curveTo(2.45f, 3.23f, 0.35f, 6.3f, 0.06f, 10.06f)
                lineToRelative(3.94f, 1.94f)
                lineToRelative(-3.66f, 1.58f)
                curveToRelative(0.71f, 2.96f, 2.55f, 5.75f, 4.89f, 7.69f)
                lineToRelative(2.77f, -2.27f)
                verticalLineToRelative(4.04f)
                curveToRelative(1.29f, 0.6f, 2.65f, 0.96f, 4f, 0.96f)
                reflectiveCurveToRelative(2.71f, -0.35f, 4f, -0.96f)
                verticalLineToRelative(-4.04f)
                lineToRelative(2.77f, 2.27f)
                curveToRelative(2.34f, -1.94f, 4.18f, -4.71f, 4.89f, -7.67f)
                lineToRelative(-3.66f, -1.6f)
                lineToRelative(3.95f, -1.96f)
                close()
                moveTo(6f, 9f)
                curveToRelative(0f, -1.1f, 1.12f, -2f, 2.5f, -2f)
                reflectiveCurveToRelative(2.5f, 0.9f, 2.5f, 2f)
                reflectiveCurveToRelative(-1.12f, 2f, -2.5f, 2f)
                reflectiveCurveToRelative(-2.5f, -0.9f, -2.5f, -2f)
                close()
                moveTo(12.01f, 18f)
                curveToRelative(-2.4f, 0f, -4.0f, -2f, -4.0f, -3.0f)
                curveToRelative(0f, -0.0f, 8f, 0f, 8f, 0f)
                curveToRelative(0f, 1.0f, -1.6f, 3.0f, -4.0f, 3.0f)
                close()
                moveTo(15.5f, 11f)
                curveToRelative(-1.38f, 0f, -2.5f, -0.9f, -2.5f, -2f)
                reflectiveCurveToRelative(1.12f, -2f, 2.5f, -2f)
                reflectiveCurveToRelative(2.5f, 0.9f, 2.5f, 2f)
                reflectiveCurveToRelative(-1.12f, 2f, -2.5f, 2f)
                close()
            }
        }.also { _BeautyMask = it}
