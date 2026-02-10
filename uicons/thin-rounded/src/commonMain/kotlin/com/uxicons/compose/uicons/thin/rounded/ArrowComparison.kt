package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowComparison: ImageVector? = null

val Icons.Tr.ArrowComparison: ImageVector
    get() = _ArrowComparison ?: UXIcon(name = "ArrowComparison") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 1.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                lineTo(23f, 1.71f)
                lineToRelative(-7.36f, 7.36f)
                curveToRelative(-0.87f, 0.88f, -2.4f, 0.88f, -3.28f, 0f)
                lineToRelative(-2.79f, -2.66f)
                curveToRelative(-0.52f, -0.52f, -1.36f, -0.52f, -1.88f, -0.01f)
                lineTo(0.87f, 13.35f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.36f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.01f, -0.71f)
                lineToRelative(6.83f, -6.96f)
                curveToRelative(0.91f, -0.91f, 2.38f, -0.91f, 3.29f, -0.0f)
                lineToRelative(2.79f, 2.66f)
                curveToRelative(0.52f, 0.52f, 1.38f, 0.51f, 1.88f, 0.01f)
                lineToRelative(7.36f, -7.36f)
                horizontalLineToRelative(-4.79f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(23.13f, 10.65f)
                lineToRelative(-6.82f, 6.95f)
                curveToRelative(-0.52f, 0.52f, -1.35f, 0.52f, -1.88f, -0.01f)
                lineToRelative(-2.79f, -2.66f)
                curveToRelative(-0.88f, -0.88f, -2.41f, -0.88f, -3.28f, 0f)
                lineToRelative(-7.36f, 7.36f)
                verticalLineToRelative(-4.79f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(1.71f, 23.0f)
                lineToRelative(7.36f, -7.36f)
                curveToRelative(0.5f, -0.5f, 1.36f, -0.51f, 1.88f, 0.01f)
                lineToRelative(2.79f, 2.66f)
                curveToRelative(0.9f, 0.91f, 2.38f, 0.9f, 3.29f, -0.0f)
                lineToRelative(6.83f, -6.96f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                close()
            }
        }.also { _ArrowComparison = it}
