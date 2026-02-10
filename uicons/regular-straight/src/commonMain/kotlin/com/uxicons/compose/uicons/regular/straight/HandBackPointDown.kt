package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Rs.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 0f)
                lineTo(1.88f, 5.12f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.89f, 2.13f)
                lineToRelative(4.12f, 4.05f)
                verticalLineToRelative(7.58f)
                curveToRelative(0f, 0.88f, 0.39f, 1.71f, 1.06f, 2.29f)
                curveToRelative(0.55f, 0.47f, 1.24f, 0.71f, 1.95f, 0.71f)
                curveToRelative(0.16f, 0f, 0.33f, -0.01f, 0.49f, -0.04f)
                curveToRelative(1.43f, -0.23f, 2.5f, -1.55f, 2.5f, -3.07f)
                verticalLineToRelative(-5.07f)
                lineToRelative(10f, -2f)
                lineTo(22f, 0f)
                lineTo(7f, 0f)
                close()
                moveTo(20f, 12.18f)
                lineToRelative(-10f, 2f)
                verticalLineToRelative(6.71f)
                curveToRelative(0f, 0.54f, -0.36f, 1.02f, -0.82f, 1.09f)
                curveToRelative(-0.3f, 0.05f, -0.59f, -0.03f, -0.82f, -0.22f)
                curveToRelative(-0.22f, -0.19f, -0.35f, -0.47f, -0.35f, -0.76f)
                lineTo(8.0f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3.61f)
                lineToRelative(-2.71f, -2.66f)
                curveToRelative(-0.19f, -0.19f, -0.29f, -0.44f, -0.29f, -0.71f)
                reflectiveCurveToRelative(0.1f, -0.52f, 0.29f, -0.71f)
                lineTo(7.83f, 2f)
                horizontalLineToRelative(12.17f)
                lineTo(20f, 12.18f)
                close()
            }
        }.also { _HandBackPointDown = it}
