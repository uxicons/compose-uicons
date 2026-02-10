package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPump: ImageVector? = null

val Icons.Ss.GasPump: ImageVector
    get() = _GasPump ?: UXIcon(name = "GasPump") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 9f)
                horizontalLineToRelative(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 5f)
                arcToRelative(3.97f, 3.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.34f, 0.25f)
                lineToRelative(2.45f, -2.45f)
                lineToRelative(1.41f, 1.41f)
                lineTo(11.01f, 6.4f)
                arcTo(3.96f, 3.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                horizontalLineToRelative(4f)
                verticalLineTo(3f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3f, -3f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.29f, 2.29f)
                lineToRelative(-3.29f, 3.29f)
                lineToRelative(0f, 13.41f)
                lineToRelative(-3f, 0f)
                lineToRelative(0f, -8f)
                lineToRelative(-16f, 0f)
                lineToRelative(0f, 13f)
                lineToRelative(16f, 0f)
                lineToRelative(0f, -3f)
                lineToRelative(5f, 0f)
                lineToRelative(0f, -14.59f)
                lineToRelative(2.71f, -2.71f)
                lineToRelative(-1.41f, -1.41f)
                close()
            }
        }.also { _GasPump = it}
