package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Ss.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 13f)
                curveToRelative(0f, 6.37f, -5.05f, 11f, -12f, 11f)
                lineTo(7f, 24f)
                lineTo(7f, 22f)
                arcToRelative(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.44f, -1.12f)
                curveTo(-2.72f, 18.03f, 0.32f, -0.28f, 14f, 0f)
                horizontalLineToRelative(3f)
                lineTo(17f, 2f)
                arcToRelative(5.43f, 5.43f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.44f, 1.12f)
                arcTo(10.02f, 10.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 13f)
                close()
                moveTo(15f, 12f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 12f)
                close()
            }
        }.also { _Hurricane = it}
