package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Eyes: ImageVector? = null

val Icons.Tr.Eyes: ImageVector
    get() = _Eyes ?: UXIcon(name = "Eyes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.75f, 0f)
                curveToRelative(-2.62f, 0f, -4.8f, 2.94f, -5.75f, 7.22f)
                curveTo(11.05f, 2.94f, 8.87f, 0f, 6.25f, 0f)
                curveTo(2.75f, 0f, 0f, 5.27f, 0f, 12f)
                reflectiveCurveToRelative(2.75f, 12f, 6.25f, 12f)
                curveToRelative(2.62f, 0f, 4.8f, -2.94f, 5.75f, -7.22f)
                curveToRelative(0.94f, 4.28f, 3.13f, 7.22f, 5.75f, 7.22f)
                curveToRelative(3.5f, 0f, 6.25f, -5.27f, 6.25f, -12f)
                reflectiveCurveTo(21.25f, 0f, 17.75f, 0f)
                close()
                moveTo(6.25f, 23f)
                curveToRelative(-2.23f, 0f, -4.18f, -3.09f, -4.92f, -7.29f)
                curveToRelative(0.43f, 0.77f, 1.24f, 1.29f, 2.17f, 1.29f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-1.16f, 0f, -2.14f, 0.8f, -2.41f, 1.88f)
                curveToRelative(-0.05f, -0.61f, -0.09f, -1.24f, -0.09f, -1.88f)
                curveTo(1f, 6.04f, 3.4f, 1f, 6.25f, 1f)
                reflectiveCurveToRelative(5.25f, 5.04f, 5.25f, 11f)
                reflectiveCurveToRelative(-2.4f, 11f, -5.25f, 11f)
                close()
                moveTo(2f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(17.75f, 23f)
                curveToRelative(-2.09f, 0f, -3.94f, -2.73f, -4.78f, -6.53f)
                curveToRelative(0.42f, 0.33f, 0.95f, 0.53f, 1.53f, 0.53f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                curveToRelative(-0.81f, 0f, -1.52f, 0.39f, -1.98f, 0.98f)
                curveToRelative(-0.01f, -0.33f, -0.03f, -0.65f, -0.03f, -0.98f)
                curveToRelative(0f, -5.96f, 2.4f, -11f, 5.25f, -11f)
                reflectiveCurveToRelative(5.25f, 5.04f, 5.25f, 11f)
                reflectiveCurveToRelative(-2.4f, 11f, -5.25f, 11f)
                close()
                moveTo(13f, 14.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
            }
        }.also { _Eyes = it}
