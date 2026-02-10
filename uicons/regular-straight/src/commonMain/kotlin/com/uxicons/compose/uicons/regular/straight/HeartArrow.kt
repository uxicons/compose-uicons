package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartArrow: ImageVector? = null

val Icons.Rs.HeartArrow: ImageVector
    get() = _HeartArrow ?: UXIcon(name = "HeartArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 18f)
                verticalLineToRelative(2.59f)
                lineToRelative(-3.06f, -3.06f)
                curveTo(21.06f, 15.28f, 23f, 12.53f, 23f, 9.95f)
                arcTo(5.75f, 5.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 4f)
                arcTo(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 6.47f)
                arcTo(5.91f, 5.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8.5f, 4f)
                arcToRelative(5.11f, 5.11f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.45f, 0.63f)
                lineTo(1.41f, 0f)
                lineTo(0f, 1.41f)
                lineTo(4.48f, 5.9f)
                arcTo(6.19f, 6.19f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.95f)
                curveToRelative(0f, 5.4f, 8.46f, 11.55f, 9.42f, 12.23f)
                lineToRelative(0.58f, 0.41f)
                lineToRelative(0.58f, -0.41f)
                arcToRelative(40.35f, 40.35f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.94f, -3.25f)
                lineTo(20.59f, 22f)
                lineTo(18f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                lineTo(24f, 18f)
                close()
                moveTo(13f, 20.13f)
                curveTo(9.04f, 17.2f, 5f, 12.91f, 5f, 9.95f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 6f)
                curveToRelative(2.2f, 0f, 3.59f, 2.7f, 3.6f, 2.72f)
                lineTo(13f, 10.49f)
                lineToRelative(0.9f, -1.77f)
                curveTo(13.91f, 8.7f, 15.3f, 6f, 17.5f, 6f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 9.95f)
                curveTo(21f, 12.91f, 16.96f, 17.2f, 13f, 20.13f)
                close()
            }
        }.also { _HeartArrow = it}
