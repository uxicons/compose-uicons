package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GrinTears: ImageVector? = null

val Icons.Ss.GrinTears: ImageVector
    get() = _GrinTears ?: UXIcon(name = "GrinTears") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.69f, 16.43f)
                curveTo(19.93f, 15.67f, 19.4f, 12.4f, 19.4f, 12.4f)
                reflectiveCurveToRelative(3.28f, 0.53f, 4.04f, 1.29f)
                arcToRelative(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.36f, 0.51f)
                arcToRelative(11.99f, 11.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -23.58f, 0f)
                arcToRelative(1.93f, 1.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.36f, -0.51f)
                curveToRelative(0.76f, -0.76f, 4.06f, -1.32f, 4.06f, -1.32f)
                curveToRelative(-0.27f, 1.06f, -0.65f, 5.84f, -3.65f, 4.36f)
                curveToRelative(4.1f, 9.63f, 17.96f, 9.63f, 22.05f, 0f)
                arcTo(1.94f, 1.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20.69f, 16.43f)
                close()
                moveTo(16f, 7f)
                curveToRelative(1.77f, 0f, 3f, 2.11f, 3f, 4f)
                lineTo(17f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(13f, 11f)
                curveTo(13f, 9.11f, 14.23f, 7f, 16f, 7f)
                close()
                moveTo(8f, 7f)
                curveToRelative(1.77f, 0f, 3f, 2.11f, 3f, 4f)
                lineTo(9f, 11f)
                curveToRelative(0f, -1.05f, -0.68f, -2f, -1f, -2f)
                reflectiveCurveToRelative(-1f, 0.95f, -1f, 2f)
                lineTo(5f, 11f)
                curveTo(5f, 9.11f, 6.23f, 7f, 8f, 7f)
                close()
                moveTo(12f, 19f)
                curveToRelative(-3.34f, 0f, -5.39f, -2.72f, -6.01f, -5f)
                arcToRelative(21.84f, 21.84f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 1f)
                arcTo(21.92f, 21.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18f, 14f)
                curveTo(17.39f, 16.28f, 15.34f, 19f, 12f, 19f)
                close()
            }
        }.also { _GrinTears = it}
