package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BillArrow: ImageVector? = null

val Icons.Sr.BillArrow: ImageVector
    get() = _BillArrow ?: UXIcon(name = "BillArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 16f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(15f, 4.5f)
                curveToRelative(0.25f, 0f, 0.51f, -0.1f, 0.7f, -0.29f)
                lineToRelative(1.3f, -1.28f)
                verticalLineToRelative(6.07f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(19f, 2.95f)
                lineToRelative(1.3f, 1.27f)
                curveToRelative(0.4f, 0.39f, 1.03f, 0.38f, 1.41f, -0.02f)
                curveToRelative(0.39f, -0.4f, 0.38f, -1.03f, -0.02f, -1.41f)
                lineToRelative(-2.23f, -2.17f)
                curveToRelative(-0.82f, -0.82f, -2.15f, -0.82f, -2.97f, -0.0f)
                lineToRelative(-2.21f, 2.18f)
                curveToRelative(-0.39f, 0.39f, -0.4f, 1.02f, -0.01f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.3f, 0.71f, 0.3f)
                close()
                moveTo(24f, 13f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(0.03f, 0f, 0.06f, -0.01f, 0.1f, -0.01f)
                curveToRelative(-0.06f, 0.16f, -0.1f, 0.33f, -0.1f, 0.51f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                curveToRelative(0f, -0.61f, -0.37f, -1.14f, -0.89f, -1.37f)
                curveToRelative(0.55f, -0.54f, 0.89f, -1.3f, 0.89f, -2.13f)
                verticalLineToRelative(-0.58f)
                curveToRelative(1.76f, 0.77f, 3f, 2.53f, 3f, 4.58f)
                close()
                moveTo(6f, 19.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(6f, 12.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(16f, 16f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                close()
                moveTo(21f, 19.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _BillArrow = it}
