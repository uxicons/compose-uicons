package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ghost: ImageVector? = null

val Icons.Sc.Ghost: ImageVector
    get() = _Ghost ?: UXIcon(name = "Ghost") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-6.31f, 0f, -9f, 2.69f, -9f, 9f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.53f, 0.42f, 0.97f, 0.95f, 1.0f)
                curveToRelative(0.55f, 0.03f, 0.99f, -0.38f, 1.04f, -0.91f)
                curveToRelative(0.06f, -0.68f, 0.17f, -1.09f, 1.5f, -1.09f)
                curveToRelative(1.23f, 0f, 1.5f, 0.27f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.59f, 0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.23f, 0.27f, -1.5f, 1.5f, -1.5f)
                curveToRelative(1.34f, 0f, 1.44f, 0.41f, 1.5f, 1.09f)
                curveToRelative(0.05f, 0.53f, 0.48f, 0.94f, 1.04f, 0.91f)
                curveToRelative(0.53f, -0.02f, 0.95f, -0.47f, 0.95f, -1.0f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -6.31f, -2.69f, -9f, -9f, -9f)
                close()
                moveTo(8.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(15.5f, 11f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Ghost = it}
