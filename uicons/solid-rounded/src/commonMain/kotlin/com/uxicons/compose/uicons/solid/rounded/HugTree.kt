package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HugTree: ImageVector? = null

val Icons.Sr.HugTree: ImageVector
    get() = _HugTree ?: UXIcon(name = "HugTree") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.5f, 12f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(23.76f, 4.14f)
                lineTo(18f, 10.07f)
                verticalLineToRelative(12.93f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-4.91f)
                lineToRelative(-9.55f, -5.82f)
                curveToRelative(-0.28f, -0.17f, -0.45f, -0.47f, -0.45f, -0.8f)
                curveToRelative(0f, -0.69f, 0.71f, -1.14f, 1.33f, -0.84f)
                lineToRelative(8.67f, 4.15f)
                verticalLineToRelative(-3.78f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(5.31f)
                lineToRelative(2f, -1.47f)
                verticalLineToRelative(-4.12f)
                curveToRelative(0f, -0.4f, 0.32f, -0.72f, 0.72f, -0.72f)
                curveToRelative(0.35f, 0f, 0.66f, 0.26f, 0.71f, 0.61f)
                lineToRelative(0.44f, 2.86f)
                lineToRelative(0.8f, -0.59f)
                curveToRelative(0.55f, -0.41f, 1.33f, -0.01f, 1.33f, 0.68f)
                curveToRelative(0f, 0.22f, -0.09f, 0.43f, -0.24f, 0.58f)
                close()
            }
        }.also { _HugTree = it}
