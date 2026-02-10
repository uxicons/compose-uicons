package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsToLine: ImageVector? = null

val Icons.Tr.ArrowsToLine: ImageVector
    get() = _ArrowsToLine ?: UXIcon(name = "ArrowsToLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 12.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(23.5f, 11.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(10.94f, 8.56f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.05f, -0.44f)
                lineToRelative(3.79f, -3.71f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.71f, -0.01f)
                lineToRelative(-3.65f, 3.57f)
                lineTo(12.5f, 0.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(11.5f, 7.71f)
                lineToRelative(-3.65f, -3.57f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                curveToRelative(-0.19f, 0.2f, -0.19f, 0.52f, 0.01f, 0.71f)
                lineToRelative(3.79f, 3.7f)
                close()
                moveTo(13.06f, 15.44f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, -0.0f)
                lineToRelative(-3.79f, 3.71f)
                curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.71f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.71f, 0.01f)
                lineToRelative(3.65f, -3.57f)
                verticalLineToRelative(7.21f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-7.21f)
                lineToRelative(3.65f, 3.57f)
                curveToRelative(0.1f, 0.1f, 0.22f, 0.14f, 0.35f, 0.14f)
                curveToRelative(0.13f, 0f, 0.26f, -0.05f, 0.36f, -0.15f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.52f, -0.01f, -0.71f)
                lineToRelative(-3.79f, -3.7f)
                close()
            }
        }.also { _ArrowsToLine = it}
