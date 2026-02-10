package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EditAlt: ImageVector? = null

val Icons.Rs.EditAlt: ImageVector
    get() = _EditAlt ?: UXIcon(name = "EditAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9.98f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineToRelative(6f)
                horizontalLineTo(2f)
                verticalLineTo(3f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 2f)
                horizontalLineTo(16.15f)
                lineTo(17.36f, 0.65f)
                arcTo(4.93f, 4.93f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18.07f, 0f)
                horizontalLineTo(3f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(18.41f)
                lineTo(24f, 18.41f)
                verticalLineTo(7.98f)
                close()
                moveTo(18f, 21.59f)
                verticalLineTo(18f)
                horizontalLineToRelative(3.59f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.73f, 11.82f)
                lineTo(20.34f, 3.31f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.37f, -0.04f)
                arcToRelative(0.94f, 0.94f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.33f)
                lineTo(13.68f, 12.64f)
                arcToRelative(4.96f, 4.96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.04f, 1.78f)
                lineToRelative(8.4f, -8.4f)
                arcToRelative(2.95f, 2.95f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -4.16f)
                arcToRelative(2.94f, 2.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.28f, 0.12f)
                lineToRelative(-8.14f, 9.09f)
                arcTo(4.97f, 4.97f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12.73f, 11.82f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 13f)
                curveToRelative(-4f, 0f, -5f, 6f, -5f, 6f)
                horizontalLineToRelative(5f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -6f)
                close()
            }
        }.also { _EditAlt = it}
