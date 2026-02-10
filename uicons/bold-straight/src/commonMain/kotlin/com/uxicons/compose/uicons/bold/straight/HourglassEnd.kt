package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassEnd: ImageVector? = null

val Icons.Bs.HourglassEnd: ImageVector
    get() = _HourglassEnd ?: UXIcon(name = "HourglassEnd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 24f)
                lineTo(3f, 24f)
                lineTo(3f, 20.59f)
                arcTo(11.95f, 11.95f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.99f, 12f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3.41f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.41f, 0f)
                lineTo(17.59f, 0f)
                arcTo(3.41f, 3.41f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 3.41f)
                arcTo(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.03f, 12f)
                arcTo(11.96f, 11.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 20.59f)
                close()
                moveTo(6f, 21f)
                lineTo(18f, 21f)
                verticalLineToRelative(-0.41f)
                curveToRelative(0f, -3.38f, -2.27f, -5.9f, -4.18f, -7.42f)
                lineTo(12.35f, 12f)
                lineToRelative(1.48f, -1.17f)
                curveTo(15.73f, 9.31f, 18f, 6.79f, 18f, 3.41f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.59f, 3f)
                lineTo(6.41f, 3f)
                arcTo(0.41f, 0.41f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 3.41f)
                curveToRelative(0f, 3.39f, 2.28f, 5.9f, 4.2f, 7.41f)
                lineTo(11.68f, 12f)
                lineTo(10.2f, 13.18f)
                curveTo(8.28f, 14.69f, 6f, 17.21f, 6f, 20.59f)
                close()
                moveTo(12.01f, 14.29f)
                lineTo(12.58f, 14.74f)
                arcTo(9.14f, 9.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.76f, 19f)
                lineTo(8.24f, 19f)
                arcToRelative(9.14f, 9.14f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.2f, -4.25f)
                lineToRelative(0.58f, -0.46f)
            }
        }.also { _HourglassEnd = it}
