package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeQuarterTo: ImageVector? = null

val Icons.Rs.TimeQuarterTo: ImageVector
    get() = _TimeQuarterTo ?: UXIcon(name = "TimeQuarterTo") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 12f)
                curveToRelative(0f, -0.37f, 0.02f, -0.73f, 0.05f, -1.09f)
                lineToRelative(1.99f, 0.18f)
                quadTo(2f, 11.54f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2f)
                quadToRelative(-0.46f, 0f, -0.91f, 0.04f)
                lineTo(10.91f, 0.05f)
                curveTo(11.27f, 0.02f, 11.63f, 0f, 12f, 0f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12f)
                close()
                moveTo(5.66f, 4.26f)
                lineTo(4.39f, 2.72f)
                arcTo(12.12f, 12.12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 4.4f)
                lineTo(4.26f, 5.67f)
                arcTo(10.14f, 10.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5.66f, 4.26f)
                close()
                moveTo(9.14f, 2.42f)
                lineTo(8.57f, 0.5f)
                arcToRelative(11.98f, 11.98f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.2f, 0.9f)
                lineToRelative(0.94f, 1.77f)
                arcTo(9.95f, 9.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9.14f, 2.42f)
                close()
                moveTo(3.16f, 7.32f)
                lineTo(1.4f, 6.38f)
                arcToRelative(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.9f, 2.2f)
                lineToRelative(1.92f, 0.57f)
                arcTo(9.96f, 9.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.16f, 7.31f)
                close()
                moveTo(11f, 6f)
                verticalLineToRelative(4.28f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.72f, 0.72f)
                lineTo(7f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.28f)
                arcTo(1.99f, 1.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, 13f, 10.28f)
                lineTo(13f, 6f)
                close()
            }
        }.also { _TimeQuarterTo = it}
