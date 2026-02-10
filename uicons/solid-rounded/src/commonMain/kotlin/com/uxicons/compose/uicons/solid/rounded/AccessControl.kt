package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AccessControl: ImageVector? = null

val Icons.Sr.AccessControl: ImageVector
    get() = _AccessControl ?: UXIcon(name = "AccessControl") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 10f)
                curveToRelative(0.35f, 0f, 0.7f, 0.03f, 1.04f, 0.07f)
                curveToRelative(-0.52f, -0.71f, -1.22f, -1.29f, -2.04f, -1.65f)
                verticalLineToRelative(-1.42f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 3.14f, -7f, 7f)
                verticalLineToRelative(1.42f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(7.72f)
                curveToRelative(-1.67f, -1.47f, -2.72f, -3.61f, -2.72f, -6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                curveToRelative(0.35f, 0f, 0.65f, 0.2f, 0.83f, 0.47f)
                curveToRelative(1.3f, -2.65f, 4.02f, -4.47f, 7.17f, -4.47f)
                close()
                moveTo(5f, 8f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                close()
                moveTo(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(18f, 14f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(18f, 22f)
                curveToRelative(-1.08f, 0f, -2.06f, -0.43f, -2.78f, -1.13f)
                curveToRelative(0.45f, -1.09f, 1.51f, -1.87f, 2.77f, -1.87f)
                horizontalLineToRelative(0.02f)
                curveToRelative(1.25f, 0f, 2.32f, 0.78f, 2.77f, 1.87f)
                curveToRelative(-0.72f, 0.7f, -1.7f, 1.13f, -2.78f, 1.13f)
                close()
            }
        }.also { _AccessControl = it}
