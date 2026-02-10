package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Tr.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(21.5f, 12f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(17.5f, 0f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-7.94f)
                curveToRelative(-1.75f, 0f, -3.35f, 1.03f, -4.09f, 2.61f)
                lineTo(0.05f, 21.29f)
                curveToRelative(-0.12f, 0.25f, -0.01f, 0.55f, 0.24f, 0.66f)
                curveToRelative(0.24f, 0.11f, 0.55f, 0.01f, 0.66f, -0.24f)
                lineTo(4.98f, 12.99f)
                curveToRelative(0.01f, 0f, 3.55f, 0.01f, 3.55f, 0.01f)
                lineToRelative(4.02f, 8.71f)
                curveToRelative(0.12f, 0.25f, 0.42f, 0.36f, 0.66f, 0.24f)
                curveToRelative(0.25f, -0.12f, 0.36f, -0.41f, 0.24f, -0.66f)
                lineToRelative(-3.83f, -8.29f)
                horizontalLineToRelative(7.37f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(18.0f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(5.44f, 12f)
                lineToRelative(0.45f, -0.97f)
                curveToRelative(0.57f, -1.24f, 1.82f, -2.03f, 3.18f, -2.03f)
                horizontalLineToRelative(7.94f)
                verticalLineToRelative(3f)
                lineTo(5.44f, 12f)
                close()
            }
        }.also { _YogaMoon = it}
