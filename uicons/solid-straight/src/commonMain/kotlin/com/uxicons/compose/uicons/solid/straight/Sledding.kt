package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sledding: ImageVector? = null

val Icons.Ss.Sledding: ImageVector
    get() = _Sledding ?: UXIcon(name = "Sledding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 21.73f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.28f, 2.04f)
                arcToRelative(3.98f, 3.98f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.06f, -0.17f)
                lineTo(0.03f, 14.77f)
                lineTo(0.89f, 12.96f)
                lineTo(19.52f, 21.8f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.67f, -0.94f)
                close()
                moveTo(18.5f, 5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 16f, 2.5f)
                arcTo(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 5f)
                close()
                moveTo(11.73f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(9.39f)
                lineToRelative(2.73f, 1.77f)
                arcToRelative(3.1f, 3.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.17f, 4.15f)
                curveToRelative(0f, 0.01f, 0f, 0.01f, -0.01f, 0.02f)
                lineTo(13.75f, 14f)
                horizontalLineToRelative(4.06f)
                lineToRelative(1.15f, 5.31f)
                lineToRelative(-2.28f, -1.08f)
                lineTo(16.19f, 16f)
                horizontalLineTo(10.94f)
                arcToRelative(2.87f, 2.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.58f, -1.5f)
                arcToRelative(3.27f, 3.27f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.22f, -3.34f)
                close()
            }
        }.also { _Sledding = it}
