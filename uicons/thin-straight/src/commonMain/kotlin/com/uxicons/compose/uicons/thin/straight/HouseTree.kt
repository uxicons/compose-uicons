package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseTree: ImageVector? = null

val Icons.Ts.HouseTree: ImageVector
    get() = _HouseTree ?: UXIcon(name = "HouseTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.04f, 13.64f)
                lineToRelative(-5.45f, -4.26f)
                curveToRelative(-0.64f, -0.5f, -1.54f, -0.5f, -2.19f, 0f)
                lineTo(0.96f, 13.64f)
                curveToRelative(-0.61f, 0.48f, -0.96f, 1.19f, -0.96f, 1.97f)
                verticalLineToRelative(8.39f)
                lineTo(15f, 24.0f)
                lineTo(15f, 15.61f)
                curveToRelative(0f, -0.77f, -0.35f, -1.49f, -0.96f, -1.97f)
                close()
                moveTo(14f, 23f)
                lineTo(1f, 23f)
                verticalLineToRelative(-7.39f)
                curveToRelative(0f, -0.47f, 0.21f, -0.9f, 0.58f, -1.18f)
                lineToRelative(5.45f, -4.26f)
                curveToRelative(0.28f, -0.22f, 0.67f, -0.22f, 0.95f, 0f)
                lineToRelative(5.45f, 4.26f)
                curveToRelative(0.37f, 0.29f, 0.58f, 0.72f, 0.58f, 1.18f)
                verticalLineToRelative(7.39f)
                close()
                moveTo(5f, 20f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                lineTo(5f, 15f)
                verticalLineToRelative(5f)
                close()
                moveTo(6f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(17f, 23f)
                horizontalLineToRelative(5.3f)
                lineToRelative(-3.73f, -7f)
                horizontalLineToRelative(2.21f)
                lineToRelative(-4.21f, -7f)
                horizontalLineToRelative(2.79f)
                lineTo(15.34f, 1.41f)
                curveToRelative(-0.34f, -0.47f, -1.29f, -0.53f, -1.71f, 0.03f)
                lineToRelative(-3.51f, 6.59f)
                lineToRelative(-0.29f, -0.23f)
                curveToRelative(-0.17f, -0.13f, -0.35f, -0.25f, -0.53f, -0.35f)
                lineTo(12.8f, 0.89f)
                curveToRelative(0.39f, -0.56f, 1.02f, -0.89f, 1.7f, -0.89f)
                reflectiveCurveToRelative(1.31f, 0.33f, 1.7f, 0.89f)
                lineToRelative(4.85f, 9.11f)
                horizontalLineToRelative(-2.69f)
                lineToRelative(4.21f, 7f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(3.73f, 7f)
                horizontalLineToRelative(-6.97f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _HouseTree = it}
