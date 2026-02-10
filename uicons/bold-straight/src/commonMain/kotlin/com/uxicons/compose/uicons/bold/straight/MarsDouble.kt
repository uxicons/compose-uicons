package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsDouble: ImageVector? = null

val Icons.Bs.MarsDouble: ImageVector
    get() = _MarsDouble ?: UXIcon(name = "MarsDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 14f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(17f)
                lineToRelative(2.44f, 2.44f)
                lineToRelative(-2.53f, 2.54f)
                arcTo(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 11f)
                curveToRelative(-0.18f, 0f, -0.36f, 0.02f, -0.53f, 0.03f)
                curveToRelative(0.01f, -0.18f, 0.03f, -0.35f, 0.03f, -0.53f)
                arcToRelative(6.45f, 6.45f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.97f, -3.4f)
                lineToRelative(2.54f, -2.53f)
                lineTo(17f, 7f)
                verticalLineTo(1f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1f, -1f)
                horizontalLineTo(10f)
                lineToRelative(2.44f, 2.44f)
                lineTo(9.9f, 4.97f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 6.5f, 17f)
                curveToRelative(0.18f, 0f, 0.35f, -0.02f, 0.53f, -0.03f)
                curveTo(7.01f, 17.14f, 7f, 17.32f, 7f, 17.5f)
                arcToRelative(6.5f, 6.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12.03f, -3.4f)
                lineToRelative(2.54f, -2.53f)
                close()
                moveTo(3f, 10.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 14f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 10.5f)
                close()
                moveTo(13.5f, 21f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 17f, 17.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 21f)
                close()
            }
        }.also { _MarsDouble = it}
