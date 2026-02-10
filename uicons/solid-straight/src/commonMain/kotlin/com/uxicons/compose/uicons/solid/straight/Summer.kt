package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Summer: ImageVector? = null

val Icons.Ss.Summer: ImageVector
    get() = _Summer ?: UXIcon(name = "Summer") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 17f)
                arcToRelative(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7f, 7f)
                curveToRelative(-6.08f, 0.12f, -9.34f, -7.64f, -5f, -11.89f)
                lineTo(12f, 5f)
                curveToRelative(0.21f, -6.61f, 9.79f, -6.6f, 10f, 0f)
                verticalLineToRelative(7.11f)
                arcTo(7.01f, 7.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 17f)
                close()
                moveTo(20f, 17f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2.82f)
                lineTo(18f, 8f)
                lineTo(16f, 8f)
                verticalLineToRelative(6.18f)
                arcTo(3.0f, 3.0f, 0f, isMoreThanHalf = true, isPositiveArc = false, 20f, 17f)
                close()
                moveTo(8.26f, 14.9f)
                arcTo(8.96f, 8.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 11.35f)
                lineTo(10f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 3.08f)
                arcToRelative(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.09f, 0.3f)
                lineTo(5.36f, 0.72f)
                lineTo(3.63f, 1.72f)
                lineTo(5.17f, 4.38f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.77f, 0.78f)
                lineTo(1.73f, 3.6f)
                lineToRelative(-1f, 1.73f)
                lineTo(3.39f, 6.88f)
                arcTo(5.95f, 5.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.09f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(2f)
                lineTo(3.09f, 10f)
                arcToRelative(5.97f, 5.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.29f, 1.11f)
                lineTo(0.73f, 12.66f)
                lineToRelative(1.01f, 1.73f)
                lineTo(4.4f, 12.83f)
                arcToRelative(5.96f, 5.96f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.76f, 0.76f)
                lineTo(3.61f, 16.27f)
                lineToRelative(1.73f, 1.01f)
                lineTo(6.9f, 14.6f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.34f, 0.35f)
                curveTo(8.24f, 14.94f, 8.25f, 14.91f, 8.26f, 14.9f)
                close()
            }
        }.also { _Summer = it}
