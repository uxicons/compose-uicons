package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileAi: ImageVector? = null

val Icons.Rs.FileAi: ImageVector
    get() = _FileAi ?: UXIcon(name = "FileAi") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(18.35f)
                curveToRelative(2.21f, -2.21f, 3.44f, -3.44f, 5.65f, -5.65f)
                verticalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 0f)
                close()
                moveTo(2f, 3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(21f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineToRelative(6f)
                horizontalLineTo(2f)
                close()
                moveTo(18f, 21.52f)
                verticalLineTo(18f)
                horizontalLineToRelative(3.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 5.01f)
                lineTo(4.15f, 11.19f)
                horizontalLineTo(5.48f)
                lineTo(6f, 9.82f)
                horizontalLineTo(8.05f)
                lineToRelative(0.51f, 1.36f)
                horizontalLineTo(9.9f)
                lineTo(7.57f, 5f)
                close()
                moveTo(6.48f, 8.57f)
                lineToRelative(0.55f, -1.45f)
                lineToRelative(0.55f, 1.45f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.16f, 5.06f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(6.07f)
                horizontalLineToRelative(-1.25f)
                close()
            }
        }.also { _FileAi = it}
