package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallIncoming: ImageVector? = null

val Icons.Ss.CallIncoming: ImageVector
    get() = _CallIncoming ?: UXIcon(name = "CallIncoming") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.61f, 12.85f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-3.17f, 3.17f)
                arcTo(5.89f, 5.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 24f)
                curveTo(9.25f, 24f, 0f, 14.75f, 0f, 7.5f)
                arcTo(5.9f, 5.9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.72f, 3.29f)
                lineTo(4.89f, 0.12f)
                lineToRelative(6.26f, 6.26f)
                lineTo(7.03f, 10.51f)
                arcTo(12.14f, 12.14f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.48f, 16.98f)
                close()
                moveTo(17.5f, 9f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(18.44f)
                curveToRelative(0.66f, -0.66f, 4.93f, -4.95f, 5.52f, -5.54f)
                lineTo(22.54f, 0.04f)
                curveTo(21.95f, 0.64f, 17.66f, 4.95f, 17f, 5.61f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineTo(6.53f)
                arcTo(2.49f, 2.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 9f)
                close()
            }
        }.also { _CallIncoming = it}
