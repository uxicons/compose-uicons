package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mountains: ImageVector? = null

val Icons.Rs.Mountains: ImageVector
    get() = _Mountains ?: UXIcon(name = "Mountains") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 8f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -8f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 8f)
                close()
                moveTo(20f, 2f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                close()
                moveTo(11f, 24f)
                lineTo(11f, 22.78f)
                lineToRelative(4.28f, -9.34f)
                arcToRelative(2.46f, 2.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.45f, 0f)
                lineTo(24f, 22.74f)
                verticalLineToRelative(1.22f)
                close()
                moveTo(13.54f, 22f)
                horizontalLineToRelative(7.92f)
                lineToRelative(-3.55f, -7.73f)
                arcToRelative(0.44f, 0.44f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.81f, 0f)
                close()
                moveTo(12.25f, 6.54f)
                arcToRelative(2.66f, 2.66f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.81f, 0f)
                lineTo(0f, 22.78f)
                lineTo(0f, 24f)
                lineTo(9f, 24f)
                lineTo(9f, 22f)
                lineTo(2.53f, 22f)
                lineTo(9.26f, 7.38f)
                arcToRelative(0.65f, 0.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.18f, 0f)
                lineToRelative(2.72f, 5.9f)
                lineToRelative(0.31f, -0.68f)
                arcToRelative(4.49f, 4.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.96f, -1.34f)
                close()
            }
        }.also { _Mountains = it}
