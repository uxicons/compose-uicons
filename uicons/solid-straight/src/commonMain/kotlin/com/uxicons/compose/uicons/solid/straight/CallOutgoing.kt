package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallOutgoing: ImageVector? = null

val Icons.Ss.CallOutgoing: ImageVector
    get() = _CallOutgoing ?: UXIcon(name = "CallOutgoing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.61f, 12.85f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, 3.29f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineTo(7.03f, 10.51f)
                arcToRelative(12.14f, 12.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6.45f, 6.47f)
                close()
                moveTo(21.53f, 0f)
                horizontalLineTo(17f)
                verticalLineTo(2f)
                horizontalLineToRelative(3.62f)
                lineTo(15f, 7.62f)
                lineToRelative(1.41f, 1.41f)
                lineTo(22f, 3.44f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineTo(2.5f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21.53f, 0f)
                close()
            }
        }.also { _CallOutgoing = it}
