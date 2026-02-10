package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudSnow: ImageVector? = null

val Icons.Ss.CloudSnow: ImageVector
    get() = _CloudSnow ?: UXIcon(name = "CloudSnow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 21f)
                lineTo(12.21f, 21f)
                lineToRelative(0.9f, 1.57f)
                lineToRelative(-1.73f, 1f)
                lineTo(10.5f, 22.05f)
                lineTo(9.63f, 23.57f)
                lineToRelative(-1.73f, -1f)
                lineTo(8.8f, 21f)
                lineTo(7f, 21f)
                lineTo(7f, 19f)
                lineTo(8.75f, 19f)
                lineToRelative(-0.86f, -1.5f)
                lineToRelative(1.73f, -1f)
                lineToRelative(0.87f, 1.52f)
                lineToRelative(0.87f, -1.52f)
                lineToRelative(1.73f, 1f)
                lineTo(12.25f, 19f)
                lineTo(14f, 19f)
                close()
                moveTo(24f, 12.5f)
                arcTo(7.51f, 7.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 20f)
                lineTo(16f, 20f)
                curveToRelative(-0.23f, -7.27f, -10.78f, -7.27f, -11f, 0f)
                curveToRelative(-4.91f, 0.02f, -6.85f, -7.15f, -2.73f, -9.95f)
                curveTo(-0.04f, 0.31f, 13.53f, -4.12f, 17.44f, 5.06f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.5f)
                close()
                moveTo(18f, 9.53f)
                lineTo(16.23f, 9.53f)
                lineTo(17.11f, 8f)
                lineTo(15.37f, 7f)
                lineTo(14.5f, 8.52f)
                lineTo(13.63f, 7f)
                lineTo(11.89f, 8f)
                lineToRelative(0.88f, 1.54f)
                lineTo(11f, 9.54f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.77f)
                lineToRelative(-0.88f, 1.54f)
                lineToRelative(1.73f, 1f)
                lineToRelative(0.87f, -1.52f)
                lineToRelative(0.87f, 1.52f)
                lineToRelative(1.73f, -1f)
                lineToRelative(-0.88f, -1.54f)
                lineTo(18f, 11.54f)
                close()
            }
        }.also { _CloudSnow = it}
