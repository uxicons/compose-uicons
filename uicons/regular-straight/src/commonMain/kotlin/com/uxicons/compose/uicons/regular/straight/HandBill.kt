package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBill: ImageVector? = null

val Icons.Rs.HandBill: ImageVector
    get() = _HandBill ?: UXIcon(name = "HandBill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 8f)
                verticalLineToRelative(2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(15.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(15.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(10f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.23f)
                curveToRelative(-0.74f, 0f, -1.46f, 0.27f, -2.01f, 0.77f)
                lineToRelative(-3.76f, 3.27f)
                verticalLineToRelative(2.69f)
                lineToRelative(5.1f, -4.47f)
                curveToRelative(0.18f, -0.17f, 0.42f, -0.26f, 0.67f, -0.26f)
                horizontalLineToRelative(4.23f)
                verticalLineToRelative(2.02f)
                curveToRelative(-0.69f, 0.01f, -1.39f, 0.24f, -1.97f, 0.73f)
                lineToRelative(-2.72f, 2.62f)
                lineToRelative(1.39f, 1.44f)
                lineToRelative(2.67f, -2.57f)
                curveToRelative(0.38f, -0.32f, 0.94f, -0.31f, 1.3f, 0.02f)
                curveToRelative(0.41f, 0.37f, 0.44f, 1.0f, 0.09f, 1.4f)
                lineToRelative(-3.71f, 4.03f)
                curveToRelative(-0.19f, 0.2f, -0.46f, 0.32f, -0.73f, 0.32f)
                lineTo(0f, 18.0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6.31f)
                curveToRelative(0.84f, 0f, 1.64f, -0.35f, 2.21f, -0.97f)
                lineToRelative(1.48f, -1.61f)
                verticalLineToRelative(2.58f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-2.75f)
                lineToRelative(0.23f, -0.26f)
                curveToRelative(1.1f, -1.23f, 1.0f, -3.13f, -0.23f, -4.23f)
                curveToRelative(0f, 0f, -0.0f, -0.0f, -0.0f, -0.0f)
                verticalLineToRelative(-4.76f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-14f)
                close()
            }
        }.also { _HandBill = it}
