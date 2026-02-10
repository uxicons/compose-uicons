package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceLying: ImageVector? = null

val Icons.Ss.FaceLying: ImageVector
    get() = _FaceLying ?: UXIcon(name = "FaceLying") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 16f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                curveToRelative(1.54f, 0f, 2.8f, 1.17f, 2.97f, 2.67f)
                curveToRelative(0.01f, -0.22f, 0.03f, -0.44f, 0.03f, -0.67f)
                curveTo(24f, 5.37f, 18.63f, 0f, 12f, 0f)
                reflectiveCurveTo(0f, 5.37f, 0f, 12f)
                reflectiveCurveToRelative(5.37f, 12f, 12f, 12f)
                curveToRelative(5.95f, 0f, 10.88f, -4.34f, 11.82f, -10.03f)
                curveToRelative(-0.41f, 1.18f, -1.51f, 2.03f, -2.82f, 2.03f)
                close()
                moveTo(15.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(8.5f, 6f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.33f, 0f, -4.32f, 1.73f, -4.34f, 1.75f)
                lineToRelative(-1.33f, -1.49f)
                curveToRelative(0.1f, -0.09f, 2.56f, -2.25f, 5.67f, -2.25f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _FaceLying = it}
