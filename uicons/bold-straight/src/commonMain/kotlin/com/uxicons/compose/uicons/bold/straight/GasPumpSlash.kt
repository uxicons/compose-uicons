package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GasPumpSlash: ImageVector? = null

val Icons.Bs.GasPumpSlash: ImageVector
    get() = _GasPumpSlash ?: UXIcon(name = "GasPumpSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.03f, 20.91f)
                arcTo(3.48f, 3.48f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 18.5f)
                verticalLineTo(5.91f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.73f, -1.77f)
                lineTo(19.56f, 0.44f)
                lineTo(17.44f, 2.56f)
                lineTo(19f, 4.12f)
                verticalLineTo(6.5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2.45f)
                verticalLineTo(18.5f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.09f, 0.29f)
                lineTo(16f, 13.88f)
                verticalLineTo(3.5f)
                arcTo(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 0f)
                horizontalLineToRelative(-9f)
                arcTo(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.33f, 0.2f)
                lineTo(2.06f, -0.06f)
                lineTo(-0.06f, 2.06f)
                lineToRelative(22f, 22f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(12.5f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.5f, 0.5f)
                verticalLineTo(9f)
                horizontalLineTo(11.12f)
                lineToRelative(-6f, -6f)
                close()
                moveTo(13f, 19.36f)
                lineToRelative(3f, 3f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(6.36f)
                lineTo(5.64f, 12f)
                horizontalLineTo(3f)
                verticalLineToRelative(9f)
                horizontalLineTo(13f)
                close()
            }
        }.also { _GasPumpSlash = it}
