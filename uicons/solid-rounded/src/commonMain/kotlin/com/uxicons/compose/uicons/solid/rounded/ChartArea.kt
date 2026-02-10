package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartArea: ImageVector? = null

val Icons.Sr.ChartArea: ImageVector
    get() = _ChartArea ?: UXIcon(name = "ChartArea") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 24f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(0f, 1f)
                curveTo(0.01f, -0.31f, 1.99f, -0.31f, 2f, 1f)
                lineTo(2f, 21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(23f, 22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(23.14f, 9.9f)
                lineToRelative(-2.02f, -2.02f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-1.88f, 1.88f)
                lineToRelative(-3.88f, -3.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-2f, 2f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(14.01f)
                curveToRelative(1.65f, 0f, 3.0f, -1.34f, 3f, -2.99f)
                lineToRelative(0.01f, -4.98f)
                curveToRelative(0.0f, -0.79f, -0.32f, -1.57f, -0.88f, -2.13f)
                close()
            }
        }.also { _ChartArea = it}
