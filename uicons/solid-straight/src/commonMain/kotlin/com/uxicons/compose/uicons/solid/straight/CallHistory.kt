package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallHistory: ImageVector? = null

val Icons.Ss.CallHistory: ImageVector
    get() = _CallHistory ?: UXIcon(name = "CallHistory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.48f, 16.98f)
                arcToRelative(12.13f, 12.13f, 0f, isMoreThanHalf = false, isPositiveArc = true, -6.45f, -6.47f)
                lineToRelative(4.12f, -4.12f)
                lineTo(4.89f, 0.12f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7.5f)
                curveTo(0f, 14.75f, 9.25f, 24f, 16.5f, 24f)
                arcToRelative(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.21f, -1.72f)
                lineToRelative(3.17f, -3.17f)
                lineToRelative(-6.26f, -6.26f)
                close()
                moveTo(10.15f, 2.56f)
                arcTo(7.99f, 7.99f, 0f, isMoreThanHalf = true, isPositiveArc = true, 21.44f, 13.85f)
                lineToRelative(-1.41f, -1.41f)
                arcToRelative(5.99f, 5.99f, 0f, isMoreThanHalf = true, isPositiveArc = false, -8.46f, -8.46f)
                close()
                moveTo(15f, 8.5f)
                verticalLineTo(5f)
                horizontalLineToRelative(2f)
                verticalLineTo(7.76f)
                lineToRelative(1.56f, 1.56f)
                lineToRelative(-1.37f, 1.37f)
                close()
            }
        }.also { _CallHistory = it}
