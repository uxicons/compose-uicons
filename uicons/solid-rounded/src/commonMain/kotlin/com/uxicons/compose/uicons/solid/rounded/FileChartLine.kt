package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileChartLine: ImageVector? = null

val Icons.Sr.FileChartLine: ImageVector
    get() = _FileChartLine ?: UXIcon(name = "FileChartLine") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 7f)
                lineTo(14f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 10.48f)
                verticalLineToRelative(8.52f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(7f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(4.51f)
                curveToRelative(0.16f, 0f, 0.32f, 0.01f, 0.48f, 0.02f)
                lineTo(12f, 7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(6.98f)
                curveToRelative(0.01f, 0.16f, 0.02f, 0.32f, 0.02f, 0.48f)
                close()
                moveTo(9f, 18f)
                curveToRelative(-0.01f, -1.31f, -1.99f, -1.31f, -2f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(0.01f, 1.31f, 1.99f, 1.31f, 2f, 0f)
                verticalLineToRelative(-2f)
                close()
                moveTo(13f, 13f)
                curveToRelative(-0.01f, -1.31f, -1.99f, -1.31f, -2f, 0f)
                verticalLineToRelative(7f)
                curveToRelative(0.01f, 1.31f, 1.99f, 1.31f, 2f, 0f)
                verticalLineToRelative(-7f)
                close()
                moveTo(17f, 16f)
                curveToRelative(-0.01f, -1.31f, -2.0f, -1.31f, -2f, 0f)
                verticalLineToRelative(4f)
                curveToRelative(0.01f, 1.31f, 2.0f, 1.31f, 2f, 0f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _FileChartLine = it}
