package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SnowBlowing: ImageVector? = null

val Icons.Bs.SnowBlowing: ImageVector
    get() = _SnowBlowing ?: UXIcon(name = "SnowBlowing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.12f, 8.43f)
                lineTo(3.48f, 6.5f)
                lineTo(0.12f, 4.57f)
                lineToRelative(1.49f, -2.6f)
                lineTo(5f, 3.91f)
                lineTo(5f, 0f)
                lineTo(8f, 0f)
                lineTo(8f, 3.91f)
                lineToRelative(3.39f, -1.95f)
                lineToRelative(1.49f, 2.6f)
                lineTo(9.52f, 6.5f)
                lineToRelative(3.37f, 1.93f)
                lineToRelative(-1.49f, 2.6f)
                lineTo(8f, 9.09f)
                lineTo(8f, 13f)
                lineTo(5f, 13f)
                lineTo(5f, 9.09f)
                lineTo(1.61f, 11.04f)
                close()
                moveTo(12.5f, 15f)
                lineTo(0f, 15f)
                verticalLineToRelative(3f)
                lineTo(12.5f, 18f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3f)
                arcTo(1.65f, 1.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 20f)
                lineTo(8f, 20f)
                curveToRelative(0f, 2.09f, 2.15f, 4f, 4.5f, 4f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -9f)
                close()
                moveTo(19.5f, 4f)
                curveTo(17.1f, 4f, 15f, 5.87f, 15f, 8f)
                horizontalLineToRelative(3f)
                arcToRelative(1.54f, 1.54f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.5f, 2f)
                lineTo(14.29f, 10f)
                lineToRelative(-1.72f, 3f)
                lineTo(19.5f, 13f)
                arcToRelative(4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -9f)
                close()
            }
        }.also { _SnowBlowing = it}
