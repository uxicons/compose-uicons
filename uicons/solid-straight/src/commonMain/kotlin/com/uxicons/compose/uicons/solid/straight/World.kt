package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _World: ImageVector? = null

val Icons.Ss.World: ImageVector
    get() = _World ?: UXIcon(name = "World") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                horizontalLineTo(6.09f)
                lineTo(0.04f, 10.96f)
                curveTo(0.02f, 11.3f, 0f, 11.65f, 0f, 12f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 23.96f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.13f, 19.12f)
                arcTo(7.21f, 7.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 14f)
                horizontalLineTo(13f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, -3f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineTo(4f)
                horizontalLineToRelative(4.09f)
                lineTo(18.9f, 2.18f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 8.58f)
                lineTo(6.91f, 15f)
                horizontalLineTo(10f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(5.96f)
                arcToRelative(11.97f, 11.97f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.69f, -3.68f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.49f, 17.66f)
                lineToRelative(1.45f, 1.06f)
                arcToRelative(12f, 12f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.5f, -15.25f)
                lineTo(17.91f, 6f)
                horizontalLineTo(15f)
                verticalLineToRelative(4f)
                horizontalLineTo(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1.99f)
                arcTo(5.3f, 5.3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20.49f, 17.66f)
                close()
            }
        }.also { _World = it}
