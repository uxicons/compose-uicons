package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TachometerAverage: ImageVector? = null

val Icons.Rs.TachometerAverage: ImageVector
    get() = _TachometerAverage ?: UXIcon(name = "TachometerAverage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 13f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, -1.73f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6.27f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 13f)
                close()
                moveTo(12f, 1f)
                curveTo(0.37f, 0.98f, -4.41f, 16.17f, 5.11f, 22.82f)
                lineToRelative(0.64f, 0.45f)
                lineToRelative(2.9f, -2.51f)
                lineTo(7.35f, 19.24f)
                lineToRelative(-1.7f, 1.47f)
                curveTo(-1.55f, 14.85f, 2.7f, 2.96f, 12f, 3f)
                curveToRelative(9.3f, -0.04f, 13.55f, 11.85f, 6.35f, 17.71f)
                lineToRelative(-1.7f, -1.47f)
                lineToRelative(-1.31f, 1.51f)
                lineToRelative(2.9f, 2.51f)
                lineToRelative(0.64f, -0.45f)
                curveTo(28.42f, 16.17f, 23.62f, 0.98f, 12f, 1f)
                close()
            }
        }.also { _TachometerAverage = it}
