package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BenchTree: ImageVector? = null

val Icons.Ss.BenchTree: ImageVector
    get() = _BenchTree ?: UXIcon(name = "BenchTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                lineTo(3f, 10f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(2f, 17f)
                verticalLineToRelative(2f)
                lineTo(0f, 19f)
                verticalLineToRelative(2f)
                lineTo(2f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(11f, 19f)
                lineTo(4f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                close()
                moveTo(23.45f, 10f)
                curveToRelative(0.35f, 0.61f, 0.55f, 1.29f, 0.55f, 2f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                curveToRelative(-0.34f, 0f, -0.67f, -0.06f, -1f, -0.15f)
                verticalLineToRelative(8.15f)
                horizontalLineToRelative(-2f)
                lineTo(17f, 13f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                curveToRelative(0f, -1.46f, 0.8f, -2.77f, 2.04f, -3.47f)
                curveToRelative(-0.02f, -0.17f, -0.04f, -0.35f, -0.04f, -0.53f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.18f, -0.01f, 0.35f, -0.04f, 0.53f)
                curveToRelative(1.23f, 0.7f, 2.04f, 2.02f, 2.04f, 3.47f)
                curveToRelative(0f, 0.7f, -0.19f, 1.39f, -0.55f, 2f)
                close()
            }
        }.also { _BenchTree = it}
